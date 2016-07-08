package parknshop.parknshopapp.Fragment.Home.HomeListView;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import parknshop.parknshopapp.Fragment.Tutorial.TutorialPresenter;
import parknshop.parknshopapp.Model.ImageData;
import parknshop.parknshopapp.Model.NewsInfo;

/**
 * Created by chrisyu on 7/3/16.
 */
public class HeaderViewPagerAdapter<T> extends FragmentStatePagerAdapter implements ViewPager.OnPageChangeListener{
    public List<T> newsInfos = new ArrayList<>();
    public int count = 0;
    public LinearLayout tutorialPanel;

    public boolean centerInside;
    public boolean zoomable;
    public boolean enableOnClick;
    public boolean isCenterInside;

    public HeaderViewPagerAdapter(FragmentManager fm, List<T> newsInfos) {
        super(fm);
        this.newsInfos = newsInfos;
    }

    public void setList(List<T> newsInfos){
        this.newsInfos = newsInfos;
        notifyDataSetChanged();
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public int getCount() {
        return count > 0 ? count : newsInfos.size();
    }

    public HeaderViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        HomeListViewHeaderFragment hlhf = new HomeListViewHeaderFragment();
        hlhf.centerInside = centerInside;
        hlhf.zoomable = zoomable;

        if(newsInfos.get(position) instanceof  NewsInfo)
            hlhf.setData((NewsInfo)newsInfos.get(position));

        if(newsInfos.get(position) instanceof ImageData)
            hlhf.setData((ImageData)newsInfos.get(position));

        hlhf.newsInfos = newsInfos;
        hlhf.position = position;
        hlhf.enableOnClick = true;
        hlhf.isCenterInside = true;

        return hlhf;
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        TutorialPresenter.redrawDotPanel(tutorialPanel, position,newsInfos.size());
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
