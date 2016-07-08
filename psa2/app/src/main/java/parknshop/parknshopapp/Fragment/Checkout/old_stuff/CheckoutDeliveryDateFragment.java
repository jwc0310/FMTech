package parknshop.parknshopapp.Fragment.Checkout.old_stuff;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.View.CheckOutDotViewHolder;
import parknshop.parknshopapp.View.old_stuff.CheckOutPickerViewHolder;

/**
 * Created by chrisyu on 1/4/16.
 */
public class CheckoutDeliveryDateFragment extends BaseFragment {
    public static int NOT_FINISH = 0;
    public static int FINISH = 1;
    public static int CURRENT = 2;

    @Bind(R.id.checkout_dot_1) LinearLayout dot1;
    @Bind(R.id.checkout_dot_2) LinearLayout dot2;
    @Bind(R.id.checkout_dot_3) LinearLayout dot3;
    @Bind(R.id.checkout_dot_4) LinearLayout dot4;

    @Bind(R.id.module_header) LinearLayout moduleHeader;
    @Bind(R.id.delivery_date_picker) LinearLayout deliveryDatePicker;
    @Bind(R.id.delivery_time_picker) LinearLayout deliveryTimePicker;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout resource file
        View view = getActivity().getLayoutInflater().inflate(R.layout.checkout_delivery_date_fragment, container, false);
        ButterKnife.bind(this, view);
        showToolbar();
        showBackButton();
        disableNavigationDrawer();
        enableSecondRightButton();
        setToolbarTitle("Checkout");

        new CheckOutDotViewHolder(dot1, 1, FINISH, getBaseActivity());
        new CheckOutDotViewHolder(dot2, 2, FINISH, getBaseActivity());
        new CheckOutDotViewHolder(dot3, 3, CURRENT, getBaseActivity());
        new CheckOutDotViewHolder(dot4, 4, NOT_FINISH, getBaseActivity());

        //new CheckOutModuleHeader(moduleHeader, getString(R.string.delivery_time_placeholder));
        new CheckOutPickerViewHolder(deliveryDatePicker,  getString(R.string.delivery_date_placeholder), R.drawable.home_activity_sliding_menu_item_arrow_down, getBaseActivity()).enableDatePicker();
        new CheckOutPickerViewHolder(deliveryTimePicker,  getString(R.string.delivery_time_placeholder), R.drawable.home_activity_sliding_menu_item_arrow_down, getBaseActivity()).enableTimePicker();

        return view;
    }


    @OnClick(R.id.back)
    public void back(){
        getBaseActivity().onBackPressed();
    }

    @OnClick(R.id.next)
    public void next() {
        getBaseActivity().placeFragmentWithBackStack(new CheckoutPaymentMethodFragment());
    }
}
