package parknshop.parknshopapp.Fragment.MemberZone;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.Adapter.MembereCouponeVoucherViewPagerFragmentRecyclerViewAdapter;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.EventUpdate.MembereCouponeVoucherViewPagerFragmentRecyclerViewAdapterOnItemClickEvent;
import parknshop.parknshopapp.Model.ECouponResponse;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Utils.DividerItemDecoration;

/**
 * Created by kwongyuenpan on 30/4/16.
 */
public class MembereCouponeVoucherViewPagerFragment extends BaseFragment {

    @Bind(R.id.rvFAQ) RecyclerView rvFAQ;
    @Bind(R.id.txtNoResult)TextView txtNoResult;

    public int positionType;

    ArrayList<ECouponResponse.ECoupon> mCouponDatas;

    public static MembereCouponeVoucherViewPagerFragment newInstance(ArrayList<ECouponResponse.ECoupon> mCouponDatas) {
        MembereCouponeVoucherViewPagerFragment frag = new MembereCouponeVoucherViewPagerFragment();
        Bundle b = new Bundle();
        b.putSerializable("CouponData", mCouponDatas);
        frag.setArguments(b);
        return frag;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.member_zone_ecoupon_evoucher_fragment_view_pager_layout, container, false);


        ButterKnife.bind(this, view);

        mCouponDatas = (ArrayList<ECouponResponse.ECoupon>) getArguments().getSerializable("CouponData");
        setAdapter();

        return view;
    }

    public void setAdapter() {

        if(mCouponDatas == null || mCouponDatas.size() == 0){
            if(positionType == 0) {
                txtNoResult.setText(getString(R.string.ecoupon_not_found));
            } else {
                txtNoResult.setText(getString(R.string.evoucher_not_found));
            }
            txtNoResult.setVisibility(View.VISIBLE);
        }else{
            txtNoResult.setVisibility(View.GONE);
        }

        rvFAQ.setHasFixedSize(true);
        rvFAQ.setLayoutManager(new LinearLayoutManager(getActivity()));

        final MembereCouponeVoucherViewPagerFragmentRecyclerViewAdapter adapter = new MembereCouponeVoucherViewPagerFragmentRecyclerViewAdapter(getActivity(), mCouponDatas, false);
        rvFAQ.setAdapter(adapter);
        RecyclerView.ItemDecoration itemDecoration =
                new DividerItemDecoration(getActivity(), LinearLayoutManager.VERTICAL);
        rvFAQ.addItemDecoration(itemDecoration);

//        final StickyRecyclerHeadersDecoration headersDecor = new StickyRecyclerHeadersDecoration(adapter);
//        rvFAQ.addItemDecoration(headersDecor);
    }

    public void onEvent(MembereCouponeVoucherViewPagerFragmentRecyclerViewAdapterOnItemClickEvent event) {
//        Bundle bundle = new Bundle();
//        MembereCouponeVoucherDetailsFragment membereCouponeVoucherDetailsFragment = new MembereCouponeVoucherDetailsFragment();
//        bundle.putString("title", event.getTitle());
//        bundle.putString("desc", event.getDesc());
//        membereCouponeVoucherDetailsFragment.setArguments(bundle);
//        placeFragmentWithBackStack(membereCouponeVoucherDetailsFragment);
    }
}
