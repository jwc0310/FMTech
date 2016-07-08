package parknshop.parknshopapp.Fragment.Coupon.CouponList;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.Fragment.Coupon.CouponDetailFragment.CouponDetailFragment;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.CouponListEvent;
import parknshop.parknshopapp.Utils.ToastUtils;
import parknshop.parknshopapp.WebServiceModel;

/**
 * Created by hp on 22/4/2016.
 */
public class CouponListFragment extends BaseFragment {
    @Bind(R.id.listview)
    ListView couponListView;
    CouponListAdapter couponListAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.coupon_list_fragment_layout, container, false);
        ButterKnife.bind(this, view);
        showToolbar();
        showLogo();

        GATrackerHelper.getInstance(getActivity()).setGATracker("m-coupon");

        if(getArguments() != null){
            if(getArguments().getBoolean("isBack", false)){
                showBackButton();
            }else{
                showMenuButton();
            }
        }else{
            showMenuButton();
        }
        showShoppingCartButton();
        disableSecondRightButton();
        enableNavigationDrawer();

        return view;
    }


    @Override
    public void onResume() {
        super.onResume();
        showProgressDialog();
        WebServiceModel.getInstance(getBaseActivity()).requestGetCouponList(getBaseActivity());
    }

    public void onEvent(final CouponListEvent couponListEvent) {
        hideProgressDialog();
        //Log.i("couponListEvent", "couponListEvent1232133333331");
        if (couponListEvent.getSuccess()) {
            //Log.i("couponListEvent", "couponListEvent1232131");

            couponListAdapter = new CouponListAdapter(getActivity());
            couponListAdapter.setData(couponListEvent.getCouponResponse().getData());
            couponListView.setAdapter(couponListAdapter);
            couponListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    Bundle bundle = new Bundle();
                    bundle.putString("title", couponListEvent.getCouponResponse().getData().get(i).getTitle());
                    bundle.putString("image", couponListEvent.getCouponResponse().getData().get(i).getImage());
                    bundle.putString("desc", couponListEvent.getCouponResponse().getData().get(i).getDescription());
                    bundle.putString("date", couponListEvent.getCouponResponse().getData().get(i).getValid_Until());
                    CouponDetailFragment fragment = new CouponDetailFragment();
                    fragment.setArguments(bundle);
                    placeFragmentWithBackStack(fragment);

                }
            });
        } else {
            ToastUtils.show(getBaseActivity(), couponListEvent.getMessage());
        }
    }

}
