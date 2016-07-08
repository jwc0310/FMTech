package parknshop.parknshopapp.Fragment.Checkout;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.orhanobut.hawk.Hawk;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.EventUpdate.PaymentMethodOnItemClickEvent;
import parknshop.parknshopapp.Fragment.CheckoutAddAddressFormFragment;
import parknshop.parknshopapp.Fragment.Home.HomePresenter;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.Model.AddressData;
import parknshop.parknshopapp.Model.AddressesResponse;
import parknshop.parknshopapp.Model.CartResponse;
import parknshop.parknshopapp.Model.ECouponResponse;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.AddressesEvent;
import parknshop.parknshopapp.Rest.event.CartEvent;
import parknshop.parknshopapp.Rest.event.ECouponEvent;
import parknshop.parknshopapp.Rest.event.EmptyJsonEvent;
import parknshop.parknshopapp.Rest.event.RequestAddAddressEvent;
import parknshop.parknshopapp.Rest.event.SetShoppingCartTypeEvent;
import parknshop.parknshopapp.Utils.AppUtils;
import parknshop.parknshopapp.Utils.SwipeDismissTouchListener;
import parknshop.parknshopapp.Utils.ToastUtils;
import parknshop.parknshopapp.View.CheckoutAddress;
import parknshop.parknshopapp.View.CheckoutButton;
import parknshop.parknshopapp.View.CheckoutCouponListItemView;
import parknshop.parknshopapp.View.CheckoutEditText;
import parknshop.parknshopapp.View.CheckoutPaymentItem;
import parknshop.parknshopapp.View.CheckoutSelectorPanel;
import parknshop.parknshopapp.WebServiceModel;
import parknshop.parknshopapp.common.MemberHelper;

/**
 * Created by chrisyu on 7/4/16.
 */
public class CheckoutPaymentFragment extends BaseFragment {
    public boolean goBackToConfirmation;

    public static int NOT_FINISH = 0;
    public static int FINISH = 1;
    public static int CURRENT = 2;

    @Bind(R.id.btnVisa) CheckoutPaymentItem btnVisa;
    @Bind(R.id.btnMaster) CheckoutPaymentItem btnMaster;
    @Bind(R.id.btnAMEX) CheckoutPaymentItem btnAMEX;
    @Bind(R.id.btnCOD) CheckoutPaymentItem btnCOD;

    @Bind (R.id.con) CheckoutButton checkoutButton;
    @Bind (R.id.ecoupon_edit_text) CheckoutEditText ecouponEditText;

    String creditCardType;

    @Bind (R.id.addresses_wrapper) LinearLayout addressesVerticalWrapper;

    @Bind (R.id.ecoupon) CheckoutSelectorPanel eCouponPanel;
    @Bind (R.id.evoucher) CheckoutSelectorPanel eVoucherPanel;

    @Bind (R.id.code_coupon_container) LinearLayout codeCouponContainer;
    @Bind (R.id.coupon_container) LinearLayout couponContainer;
    @Bind (R.id.evoucher_container) LinearLayout evoucherContainer;

    boolean billingAddressSelected;
    boolean paymentTypeSelected;

