package parknshop.parknshopapp.Fragment.Home.HomeListView;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.Fragment.Tutorial.TutorialDot;
import parknshop.parknshopapp.Fragment.Tutorial.TutorialPresenter;
import parknshop.parknshopapp.Model.NewsInfo;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Utils.Utils;

/**
 * Created by chrisyu on 7/3/16.
 */
public class ListViewHeader extends RelativeLayout implements ViewPager.OnPageChangeListener {
    @Bind(R.id.viewpager)
    ViewPager viewPager;

    List<NewsInfo> newsInfos;
    int headerItemCount;

    public ListViewHeader(Context context) {
        super(context);
        init(context);
    }

    public ListViewHeader(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public ListViewHeader(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    public ListViewHeader(Context context, PagerAdapter adapter) {
        super(context);
        init(context);

        headerItemCount = adapter.getCount();
        this.newsInfos = newsInfos;

        int screenWidth = Utils.getScreenWidth(context);

        viewPager.setOffscreenPageLimit(4);
        TutorialPresenter.initTutorialPanel((LinearLayout) this.findViewById(R.id.tutorial_dot_panel),context, headerItemCount);

        viewPager.setAdapter(adapter);
        viewPager.setOnPageChangeListener(this);
    }

    private void init(Context ctx) {
        LayoutInflater.from(ctx).inflate(R.layout.home_activity_listview_header, this, true);
        ButterKnife.bind(this);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        //Log.i("onPageSelected", "onPageSelected");
        TutorialPresenter.redrawDotPanel((LinearLayout) this.findViewById(R.id.tutorial_dot_panel), position, headerItemCount);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    public static void initDotsPanel(LinearLayout panel, Context context, List<NewsInfo> newsInfos) {
        if(newsInfos == null) return;
        for(int i = 0; i < newsInfos.size(); i++) {
            TutorialDot tutorialDot = new TutorialDot(context);
            if(i == 0)
                tutorialDot.enable();
            else
                tutorialDot.disable();
            panel.addView(tutorialDot);
        }
    }


    public static void redrawDotsPanel(LinearLayout panel, int currentPosition, List<NewsInfo> newsInfos) {
        if(newsInfos == null) return;
        for(int i = 0; i < newsInfos.size(); i++) {
            TutorialDot tutorialDot = (TutorialDot) panel.getChildAt(i);
            if(i == currentPosition)
                tutorialDot.enable();
            else
                tutorialDot.disable();
        }
    }
}

