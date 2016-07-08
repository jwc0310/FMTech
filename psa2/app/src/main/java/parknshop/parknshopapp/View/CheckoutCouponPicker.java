package parknshop.parknshopapp.View;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Base.BaseActivity;
import parknshop.parknshopapp.EventUpdate.StringPickerAdapterOnItemClickEvent;
import parknshop.parknshopapp.Fragment.Checkout.CheckoutCouponFragment;
import parknshop.parknshopapp.Fragment.Checkout.CouponAdapter.CouponPickerAdapter;
import parknshop.parknshopapp.Fragment.Checkout.CouponAdapter.CouponPickerAdapterOnItemClickEvent;
import parknshop.parknshopapp.Model.ECouponResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.CouponPickerCancelEvent;
import parknshop.parknshopapp.Rest.event.EmptyJsonEvent;
import parknshop.parknshopapp.Utils.ToastUtils;
import parknshop.parknshopapp.WebServiceModel;

/**
 * Created by hp on 12/4/2016.
 */
public class CheckoutCouponPicker extends LinearLayout {
    View view;
    public @Bind(R.id.picker_name) TextView title;
    public @Bind(R.id.picker_image_btn) ImageView icon;
    public @Bind(R.id.dimmed_background) View dimmed;

    Context context;

    ArrayList<ECouponResponse.ECoupon> couponList;
    ECouponResponse.ECoupon eCoupon;
    int successCode;

    String titleDefaultText;

    String type; //ECOUPON / EVOUCHER
    boolean isItem;
    //boolean disabled;

    public int selectedCouponPosition = -1;
    public int selectedVoucherPosition = -1;

    public CheckoutCouponPicker(Context context) {
        this(context, null);
    }

    public CheckoutCouponPicker(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CheckoutCouponPicker(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater.from(context).inflate(R.layout.checkout_picker_layout, this);

        ButterKnife.bind(this);

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CheckoutCouponPicker);
        CharSequence titleString = a.getString(R.styleable.CheckoutCouponPicker_checkout_coupon_title);
        Drawable drawable = a.getDrawable(R.styleable.CheckoutCouponPicker_checkout_coupon_drawable);
        int dataPointer = a.getInteger(R.styleable.CheckoutCouponPicker_checkout_coupon_data, -1);


        titleDefaultText = titleString +"";
        setTitle(titleString != null ? titleString.toString() : "");
        setIcon(drawable);

        this.context = context;
        this.successCode = this.hashCode();

        try {
            MyApplication.getInstance().register(this);
        }catch (Exception e) {
            //Log.i("null", "null pointer exeception found @ My Application");
        }
    }

    public void setTitle(String titlestring) {
        title.setHint(titlestring);
    }

    public void setText(String titleString) {
        title.setText(titleString);
    }

    public void setEcoupon (ECouponResponse.ECoupon eCoupon) {
        this.eCoupon = eCoupon;
        setText(eCoupon.getType().equals(CheckoutCouponFragment.ECOUPON) ? eCoupon.getTerms() : eCoupon.getDescription());
    }

    public void resetDefaultText() {
        title.setHint(titleDefaultText);
    }

    public void setIcon(Drawable drawable) {
        if(drawable != null)
            icon.setImageDrawable(drawable);
    }

    public void setDataArray(ArrayList<ECouponResponse.ECoupon> array) {
        this.couponList = array;
        if(type == CheckoutCouponFragment.ECOUPON)
            setTitle(context.getString(R.string.check_out_select_ecoupon));
        else
            setTitle(context.getString(R.string.check_out_select_evoucher));

        if(couponList.size() == 0)
            showDimmedBackground();
        else
            hideDimmedBackground();
    }

    @Nullable
    @OnClick(R.id.root)
    public void rootOnClick() {
        //if(disabled)
        //    return;

        if(couponList == null || couponList.size() == 0)
            return;

        if(couponList != null) {
            CouponPickerAdapter couponPickerAdapter = new CouponPickerAdapter(context, couponList, successCode);
            couponPickerAdapter.setPicker(this);

            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setAdapter(couponPickerAdapter, couponPickerAdapter);

            if(couponList.size() > 0)
                builder.show();
        }
    }

    @Nullable
    @OnClick (R.id.picker_image_btn)
    public void cancelCoupon() {
        if(!isItem) return;

        /*
        StringPickerAdapterOnItemClickEvent stringPickerAdapterOnItemClickEvent = new StringPickerAdapterOnItemClickEvent();
        stringPickerAdapterOnItemClickEvent.setText(title.getText().toString());
        if(position >= 0)
            stringPickerAdapterOnItemClickEvent.setPosition(position);
        stringPickerAdapterOnItemClickEvent.setSelected(false);

        MyApplication.getInstance().mBus.post(stringPickerAdapterOnItemClickEvent);*/


        if(eCoupon.getType().equals(CheckoutCouponFragment.ECOUPON)) {
            WebServiceModel.getInstance(context).setECoupon(context, eCoupon.getCode());
        }

        if(eCoupon.getType().equals(CheckoutCouponFragment.EVOUCHER)) {
            WebServiceModel.getInstance(context).setEVoucher(context, eCoupon.getCode());
        }

        CouponPickerCancelEvent couponPickerCancelEvent = new CouponPickerCancelEvent();
        couponPickerCancelEvent.seteCoupon(eCoupon);
        couponPickerCancelEvent.setType(this.getType());

        MyApplication.getInstance().mBus.post(couponPickerCancelEvent);

        this.setVisibility(View.GONE);
        ((ViewManager)this.getParent()).removeView(this);
    }

    public void onEvent(StringPickerAdapterOnItemClickEvent stringPickerAdapterOnItemClickEvent) {
        if(stringPickerAdapterOnItemClickEvent.getSuccessCode() == successCode) {
            String areaSelected = stringPickerAdapterOnItemClickEvent.getText();
            //title.setText(areaSelected);
        }
    }

    public void showDimmedBackground() {
        dimmed.setVisibility(View.VISIBLE);
    }

    public void hideDimmedBackground() {
        dimmed.setVisibility(View.GONE);
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public boolean isItem() {
        return isItem;
    }

    public void setIsItem(boolean isItem) {
        this.isItem = isItem;
    }

    public void onEvent(EmptyJsonEvent emptyJsonEvent) {
        if(couponList == null || couponList.size() == 0)
            return;

        if(emptyJsonEvent.getSuccess()) {
            String type = couponList.get(0).getType();
            CouponPickerAdapterOnItemClickEvent event = new CouponPickerAdapterOnItemClickEvent();

            if(emptyJsonEvent.getType().equals("setEcoupon")) {
                //hideProgressDialog();

                if (selectedCouponPosition < 0) return;

                int position = selectedCouponPosition;

                event.setEcoupon(couponList.get(position));
                if(successCode != -1)
                    event.setSuccessCode(successCode);
                MyApplication.getInstance().mBus.post(event);
            }

            if(emptyJsonEvent.getType().equals("setEvoucher")) {
                //hideProgressDialog();

                if (selectedVoucherPosition < 0) return;

                int position = selectedVoucherPosition;

                event.setEcoupon(couponList.get(position));
                if(successCode != -1)
                    event.setSuccessCode(successCode);
                MyApplication.getInstance().mBus.post(event);
            }
            ToastUtils.show(context, "Added Coupon Successfully");
        } else {
            ToastUtils.show(context, "Add Coupon Fail");
        }
        ((BaseActivity)context).hideProgressDialog();

    }
}
