package parknshop.parknshopapp.Fragment.Checkout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.Fragment.Home.HomeFragment;
import parknshop.parknshopapp.Fragment.MemberZone.OrderHistoryFragment;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 7/4/16.
 */
public class CheckoutThankYouFragment extends BaseFragment{

    public static int NOT_FINISH = 0;
    public static int FINISH = 1;
    public static int CURRENT = 2;

    //@Bind(R.id.checkout_dot_1) LinearLayout dot1;
    //@Bind(R.id.checkout_dot_2) LinearLayout dot2;
    //@Bind(R.id.checkout_dot_3) LinearLayout dot3;
    //@Bind(R.id.checkout_dot_4) LinearLayout dot4;

    @Bind (R.id.order) TextView orderTextView;

    private String orderNo = "";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout resource file
        View view = getActivity().getLayoutInflater().inflate(R.layout.checkout_thankyou_layout, container, false);
        ButterKnife.bind(this, view);
        showToolbar();
        showBackButtonAndAddTopFragment(new HomeFragment());
        disableNavigationDrawer();
        enableSecondRightButton();
        setToolbarTitle(getString(R.string.order_details_delivery_method));

        //new CheckOutDotViewHolder(dot1, 5, FINISH, getBaseActivity());
        //new CheckOutDotViewHolder(dot2, 6, FINISH, getBaseActivity());
        //new CheckOutDotViewHolder(dot3, 7, FINISH, getBaseActivity());
        //new CheckOutDotViewHolder(dot4, 8, CURRENT, getBaseActivity());

        GATrackerHelper.getInstance(getActivity()).setGATracker("my-cart/step05-thank-you/"+ orderNo);
        GATrackerHelper.getInstance(getActivity()).sendCheckOutProductToGA("payment/" + orderNo, "");

        if(orderTextView.getText().toString().contains("%s") && orderNo != null && orderNo.length() > 0)
            orderTextView.setText(orderTextView.getText().toString().replace("%s", orderNo));


        return view;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    @OnClick(R.id.con)
    public void con() {
        placeFragmentWithBackStack(new HomeFragment());
    }

    @OnClick(R.id.view_order_history)
    public void goToOrderHistoryFragment() {
        placeFragmentWithBackStack(new OrderHistoryFragment());
    }
}
