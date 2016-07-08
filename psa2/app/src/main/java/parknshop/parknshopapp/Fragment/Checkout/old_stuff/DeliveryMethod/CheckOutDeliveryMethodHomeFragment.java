package parknshop.parknshopapp.Fragment.Checkout.old_stuff.DeliveryMethod;

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
import parknshop.parknshopapp.Fragment.Checkout.old_stuff.CheckoutDeliveryDateFragment;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.View.CheckOutDotViewHolder;
import parknshop.parknshopapp.View.old_stuff.CheckOutPickerViewHolder;

/**
 * Created by chrisyu on 31/3/16.
 */
public class CheckOutDeliveryMethodHomeFragment extends BaseFragment {

    //status
    //0 - not finished
    //1 - finish
    //2 - current
    public static int NOT_FINISH = 0;
    public static int FINISH = 1;
    public static int CURRENT = 2;

    @Bind(R.id.checkout_dot_1) LinearLayout dot1;
    @Bind(R.id.checkout_dot_2) LinearLayout dot2;
    @Bind(R.id.checkout_dot_3) LinearLayout dot3;
    @Bind(R.id.checkout_dot_4) LinearLayout dot4;

    @Bind(R.id.delivery_module) LinearLayout deliveryModule;
    @Bind(R.id.pickup_store_module) LinearLayout pickupStoreModule;

    @Bind(R.id.delivery_address_module) LinearLayout deliveryAddressModule;
    @Bind(R.id.checkout_delivery_address_module_listview) ListView listview;

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

        new CheckOutDotViewHolder(dot1, 1, FINISH, getBaseActivity());
        new CheckOutDotViewHolder(dot2, 2, CURRENT, getBaseActivity());
        new CheckOutDotViewHolder(dot3, 3, NOT_FINISH, getBaseActivity());
        new CheckOutDotViewHolder(dot4, 4, NOT_FINISH, getBaseActivity());


        //====sub module
        ArrayList<View> subModule = new ArrayList<View>();
        subModule.add(pickupStoreModule);
        subModule.add(deliveryAddressModule);

        //new CheckOutModuleHeader(deliveryModule, getString(R.string.delivery_method_title));
        //new CheckOutPickerViewHolder(deliveryModule, getString(R.string.delivery_placeholder), R.drawable.home_activity_sliding_menu_item_arrow_down, getResources().getStringArray(R.array.check_out_delivery_method), getBaseActivity())
        //.setViewList(subModule);
//
        //new CheckOutModuleHeader(deliveryAddressModule, getString(R.string.delivery_address_placeholder));
        //listview.setAdapter(new CheckoutDeliveryAddressModuleAdapter(getBaseActivity()));

        //new CheckOutModuleHeader(pickupStoreModule, getString(R.string.pick_up_store_title));
        new CheckOutPickerViewHolder(pickupStoreModule, getString(R.string.select_store), R.drawable.home_activity_sliding_menu_item_arrow_down, getResources().getStringArray(R.array.check_out_list_of_store), getBaseActivity());

        deliveryAddressModule.setVisibility(View.INVISIBLE);
        pickupStoreModule.setVisibility(View.INVISIBLE);

        return view;
    }

    @OnClick(R.id.next)
    public void next() {
        getBaseActivity().placeFragmentWithBackStack(new CheckoutDeliveryDateFragment());
    }

    @OnClick(R.id.back)
    public void back() {
        getBaseActivity().onBackPressed();
    }
}
