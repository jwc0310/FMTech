package parknshop.parknshopapp.Fragment.Product.ProductList;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;

import com.orhanobut.hawk.Hawk;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.Model.Category.CategoryTree;
import parknshop.parknshopapp.Model.Category.SubCategories;
import parknshop.parknshopapp.Model.FilterData;
import parknshop.parknshopapp.Model.TextSearchResponse;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 11/3/16.
 */
public class ProductListPresenter {

    public static int ROW = 2;
    public static String[] sortTags = {"iwaBestSellerQty", "new", "price-asc", "price-desc", "topRated"};
    public static String sortTag = sortTags[0];

    public static void initRecyclerView (RecyclerView recyclerView, final BaseFragment baseFragment) {
        recyclerView.setHasFixedSize(true);
        baseFragment.staggeredGridLayoutManager = new StaggeredGridLayoutManager(ROW, StaggeredGridLayoutManager.VERTICAL);
        if(((ProductListFragment) baseFragment).productId.length() > 0)
            baseFragment.staggeredGridLayoutManager.setGapStrategy(StaggeredGridLayoutManager.GAP_HANDLING_NONE);
        recyclerView.setLayoutManager(baseFragment.staggeredGridLayoutManager);

        //recyclerView.setOnScrollListener(new RecyclerView.OnScrollListener() {
        //    @Override
         //   public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
        //        super.onScrollStateChanged(recyclerView, newState);
        //        //baseFragment.cartPanel.setVisibility(View.GONE);
        //    }
        //});
    }

