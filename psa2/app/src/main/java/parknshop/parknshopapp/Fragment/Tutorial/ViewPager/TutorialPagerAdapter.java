package parknshop.parknshopapp.Fragment.Tutorial.ViewPager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import parknshop.parknshopapp.Utils.AppUtils;

/**
 * Created by chrisyu on 4/3/16.
 */
public class TutorialPagerAdapter extends FragmentStatePagerAdapter {
    public TutorialPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return TutorialItemFragment.newInstance(position);
    }

    @Override
    public int getCount() {
        return AppUtils.tutorial_page_count;
    }
}