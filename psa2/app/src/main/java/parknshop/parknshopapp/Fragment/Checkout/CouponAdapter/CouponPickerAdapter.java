package parknshop.parknshopapp.Fragment.Checkout.CouponAdapter;

import android.content.Context;
import android.content.DialogInterface;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import parknshop.parknshopapp.Base.BaseActivity;
import parknshop.parknshopapp.Fragment.Checkout.CheckoutCouponFragment;
import parknshop.parknshopapp.Model.ECouponResponse;
import parknshop.parknshopapp.View.CheckoutCouponPicker;
import parknshop.parknshopapp.WebServiceModel;

public class CouponPickerAdapter extends BaseAdapter implements DialogInterface.OnClickListener {
    private LayoutInflater inflater;
    private String[] texts;
    private ArrayList<ECouponResponse.ECoupon> ecoupon;
    private Context mContext;
    private int reqCode;

    private int successCode = -1;
    private int failureCode = -1;
    CheckoutCouponPicker cp;

    public CouponPickerAdapter(Context context, String[] texts, int reqCode) {
        inflater = LayoutInflater.from(context);
        mContext = context;
        this.texts = texts;
        this.successCode = reqCode;
    }

    public CouponPickerAdapter(Context context, ArrayList<ECouponResponse.ECoupon> ecoupon, int reqCode) {
        inflater = LayoutInflater.from(context);
        mContext = context;
        this.ecoupon = ecoupon;
        this.successCode = reqCode;
    }

    public CouponPickerAdapter(Context context, String[] texts, int successCode, int failureCode) {
        inflater = LayoutInflater.from(context);
        mContext = context;
        this.texts = texts;
        this.successCode = successCode;
        this.failureCode = failureCode;
    }

    public void setPicker(CheckoutCouponPicker cp) {
        this.cp = cp;
    }

    @Override
    public int getCount() {
        return ecoupon.size();
    }

    @Override
    public Object getItem(int position) {
        return ecoupon.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView textview;
        if (convertView == null) {
            convertView = inflater.inflate(android.R.layout.simple_list_item_1, null);
            textview = (TextView) convertView.findViewById(android.R.id.text1);
            convertView.setTag(textview);
        } else {
            textview = (TextView) convertView.getTag();
        }

        //Log.i("coupon", "coupon" + " " + " " + ecoupon.get(position).getTerms());

        if(ecoupon.get(position).getType().equals(CheckoutCouponFragment.ECOUPON))
            textview.setText(Html.fromHtml(ecoupon.get(position).getTerms()));


        if(ecoupon.get(position).getType().equals(CheckoutCouponFragment.EVOUCHER))
            textview.setText(Html.fromHtml(ecoupon.get(position).getDescription()));
        return convertView;
    }

    Runnable callback;
    public void setCallBack(Runnable runnable) {
        this.callback = runnable;
    }

    @Override
    public void onClick(DialogInterface dialogInterface, int position) {
        ((BaseActivity)mContext).showProgressDialog();

        if(ecoupon.get(position).getType().equals(CheckoutCouponFragment.ECOUPON)) {
            WebServiceModel.getInstance(mContext).setECoupon(mContext, ecoupon.get(position).getCode());
            if(cp != null) cp.selectedCouponPosition = position;
        }

        if(ecoupon.get(position).getType().equals(CheckoutCouponFragment.EVOUCHER)) {
            WebServiceModel.getInstance(mContext).setEVoucher(mContext, ecoupon.get(position).getCode());
            if(cp != null) cp.selectedVoucherPosition = position;
        }

       /* CouponPickerAdapterOnItemClickEvent event = new CouponPickerAdapterOnItemClickEvent();

        Log.i("click", "click" + ecoupon.get(position).getType() + " " + ecoupon.get(position).getDescription());

        event.setEcoupon(ecoupon.get(position));

        if(successCode != -1)
            event.setSuccessCode(successCode);

        MyApplication.getInstance().mBus.post(event);*/
    }
}
