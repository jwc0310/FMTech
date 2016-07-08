package parknshop.parknshopapp.Fragment.MemberZone;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.View.CheckoutPicker;

/**
 * Created by Gigi Wong on 2016年04月22日.
 */
public class MemberAddPaymentFormFragment extends BaseFragment {

    @Bind(R.id.card_picker)
    CheckoutPicker cardPicker;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.member_card_payment_form, container, false);
        ButterKnife.bind(this, view);

        showBackButton();
        showToolbar();
        disableNavigationDrawer();
        setToolbarTitle(getString(R.string.add_payment_btn));
        disableSecondRightButton();
        disableCartButton();

        cardPicker.setPickerIcon(getResources().getDrawable(R.drawable.payment_method_icn_visa));
        cardPicker.showPickerIcon(true);

        return view;
    }
}
