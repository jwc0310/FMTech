package parknshop.parknshopapp.Fragment.MemberZone;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.Adapter.MemberFAQViewPagerAdapter;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.Model.FAQResponse;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.FAQResponseEvent;
import parknshop.parknshopapp.Utils.ToastUtils;
import parknshop.parknshopapp.WebServiceModel;

/**
 * Created by kwongyuenpan on 30/4/16.
 */
public class MemberFAQFragment extends BaseFragment {

    @Bind(R.id.viewpager)
    ViewPager viewPager;
    @Bind (R.id.tab_layout)
    TabLayout tabLayout;

    Map<Integer, ArrayList<FAQResponse.Data>> mFAQData;

    int apiCount = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.category_fragment_layout, container, false);
        ButterKnife.bind(this, view);

        showBackButton();
        showToolbar();
        enableNavigationDrawer();
        disableSecondRightButton();
        disableCartButton();

        setToolbarTitle(getString(R.string.faq));//getName());

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        mFAQData = new HashMap<>();
        showProgressDialog();
        WebServiceModel.getInstance(getActivity()).requestGetGeneralFAQ();
        WebServiceModel.getInstance(getActivity()).requestGetSATFAQ();
    }

    public void onEvent(FAQResponseEvent mFAQResponseEvent) {
        apiCount++;
        if(mFAQResponseEvent.getSuccess()){

            // General FAQ
//            if(mFAQResponseEvent.getSuccessCode() == 0){

//            }else{ // SAT FAQ
                mFAQData.put(mFAQResponseEvent.getType(), mFAQResponseEvent.getFaqResponse().getData());
//            }

        }else{
            ToastUtils.show(getActivity(), mFAQResponseEvent.getMessage());
        }

        if(apiCount == 2){
            hideProgressDialog();
            apiCount = 0;
            setAdapter();
        }
    }

    public void setAdapter(){
        MemberFAQViewPagerAdapter memberFAQViewPagerAdapter = new MemberFAQViewPagerAdapter(this.getChildFragmentManager(), mFAQData, getBaseActivity());
        viewPager.setAdapter(memberFAQViewPagerAdapter);
        viewPager.setOffscreenPageLimit(mFAQData.size());
        viewPager.addOnPageChangeListener(memberFAQViewPagerAdapter);

        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setTabMode(TabLayout.MODE_FIXED);
        tabLayout.setTabTextColors(getResources().getColorStateList(R.color.tab_text_color));

    }
}
