package parknshop.parknshopapp.Fragment.Product.ProductList;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.orhanobut.hawk.Hawk;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.GlobalConstant;
import parknshop.parknshopapp.Model.Category.CategoryDrawerItem;
import parknshop.parknshopapp.Model.Category.CategoryTree;
import parknshop.parknshopapp.Model.Category.SubCategory;
import parknshop.parknshopapp.Model.FilterData;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Utils.LogUtil;
import parknshop.parknshopapp.View.CircleImageView;

/**
 * Created by chrisyu on 23/3/16.
 */
public class HeaderCircleProductCategoryAdapter extends RecyclerView.Adapter {
    public String headerId;
    public String categoryId;
    public boolean toProductListPage;
    ProductListFragment productListFragment;
    RecyclerView recyclerView;

    private ArrayList<FilterData> filterDatas = new ArrayList<FilterData>();
    //public ArrayList<OnClickListener>
    public int position;
    private ArrayList<String> urlList = new ArrayList<>();

    ArrayList<ProductCategoryViewHolder> productCategoryViewHolders = new ArrayList<>();

    public List<parknshop.parknshopapp.Model.Category.CategoryTree.Data.SubCategory> newCatList = new ArrayList<>();

    public HeaderCircleProductCategoryAdapter(ArrayList<FilterData> filterDatas, ProductListFragment productListFragment) {
        this.filterDatas = filterDatas;
        this.productListFragment = productListFragment;
        this.recyclerView = productListFragment.categoryRecyclerView;
        //manupulateInformation();
    }

    public HeaderCircleProductCategoryAdapter(ArrayList<FilterData> filterDatas, BaseFragment bf, RecyclerView recyclerView) {
        this.filterDatas = filterDatas;
        this.productListFragment = (ProductListFragment)bf;
        this.recyclerView = recyclerView;
        //manupulateInformation();
    }

    public HeaderCircleProductCategoryAdapter(List<parknshop.parknshopapp.Model.Category.CategoryTree.Data.SubCategory> newCatList, ProductListFragment productListFragment) {
        this.newCatList = newCatList;
        this.productListFragment = productListFragment;
        this.recyclerView = productListFragment.categoryRecyclerView;
    }

    public void setData(ArrayList<FilterData> filterDatas) {
        this.filterDatas = filterDatas;
    }

    public void manupulateInformation() {
        if(filterDatas != null && urlList.size() == 0) {
            //urlList.clear();
            for(int i = 0; i < filterDatas.size(); i++) {
                String urlPath = getImagePathOnCategoryTreeById((categoryId), (filterDatas.get(i).getId()));
                //Log.i("urlPath", "urlPath" + urlPath +categoryId + " " + filterDatas.get(i).getId());
                urlList.add(urlPath);
            }
        }
    }

