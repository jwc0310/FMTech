package parknshop.parknshopapp.Fragment.Checkout.old_stuff.DeliveryMethod;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 1/4/16.
 */
public class CheckoutSelfPickupFragment extends BaseFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout resource file
        View view = getActivity().getLayoutInflater().inflate(R.layout.checkout_fragment_layout, container, false);
        ButterKnife.bind(this, view);
        showToolbar();
        showBackButton();
        disableNavigationDrawer();
        enableSecondRightButton();
        setToolbarTitle("Checkout");

        /*
        new CheckOutDotViewHolder(dot1, 1, FINISH, getBaseActivity());
        new CheckOutDotViewHolder(dot2, 2, CURRENT, getBaseActivity());
        new CheckOutDotViewHolder(dot3, 3, NOT_FINISH, getBaseActivity());
        new CheckOutDotViewHolder(dot4, 4, NOT_FINISH, getBaseActivity());

        new CheckOutModuleHeader(deliveryModule, getString(R.string.delivery_method_title));
        new CheckOutPickerViewHolder(deliveryModule, getString(R.string.delivery_placeholder), R.drawable.home_activity_sliding_menu_item_arrow_down, getBaseActivity());

        new CheckOutModuleHeader(deliveryAddressModule, getString(R.string.delivery_address_placeholder));

        listview.setAdapter(new CheckoutDeliveryAddressModuleAdapter(getBaseActivity()));*/
        return view;
    }
}