    View view;
/*
    @Override
    public void onCreate(Bundle onSavedBundle) {
        super.onCreate(onSavedBundle);

        if(Hawk.get("goToConfirmation", false) == true)
            placeFragmentWithBackStack(new CheckoutConfirmationFragment());


        // Inflate the layout resource file
        view = getActivity().getLayoutInflater().inflate(R.layout.checkout_payment_method_layout, null);

        ButterKnife.bind(this, view);
    }*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //super.onCreate(onSavedBundle);
        super.onCreateView(inflater, container, savedInstanceState);

        if(Hawk.get("goToConfirmation", false) == true)
            placeFragmentWithBackStack(new CheckoutConfirmationFragment());

        GATrackerHelper.getInstance(getActivity()).setGATracker("my-cart/step03-payment");

        // Inflate the layout resource file
        View view = getActivity().getLayoutInflater().inflate(R.layout.checkout_payment_method_layout, container, false);

        ButterKnife.bind(this, view);

        showToolbar();
        showBackButton();
        disableNavigationDrawer();
        enableSecondRightButton();
        setToolbarTitle(getString(R.string.checkout));

        if(MemberHelper.getLoginResponse().getMemberProfile().isAllowCODPayment()){
            btnCOD.setVisibility(View.VISIBLE);
        } else {
            btnCOD.setVisibility(View.INVISIBLE);
        }

        showProgressDialog();
        WebServiceModel.getInstance(getBaseActivity()).getAddressBook(getBaseActivity());
        WebServiceModel.getInstance(getBaseActivity()).getEcouponAndEVouchers(getBaseActivity());
        WebServiceModel.getInstance(getBaseActivity()).requestGetCart(getBaseActivity());

        return view;
    }

    @OnClick (R.id.con)
    public void nextPage(){
        // If user not yet choosed
        if(TextUtils.isEmpty(creditCardType)){
            return;
        }

        if(checkoutButton.disabledView.getVisibility() == View.VISIBLE)
            return;

        placeFragmentWithBackStack(new CheckoutConfirmationFragment());
    }

    @OnClick(R.id.ecoupon_btn_aply)
    public void setCoupon() {
        if(ecouponEditText.getText().toString() == null || ecouponEditText.getText().toString().length() == 0) {
            ToastUtils.show(getBaseActivity(), "Can't be Empty");
            return;
        }

        showProgressDialog();
        WebServiceModel.getInstance(getBaseActivity()).setECoupon(getBaseActivity(), ecouponEditText.getText().toString());
    }

    public void onEvent(RequestAddAddressEvent requestAddAddressEvent) {
        if(requestAddAddressEvent.getSuccess())
            placeFragmentWithBackStack(new CheckoutConfirmationFragment());
    }

    public void onResume() {
        super.onResume();
        String selectedCardType = Hawk.get("selectedCardType", new String());
        if(selectedCardType.equals("visa"))
            btnVisa.onClick();

        if(selectedCardType.equals("master"))
            btnMaster.onClick();

        if(selectedCardType.equals("amex"))
            btnAMEX.onClick();

        if(selectedCardType.equals("cod"))
            btnCOD.onClick();
    }

    public void onEvent(SetShoppingCartTypeEvent setShoppingCartTypeEvent) {
        if(setShoppingCartTypeEvent.getSuccess()) {
            paymentTypeSelected = true;
        }

        if(setShoppingCartTypeEvent.getSuccess() && billingAddressSelected) {
            checkoutButton.disabledView.setVisibility(View.GONE);
        } else {
            ToastUtils.show(getActivity(), setShoppingCartTypeEvent.getMessage());
        }

        hideProgressDialog();
    }

    public void onEvent(PaymentMethodOnItemClickEvent event) {
        creditCardType = event.getPaymentType();
        Hawk.put("paymentMode", creditCardType);
        showProgressDialog();

        if(event.getSuccessCode() == R.id.btnVisa || event.getSuccessCode() == R.id.btnMaster || event.getSuccessCode() == R.id.btnAMEX || event.getSuccessCode() == R.id.btnCOD)
            WebServiceModel.getInstance(getActivity()).requestSetShoppingCartType(getActivity(), creditCardType);
    }

    //Network event - getAddressBook
    public void onEvent(AddressesEvent baseEvent) {

        CartResponse cartResponse = HomePresenter.getRemoteShoppingCart();
        AddressData.AddressForm billingAddressForm = cartResponse.getBillingAddress();

        if(baseEvent.getSuccess()) {
            AddressesResponse data = (AddressesResponse) baseEvent.getDataObject();
            addressesVerticalWrapper.removeAllViews();

            for(int i = 0; i < data.getAddresses().size(); i++) {
                AddressData.AddressForm addressForm = data.getAddresses().get(i);

                CheckoutAddress checkoutAddress = CheckoutAddress.build(getBaseActivity(),addressForm);
                checkoutAddress.setBillingAddress(true);
                addressesVerticalWrapper.addView(checkoutAddress);

                if( billingAddressForm.getDistrict().equals(addressForm.getDistrict()) && billingAddressForm.getBlock().equals(addressForm.getBlock()) && billingAddressForm.getAlley().equals(addressForm.getAlley()) && billingAddressForm.getFirstName().equals(addressForm.getFirstName()) ) {
                    checkoutAddress.checkboxView.setSelected(true);
                    //checkoutButton.setDisabled(false);
                    billingAddressSelected = true;
                }
            }
            //if(data.getAddresses().size() == 0)
             //   checkoutAddressForm.checkoutCheckBoxWithText.reverseCheckbox();
        } else {
           // checkoutAddressForm.checkoutCheckBoxWithText.reverseCheckbox();
        }
    }

    public void onEvent(CartEvent cartEvent) {

        if(cartEvent.getType().equals("saveDeliveryAddressViaAddressData"))
            billingAddressSelected = true;

        if(paymentTypeSelected && billingAddressSelected)
            checkoutButton.disabledView.setVisibility(View.GONE);


        CartResponse cartResponse = cartEvent.getCartResponse();

        List<CartResponse.VoucherInfo> voucherInfos = cartResponse.getVoucherInfos();
        List<CartResponse.VoucherInfo> iwaCouponInfos = cartResponse.getIwaCouponInfos();

        couponContainer.removeAllViews();
        for(int i = 0; i < iwaCouponInfos.size(); i++) {
            String label = "";
            String desc = "";
            for(int y = 0;y < eCouponList.size(); y++) {
                if(iwaCouponInfos.get(i).voucherCode.equals(eCouponList.get(y).getCode())) {
                    label = eCouponList.get(i).getTerms() + " HK$" + eCouponList.get(i).getIgcValue();
                    desc = getBaseActivity().getResources().getString(R.string.expiry_date_ecoupon) + "(" +eCouponList.get(y).getFormateStartDate() + " - " + eCouponList.get(y).getFormateEndDate() + ")";
                    // descriptionTextView.setText("(" + baseActivity.getResources().getString(R.string.expiry_date_ecoupon) + data.get(position).getFormateStartDate() + " - " + data.get(position).getFormateEndDate() + ")");

                }
            }

            if(label.length() == 0 && desc.length() == 0) {
                label = iwaCouponInfos.get(i).voucherCode;
                desc = iwaCouponInfos.get(i).description;
            }

            final CheckoutCouponListItemView checkoutCouponListItemView = new CheckoutCouponListItemView(getBaseActivity(), label, desc);
            checkoutCouponListItemView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));


            final String code = iwaCouponInfos.get(i).voucherCode;//voucherInfos.get(i).voucherCode;

            checkoutCouponListItemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                }
            });
            // Create a generic swipe-to-dismiss touch listener.
            checkoutCouponListItemView.setOnTouchListener(new SwipeDismissTouchListener(
                    checkoutCouponListItemView,
                    null,
                    new SwipeDismissTouchListener.DismissCallbacks() {
                        @Override
                        public boolean canDismiss(Object token) {
                            return true;
                        }

                        @Override
                        public void onDismiss(View view, Object token) {
                            couponContainer.removeView(checkoutCouponListItemView);

                            CartResponse cartResponse = Hawk.get(AppUtils.remote_shopping_cart, new CartResponse());
                            List<CartResponse.VoucherInfo> iwaCouponInfos = cartResponse.getIwaCouponInfos();

                            String couponCodeList = "";
                            for(int x = 0; x < iwaCouponInfos.size(); x++) {
                                if(!code.equals(iwaCouponInfos.get(x).voucherCode)) {
                                    couponCodeList += iwaCouponInfos.get(x).voucherCode + ",";
                                }
                            }

                            WebServiceModel.getInstance(getBaseActivity()).setECoupon(getBaseActivity(), couponCodeList);

                            getBaseActivity().showProgressDialog();
                        }
                    }));

            couponContainer.addView(checkoutCouponListItemView);
        }

        evoucherContainer.removeAllViews();
        for(int i = 0; i < voucherInfos.size(); i++) {
            String label = "";
            String desc = "";
            for(int y = 0;y < eVoucherList.size(); y++) {
                if(voucherInfos.get(i).voucherCode.equals(eVoucherList.get(y).getCode())) {
                    label = voucherInfos.get(i).description + " HK$" + eVoucherList.get(y).getIgcValue();
                    desc = getBaseActivity().getResources().getString(R.string.expiry_date_ecoupon) + "(" +eVoucherList.get(y).getFormateStartDate() + " - " + eVoucherList.get(y).getFormateEndDate() + ")";
                    // descriptionTextView.setText("(" + baseActivity.getResources().getString(R.string.expiry_date_ecoupon) + data.get(position).getFormateStartDate() + " - " + data.get(position).getFormateEndDate() + ")");

                }
            }

            final CheckoutCouponListItemView checkoutCouponListItemView = new CheckoutCouponListItemView(getBaseActivity(), label, desc);
            checkoutCouponListItemView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

            final String code = voucherInfos.get(i).voucherCode;

            checkoutCouponListItemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                }
            });
            // Create a generic swipe-to-dismiss touch listener.
            checkoutCouponListItemView.setOnTouchListener(new SwipeDismissTouchListener(
                    checkoutCouponListItemView,
                    null,
                    new SwipeDismissTouchListener.DismissCallbacks() {
                        @Override
                        public boolean canDismiss(Object token) {
                            return true;
                        }

                        @Override
                        public void onDismiss(View view, Object token) {
                            evoucherContainer.removeView(checkoutCouponListItemView);

                            CartResponse cartResponse = Hawk.get(AppUtils.remote_shopping_cart, new CartResponse());
                            List<CartResponse.VoucherInfo> voucherInfos = cartResponse.getVoucherInfos();

                            String voucherCodeList = "";
                            for(int i = 0; i < voucherInfos.size(); i++) {
                                if(!code.equals(voucherInfos.get(i).voucherCode))
                                    voucherCodeList += voucherInfos.get(i).voucherCode + ",";
                            }

                            WebServiceModel.getInstance(getBaseActivity()).setEVoucher(getBaseActivity(), voucherCodeList);

                            getBaseActivity().showProgressDialog();
                        }
                    }));


            evoucherContainer.addView(checkoutCouponListItemView);
        }


        hideProgressDialog();
    }

    public ECouponResponse.ECoupon getVoucherItemByCode(ArrayList<ECouponResponse.ECoupon> eCouponList, String code) {
        ECouponResponse.ECoupon eCoupon = new ECouponResponse.ECoupon();

        for(int i = 0; i < eCouponList.size(); i++) {
            if(eCouponList.get(i).getCode().equals(code)) {
                eCoupon = eCouponList.get(i);
            }
        }

        return eCoupon;
    }

    @OnClick (R.id.add_new_delivery_address)
    public void addNewAddress() {

        GATrackerHelper.getInstance(getActivity()).setGATracker("my-cart/step03-payment/add-billing-address");

        CheckoutAddAddressFormFragment checkoutAddAddressFormFragment = new CheckoutAddAddressFormFragment();
        checkoutAddAddressFormFragment.isBillingAddress = true;
        placeFragmentWithBackStack(checkoutAddAddressFormFragment);
    }


    public ArrayList<ECouponResponse.ECoupon> eCouponList = new ArrayList<ECouponResponse.ECoupon>();
    public ArrayList<ECouponResponse.ECoupon> eVoucherList = new ArrayList<ECouponResponse.ECoupon>();

    //Network Event
    public void onEvent(ECouponEvent eCouponEvent) {
        if(eCouponEvent.getSuccess()) {
            ECouponResponse eCouponResponse = (ECouponResponse) eCouponEvent.getDataObject();
            eCouponList = eCouponResponse.getCouponList();
            eVoucherList = eCouponResponse.getEVoucherList();
        } else {
        }
    }

    public void onEvent(EmptyJsonEvent event) {
        hideProgressDialog();

        if (event.getSuccess()) {
            WebServiceModel.getInstance(getBaseActivity()).requestGetCart(getBaseActivity());
            showProgressDialog();
        } else {
            ToastUtils.show(getBaseActivity(), event.getMessage());
        }

    }

    @OnClick(R.id.ecoupon)
    public void goEcouponPanel() {

        GATrackerHelper.getInstance(getActivity()).setGATracker("my-cart/step03-payment/select-ecoupon");

        CartResponse cartResponse = Hawk.get(AppUtils.remote_shopping_cart, new CartResponse());
        List<CartResponse.VoucherInfo> iwaCouponInfos = cartResponse.getIwaCouponInfos();

        CheckoutCouponListFragment checkoutCouponListFragment = new CheckoutCouponListFragment();
        checkoutCouponListFragment.couponArrayList = eCouponList;
        checkoutCouponListFragment.selectedList = iwaCouponInfos;
        checkoutCouponListFragment.ecoupon = true;
        placeFragmentWithBackStack(checkoutCouponListFragment);
    }

    @OnClick(R.id.evoucher)
    public void evoucherPanel() {

        GATrackerHelper.getInstance(getActivity()).setGATracker("my-cart/step03-payment/select-evoucher");

        CartResponse cartResponse = Hawk.get(AppUtils.remote_shopping_cart, new CartResponse());
        List<CartResponse.VoucherInfo> voucherInfos = cartResponse.getVoucherInfos();

        CheckoutCouponListFragment checkoutCouponListFragment = new CheckoutCouponListFragment();
        checkoutCouponListFragment.couponArrayList = eVoucherList;
        checkoutCouponListFragment.selectedList = voucherInfos;
        checkoutCouponListFragment.evoucher = true;
        placeFragmentWithBackStack(checkoutCouponListFragment);
    }

}
