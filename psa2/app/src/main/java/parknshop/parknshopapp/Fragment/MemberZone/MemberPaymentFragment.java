package parknshop.parknshopapp.Fragment.MemberZone;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Adapter.PaymentListAdapter;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.Model.PaymentInfoData;
import parknshop.parknshopapp.R;

/**
 * Created by Gigi Wong on 2016年04月22日.
 */
public class MemberPaymentFragment extends BaseFragment {

    @Bind(R.id.list) ListView list;
    @Bind(R.id.txtNoItems) TextView txtNoItems;

    PaymentListAdapter paymentListAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.member_payment_layout, container, false);
        ButterKnife.bind(this, view);

        showBackButton();
        showToolbar();
        disableNavigationDrawer();
        setToolbarTitle(getString(R.string.payment_method));
        disableSecondRightButton();
        disableCartButton();

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        uploadLayout();
    }

    public void uploadLayout(){
        String[] paymentListResponse = {""};
        if(paymentListResponse != null && paymentListResponse.length > 0) {
            txtNoItems.setVisibility(View.GONE);
            paymentListAdapter = new PaymentListAdapter(paymentListResponse, getActivity());
            list.setAdapter(paymentListAdapter);
        }else{
            txtNoItems.setVisibility(View.VISIBLE);
        }
    }

    @OnClick(R.id.btnAdd)
    public void goToAddAddressPage(){
        MemberAddPaymentFragment fragment = new MemberAddPaymentFragment();
        placeFragmentWithBackStack(fragment);
    }
}
