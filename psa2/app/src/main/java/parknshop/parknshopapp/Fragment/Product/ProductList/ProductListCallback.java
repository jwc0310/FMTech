package parknshop.parknshopapp.Fragment.Product.ProductList;

import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import parknshop.parknshopapp.AnimationHelper;
import parknshop.parknshopapp.Base.HttpController.CustomRunnable;
import parknshop.parknshopapp.EventUpdate.ProductDetailEvent;
import parknshop.parknshopapp.Fragment.Product.ProductDetailWithPromotion.PromotionRecyclerViewAdapter;
import parknshop.parknshopapp.Model.PromotionResponse;
import parknshop.parknshopapp.Model.TextSearchResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Utils.Utils;

/**
 * Created by chrisyu on 11/3/16.
 */
public class ProductListCallback extends CustomRunnable {
    RecyclerView recyclerView;
    ProductListAdapter productListAdapter;
    ProductListFragment productListFragment;
    int totalItems;
    boolean reload;
    TextSearchResponse textSearchResponse;
    boolean isProductDetail;
    PromotionResponse.Data mPromotionData;

    public ProductListCallback(ProductListFragment productListFragment) {
        this.recyclerView = productListFragment.recyclerView;
        this.productListAdapter = productListFragment.productListAdapter;
        this.productListFragment = productListFragment;
        this.reload = productListFragment.reload;
    }

    public void setPromotionData(PromotionResponse.Data mPromotionData) {
        this.mPromotionData = mPromotionData;
        this.productListAdapter.setPromotionData(mPromotionData);
    }

    public PromotionResponse.Data getPromotionData() {
        return mPromotionData;
    }

