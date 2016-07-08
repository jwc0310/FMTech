package parknshop.parknshopapp.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;

import java.util.ArrayList;
import java.util.Map;

import parknshop.parknshopapp.Base.BaseActivity;
import parknshop.parknshopapp.Fragment.MemberZone.MemberFAQViewPagerFragment;
import parknshop.parknshopapp.Model.FAQResponse;
import parknshop.parknshopapp.R;

/**
 * Created by kwongyuenpan on 30/4/16.
 */
public class MemberFAQViewPagerAdapter extends FragmentStatePagerAdapter implements ViewPager.OnPageChangeListener {
    public int position;
    BaseActivity baseActivity;
    Map<Integer, ArrayList<FAQResponse.Data>> mFAQData;

    public MemberFAQViewPagerAdapter(FragmentManager fm, Map<Integer, ArrayList<FAQResponse.Data>> fAQData, BaseActivity baseActivity) {
        super(fm);
        this.mFAQData = fAQData;
        this.baseActivity = baseActivity;
    }


    @Override
    public Fragment getItem(int position) {
        MemberFAQViewPagerFragment memberFAQViewPagerFragment = MemberFAQViewPagerFragment.newInstance(mFAQData.get(position));
        return memberFAQViewPagerFragment;
    }

    @Override
    public int getCount() {
        return mFAQData.size();
    }


    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        if(position == 0){
            return baseActivity.getString(R.string.faq_tab_title_general);
        }
        return baseActivity.getString(R.string.faq_tab_title_security_and_technical);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}