package parknshop.parknshopapp.Fragment.Product.CrazySale;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.LinearLayout;

import java.util.ArrayList;

import parknshop.parknshopapp.Fragment.Tutorial.TutorialPresenter;

/**
 * Created by chrisyu on 30/3/16.
 */
public class CrazySaleHeaderAdapter extends FragmentStatePagerAdapter implements ViewPager.OnPageChangeListener{
    public ArrayList<String> links = new ArrayList<String>();
    public LinearLayout tutorialPanel;

    public CrazySaleHeaderAdapter(FragmentManager fm, ArrayList<String> links) {
        super(fm);
        this.links = links;
    }

    @Override
    public Fragment getItem(int position) {
        CrazySaleHeaderFragment crazySaleHeaderFragment = new CrazySaleHeaderFragment();
        crazySaleHeaderFragment.loadUrl = links.get(position);
        return  crazySaleHeaderFragment;
    }

    @Override
    public int getCount() {
        return links.size();
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        TutorialPresenter.redrawDotPanel(tutorialPanel, position,links.size());
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
