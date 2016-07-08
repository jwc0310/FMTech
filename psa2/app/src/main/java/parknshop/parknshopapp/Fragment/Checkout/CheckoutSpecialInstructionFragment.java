package parknshop.parknshopapp.Fragment.Checkout;

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

/**
 * Created by chrisyu on 7/4/16.
 */
public class CheckoutSpecialInstructionFragment extends BaseFragment {

    public static int NOT_FINISH = 0;
    public static int FINISH = 1;
    public static int CURRENT = 2;

    @Bind(R.id.checkout_dot_1) LinearLayout dot1;
    @Bind(R.id.checkout_dot_2) LinearLayout dot2;
    @Bind(R.id.checkout_dot_3) LinearLayout dot3;
    @Bind(R.id.checkout_dot_4) LinearLayout dot4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout resource file
        View view = getActivity().getLayoutInflater().inflate(R.layout.checkout_special_instruction_layout, container, false);


        ButterKnife.bind(this, view);
        showToolbar();
        showBackButton();
        disableNavigationDrawer();
        enableSecondRightButton();
        setToolbarTitle(getString(R.string.order_details_delivery_method));

        new CheckOutDotViewHolder(dot1, 2, FINISH, getBaseActivity());
        new CheckOutDotViewHolder(dot2, 3, FINISH, getBaseActivity());
        new CheckOutDotViewHolder(dot3, 4, CURRENT, getBaseActivity());
        new CheckOutDotViewHolder(dot4, 5, NOT_FINISH, getBaseActivity());

        /*
        CheckoutButtonGroup.handleGroup(deliveryGroup);
        CheckoutButtonGroup.handleGroup(titleGroup);
        CheckoutButtonGroup.handleGroup(selfPickupGroup);

        areaPicker.setOnItemSelectedCallback(onAreaSelectedCallback);
*/
        return view;
    }

    @OnClick(R.id.con)
    public void nextPage() {
        placeFragmentWithBackStack(new CheckoutCouponFragment());
    }
}
