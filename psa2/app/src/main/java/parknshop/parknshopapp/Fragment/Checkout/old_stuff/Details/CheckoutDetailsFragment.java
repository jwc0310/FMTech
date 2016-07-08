package parknshop.parknshopapp.Fragment.Checkout.old_stuff.Details;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.orhanobut.hawk.Hawk;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.Model.CartResponse;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Utils.AppUtils;

/**
 * Created by chrisyu on 31/3/16.
 */
public class CheckoutDetailsFragment extends BaseFragment {
    public static int NOT_FINISH = 0;
    public static int FINISH = 1;
    public static int CURRENT = 2;

    @Bind(R.id.listview) ListView listview;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout resource file
        View view = getActivity().getLayoutInflater().inflate(R.layout.checkout_delievery_method_layout, container, false);
        ButterKnife.bind(this, view);
        showToolbar();
        showMenuButton();
        enableNavigationDrawer();
        enableSecondRightButton();
        setToolbarTitle("Checkout");

        CartResponse cartResponse = Hawk.get(AppUtils.remote_shopping_cart);

        CheckOutDetailAdapter checkOutDetailAdapter = new CheckOutDetailAdapter(getBaseActivity());

        //listview.addHeaderView(generateHeader());
        //listview.addFooterView(generateFooter());
        //listview.setAdapter(new RightSlidingListViewAdapter(cartResponse.getAllEntry(), getBaseActivity()));

        return view;
    }

    /*
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout resource file
        View view = getActivity().getLayoutInflater().inflate(R.layout.checkout_details_fragment, container, false);
        ButterKnife.bind(this, view);
        showToolbar();
        showMenuButton();
        enableNavigationDrawer();
        enableSecondRightButton();
        setToolbarTitle("Checkout");

        CartResponse cartResponse = Hawk.get(AppUtils.remote_shopping_cart);

        CheckOutDetailAdapter checkOutDetailAdapter = new CheckOutDetailAdapter(getBaseActivity());

        //listview.addHeaderView(generateHeader());
        //listview.addFooterView(generateFooter());
        //listview.setAdapter(new RightSlidingListViewAdapter(cartResponse.getAllEntry(), getBaseActivity()));

        return view;
    }*/
