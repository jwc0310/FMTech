package parknshop.parknshopapp.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;

import java.util.ArrayList;
import java.util.Map;

import parknshop.parknshopapp.Base.BaseActivity;
import parknshop.parknshopapp.Fragment.MemberZone.MembereCouponeVoucherViewPagerFragment;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.Model.ECouponResponse;
import parknshop.parknshopapp.R;

/**
 * Created by kwongyuenpan on 30/4/16.
 */
public class MembereCouponeVoucherViewPagerAdapter extends FragmentStatePagerAdapter implements ViewPager.OnPageChangeListener {
    public int position;
    BaseActivity baseActivity;
    Map<Integer, ArrayList<ECouponResponse.ECoupon>> mCouponDatas;

    public MembereCouponeVoucherViewPagerAdapter(FragmentManager fm, Map<Integer, ArrayList<ECouponResponse.ECoupon>> mCouponDatas, BaseActivity baseActivity) {
        super(fm);
        this.mCouponDatas = mCouponDatas;
        this.baseActivity = baseActivity;
    }


    @Override
    public Fragment getItem(int position) {
        MembereCouponeVoucherViewPagerFragment membereCouponeVoucherViewPagerFragment = MembereCouponeVoucherViewPagerFragment.newInstance(mCouponDatas.get(position));
        membereCouponeVoucherViewPagerFragment.positionType = position;
        return membereCouponeVoucherViewPagerFragment;
    }

    @Override
    public int getCount() {
        return mCouponDatas.size();
    }


    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        if(position == 0){
            return baseActivity.getString(R.string.ecoupon);
        }
        return baseActivity.getString(R.string.check_out_evoucher);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        if(position == 0){
            GATrackerHelper.getInstance(baseActivity).setGATracker("my-account/ecoupon-evoucher/ecoupon");
        }else{
            GATrackerHelper.getInstance(baseActivity).setGATracker("my-account/ecoupon-evoucher/evoucher");
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}