package parknshop.parknshopapp.View;

import android.content.Context;
import android.text.Html;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.Model.CartResponse;
import parknshop.parknshopapp.Model.ECouponResponse;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 11/5/16.
 */
public class CheckoutCouponListItemView extends LinearLayout{
    @Bind(R.id.label) TextView labelTextView;
    @Bind(R.id.description) TextView descriptionTextView;
    @Bind(R.id.checked) ImageView checkedImageView;
    @Bind(R.id.unchecked) ImageView uncheckedImageView;
    @Bind(R.id.divider) View divider;

    ECouponResponse.ECoupon eCoupon;
    CartResponse.VoucherInfo voucherInfo;

    public CheckoutCouponListItemView(Context context, CartResponse.VoucherInfo voucherInfo) {
        this(context, voucherInfo.voucherCode, voucherInfo.description);
        this.voucherInfo = voucherInfo;
    }


    public CheckoutCouponListItemView(Context context, ECouponResponse.ECoupon eCoupon) {
        this(context, eCoupon.getTerms(), eCoupon.getDescription());
        this.eCoupon = eCoupon;
    }


    public CheckoutCouponListItemView(Context context, String label, String description) {
        this(context);
        labelTextView.setText(Html.fromHtml(label));
        descriptionTextView.setText(description);

        //Log.i("itemview", "itemview " + label + " " + description);
    }

    public CheckoutCouponListItemView(Context context) {
        this(context, null, 0);
    }


    public CheckoutCouponListItemView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        LayoutInflater.from(context).inflate(R.layout.checkout_coupon_layout, this);

        ButterKnife.bind(this);

        checkedImageView.setVisibility(View.GONE);
        uncheckedImageView.setVisibility(View.GONE);
        divider.setVisibility(View.VISIBLE);

        this.setBackgroundColor(getResources().getColor(R.color.grey));
    }


}
