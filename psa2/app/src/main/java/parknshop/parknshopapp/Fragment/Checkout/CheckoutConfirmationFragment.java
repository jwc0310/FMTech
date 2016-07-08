package parknshop.parknshopapp.Fragment.Checkout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.orhanobut.hawk.Hawk;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.Fragment.Home.HomePresenter;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.Model.CartResponse;
import parknshop.parknshopapp.Model.MemberProfile;
import parknshop.parknshopapp.Model.SpecialRemark;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.BaseEvent;
import parknshop.parknshopapp.Rest.event.CartEvent;
import parknshop.parknshopapp.Rest.event.SetPaymentGatewayEvent;
import parknshop.parknshopapp.Utils.LogUtil;
import parknshop.parknshopapp.Utils.ToastUtils;
import parknshop.parknshopapp.View.CheckoutButton;
import parknshop.parknshopapp.View.CheckoutCheckBoxWithText;
import parknshop.parknshopapp.View.CheckoutCouponListItemView;
import parknshop.parknshopapp.View.CheckoutHeader;
import parknshop.parknshopapp.View.CheckoutHeaderItemGroup;
import parknshop.parknshopapp.View.CheckoutItem;
import parknshop.parknshopapp.View.ShoppingCartProductItem;
import parknshop.parknshopapp.WebServiceModel;
import parknshop.parknshopapp.common.MemberHelper;

/**
 * Created by chrisyu on 8/4/16.
 */
public class CheckoutConfirmationFragment extends BaseFragment {
    public static int NOT_FINISH = 0;
    public static int FINISH = 1;
    public static int CURRENT = 2;

    /*
    @Bind(R.id.checkout_dot_1) LinearLayout dot1;
    @Bind(R.id.checkout_dot_2) LinearLayout dot2;
    @Bind(R.id.checkout_dot_3) LinearLayout dot3;
    @Bind(R.id.checkout_dot_4) LinearLayout dot4;
*/
    @Bind (R.id.order_confirmation) CheckoutHeader checkoutConfirmationViewGroup;

    @Bind (R.id.products_lists_top_three_in_cart) LinearLayout productListTopThreeLinearLayout;
    @Bind (R.id.products_lists_view_all_itmes) View viewAllItemsViewBtn;
    @Bind (R.id.products_lists_exclude_three_in_cart) LinearLayout productListExcludeTopThreeLinearLayout;

   // @Bind (R.id.your_detail_header) CheckoutHeader checkoutYourDetailViewGroup;
    @Bind (R.id.delivery_time_group) CheckoutHeader deliveryTimeViewGroup;
    @Bind (R.id.delivery_details) CheckoutHeader checkoutDeliveryDetailsViewGroup;
    @Bind (R.id.ecoupon_evoucher) CheckoutHeader checkoutECouponEVoucherViewGroup;
    @Bind (R.id.payment_method) CheckoutHeader checkoutPaymentViewGroup;
    @Bind (R.id.terms_check_box) CheckoutCheckBoxWithText termsAndCondition;
    @Bind (R.id.cbInvoice) CheckoutCheckBoxWithText cbInvoice;
    @Bind (R.id.edtReview) EditText reviewEditText;
    @Bind (R.id.main_layout) View mainPanel;

    @Bind (R.id.checkout_ecoupon_linear_layout) LinearLayout checkoutEcouponLayout;
    @Bind (R.id.checkout_evoucher_linear_layout) LinearLayout checkoutEvoucherLayout;

    @Bind (R.id.con) CheckoutButton continueButton;

    String savedPaymentMode;
    String paymentGateway;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        Hawk.put("goToConfirmation", false);

        // Inflate the layout resource file
        View view = getActivity().getLayoutInflater().inflate(R.layout.checkout_confirmation_layout, container, false);

        GATrackerHelper.getInstance(getActivity()).setGATracker("my-cart/step04-order-confirmation");

        ButterKnife.bind(this, view);
        showToolbar();
        showBackButton();
        disableNavigationDrawer();
        enableSecondRightButton();
        setToolbarTitle(getString(R.string.order_confirmation));

        /*
        new CheckOutDotViewHolder(dot1, 5, FINISH, getBaseActivity());
        new CheckOutDotViewHolder(dot2, 6, FINISH, getBaseActivity());
        new CheckOutDotViewHolder(dot3, 7, CURRENT, getBaseActivity());
        new CheckOutDotViewHolder(dot4, 8, NOT_FINISH, getBaseActivity());*/

        savedPaymentMode = Hawk.get("paymentMode", "");
        paymentGateway = "";