/*
    public LinearLayout generateHeader() {
        LinearLayout header = new LinearLayout(getBaseActivity());
        header.setOrientation(LinearLayout.VERTICAL);
        header.setLayoutParams(new AbsListView.LayoutParams(AbsListView.LayoutParams.MATCH_PARENT, AbsListView.LayoutParams.WRAP_CONTENT));

        header.addView(generateRegistrationPanel());
        header.addView(generateOrderDetails());

        return header;
    }


    public LinearLayout generateFooter() {
        LinearLayout header = new LinearLayout(getBaseActivity());
        header.setLayoutParams(new AbsListView.LayoutParams(AbsListView.LayoutParams.MATCH_PARENT, AbsListView.LayoutParams.WRAP_CONTENT));

        header.addView(generateDiscountPanel());

        return header;
    }

    public LinearLayout generateRegistrationPanel() {
        LinearLayout registrationPanel = (LinearLayout) getActivity().getLayoutInflater().inflate(R.layout.registration_panel, null);
        registrationPanel.setLayoutParams(new AbsListView.LayoutParams(AbsListView.LayoutParams.MATCH_PARENT, Utils.dpToPx(112, getBaseActivity())));

        new CheckOutDotViewHolder((LinearLayout)registrationPanel.findViewById(R.id.checkout_dot_1), 3, FINISH, getBaseActivity());
        new CheckOutDotViewHolder((LinearLayout)registrationPanel.findViewById(R.id.checkout_dot_2), 4, FINISH, getBaseActivity());
        new CheckOutDotViewHolder((LinearLayout)registrationPanel.findViewById(R.id.checkout_dot_3), 5, FINISH, getBaseActivity());
        new CheckOutDotViewHolder((LinearLayout)registrationPanel.findViewById(R.id.checkout_dot_4), 6, CURRENT, getBaseActivity());

        return registrationPanel;
    }

    public LinearLayout generateOrderDetails() {
        LinearLayout orderDetails = (LinearLayout) getActivity().getLayoutInflater().inflate(R.layout.checkout_module_order_detail, null);
        orderDetails.setOrientation(LinearLayout.VERTICAL);
        new CheckOutModuleHeader(orderDetails, getString(R.string.order_details));

        new CheckOutOrderDetail(orderDetails.findViewById(R.id.total_item), getString(R.string.total_items), 12 + "");
        new CheckOutOrderDetail(orderDetails.findViewById(R.id.sub_total), getString(R.string.subtotal), "HK$680" + "");
        new CheckOutOrderDetail(orderDetails.findViewById(R.id.ecoupon_code), getString(R.string.ecoupon_code), "HK$0.0" + "");
        new CheckOutOrderDetail(orderDetails.findViewById(R.id.ecoupon), getString(R.string.ecoupon), "HK$0.0" + "");
        new CheckOutOrderDetail(orderDetails.findViewById(R.id.delivery_fee), getString(R.string.delivery_fee), "HK$0.0" + "");

        new CheckOutOrderDetail(orderDetails.findViewById(R.id.total_item), getString(R.string.order_total), "HK$680" + "");

        return orderDetails;
    }

    public LinearLayout generateDiscountPanel() {
        LinearLayout footerPanel = (LinearLayout) getActivity().getLayoutInflater().inflate(R.layout.checkout_module_footer, null);

        new FooterPanel(footerPanel, getBaseActivity());

        return footerPanel;
    }

    class FooterPanel {
        public FooterPanel (View view, BaseActivity baseActivity) {
            this.view = view;
            this.baseActivity = baseActivity;

            ButterKnife.bind(this, view);
            new CheckOutModuleHeader(detailHeader, getString(R.string.your_detail));
            new CheckOutOrderDetail(firstname, getString(R.string.first_name), "Amanda");
            new CheckOutOrderDetail(lastname, getString(R.string.last_name), "Chan");
            new CheckOutOrderDetail(email, getString(R.string.email), "Chan@Chan.com");
            new CheckOutOrderDetail(contactNo, getString(R.string.contact_no), "91256478");

            new CheckOutModuleHeader(deliveryDetail, getString(R.string.delivery_details));
            new CheckOutOrderDetail(deliveryMethod, getString(R.string.delivery_method_title), "Home Delivery");
            new CheckOutOrderDetail(deliveryDate, getString(R.string.delivery_date), "16/10/2016");
            new CheckOutOrderDetail(deliveryTime, getString(R.string.delivery_time), "12:00am - 17:00pm");

            new DeliveryAddressViewHolder(deliveryAddressView, getBaseActivity()).setPlaceHolder(getString(R.string.delivery_address_placeholder));

            new CheckOutModuleHeader(specialAddress, getString(R.string.special_instruction));
            new CheckOutOrderDetail(withGiftWrap, getString(R.string.with_gift_wrap), "Yes");
            new CheckOutOrderDetail(remark, getString(R.string.remarks), "");

            new CheckOutModuleHeader(ecouponAndEvoucher, getString(R.string.ecoupon_evoucher));
            new CheckOutOrderDetail(ecouponCode, getString(R.string.ecoupon_code), "-HK$50");
            new CheckOutOrderDetail(ecoupon, getString(R.string.ecoupon), "-HK$10");

            new CheckOutModuleHeader(paymentMethod, getString(R.string.payment_method));

            new DeliveryAddressViewHolder(billingAddressView, getBaseActivity()).setPlaceHolder(getString(R.string.payment_address_placeholder));

            new CheckoutButton(next, "CONTINUE");
        }

        @OnClick(R.id.next)
        public void next() {
            baseActivity.placeFragmentWithBackStack(new CheckOutDeliveryMethodHomeFragment());
        }

        View view;
        BaseActivity baseActivity;

        @Bind(R.id.your_detail_header) public View detailHeader;
        @Bind(R.id.firstname) public View firstname;
        @Bind(R.id.lastname) public View lastname;
        @Bind(R.id.email) public View email;
        @Bind(R.id.contact_no) public View contactNo;

        @Bind(R.id.delivery_detail) public View deliveryDetail;
        @Bind(R.id.delivery_method) public View deliveryMethod;
        @Bind(R.id.delivery_date) public View deliveryDate;
        @Bind(R.id.delivery_time) public View deliveryTime;

        @Bind(R.id.delivery_address) public View deliveryAddressView;

        @Bind(R.id.special_instruction) public View specialAddress;
        @Bind(R.id.with_gift_wrap) public View withGiftWrap;
        @Bind(R.id.remarks) public View remark;

        @Bind(R.id.ecoupon_evoucher) public View ecouponAndEvoucher;
        @Bind(R.id.ecoupon_code_text) public View ecouponCode;
        @Bind(R.id.ecoupon_text) public View ecoupon;

        @Bind(R.id.payment_method) public View paymentMethod;
        @Bind(R.id.billing_address) public View billingAddressView;

        @Bind(R.id.next) public View next;
    }*/
}