    public static void initHorizontalRecyclerView (final RecyclerView recyclerView, final BaseFragment productListFragment) {
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(productListFragment.getBaseActivity(), LinearLayoutManager.HORIZONTAL, false));
    }

    public static void resetValue(ProductListFragment productListFragment) {
        /*Hawk.put(AppUtils.sort_tag, null);
        Hawk.put("firstRun", null);

        Hawk.put(AppUtils.category_list, null);
        Hawk.put(AppUtils.brand_list, null);
        Hawk.put(AppUtils.event_list, null);
        Hawk.put(AppUtils.star_pressed, "");

        Hawk.put(AppUtils.have_stock, false);
        Hawk.put(AppUtils.selected_min_price, null);
        Hawk.put(AppUtils.selected_max_price, null);

        Hawk.put(AppUtils.max_price, 0);
        Hawk.put(AppUtils.min_price, 0);*/
        productListFragment.productListRepo = new ProductListRepo();
    }

    public static void resetAdapter(ProductListFragment productListFragment) {
        //Hawk.put(AppUtils.product_list_has_more, true);
        productListFragment.hasMore = true;
        productListFragment.productListAdapter.page = 0;
        productListFragment.reload = false;
        productListFragment. productListAdapter.productList.clear();
    }

    public static String getQueryString(ProductListFragment productListFragment) {
        final String colon = ":";
        final String cateKey = "category";
        final String brandKey = "masterBrandName";
        final String eventKey = "promotionsTag";
        final String stockKey = "isInStock";
        final String priceKey = "priceValue";

        StringBuilder builder = new StringBuilder();
        //builder.append(searchText.getText().toString());
        //iwaBestSellerQty
        builder.append(colon);

        for(int i = 0 ; i < productListFragment.productListRepo.sorts.size(); i++ ){
            if(productListFragment.productListRepo.sorts.get(i).isSelected())
                builder.append(productListFragment.productListRepo.sorts.get(i).getCode());
        }

        // add category
        //for (FilterData index : productListFragment.productListRepo.categoryList) {
        //    if(index.selected)
        //        appendQueryString(builder, cateKey, index.getId());
        //}

        // add category
        for (parknshop.parknshopapp.Model.Category.CategoryTree.Data.SubCategory index : productListFragment.productListRepo.newCatList) {
            if(index.selected)
                appendQueryString(builder, cateKey, index.id);
        }

        // add brand
        for (FilterData index : productListFragment.productListRepo.brandList) {
            if(index.selected)
                appendQueryString(builder, brandKey, index.getName());
        }

        // add event
        if(productListFragment.productListRepo.facets != null && productListFragment.productListRepo.facets.size() > 0)
        for (TextSearchResponse.Facet.Value index : productListFragment.productListRepo.facets.get(0).getValues()) {
            if(index.isSelected)
                appendQueryString(builder, eventKey, index.getName());
        }

        // add stock
        if (productListFragment.productListRepo.haveStock) {
            appendQueryString(builder, stockKey, Boolean.toString(productListFragment.productListRepo.haveStock));
        }

        // add price
        if (productListFragment.productListRepo.selectedMinPrice > 0 && productListFragment.productListRepo.selectedMaxPrice > 0) {
            if(productListFragment.productListRepo.selectedMinPrice != productListFragment.productListRepo.minPrice || productListFragment.productListRepo.selectedMaxPrice != productListFragment.productListRepo.maxPrice)
                    appendQueryString(builder, priceKey, "[" + (productListFragment.productListRepo.selectedMinPrice) + " TO " + (productListFragment.productListRepo.selectedMaxPrice) + "]");
        }

        return builder.toString();
    }

    private static void appendQueryString(StringBuilder builder, String key, String value) {
        final String colon = ":";
        builder.append(colon);
        builder.append(key);
        builder.append(colon);
        builder.append(value);
    }

    public static void initViewpagerTabLayout(ProductListFragment productListFragment) {
        //productListFragment.categoryViewPagerAdapter = new CategoryViewPagerAdapter(productListFragment.getFragmentManager(), Hawk.get(AppUtils.category_list, new ArrayList<FilterData>()), productListFragment);
        //productListFragment.viewPager.setAdapter(productListFragment.categoryViewPagerAdapter);
        //productListFragment.viewPager.setOnPageChangeListener(productListFragment.categoryViewPagerAdapter);
        //productListFragment.tabLayout.setupWithViewPager(productListFragment.viewPager);
        //productListFragment.tabLayout.setTabTextColors(productListFragment.getResources().getColorStateList(R.color.tab_text_color));
    }

    public static void initCategoryBubble(ProductListFragment productListFragment) {
        List<parknshop.parknshopapp.Model.Category.CategoryTree.Data.SubCategory> getSubcategories = new ArrayList<>();

        CategoryTree categoryTree = Hawk.get("categoryTree", new CategoryTree());

        for(int i = 0; i < categoryTree.getData().getSubcategories().size() ; i++) {

            if(categoryTree.getData().getSubcategories().get(i).id.equals(productListFragment.headerId)) {

                for(int y = 0; y < categoryTree.getData().getSubcategories().get(i).getSubcategories().size(); y++) {

                    if(categoryTree.getData().getSubcategories().get(i).getSubcategories().get(y).id.equals(productListFragment.categoryId)) {
                        getSubcategories = categoryTree.getData().getSubcategories().get(i).getSubcategories().get(y).getSubcategories();
                        //Log.i("yoyoyoyoyoy", "yoyoyoyoyoyo" + categoryTree.getData().getSubcategories().get(i).getSubcategories().get(y).id + " " + getSubcategories);
                    }
                }
            }
        }

        productListFragment.productListRepo.newCatList = getSubcategories;

        if(productListFragment.productListRepo.newCatList.size() > 0) {
            productListFragment.categoryRecyclerView.setVisibility(View.VISIBLE);
        }
    }

    public static void init(ProductListFragment productListFragment,TextSearchResponse textSearchResponse) {
        ArrayList<FilterData> categoryList = new ArrayList<FilterData>();
        ArrayList<FilterData> brandList = new ArrayList<FilterData>();
        ArrayList<FilterData> eventList = new ArrayList<FilterData>();

        for (SubCategories value : textSearchResponse.getCategoryHierarchyData().getSubcategories()) {
            if (value.getName() != null) {
                categoryList.add(new FilterData(value.getId(), value.getName(), value.getCountName()));
                //productListFragment.cateIdList.add(value.getCountName());
            }
        }

        //if (Hawk.get(AppUtils.category_list) == null || ((ArrayList)Hawk.get(AppUtils.category_list)).size() == 0) {
        for (Map.Entry<String, List<TextSearchResponse.Facet.Value>> entry : textSearchResponse.getFilterData().entrySet()) {

            if (entry.getKey().equals(productListFragment.getString(R.string.product_cate_from_API))) {
                //for (SubCategories value : textSearchResponse.getCategoryHierarchyData().getSubcategories()) {
                //    if (value.getName() != null) {
                //        categoryList.add(new FilterData(value.getId(), value.getName(), value.getCountName()));
                //productListFragment.cateIdList.add(value.getCountName());
                //    }
                //}
            } else if (entry.getKey().equals(productListFragment.getString(R.string.product_brand_from_API))) {
                // 品牌
                for (TextSearchResponse.Facet.Value value : entry.getValue()) {
                    if (value.getCountString() != null)
                        brandList.add(new FilterData(value.getName(), value.getCountString()));
                }
            } else if (entry.getKey().equals(productListFragment.getString(R.string.product_event_from_API))) {
                // 特惠活動
                for (TextSearchResponse.Facet.Value value : entry.getValue()) {
                    if (value.getName() != null)
                        eventList.add(new FilterData(value.getName(), value.getCountString()));
                }
            } else if (entry.getKey().equals(productListFragment.getString(R.string.product_price_from_API))) {
                // 價格
                //Log.i("mmprice", "mmprice " );
                productListFragment.productListRepo.maxPrice = 0;
                productListFragment.productListRepo.minPrice = 0;

                for (TextSearchResponse.Facet.Value value : entry.getValue()) {
                    try {
                        if (value.getName() != null) {
                            float price = Float.parseFloat(value.getName()); // (int)Math.ceil(Float.parseFloat(value.getName()));

                            if (productListFragment.productListRepo.maxPrice == 0 && productListFragment.productListRepo.minPrice == 0) {
                                productListFragment.productListRepo.minPrice = (int)Math.floor((price));
                                productListFragment.productListRepo.maxPrice = (int)Math.ceil((price));
                                //Log.i("mmprice", "mmprice " + price);
                            } else if (price > productListFragment.productListRepo.maxPrice) {
                                productListFragment.productListRepo.maxPrice = (int)Math.ceil((price));
                                //Log.i("mmprice", "maxmprice " + price);
                            } else if (price < productListFragment.productListRepo.minPrice) {
                                productListFragment.productListRepo.minPrice =  (int)Math.floor((price));
                                //Log.i("mmprice", "minmprice " + price);
                            }
                        }
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        //}


        //productListFragment.productListRepo.categoryList = categoryList;
        productListFragment.productListRepo.brandList = brandList;
        productListFragment.productListRepo.eventList = eventList;
        //productListFragment.productListRepo.sorts = textSearchResponse.getSorts();
        productListFragment.productListRepo.facets = textSearchResponse.getFacet();
        //productListFragment.productListRepo.selectedMinPrice = productListFragment.productListRepo.selectedMinPrice;
        //productListFragment.productListRepo.selectedMaxPrice = productListFragment.productListRepo.selectedMaxPrice;

        //Hawk.put(AppUtils.category_list, categoryList);
        //Hawk.put(AppUtils.brand_list, brandList);
        //Hawk.put(AppUtils.event_list, eventList);

        productListFragment.productListRepo.sorts.clear();

        TextSearchResponse.Sorts brandSort = new TextSearchResponse.Sorts();
        brandSort.setCode("masterBrandName");
        brandSort.setName(productListFragment.getString(R.string.sorting_brand_name));
        brandSort.setSelected(true);
        productListFragment.productListRepo.sorts.add(brandSort);

        TextSearchResponse.Sorts newSort = new TextSearchResponse.Sorts();
        newSort.setCode("new");
        newSort.setName(productListFragment.getString(R.string.sorting_new));
        productListFragment.productListRepo.sorts.add(newSort);

        TextSearchResponse.Sorts lowToHigh = new TextSearchResponse.Sorts();
        lowToHigh.setCode("price-asc");
        lowToHigh.setName(productListFragment.getString(R.string.sorting_low_to_high));
        productListFragment.productListRepo.sorts.add(lowToHigh);

        TextSearchResponse.Sorts highToLow = new TextSearchResponse.Sorts();
        highToLow.setCode("price-desc");
        highToLow.setName(productListFragment.getString(R.string.sorting_hight_to_low));
        productListFragment.productListRepo.sorts.add(highToLow);

        TextSearchResponse.Sorts aToZ = new TextSearchResponse.Sorts();
        aToZ.setCode("productName-asc");
        aToZ.setName(productListFragment.getString(R.string.sorting_product_name_a_to_z));
        productListFragment.productListRepo.sorts.add(aToZ);

        TextSearchResponse.Sorts zToA = new TextSearchResponse.Sorts();
        zToA.setCode("productName-desc");
        zToA.setName(productListFragment.getString(R.string.sorting_product_name_z_to_a));
        productListFragment.productListRepo.sorts.add(zToA);


        if(textSearchResponse.getProducts().size() == 1){
            productListFragment.productListRepo.useSortButton = false;
        }

    }

/*
  "sorts": [
    {
      "code": "masterBrandName",
      "name": "Brand Name",
      "selected": false
    },
    {
      "code": "mostRelevant",
      "name": "Most Relevant",
      "selected": false
    },
    {
      "code": "new",
      "name": "New",
      "selected": false
    },
    {
      "code": "topRated",
      "name": "Top Rated",
      "selected": true
    },
    {
      "code": "price-asc",
      "name": "Price Low to High",
      "selected": false
    },
    {
      "code": "price-desc",
      "name": "Price High to Low",
      "selected": false
    },
    {
      "code": "productName-asc",
      "name": "Product Name A-Z",
      "selected": false
    },
    {
      "code": "productName-desc",
      "name": "Product Name Z-A",
      "selected": false
    },
    {
      "code": "igcBestSeller",
      "name": "Best Seller",
      "selected": false
    },
    {
      "code": "productNewInIndex",
      "name": "Default",
      "selected": false
    },
    {
      "code": "productWhatsHotIndex",
      "name": "Default",
      "selected": false
    },
    {
      "code": "productBestSellerIndex",
      "name": "Default",
      "selected": false
    },
    {
      "code": "productTopSellIndex",
      "name": "Default",
      "selected": false
    },
    {
      "code": "productOnlineOnlyIndex",
      "name": "Default",
      "selected": false
    },
    {
      "code": "productIwatsonsOnlyIndex",
      "name": "Default",
      "selected": false
    },
    {
      "code": "productWhyNotTryIndex",
      "name": "Default",
      "selected": false
    },
    {
      "code": "productList1Index",
      "name": "Default",
      "selected": false
    },
    {
      "code": "productList2Index",
      "name": "Default",
      "selected": false
    },
    {
      "code": "productList3Index",
      "name": "Default",
      "selected": false
    },
    {
      "code": "productList4Index",
      "name": "Default",
      "selected": false
    },
    {
      "code": "productList5Index",
      "name": "Default",
      "selected": false
    },
    {
      "code": "productHighlightIndex",
      "name": "Default",
      "selected": false
    },
    {
      "code": "productPromotionIndex",
      "name": "Default",
      "selected": false
    },
    {
      "code": "productExclusiveIndex",
      "name": "Default",
      "selected": false
    },
    {
      "code": "productOfferIndex",
      "name": "Default",
      "selected": false
    },
    {
      "code": "productSpecialIndex",
      "name": "Default",
      "selected": false
    }
  ],*/
}
