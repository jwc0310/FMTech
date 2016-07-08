package parknshop.parknshopapp.Fragment.Checkout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.Fragment.Checkout.CouponAdapter.CouponPickerAdapterOnItemClickEvent;
import parknshop.parknshopapp.Model.ECouponResponse;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.CouponPickerCancelEvent;
import parknshop.parknshopapp.Rest.event.ECouponEvent;
import parknshop.parknshopapp.Utils.ToastUtils;
import parknshop.parknshopapp.View.CheckOutDotViewHolder;
import parknshop.parknshopapp.View.CheckoutCouponPicker;
import parknshop.parknshopapp.View.CheckoutEditText;
import parknshop.parknshopapp.WebServiceModel;

/**
 * Created by chrisyu on 7/4/16.
 */
public class CheckoutCouponFragment extends BaseFragment {
    public boolean goBackToConfirmation;

    public static int NOT_FINISH = 0;
    public static int FINISH = 1;
    public static int CURRENT = 2;

    public static String ECOUPON = "COUPON";
    public static String EVOUCHER = "VOUCHER";

    @Bind(R.id.checkout_dot_1) LinearLayout dot1;
    @Bind(R.id.checkout_dot_2) LinearLayout dot2;
    @Bind(R.id.checkout_dot_3) LinearLayout dot3;
    @Bind(R.id.checkout_dot_4) LinearLayout dot4;

    @Bind (R.id.ecoupon) CheckoutCouponPicker eCouponPicker;
    @Bind(R.id.evoucher) CheckoutCouponPicker eVoucherPicker;

    @Bind (R.id.ecoupon_linear_layout) LinearLayout eCouponLinearLayout;
    @Bind (R.id.evoucher_linear_layout) LinearLayout eVoucherLinearLayout;

    @Bind (R.id.ecoupon_edit_text) CheckoutEditText ecouponEditText;

    ArrayList<ECouponResponse.ECoupon> eCouponList = new ArrayList<ECouponResponse.ECoupon>();
    ArrayList<ECouponResponse.ECoupon> eVoucherList = new ArrayList<ECouponResponse.ECoupon>();

    List<ECouponResponse.ECoupon> selectedeCouponList = new ArrayList<ECouponResponse.ECoupon>();
    List<ECouponResponse.ECoupon> selectedeVoucherList = new ArrayList<ECouponResponse.ECoupon>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout resource file
        View view = getActivity().getLayoutInflater().inflate(R.layout.checkout_coupon_fragment, container, false);
        ButterKnife.bind(this, view);
        showToolbar();
        showBackButton();
        disableNavigationDrawer();
        enableSecondRightButton();
        setToolbarTitle(getString(R.string.order_details_delivery_method));

        new CheckOutDotViewHolder(dot1, 2, FINISH, getBaseActivity());
        new CheckOutDotViewHolder(dot2, 3, FINISH, getBaseActivity());
        new CheckOutDotViewHolder(dot3, 4, FINISH, getBaseActivity());
        new CheckOutDotViewHolder(dot4, 5, CURRENT, getBaseActivity());

        showProgressDialog();
        WebServiceModel.getInstance(getBaseActivity()).getEcouponAndEVouchers(getBaseActivity());

