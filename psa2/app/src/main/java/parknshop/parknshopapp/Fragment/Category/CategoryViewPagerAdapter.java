package parknshop.parknshopapp.Fragment.Category;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;

import java.util.List;
import java.util.Map;

import parknshop.parknshopapp.Base.BaseActivity;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.EventUpdate.CategoryViewPagerAdapterOnPageSelectedEvent;
import parknshop.parknshopapp.Fragment.Category.CategoryHighLight.CategoryHighLightFragment;
import parknshop.parknshopapp.Fragment.Product.ProductList.ProductListFragment;
import parknshop.parknshopapp.GlobalConstant;
import parknshop.parknshopapp.Model.Category.CategoryDrawerItem;
import parknshop.parknshopapp.Model.TextSearchResponse;
import parknshop.parknshopapp.MyApplication;

/**
 * Created by chrisyu on 7/3/16.
 */
public class CategoryViewPagerAdapter extends FragmentStatePagerAdapter implements ViewPager.OnPageChangeListener {
    List<CategoryDrawerItem> groupData;
    public int position;
    BaseActivity baseActivity;
    Map<String, TextSearchResponse> textSearchResponses;

    public CategoryViewPagerAdapter(FragmentManager fm, List<CategoryDrawerItem> groupData/*, Map<String, TextSearchResponse> textSearchResponses, */, BaseActivity baseActivity) {
        super(fm);
        this.groupData = groupData;
        //this.textSearchResponses = textSearchResponses;
        this.baseActivity = baseActivity;
    }


    @Override
    public Fragment getItem(int position) {
        if(groupData.get(position).getContentType().equals(GlobalConstant.ONLINE_PROMOTION)) {
            //Log.i("", "groupData::" + groupData.get(position).getImgUrl());
            //Log.i("", "groupDatagetTagGA::" + groupData.get(position).getTagGA());

            CategoryDrawerItem tempCat = new CategoryDrawerItem("0" , groupData.get(position).text, groupData.get(position).getTagGA());
            parknshop.parknshopapp.Model.Category.SubCategory tempSubCat = tempCat.getSubCategory();
            tempSubCat.setContentType(groupData.get(position).getContentType());
            tempSubCat.setValue(groupData.get(position).getContent());
            tempCat.setSubCategory(tempSubCat);

            ProductListFragment plf = ProductListFragment.newInstance(0, tempCat, false);
            plf.setGATag(tempCat.getTagGA());
            plf.showProgressDialog = false;
            plf.headerImage = groupData.get(position).getImgUrl();
            plf.showMenuButton = true;
            plf.setTitle = false;
            plf.isCategoryWrapping = true;
            plf.isChildFragment = true;
            return plf;
        } else if(groupData.get(position).getContentType().equals(GlobalConstant.PROMTOION)) {
            CategoryHighLightFragment chlf = CategoryHighLightFragment.newInstance(groupData.get(position).getSubCategory());
            chlf.id = Integer.valueOf(groupData.get(position).getContent());
            chlf.title = groupData.get(position).text;
            chlf.isChildFragment = true;
            return chlf;
        }

        return new BaseFragment();
    }

    @Override
    public int getCount() {
        return groupData.size();
    }


    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return groupData.get(position).text;
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        //remember last view page
        CategoryViewPagerAdapterOnPageSelectedEvent categoryViewPagerAdapterOnPageSelectedEvent = new CategoryViewPagerAdapterOnPageSelectedEvent();
        categoryViewPagerAdapterOnPageSelectedEvent.setPosition(position);
        MyApplication.getInstance().mBus.post(categoryViewPagerAdapterOnPageSelectedEvent);

        baseActivity.setToolbarTitle(groupData.get(position).text);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}