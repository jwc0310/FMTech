package parknshop.parknshopapp.Fragment.Category;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.Model.Category.CategoryDrawerItem;
import parknshop.parknshopapp.Model.TextSearchResponse;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 10/3/16.
 */
public class CategoryFragment extends BaseFragment {
    @Bind (R.id.viewpager) ViewPager viewPager;
    public @Bind (R.id.tab_layout) TabLayout tabLayout;

    Map<String, TextSearchResponse> textSearchResponses = new HashMap<>();

    public List<CategoryDrawerItem> groupData;
    public int childPosition;
    public String title;
    public int apiCalled = 0;

    View view;

    public static CategoryFragment newInstance(int categoryId, String title) {
        CategoryFragment categoryFragment = new CategoryFragment();
        Bundle args = new Bundle();
        args.putInt("categoryId", categoryId);
        args.putString("title", title);
        categoryFragment.setArguments(args);
        return categoryFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //showProgressDialog();

        view = getActivity().getLayoutInflater().inflate(R.layout.category_fragment_layout, null);
        ButterKnife.bind(this, view);


        int categoryId = getArguments() != null ? getArguments().getInt("categoryId", 0) : 0;


        CategoryViewPagerAdapter categoryViewPagerAdapter = new CategoryViewPagerAdapter(this.getChildFragmentManager(), groupData, getBaseActivity());
        viewPager.setAdapter(categoryViewPagerAdapter);
        //viewPager.setOffscreenPageLimit(groupData.size());
        viewPager.addOnPageChangeListener(categoryViewPagerAdapter);

        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabTextColors(getResources().getColorStateList(R.color.tab_text_color));


        viewPager.setCurrentItem(childPosition);

        if(groupData != null && groupData.size() > childPosition && groupData.get(childPosition) != null)
            setToolbarTitle(groupData.get(childPosition).text);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout resource file
        showMenuButton();
        showToolbar();
        enableNavigationDrawer();
        enableSecondRightButton();

        return view;
    }

    public String titleString;

    @Override
    public void onPause() {
        super.onPause();
        titleString = getToolbarTitle().getText().toString();
    }

    //public List<CategoryDrawerItem> groupData;
    //public int childPosition;
    //public String title;
    @Override
    public void onResume() {
        super.onResume();
        if(titleString != null) {
            setToolbarTitle(titleString);
        } else {
        }
       // setToolbarTitle(groupData.get(childPosition).getSubCategory().getTitle());//getName());

        /*for (CategoryDrawerItem categoryDrawerItem : groupData) {
            if(categoryDrawerItem.getSubCategory() != null){
                String subCategoryType = categoryDrawerItem.getSubCategory().getContentType();  //Content type

                String value = categoryDrawerItem.getSubCategory().getValue();

                if(subCategoryType.equals(GlobalConstant.CATEGORY)){
                    WebServiceModel.getInstance(getActivity()).requestProductList(value, "0", "", "Cat", this.hashCode(), subCategoryType);
                } else if(subCategoryType.equals(GlobalConstant.PROMOTION_TAG)){
                    WebServiceModel.getInstance(getActivity()).requestProductList(value, "", "", "Cat", this.hashCode(), subCategoryType);
                } else if(subCategoryType.equals(GlobalConstant.BRAND)){
                    WebServiceModel.getInstance(getActivity()).requestProductList(value, "", "", "BRAND", this.hashCode(), subCategoryType);
                } else if(subCategoryType.equals(GlobalConstant.CUSTOMIZE_PRODUCT)){
                    WebServiceModel.getInstance(getActivity()).requestGetCustomizeProducts(value);
                }

            }
        }*/
    }

    /*
    public void onEvent(GetProductsByTextSearchResponseEvent getProductsByTextSearchResponseEvent) {
//        LogUtil.info("", "searchByText123dadsadas:"+getProductsByTextSearchResponseEvent.getTextSearchResponse().getProducts().size());
        if(!getProductsByTextSearchResponseEvent.getSuccess()){
            ToastUtils.show(getActivity(), getProductsByTextSearchResponseEvent.getMessage());
        }else{
            if(getProductsByTextSearchResponseEvent.getType().equals(GlobalConstant.CATEGORY)){
                textSearchResponses.put(GlobalConstant.CATEGORY, getProductsByTextSearchResponseEvent.getTextSearchResponse());
            }else if(getProductsByTextSearchResponseEvent.getType().equals(GlobalConstant.PROMOTION_TAG)){
                textSearchResponses.put(GlobalConstant.PROMOTION_TAG, getProductsByTextSearchResponseEvent.getTextSearchResponse());
            }else if(getProductsByTextSearchResponseEvent.getType().equals(GlobalConstant.BRAND)){
                textSearchResponses.put(GlobalConstant.BRAND, getProductsByTextSearchResponseEvent.getTextSearchResponse());
//            }else if(getProductsByTextSearchResponseEvent.getType().equals(GlobalConstant.CUSTOMIZE_PRODUCT)){

            }
        }
        apiCalled ++;

        // Finished API Call, set adapter
        if(apiCalled == 4) {
            apiCalled = 0;
            hideProgressDialog();
            setAdapter();
        }

    }*/
/*
    public void onEvent(CustomizeProductEvent customizeProductEvent){

        if(!customizeProductEvent.getSuccess()){
            ToastUtils.show(getActivity(), customizeProductEvent.getMessage());
        }else{
            String query = ":iwaBestSellerQty";
            for(int i = 0; i < customizeProductEvent.getCustomizeProductResponse().getData().getProducts().size(); i++){
                query = query+":defaultVariantCode:"+customizeProductEvent.getCustomizeProductResponse().getData().getProducts().get(i).getProductId();
            }
            WebServiceModel.getInstance(getActivity()).requestGetProductsByCat(getActivity(), "Cat", query);
        }
    }

    public void onEvent(GetProductsByCatResponseEvent getProductsByCatResponseEvent){
        if(getProductsByCatResponseEvent.getSuccess()){
            textSearchResponses.put(GlobalConstant.CUSTOMIZE_PRODUCT, getProductsByCatResponseEvent.getTextSearchResponse());
        }else{
            ToastUtils.show(getActivity(), getProductsByCatResponseEvent.getMessage());
        }
        apiCalled ++;
        // Finished API Call, set adapter
        if(apiCalled == 4) {
            apiCalled = 0;
            hideProgressDialog();
            setAdapter();
        }
    }*/
/*
    public void setAdapter(){
        CategoryViewPagerAdapter categoryViewPagerAdapter = new CategoryViewPagerAdapter(this.getChildFragmentManager(), groupData, textSearchResponses, getBaseActivity());
        viewPager.setAdapter(categoryViewPagerAdapter);
        viewPager.setOffscreenPageLimit(groupData.size());
        viewPager.addOnPageChangeListener(categoryViewPagerAdapter);

        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabTextColors(getResources().getColorStateList(R.color.tab_text_color));
        viewPager.setCurrentItem(childPosition);
    }

    public void onEvent(CategoryViewPagerAdapterOnPageSelectedEvent categoryViewPagerAdapterOnPageSelectedEvent) {
        childPosition = categoryViewPagerAdapterOnPageSelectedEvent.getPosition();
    }*/
}