    @Override
    public ProductCategoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //TODO
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_category_item, parent, false);
        ProductCategoryViewHolder vh = new ProductCategoryViewHolder(v, productListFragment);

        //manupulateInformation();

        if(!productCategoryViewHolders.contains(vh))
            productCategoryViewHolders.add(vh);

        return vh;
    }

    public boolean isNumeric(String str)
    {
        if(str == null)
            return false;

        try
        {
            double d = Double.parseDouble(str);
        }
        catch(NumberFormatException nfe)
        {
            return false;
        }
        return true;
    }


    public String getImagePathOnCategoryTreeById(String secondLevelCategoryId, String thirdLevelCategoryId) {
        CategoryTree categoryTree = Hawk.get("categoryTree", new CategoryTree());

        for(int i = 0; i < categoryTree.getData().getSubcategories().size() ; i++) {
            CategoryTree.Data.SubCategory subCategory = categoryTree.getData().getSubcategories().get(i);
            for(int x = 0; x < subCategory.getSubcategories().size(); x++) { //level 1
                if((subCategory.getSubcategories().get(x).id).equals( secondLevelCategoryId))
                    for(int y = 0; y < subCategory.getSubcategories().get(x).getSubcategories().size(); y++) //level 2
                        if((subCategory.getSubcategories().get(x).getSubcategories().get(y).id) .equals( thirdLevelCategoryId))
                            return (subCategory.getSubcategories().get(x).getSubcategories().get(y).getImage());

            }
        }
        return "";
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {
        final ProductCategoryViewHolder currentHolder = (ProductCategoryViewHolder) holder;

        FilterData currentData = new FilterData("", "");

        if(filterDatas != null && filterDatas.size() > 0) {
            currentData = filterDatas.get(getRealPosition(position));
            currentHolder.titleTextView.setText(currentData.getName());
        } else if(newCatList != null && newCatList.size() > 0){
            parknshop.parknshopapp.Model.Category.CategoryTree.Data.SubCategory tempData = newCatList.get(getRealPosition(position));
            currentHolder.titleTextView.setText(tempData.getName());
        }

        String urlPath = "";

        if(newCatList != null && newCatList.size() > 0) {
            if(newCatList.get(position).getImage() != null)
                Glide.with(productListFragment.getBaseActivity()).load(newCatList.get(position).getImage()).into(((ProductCategoryViewHolder) holder).circleImageView);
            else
                Glide.with(productListFragment.getBaseActivity()).load(R.drawable.parknshop_circle).into(((ProductCategoryViewHolder) holder).circleImageView);

        } else if(currentData != null && currentData.getImageUrl() != null && currentData.getImageUrl().length() > 0) {
            Glide.with(productListFragment.getBaseActivity()).load(currentData.getImageUrl()).error(R.drawable.parknshop_circle).into(((ProductCategoryViewHolder) holder).circleImageView);
        } else if(categoryId != null && (categoryId).length() > 0 && urlList != null) {
            if(urlList.size() > 0) {
                Glide.with(productListFragment.getBaseActivity()).load(urlList.get(position)).error(R.drawable.parknshop_circle).into(((ProductCategoryViewHolder) holder).circleImageView);
            } else if(getImagePathOnCategoryTreeById((categoryId), currentData.getId()) != null) {
                 urlPath = getImagePathOnCategoryTreeById((categoryId), (currentData.getId()));
                 //Log.i("yoyoyoy", "yiyiyiyiyi" + " " + " " + categoryId + " " + categoryId + " " + currentData + " " + currentData.getImageUrl() + urlPath);

                 Glide.with(productListFragment.getBaseActivity()).load(urlPath).error(R.drawable.parknshop_circle).into(((ProductCategoryViewHolder) holder).circleImageView);
             }
        } else {
            Glide.with(productListFragment.getBaseActivity()).load(R.drawable.parknshop_circle).into(((ProductCategoryViewHolder) holder).circleImageView);
        }


        if(currentData.selected) {
            currentHolder.circleImageView.setSelected(true);
            currentHolder.titleTextView.setTextColor(productListFragment.getBaseActivity().getResources().getColor(R.color.colorPrimary)); //578cf7
        } else {
            currentHolder.circleImageView.setSelected(false);
            currentHolder.titleTextView.setTextColor(productListFragment.getBaseActivity().getResources().getColor(R.color.black));
        }

        if(newCatList != null && newCatList.size() > 0) {
            parknshop.parknshopapp.Model.Category.CategoryTree.Data.SubCategory tempData = newCatList.get(getRealPosition(position));
            currentHolder.circleImageView.setSelected(tempData.selected);
            if(tempData.selected) {
                currentHolder.titleTextView.setTextColor(productListFragment.getBaseActivity().getResources().getColor(R.color.colorPrimary)); //578cf7
            } else {
                currentHolder.titleTextView.setTextColor(productListFragment.getBaseActivity().getResources().getColor(R.color.black));
            }
        }

        //Log.i("isSelected", "isSelected " + currentData.selected);

        currentHolder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(toProductListPage) {
                    FilterData currentData = filterDatas.get(getRealPosition(position));
                    CategoryDrawerItem childdata = new CategoryDrawerItem(currentData.getCountName(), currentData.getName(), currentData.getName());
                    SubCategory subCategory = childdata.getSubCategory();
                    subCategory.setContentType(GlobalConstant.CATEGORY);
                    subCategory.setValue(currentData.getCountName());
                    childdata.setSubCategory(subCategory);
                    ProductListFragment plf = ProductListFragment.newInstance(0, childdata, false);
                    plf.setGATag(childdata.getTagGA());
                    LogUtil.info("", "headerCircleOrProductCat123:"+childdata.getTagGA());
                    plf.showBackButton = true;
                    productListFragment.placeFragmentWithBackStack(plf);
                    return;
                }

                productListFragment.recyclerView.stopScroll();
                productListFragment.staggeredGridLayoutManager.scrollToPositionWithOffset(0,0);

                if(filterDatas != null && filterDatas.size() > 0){
                    FilterData currentData = (filterDatas.get(getRealPosition(position)));

                    for (FilterData fd : filterDatas)
                        if (currentData != fd)
                            fd.selected = false;


                    currentData.selected = !currentData.selected;

                    for (ProductCategoryViewHolder pcvh : productCategoryViewHolders)
                        if (pcvh != currentHolder) {
                            pcvh.circleImageView.setSelected(false);
                            pcvh.titleTextView.setTextColor(productListFragment.getBaseActivity().getResources().getColor(R.color.black));
                        }

                    //Log.i("isSelected 2", "isSelected 2 " + !currentHolder.circleImageView.getSelected());
                    currentHolder.circleImageView.setSelected(!currentHolder.circleImageView.getSelected());

                    currentHolder.circleImageView.invalidate();

                    notifyDataSetChanged();

                    productListFragment.productListRepo.categoryList = filterDatas;
                    productListFragment.showBackButton = true;

                    if(currentHolder.circleImageView.getSelected()) {
                        productListFragment.productListRepo.lastSelectedCategoryPosition = position + 1;
                    } else {
                        productListFragment.productListRepo.lastSelectedCategoryPosition = 0;
                    }
                    //Hawk.put(AppUtils.category_list, filterDatas);

                    LogUtil.info("", "headerCircleOrProductCat:");
                    productListFragment.reload = true;
                    productListFragment.callApi(0);
                    productListFragment.showProgressDialog();
                }

                if(newCatList != null && newCatList.size() > 0) {

                    parknshop.parknshopapp.Model.Category.CategoryTree.Data.SubCategory currentData = (newCatList.get(getRealPosition(position)));

                    for (parknshop.parknshopapp.Model.Category.CategoryTree.Data.SubCategory fd : newCatList)
                        if (currentData != fd)
                            fd.selected = false;


                    currentData.selected = !currentData.selected;

                    for (ProductCategoryViewHolder pcvh : productCategoryViewHolders)
                        if (pcvh != currentHolder) {
                            pcvh.circleImageView.setSelected(false);
                            pcvh.titleTextView.setTextColor(productListFragment.getBaseActivity().getResources().getColor(R.color.black));
                        }

                    //Log.i("isSelected 2", "isSelected 2 " + !currentHolder.circleImageView.getSelected());
                    currentHolder.circleImageView.setSelected(!currentHolder.circleImageView.getSelected());

                    currentHolder.circleImageView.invalidate();

                    notifyDataSetChanged();

                    productListFragment.productListRepo.newCatList = newCatList;
                    productListFragment.showBackButton = true;
                    //Hawk.put(AppUtils.category_list, filterDatas);

                    LogUtil.info("", "headerCircleOrProductCat312:"+currentData.getCateStringEN()+"/"+currentData.getCateStringEN()+"/c/"+currentData.getId());

                    String GA_TAG = currentData.getCateStringEN()+"/"+currentData.getCateStringEN()+"/c/"+currentData.getId();
                    GATrackerHelper.getInstance(MyApplication.getInstance()).setProduct();
                    GATrackerHelper.getInstance(MyApplication.getInstance()).setCategory(GA_TAG);
                    GATrackerHelper.getInstance(MyApplication.getInstance()).setGATracker(GA_TAG);


                    productListFragment.reload = true;
                    productListFragment.callApi(0);
                    productListFragment.showProgressDialog();
                }
            }
        });
    }

    public int getRealPosition(int position) {
        return position;
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        //Log.i("newCatList", "newCatList" +newCatList.size() );

        if(newCatList != null && newCatList.size() > 0)
            return newCatList.size();

        return filterDatas.size() ;
    }

    class ProductCategoryViewHolder extends RecyclerView.ViewHolder {
        View view;
        ProductListFragment productListFragment;
        public @Bind(R.id.title) TextView titleTextView;
        public @Bind(R.id.circle_image_view) CircleImageView circleImageView;

        public ProductCategoryViewHolder(View view, ProductListFragment productListFragment) {
            super(view);
            this.view = view;
            this.productListFragment = productListFragment;
            ButterKnife.bind(this, view);
        }
    }
}