    @Override
    public void run() {

        //if(mPromotionData != null)

        //if(productListFragment.mPromotionData != null && productListFragment.mPromotionData.getPromotionType().equals("a"))
        //    productListFragment.productListAdapter.productList.clear();
        final Handler handler = new Handler(Looper.getMainLooper());
        final Runnable r = new Runnable() {
            public void run() {
                try {
                    productListFragment.progressBar.setVisibility(View.GONE);

                    if (productListFragment.productListAdapter.page == 0)
                        productListFragment.productListAdapter.productList.clear();

                    //productListFragment.dimmed.setVisibility(View.GONE);
                    //textSearchResponse = (TextSearchResponse)this.data;
                    if (textSearchResponse != null) {

                        productListFragment.no_item_found.setVisibility(View.GONE);
                        productListFragment.items.setVisibility(View.VISIBLE);

                        if (productListFragment.productId.length() == 0 && productListAdapter.page == 0) {
                            productListFragment.sortButton.setVisibility(View.VISIBLE);
                        }

                        if (!isProductDetail && (textSearchResponse.getProducts() == null || textSearchResponse.getProducts().size() == 0)) {
                            //no more
                            //productListAdapter.noMore = true;
                            //Hawk.put(AppUtils.product_list_has_more, false);

                            if(mPromotionData != null) {
                                recyclerView.setAdapter(productListAdapter);
                                productListAdapter.hasHeader = true;
                            }

                            productListFragment.hasMore = false;
                            productListAdapter.notifyDataSetChanged();

                            if (reload)
                                clearData(textSearchResponse);

                            else if (productListAdapter.page == 0 && mPromotionData == null) {
                                productListFragment.no_item_found.setVisibility(View.VISIBLE);
                                productListFragment.items.setVisibility(View.GONE);
                                if (productListFragment.productListRepo.firstRun) {
                                    productListFragment.sortButton.setVisibility(View.GONE);
                                    productListFragment.productListRepo.firstRun = false;
                                }
                            }
                        } else {

                            if (productListFragment.productListRepo.firstRun) {
                                ProductListPresenter.initCategoryBubble(productListFragment);
                                productListFragment.productListRepo.firstRun = false;
                            }
                            ProductListPresenter.init(productListFragment, textSearchResponse);


                            if (reload) {
                                clearData(textSearchResponse);
                            } else {
                                productListAdapter.productList.addAll(textSearchResponse.getProducts());
                                productListAdapter.hasHeader = true;

                                if (productListAdapter.page == 0)
                                    recyclerView.setAdapter(productListAdapter);

                                productListAdapter.notifyDataSetChanged();
                            }

                            productListFragment.productListAdapter.page++;
                        }

                        initCategoryList(productListFragment);

                        //fade out //or no use ...//just gone ed
                        initViewPagerTab(textSearchResponse);
                        // productListAdapter.totalCount = Integer.valueOf(textSearchResponse.getTotalResult());

                        productListFragment.items.setText("" + Integer.valueOf(textSearchResponse.getTotalResult()) + " " + productListFragment.getResources().getString(R.string.items));
                        productListAdapter.totalCount = ("" + Integer.valueOf(textSearchResponse.getTotalResult()) + " " +  productListFragment.getResources().getString(R.string.items));

                        if (mPromotionData != null)
                            productListFragment.sortButton.setVisibility(View.GONE);

                    } else if (getPromotionData() != null) { // Promotion type b and c
                        PromotionRecyclerViewAdapter promotionRecyclerViewAdapter = getPromotionData().getPromotionType().equals("b") ? new PromotionRecyclerViewAdapter(productListFragment, mPromotionData.getPromotionItemSet(), mPromotionData.getPromotionImageSet()) : new PromotionRecyclerViewAdapter(productListFragment);
                        recyclerView.setHasFixedSize(true);
                        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
                        recyclerView.setLayoutManager(staggeredGridLayoutManager);
                        promotionRecyclerViewAdapter.hasFooter = false;
                        promotionRecyclerViewAdapter.hasHeader = true;
                        promotionRecyclerViewAdapter.mPromotionData = mPromotionData;
                        //promotionRecyclerViewAdapter.redemptionItemList = (data).redemeptionItemVOList;

                        productListFragment.sortButton.setVisibility(View.GONE);
                        recyclerView.setAdapter(promotionRecyclerViewAdapter);
                    }

                    //Log.i("yo", productListFragment.isHappyTime + " " + productListFragment.isSideMenu + " " + productListFragment.isAnimationAdded + " " + productListFragment.productId.length());
                    if (!productListFragment.isHappyTime && !productListFragment.isSideMenu && !productListFragment.isAnimationAdded && productListFragment.productId.length() == 0) {
                        //if (productListFragment.productListRepo.newCatList.size() > 0 && (!(productListFragment.isAnimationAdded))) {
                            productListFragment.isAnimationAdded = true;
                            recyclerView.setOnScrollListener(new RecyclerView.OnScrollListener() {
                                @Override
                                public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                                    super.onScrolled(recyclerView, dx, dy);

                                    if (recyclerView.computeVerticalScrollOffset() > Utils.dpToPxHeight(115, productListFragment.getBaseActivity()) && dy > 0) {
                                        if (productListFragment.productListRepo.newCatList.size() > 0) AnimationHelper.slideToTop(productListFragment.categoryRecyclerView, 115);
                                        AnimationHelper.slideToBottomGone(productListFragment.sortButton, Utils.dpToPxHeight(400, productListFragment.getBaseActivity()));
                                        //AnimationHelper.slideToTop(productListFragment.cartPanel, 95);
                                        isSortButtonHiddenByScrolling = true;
                                    }

                                    if (dy < 0) {
                                        if (productListFragment.productListRepo.newCatList.size() > 0)
                                            AnimationHelper.slideFromTop(productListFragment.categoryRecyclerView, 115);
                                        AnimationHelper.slideFromBottomByPx(productListFragment.sortButton, Utils.dpToPxHeight(400, productListFragment.getBaseActivity()), productListFragment.getBaseActivity());
                                        isSortButtonHiddenByScrolling = false;
                                    }
                                }

                                @Override
                                public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                                    super.onScrollStateChanged(recyclerView, newState);
                                }
                            });
                        //}
                    } else if(productListFragment.productId.length() > 0) {
                        recyclerView.setOnScrollListener(new RecyclerView.OnScrollListener() {
                            @Override
                            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                                super.onScrolled(recyclerView, dx, dy);
                                if(Utils.dpToPxHeight(250, productListFragment.getActivity()) > recyclerView.computeVerticalScrollOffset()) {
                                    ProductDetailEvent productDetailEvent = new ProductDetailEvent(Utils.getScreenHeight(productListFragment.getActivity()), recyclerView.computeVerticalScrollOffset());
                                    MyApplication.getInstance().mBus.post(productDetailEvent);
                                }
                            }

                            @Override
                            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                                super.onScrollStateChanged(recyclerView, newState);
                            }
                        });
                    }
                    productListAdapter.isCallingApi = false;
                    productListFragment.hideProgressDialog();
                } catch (Exception e) {

                }
            }
        };

        handler.postDelayed(r, 300);
    }

    public void clearData(TextSearchResponse textSearchResponse) {
        //Hawk.put(AppUtils.product_list_has_more, true);
        productListFragment.hasMore = true;
        productListAdapter.page = 0;
        productListFragment.reload = false;
        productListAdapter.productList.clear();
        productListAdapter.swap(textSearchResponse.getProducts());
    }


    public void initCategoryList(ProductListFragment productListFragment) {
        if(productListFragment.productListRepo.newCatList.size() == 0 || productListFragment.productId.length() > 0 || productListFragment.childdata != null || productListFragment.mPromotionData != null) {
            productListFragment.categoryRecyclerView.setVisibility(View.GONE);
        } else if(!productListFragment.isCrazySale && !productListFragment.isCategoryWrapping){
            //if(productListAdapter.page == 0)
             //   productListFragment.categoryRecyclerView.setVisibility(View.VISIBLE);

            if(productListFragment.categoryRecyclerView.getAdapter() == null) {
                productListFragment.headerCircleProductCategoryAdapter = (new HeaderCircleProductCategoryAdapter(productListFragment.productListRepo.newCatList, productListFragment));
                productListFragment.headerCircleProductCategoryAdapter.categoryId = productListFragment.categoryId;
                productListFragment.headerCircleProductCategoryAdapter.headerId = productListFragment.headerId;


                productListFragment.categoryRecyclerView.setAdapter(productListFragment.headerCircleProductCategoryAdapter);
                Animation slideToRight = AnimationUtils.loadAnimation(productListFragment.getBaseActivity(), R.anim.slide_to_right);

                slideToRight.setDuration(1000);
                //slideToRight.setInterpolator(new AccelerateInterpolator(1.0f));
                productListFragment.categoryRecyclerView.startAnimation(slideToRight);

            } else {
                productListFragment.headerCircleProductCategoryAdapter.setData(productListFragment.productListRepo.categoryList);
                productListFragment.headerCircleProductCategoryAdapter.notifyDataSetChanged();
            }
        }
    }

    public boolean isSortButtonHiddenByScrolling;
    public void initViewPagerTab(TextSearchResponse textSearchResponse) {
        //if(productListFragment.viewPager.getAdapter() == null) {
        //    productListFragment.categoryViewPagerAdapter = new CategoryViewPagerAdapter(productListFragment.getFragmentManager(), Hawk.get(AppUtils.category_list, new ArrayList<FilterData>()), productListFragment);
        //    productListFragment.viewPager.setAdapter(productListFragment.categoryViewPagerAdapter);
        //    productListFragment.viewPager.setOnPageChangeListener(productListFragment.categoryViewPagerAdapter);
        //    productListFragment.tabLayout.setupWithViewPager(productListFragment.viewPager);
        //   productListFragment.tabLayout.setTabTextColors(productListFragment.getResources().getColorStateList(R.color.tab_text_color));
        //}
        //if(productListFragment.categoryViewPagerAdapter.position == 0)
        //    productListFragment.items.setText(textSearchResponse.getTotalResult() + " items");
        //else
        //    productListFragment.items.setText(textSearchResponse.getCategoryHierarchyData().getSubcategories().get(productListFragment.categoryViewPagerAdapter.position - 1).getTotalNumber()  + " items");
    }
}
