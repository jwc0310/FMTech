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
import parknshop.parknshopapp.Adapter.MembereCouponeVoucherViewPagerAdapter;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.Model.ECouponResponse;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.ECouponEvent;
import parknshop.parknshopapp.WebServiceModel;

/**
 * Created by kwongyuenpan on 30/4/16.
 */
public class MembereCouponeVoucherFragment extends BaseFragment {

    @Bind(R.id.viewpager)
    ViewPager viewPager;
    @Bind (R.id.tab_layout)
    TabLayout tabLayout;

    Map<Integer, ArrayList<ECouponResponse.ECoupon>> mCouponDatas;
    ArrayList<ECouponResponse.ECoupon> eCouponList = new ArrayList<ECouponResponse.ECoupon>();
    ArrayList<ECouponResponse.ECoupon> eVoucherList = new ArrayList<ECouponResponse.ECoupon>();


    int apiCount = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.category_fragment_layout, container, false);

        GATrackerHelper.getInstance(getActivity()).setGATracker("my-account/ecoupon-evoucher");

        ButterKnife.bind(this, view);

        showBackButton();
        showToolbar();
        enableNavigationDrawer();
        enableSecondRightButton();
        disableCartButton();

        setToolbarTitle(getString(R.string.ecoupon_evoucher));//getName());

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();

        mCouponDatas = new HashMap<>();

        showProgressDialog();
        WebServiceModel.getInstance(getBaseActivity()).getEcouponAndEVouchers(getBaseActivity());

//        mFAQData = new HashMap<>();


        // demo data
//        FAQResponse fAQResponse = new FAQResponse();
//        ArrayList<FAQResponse.Data> datas = fAQResponse.getData();
//        FAQResponse.Data data = new FAQResponse.Data();
//        data.setContentTc("eCoupon & e Voucher name eCoupon & e Voucher name eCoupon & e Voucher name eCoupon & e Voucher name eCoupon & e Voucher name eCoupon & e Voucher name");
//        data.setContentTc("eCoupon & e Voucher name eCoupon & e Voucher name eCoupon & e Voucher name eCoupon & e Voucher name eCoupon & e Voucher name eCoupon & e Voucher name");
//        data.setTitleEn("eCoupon & e Voucher name");
//        data.setTitleTc("eCoupon & e Voucher name");
//        datas.add(data);
//        datas.add(data);
//        datas.add(data);
//        datas.add(data);
//        datas.add(data);

    }


    public void onEvent(ECouponEvent eCouponEvent) {

        hideProgressDialog();
        if(eCouponEvent.getSuccess()) {
            ECouponResponse eCouponResponse = (ECouponResponse) eCouponEvent.getDataObject();
            eCouponList = eCouponResponse.getCouponList();
            eVoucherList = eCouponResponse.getEVoucherList();

            mCouponDatas.put(0, eCouponList);
            mCouponDatas.put(1, eVoucherList);


            setAdapter();
        }
    }

    public void setAdapter(){
        MembereCouponeVoucherViewPagerAdapter membereCouponeVoucherViewPagerAdapter = new MembereCouponeVoucherViewPagerAdapter(this.getChildFragmentManager(), mCouponDatas, getBaseActivity());
        viewPager.setAdapter(membereCouponeVoucherViewPagerAdapter);
        viewPager.setOffscreenPageLimit(mCouponDatas.size());
        viewPager.addOnPageChangeListener(membereCouponeVoucherViewPagerAdapter);

        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setTabMode(TabLayout.MODE_FIXED);
        tabLayout.setTabTextColors(getResources().getColorStateList(R.color.tab_text_color));

//        viewPager.setCurrentItem(1);
//        Handler handler = new Handler();
//        handler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                hideProgressDialog();
//            }
//        }, 2000);
    }
}
