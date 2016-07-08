package parknshop.parknshopapp.Fragment.Tutorial.ViewPager;

import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.LinearLayout;

import parknshop.parknshopapp.Fragment.Tutorial.TutorialFragment;
import parknshop.parknshopapp.Fragment.Tutorial.TutorialPresenter;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.Utils.AppUtils;

/**
 * Created by chrisyu on 4/3/16.
 */
public class TutorialOnPageChangeListener implements ViewPager.OnPageChangeListener {
    View skip_btn;
    LinearLayout tutorialPanel;
    View start_btn;
    TutorialFragment mTutorialFragment;


    public TutorialOnPageChangeListener(TutorialFragment tutorialFragment) {
        this.skip_btn = tutorialFragment.skip;
        this.tutorialPanel = tutorialFragment.tutorialPanel;
        this.start_btn = tutorialFragment.start;
        this.mTutorialFragment = tutorialFragment;
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

        GATrackerHelper.getInstance(mTutorialFragment.getActivity()).setGATracker("settings/tutorial-0"+position + 1);

        if(position == AppUtils.tutorial_page_count - 1)
            skip_btn.setVisibility(View.INVISIBLE);
        else
            skip_btn.setVisibility(View.VISIBLE);

        if(position == 3)
            start_btn.setVisibility(View.VISIBLE);
        else
            start_btn.setVisibility(View.INVISIBLE);


        TutorialPresenter.redrawDotPanel(tutorialPanel, position, AppUtils.tutorial_page_count);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
