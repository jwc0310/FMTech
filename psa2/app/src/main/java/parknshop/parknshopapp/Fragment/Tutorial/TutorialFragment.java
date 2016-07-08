package parknshop.parknshopapp.Fragment.Tutorial;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.orhanobut.hawk.Hawk;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.Fragment.Home.HomeFragment;
import parknshop.parknshopapp.Fragment.Tutorial.ViewPager.TutorialOnPageChangeListener;
import parknshop.parknshopapp.Fragment.Tutorial.ViewPager.TutorialPagerAdapter;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Utils.AppUtils;
import parknshop.parknshopapp.View.CheckoutButton;

/**
 * Created by chrisyu on 11/3/16.
 */
public class TutorialFragment extends BaseFragment {

    public @Bind(R.id.tutorial_viewpager) ViewPager tutorialViewPager;
    public @Bind(R.id.skip) TextView skip;
    public @Bind(R.id.start) CheckoutButton start;
    public @Bind(R.id.tutorial_dot_panel) LinearLayout tutorialPanel;
    boolean closePage;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout resource file
        View view = getActivity().getLayoutInflater().inflate(R.layout.tutorial_activity_layout, container, false);

        GATrackerHelper.getInstance(getActivity()).setGATracker("settings/tutorial-01");

        if(getArguments() != null)
            closePage = getArguments().getBoolean("closePage", false);

        ButterKnife.bind(this, view);
        hideToolbar();
        disableNavigationDrawer();

        TutorialPresenter.initTutorialPanel(tutorialPanel, getActivity(), AppUtils.tutorial_page_count);

        tutorialViewPager.setAdapter(new TutorialPagerAdapter(getSupportFragmentManager()));
        tutorialViewPager.setOnPageChangeListener(new TutorialOnPageChangeListener(this));

        return view;
    }

    public void onPause() {
        super.onPause();
        showToolbar();
        enableNavigationDrawer();
    }

    @OnClick({R.id.start, R.id.skip})
    public void goToMainPage(){

        Hawk.put("firstOpened", true);
        if(!closePage){
            placeFragment(new HomeFragment());
            if(getBaseActivity().getAdvertisementData() != null)
                getBaseActivity().showFullScreenAd(getBaseActivity().getAdvertisementData().getImage(),getBaseActivity().getAdvertisementData().getColorCode());
        }else{
            showToolbar();
            enableNavigationDrawer();
            getActivity().onBackPressed();
        }

    }
}
