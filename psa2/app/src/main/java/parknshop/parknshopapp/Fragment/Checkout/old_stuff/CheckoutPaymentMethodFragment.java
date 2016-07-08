package parknshop.parknshopapp.Fragment.Checkout.old_stuff;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.View.CheckOutDotViewHolder;

/**
 * Created by chrisyu on 1/4/16.
 */
public class CheckoutPaymentMethodFragment extends BaseFragment {

    public static int NOT_FINISH = 0;
    public static int FINISH = 1;
    public static int CURRENT = 2;

    @Bind(R.id.checkout_dot_1) LinearLayout dot1;
    @Bind(R.id.checkout_dot_2) LinearLayout dot2;
    @Bind(R.id.checkout_dot_3) LinearLayout dot3;
    @Bind(R.id.checkout_dot_4) LinearLayout dot4;

    @Bind(R.id.module_header) LinearLayout moduleHeader;

    @Bind(R.id.listview) ListView listView;

    public ArrayList<Object> data = new ArrayList<Object>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout resource file
        View view = getActivity().getLayoutInflater().inflate(R.layout.checkout_payment_fragment_layout, container, false);
        ButterKnife.bind(this, view);
        showToolbar();
        showBackButton();
        disableNavigationDrawer();
        enableSecondRightButton();
        setToolbarTitle("Checkout");

        new CheckOutDotViewHolder(dot1, 2, FINISH, getBaseActivity());
        new CheckOutDotViewHolder(dot2, 3, FINISH, getBaseActivity());
        new CheckOutDotViewHolder(dot3, 4, FINISH, getBaseActivity());
        new CheckOutDotViewHolder(dot4, 5, CURRENT, getBaseActivity());

       // new CheckOutModuleHeader(moduleHeader, getString(R.string.payment_method));

        data.add(new Integer(1));
        data.add(new Integer(1));
        data.add(new Integer(1));
        data.add(new Integer(1));

        //listView.setAdapter(new parknshop.parknshopapp.Fragment.Checkout.old_stuff.CheckoutPayment.CheckoutPaymentAdapter(data, getBaseActivity()));
        //new CheckOutModuleHeader(moduleHeader, getString(R.string.delivery_time_placeholder));
        //new CheckOutPickerViewHolder(deliveryDatePicker,  getString(R.string.delivery_date_placeholder), R.drawable.home_activity_sliding_menu_item_arrow_down, getBaseActivity()).enableDatePicker();
        //new CheckOutPickerViewHolder(deliveryTimePicker,  getString(R.string.delivery_time_placeholder), R.drawable.home_activity_sliding_menu_item_arrow_down, getBaseActivity()).enableTimePicker();

        return view;
    }

    @OnClick(R.id.back)
    public void back(){
        getBaseActivity().onBackPressed();
    }

    @OnClick(R.id.next)
    public void next() {

    }
}