        if(savedPaymentMode.equals("CreditCardFull")){
            paymentGateway = "eNetsHK";
        }else if(savedPaymentMode.equals("CreditCardFullAmex")){
            paymentGateway = "TNS";
        }else if(savedPaymentMode.equals("COD")){
            paymentGateway = "COD";
        }

        termsAndCondition.isTAndC = true;

        termsAndCondition.setBGColor(getResources().getColor(R.color.grey));
        cbInvoice.setBGColor(getResources().getColor(R.color.grey));

        termsAndCondition.setTnc(getString(R.string.t_and_c));
        cbInvoice.setText(getString(R.string.no_need_the_receipt));

        showProgressDialog();
        //cart?separateCart=true
        WebServiceModel.getInstance(getActivity()).requestGetCart(getActivity(), true);

        return view;
    }

    public void onResume() {
        super.onResume();
        termsAndCondition.setTnc(getString(R.string.t_and_c));
        cbInvoice.setText(getString(R.string.no_need_the_receipt));

    }

    @OnClick(R.id.con)
    public void nextPage() {
        if(!termsAndCondition.isSelected) {
            //ToastUtils.show(getBaseActivity(), getResources().getString(R.string.check_out_please_accept_terms_and_condition));
            return;
        }

        callingCreditCardfragment();

        if(reviewEditText.getText() != null && reviewEditText.getText().length() != 0) {
            SpecialRemark specialRemark = new SpecialRemark();
            specialRemark.setRemark(reviewEditText.getText().toString());
            WebServiceModel.getInstance(getBaseActivity()).requestPostSpecialRemark(getBaseActivity(), specialRemark);
        }
    }

    public void callingCreditCardfragment() {
        String invoice;
        if(cbInvoice.isSelected){
            invoice = "Y";
        }else{
            invoice = "N";
        }

        LogUtil.info("", "paymentGateway:" + paymentGateway);

        if(paymentGateway.equals("TNS") || paymentGateway.equals("COD")){
            showLoadingView();
            WebServiceModel.getInstance(getActivity()).requestSetPaymentGateway(getActivity(), paymentGateway, "Y", invoice, "Y", null);
        }else{
            CheckoutCreditCardFragment checkoutCreditCardFragment = new CheckoutCreditCardFragment();
            Bundle bundle = new Bundle();
            bundle.putString("paymentGateway", paymentGateway);
            bundle.putString("invoice", invoice);
            checkoutCreditCardFragment.setArguments(bundle);
            placeFragmentWithBackStack(checkoutCreditCardFragment);
        }
    }

    public void onEvent(CartEvent cartEvent) {
        if(cartEvent.getSuccess()) {
            mainPanel.setVisibility(View.VISIBLE);

            CartResponse cartResponse = cartEvent.getCartResponse();

            setDeliveryMethod(cartResponse);
            setDeliveryTime();
            setPaymentMethod(cartResponse);

            setOrderConfirmation(cartResponse);

            for(int i = 0; i < cartResponse.getAllEntry().size(); i ++) {
                final CartResponse.Entry entry = cartResponse.getAllEntry().get(i);

                if(!entry.product.hasStock())
                    continue;

                ShoppingCartProductItem productView = new ShoppingCartProductItem(getBaseActivity());

                productView.setEntry(entry);

                if(i < 3) {
                    productListTopThreeLinearLayout.addView(productView);
                    viewAllItemsViewBtn.setVisibility(View.GONE);
                    productListExcludeTopThreeLinearLayout.setVisibility(View.GONE);
                } else {
                    productListExcludeTopThreeLinearLayout.addView(productView);
                    viewAllItemsViewBtn.setVisibility(View.VISIBLE);
                    productListExcludeTopThreeLinearLayout.setVisibility(View.GONE);

                    viewAllItemsViewBtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            viewAllItemsViewBtn.setVisibility(View.GONE);
                            productListExcludeTopThreeLinearLayout.setVisibility(View.VISIBLE);
                        }
                    });
                }
            }

            setYourDetail();


            setCoupon();

        }

        hideProgressDialog();
    }

    public void setOrderConfirmation(CartResponse cartResponse) {
        checkoutConfirmationViewGroup.getCheckoutItemById(R.id.total_items).setItem( cartResponse.getTotalItems() + "");
        checkoutConfirmationViewGroup.getCheckoutItemById(R.id.subtotal).setItem(cartResponse.getSubTotalCart() + "");
        checkoutConfirmationViewGroup.getCheckoutItemById(R.id.ecoupon_code).setItem(null);
        checkoutConfirmationViewGroup.getCheckoutItemById(R.id.ecoupon).setItem(null);
        checkoutConfirmationViewGroup.getCheckoutItemById(R.id.delivery_fee).setItem(cartResponse.getDeliveryCost(getBaseActivity()) + "");
        checkoutConfirmationViewGroup.getCheckoutItemById(R.id.order_total).setItem(cartResponse.getTotalPrice() + "");
    }

    public void setYourDetail() {
        MemberProfile memberProfile = MemberHelper.getLoginResponse().getMemberProfile();

        //checkoutYourDetailViewGroup.getCheckoutItemById(R.id.first_name).setItem(memberProfile.getLastName());
        //checkoutYourDetailViewGroup.getCheckoutItemById(R.id.last_name).setItem(memberProfile.getLastName());
        //checkoutYourDetailViewGroup.getCheckoutItemById(R.id.email).setItem(memberProfile.getEmail());
        //checkoutYourDetailViewGroup.getCheckoutItemById(R.id.contact_no).setItem(memberProfile.getDefaultAddress().phone + "");
    }

    public void setDeliveryMethod(CartResponse cartResponse) {

        String deliveryMode = Hawk.get("deliveryMode", "");
        if(deliveryMode.equals("HomeDelivery")){
            checkoutDeliveryDetailsViewGroup.getCheckoutItemById(R.id.delivery_method).setItem(getString(R.string.check_out_home_delivery));
        }else{
            checkoutDeliveryDetailsViewGroup.getCheckoutItemById(R.id.delivery_method).setItem(getString(R.string.delivery_method_self));
        }
        //checkoutDeliveryDetailsViewGroup.getCheckoutItemById(R.id.delivery_date).setItem(Hawk.get("selectedDate", new String()).split(" ")[0]);
        //checkoutDeliveryDetailsViewGroup.getCheckoutItemById(R.id.delivery_time).setItem(Hawk.get("selectedTime", new String()));
        checkoutDeliveryDetailsViewGroup.getDeliveryAddress().setAddress(cartResponse.getDeliveryAddress());
        checkoutDeliveryDetailsViewGroup.getCheckoutItemById(R.id.first_name).setItem(cartResponse.getDeliveryAddress().getFirstName());
        checkoutDeliveryDetailsViewGroup.getCheckoutItemById(R.id.last_name).setItem(cartResponse.getDeliveryAddress().getLastName());
        checkoutDeliveryDetailsViewGroup.getCheckoutItemById(R.id.email).setItem(cartResponse.getDeliveryAddress().getEmail());
        checkoutDeliveryDetailsViewGroup.getCheckoutItemById(R.id.contact_no).setItem(cartResponse.getDeliveryAddress().getMobilePhone());

    }

    public void setDeliveryTime() {
        deliveryTimeViewGroup.getCheckoutItemById(R.id.delivery_date).setItem(Hawk.get("selectedDate", new String()).split("T")[0]);
        deliveryTimeViewGroup.getCheckoutItemById(R.id.delivery_time).setItem(Hawk.get("selectedTime", new String()));
    }

    @Bind(R.id.evoucher_ecoupon_code) CheckoutItem evoucherCheckoutItemHolder;
    @Bind(R.id.evoucher_ecoupon) CheckoutItem ecouponCheckoutItemPlaceHolder;

    public void setCoupon() {
        //checkoutECouponEVoucherViewGroup.getCheckoutItemById(R.id.evoucher_ecoupon_code).setItem(null);
        //checkoutECouponEVoucherViewGroup.getCheckoutItemById(R.id.evoucher_ecoupon).setItem(null);
        CartResponse cartResponse = HomePresenter.getRemoteShoppingCart();
        List<CartResponse.VoucherInfo> iwaCouponInfos = cartResponse.getIwaCouponInfos();
        List<CartResponse.VoucherInfo> voucherInfos = cartResponse.getVoucherInfos();

        //checkoutEcouponLayout
        for(int i = 0; i < iwaCouponInfos.size(); i++) {
            CheckoutCouponListItemView checkoutCouponListItemView = new CheckoutCouponListItemView(getBaseActivity(), iwaCouponInfos.get(i));
            checkoutCouponListItemView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

            checkoutEcouponLayout.addView(checkoutCouponListItemView);
        }

        if(iwaCouponInfos.size() == 0)
            evoucherCheckoutItemHolder.setVisibility(View.GONE);

        //checkoutEvoucherLayout
        for(int i = 0; i < voucherInfos.size(); i++) {
            CheckoutCouponListItemView checkoutCouponListItemView = new CheckoutCouponListItemView(getBaseActivity(), voucherInfos.get(i));
            checkoutCouponListItemView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

            checkoutEvoucherLayout.addView(checkoutCouponListItemView);
        }

        if(voucherInfos.size() == 0)
            ecouponCheckoutItemPlaceHolder.setVisibility(View.GONE);

        if(iwaCouponInfos.size() == 0 && voucherInfos.size() == 0) {
            checkoutECouponEVoucherViewGroup.setVisibility(View.GONE);
        }

        ((CheckoutHeaderItemGroup)checkoutECouponEVoucherViewGroup).editTextView.setVisibility(View.GONE);
    }

    public void setPaymentMethod(CartResponse cartResponse) {
        String cardType = Hawk.get("selectedCardType", new String());
        checkoutPaymentViewGroup.getCheckoutItemById(R.id.payment_type).setHeader(getCardName(cardType));
        checkoutPaymentViewGroup.getCheckoutItemById(R.id.payment_type).setLeftDrawable(getCardDrawableId(cardType));

        checkoutPaymentViewGroup.getBillingAddress().setAddress(cartResponse.getBillingAddress());
        checkoutPaymentViewGroup.getCheckoutItemById(R.id.payment_first_name).setItem(cartResponse.getBillingAddress().getFirstName());
        checkoutPaymentViewGroup.getCheckoutItemById(R.id.payment_last_name).setItem(cartResponse.getBillingAddress().getLastName());
        checkoutPaymentViewGroup.getCheckoutItemById(R.id.payment_email).setItem(cartResponse.getBillingAddress().getEmail());
        checkoutPaymentViewGroup.getCheckoutItemById(R.id.payment_contact_no).setItem(cartResponse.getBillingAddress().getMobilePhone());
    }

    public String getCardName(String cardType) {
        if(cardType.equals("visa"))
            return "Visa";//R.drawable.payment_method_icn_visa;

        if(cardType.equals("master"))
            return "Master";//R.drawable.payment_method_icn_master_card;

        if(cardType.equals("amex"))
            return "American Express";/// R.drawable.payment_method_icn_am;
        if(cardType.equals("cod"))
            return "Cash On Delivery";/// R.drawable.payment_method_icn_am;
        return "";//0;
    }


    public int getCardDrawableId(String cardType) {
        if(cardType.equals("visa"))
            return R.drawable.payment_method_icn_visa;

        if(cardType.equals("master"))
            return R.drawable.payment_method_icn_master_card;

        if(cardType.equals("amex"))
            return R.drawable.payment_method_icn_am;
        return 0;
    }

    public void onEvent(SetPaymentGatewayEvent setPaymentGatewayEvent) {
        hideLoadingView();
        if(setPaymentGatewayEvent.getSuccess()){
            if(setPaymentGatewayEvent.getPaymentResponse().getUrl() != null){
                CheckoutCreditCardFragment checkoutCreditCardFragment = new CheckoutCreditCardFragment();
                Bundle bundle = new Bundle();
                bundle.putString("paymentGateway", paymentGateway);
                bundle.putString("url", setPaymentGatewayEvent.getPaymentResponse().getUrl());
                checkoutCreditCardFragment.setArguments(bundle);
                placeFragmentWithBackStack(checkoutCreditCardFragment);
            }else{
                // COD
                CheckoutThankYouFragment checkoutThankYouFragment = new CheckoutThankYouFragment();
                checkoutThankYouFragment.setOrderNo(setPaymentGatewayEvent.getPaymentResponse().getOrderNo());

                placeFragmentWithBackStack(checkoutThankYouFragment);
            }
        }else{
            ToastUtils.show(getActivity(), setPaymentGatewayEvent.getMessage());
        }
    }

    public void onEvent(BaseEvent event) {
        if(event.getSuccessCode() == (termsAndCondition.hashCode())) {
            if((boolean)event.getDataObject() == true)
                continueButton.disabledView.setVisibility(View.GONE);
            else
                continueButton.disabledView.setVisibility(View.VISIBLE);
        }
    }

    private String capitalize(final String line) {
        return Character.toUpperCase(line.charAt(0)) + line.substring(1);
    }

    //@Bind (R.id.your_detail_header) CheckoutHeader checkoutYourDetailViewGroup;
    //@Bind (R.id.delivery_details) CheckoutHeader checkoutDeliveryDetailsViewGroup;
    //@Bind (R.id.special_instruction) CheckoutHeader checkoutSpecialInstructionViewGroup;
    //@Bind (R.id.ecoupon_evoucher) CheckoutHeader checkoutECouponEVoucherViewGroup;
    //@Bind (R.id.payment_method) CheckoutHeader checkoutPaymentViewGroup;
    //@Bind(R.id.cbInvoice) CheckoutCheckBoxWithText cbInvoice;
}
