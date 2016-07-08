package parknshop.parknshopapp.Fragment.MemberZone;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.R;

/**
 * Created by Gigi Wong on 2016年04月22日.
 */
public class MemberAddPaymentFragment extends BaseFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.member_card_add_payment_layout, container, false);
        ButterKnife.bind(this, view);

        showBackButton();
        showToolbar();
        disableNavigationDrawer();
        setToolbarTitle(getString(R.string.add_payment_btn));
        disableSecondRightButton();
        disableCartButton();

        return view;
    }

    @OnClick(R.id.con)
    public void goToPaymentFormPage(){
        MemberAddPaymentFormFragment fragment = new MemberAddPaymentFormFragment();
        placeFragmentWithBackStack(fragment);
    }
}
