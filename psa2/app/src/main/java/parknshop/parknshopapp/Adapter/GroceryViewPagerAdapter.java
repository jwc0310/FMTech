package parknshop.parknshopapp.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;

import parknshop.parknshopapp.Base.BaseActivity;
import parknshop.parknshopapp.Fragment.Grocery.GroceryViewPagerFragment;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.Model.WishListResponse;
import parknshop.parknshopapp.R;

/**
 * Created by kwongyuenpan on 30/4/16.
 */
public class GroceryViewPagerAdapter extends FragmentStatePagerAdapter implements ViewPager.OnPageChangeListener {
    public int position;
    BaseActivity baseActivity;
    WishListResponse[] mWishStaticListResponses;
    WishListResponse[] mWishListResponses;

    public GroceryViewPagerAdapter(FragmentManager fm, WishListResponse[] wishStaticListResponses, WishListResponse[] wishListResponses, BaseActivity baseActivity) {
        super(fm);
        this.mWishStaticListResponses = wishStaticListResponses;
        this.mWishListResponses = wishListResponses;
        this.baseActivity = baseActivity;
    }


    @Override
    public Fragment getItem(int position) {
        GroceryViewPagerFragment groceryViewPagerFragment = null;
        if(position == 0){
            groceryViewPagerFragment = GroceryViewPagerFragment.newInstance(mWishListResponses);
        }else{
            groceryViewPagerFragment = GroceryViewPagerFragment.newInstance(mWishStaticListResponses);
        }
        groceryViewPagerFragment.positionType = position;
        return groceryViewPagerFragment;
    }

    @Override
    public int getCount() {
        return 2;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        if(position == 0){
            return baseActivity.getString(R.string.home_activity_sliding_menu_my_list);
        }
        return baseActivity.getString(R.string.home_activity_sliding_menu_suggest_list);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

        if(position == 0){
            GATrackerHelper.getInstance(baseActivity).setGATracker("my-list/my-list");
        }else{
            GATrackerHelper.getInstance(baseActivity).setGATracker("my-list/recommend-list");
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}