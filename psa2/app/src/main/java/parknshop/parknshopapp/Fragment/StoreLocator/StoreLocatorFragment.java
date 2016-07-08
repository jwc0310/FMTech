package parknshop.parknshopapp.Fragment.StoreLocator;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.orhanobut.hawk.Hawk;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.Model.StoreListResponse;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.OnMarkerPressedEvent;
import parknshop.parknshopapp.Rest.event.StoreListEvent;
import parknshop.parknshopapp.Utils.AppUtils;
import parknshop.parknshopapp.WebServiceModel;

/**
 * Created by chrisyu on 27/4/16.
 */
public class StoreLocatorFragment extends BaseFragment {
    StoreListResponse storeListResponse;
    @Bind (R.id.tab_layout) TabLayout tabLayout;
    @Bind (R.id.viewpager) ViewPager viewPager;

    int swipePosition = -1;
    View view;
    public void onCreate(Bundle onSaved) {
        super.onCreate(onSaved);
        view = getLayoutInflater(onSaved).inflate(R.layout.category_fragment_layout, null);

        disableCartButton();
        disableSecondRightButton();

        GATrackerHelper.getInstance(getActivity()).setGATracker("store-locator");

        ButterKnife.bind(this, view);

        WebServiceModel.getInstance(getBaseActivity()).requestGetStoreList();
        showProgressDialog();
    }

    boolean firstCase = true;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        return view;
    }

    public void onResume() {
        super.onResume();
        setToolbarTitle(getString(R.string.store_locator));
        showMenuButton();
        enableSearchButton();
        disableSecondRightButton();
        enableNavigationDrawer();
        showShoppingCartButton();
    }

    public void onEvent(StoreListEvent storeListEvent) {
        if(storeListEvent.getSuccess()) {
            StoreListResponse storeListResponse = (StoreListResponse)storeListEvent.getDataObject();

            Hawk.put(AppUtils.store_locator_store_list, storeListResponse.getStores());

            CategoryViewPagerAdapter categoryViewPagerAdapter = new CategoryViewPagerAdapter(this.getChildFragmentManager());
            categoryViewPagerAdapter.setData(storeListResponse.getStores());

            viewPager.setAdapter(categoryViewPagerAdapter);

            tabLayout.setupWithViewPager(viewPager);
            tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
            tabLayout.setTabMode(TabLayout.MODE_FIXED);
            tabLayout.setTabTextColors(getResources().getColorStateList(R.color.tab_text_color));
        } else {
            //Log.i("fil", "fail" + storeListEvent.getMessage());
        }
        hideProgressDialog();
    }


    public class CategoryViewPagerAdapter extends FragmentStatePagerAdapter {
        List<StoreListResponse.Store> stores;
        public CategoryViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        public void setData(List<StoreListResponse.Store> stores) {
            this.stores = stores;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            // Generate title based on item position
            if(position == 0) {
                return getString(R.string.store_locator_map);
            } else {
                return getString(R.string.store_locator_list);
            }
        }

        @Override
        public Fragment getItem(int position) {
            if(position == 0) {
                StoreLocatorGoogleMapFragment storeLocatorMapFragment = new StoreLocatorGoogleMapFragment();
                storeLocatorMapFragment.stores = stores;
                GATrackerHelper.getInstance(getActivity()).setGATracker("store-locator/map-view");
                return storeLocatorMapFragment;
            } else {
                StoreLocatorListFragment storeLocatorListFragment = new StoreLocatorListFragment();
                storeLocatorListFragment.stores = stores;
                GATrackerHelper.getInstance(getActivity()).setGATracker("store-locator/list-view/"+stores.get(position).getName());
                return storeLocatorListFragment;
            }
        }

        @Override
        public int getCount() {
            return 2;
        }
    }
    public static double distance(double lat1, double lon1, double lat2, double lon2, String unit) {
        double theta = lon1 - lon2;
        double dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2)) + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * Math.cos(deg2rad(theta));
        dist = Math.acos(dist);
        dist = rad2deg(dist);
        dist = dist * 60 * 1.1515;
        //if (unit == "K") {
        dist = dist * 1.609344 ;
        //} else if (unit == "N") {
        //    dist = dist * 0.8684;
        //}

        return (dist);
    }

    /*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
	/*::	This function converts decimal degrees to radians						 :*/
	/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
    private static double deg2rad(double deg) {
        return (deg * Math.PI / 180.0);
    }

    /*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
	/*::	This function converts radians to decimal degrees						 :*/
	/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
    private static double rad2deg(double rad) {
        return (rad * 180 / Math.PI);
    }

    public void onEvent(OnMarkerPressedEvent onMarkerPressedEvent) {
        viewPager.setCurrentItem(0);
    }
}