        return view;
    }

    //Network Event
    public void onEvent(ECouponEvent eCouponEvent) {
        hideProgressDialog();
        if(eCouponEvent.getSuccess()) {
            ECouponResponse eCouponResponse = (ECouponResponse) eCouponEvent.getDataObject();
            eCouponList = eCouponResponse.getCouponList();
            eVoucherList = eCouponResponse.getEVoucherList();

            eCouponPicker.setType(ECOUPON);
            eCouponPicker.setDataArray(eCouponList);

            eVoucherPicker.setType(EVOUCHER);
            eVoucherPicker.setDataArray(eVoucherList);
        } else {
            eCouponPicker.setVisibility(View.GONE);
            eVoucherPicker.setVisibility(View.GONE);
        }
    }

    ECouponResponse.ECoupon savedCoupon;
    //UI Event
    public void onEvent(CouponPickerAdapterOnItemClickEvent event) {

        //handle coupon case
        if(event.getSuccessCode() == eCouponPicker.hashCode()) {
            ECouponResponse.ECoupon eCoupon = event.getEcoupon();


            if(eCoupon.getType().equals(ECOUPON)) {
                //if(savedCoupon != null)
                //    removeSelectedCoupon(savedCoupon);
                //eCouponLinearLayout.removeAllViews();
                addSelectedCoupon(eCoupon);

                CheckoutCouponPicker checkoutPicker = generateACheckoutCouponPicker(eCoupon, ECOUPON);
                eCouponLinearLayout.addView(checkoutPicker);
                savedCoupon = eCoupon;
            }
            eCouponPicker.setDataArray(eCouponList);
        }


        //handle voucher
        if(event.getSuccessCode() == eVoucherPicker.hashCode()) {
            ECouponResponse.ECoupon evoucher = event.getEcoupon();
            if (evoucher.getType().equals(EVOUCHER)) {
                addSelectedVoucher(evoucher);

                CheckoutCouponPicker checkoutPicker = generateACheckoutCouponPicker(evoucher, EVOUCHER);
                eVoucherLinearLayout.addView(checkoutPicker);
            }
            eVoucherPicker.setDataArray(eVoucherList);
        }
    }

    //UI Event
    public void onEvent(CouponPickerCancelEvent couponPickerCancelEvent) {
        if(couponPickerCancelEvent.getType() == ECOUPON) {
            removeSelectedCoupon(couponPickerCancelEvent.getCouponCancaled());
            eCouponPicker.setDataArray(eCouponList);
        }

        if(couponPickerCancelEvent.getType() == EVOUCHER) {
            removeSelectedVoucher(couponPickerCancelEvent.getCouponCancaled());
            eVoucherPicker.setDataArray(eVoucherList);
        }
    }

    public CheckoutCouponPicker generateACheckoutCouponPicker(ECouponResponse.ECoupon eCoupon, String type) {
        CheckoutCouponPicker checkoutPicker = new CheckoutCouponPicker(getBaseActivity());
        checkoutPicker.setEcoupon(eCoupon);
        checkoutPicker.setType(type);
        checkoutPicker.setIsItem(true);
        checkoutPicker.setIcon(this.getResources().getDrawable(R.drawable.ios_item_close_btn));
        return  checkoutPicker;
    }

    public void addSelectedCoupon(ECouponResponse.ECoupon areaSelected) {
        //Log.i("add selected ", "add selected " + areaSelected);
        selectedeCouponList.add(areaSelected);
        eCouponList.remove(areaSelected);
        Collections.sort(eCouponList, new ECouponComparator());
    }

    public void removeSelectedCoupon(ECouponResponse.ECoupon areaSelected) {
        //Log.i("remove selected ", "remove selected " + areaSelected);
        selectedeCouponList.remove(areaSelected);
        eCouponList.add(areaSelected);
        Collections.sort(eCouponList, new ECouponComparator());
    }

    public void addSelectedVoucher(ECouponResponse.ECoupon areaSelected) {
        //Log.i("add selected ", "add selected " + areaSelected);
        selectedeVoucherList.add(areaSelected);
        eVoucherList.remove(areaSelected);
        Collections.sort(eCouponList, new ECouponComparator());
    }

    public void removeSelectedVoucher(ECouponResponse.ECoupon areaSelected) {
        //Log.i("remove selected ", "remove selected " + areaSelected);
        selectedeVoucherList.remove(areaSelected);
        eVoucherList.add(areaSelected);
        Collections.sort(eCouponList, new ECouponComparator());
    }

    @OnClick(R.id.con)
    public void nextPage() {
        if(goBackToConfirmation)
            placeFragmentWithBackStack(new CheckoutConfirmationFragment());
        else
            placeFragmentWithBackStack(new CheckoutPaymentFragment());
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


    public class ECouponComparator implements Comparator<ECouponResponse.ECoupon> {
        @Override
        public int compare(ECouponResponse.ECoupon o1, ECouponResponse.ECoupon o2) {
            return o1.getDescription().compareTo(o2.getDescription());
        }
    }
}
