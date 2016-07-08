package parknshop.parknshopapp.View;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 16/4/2.
 */
public class CheckoutHeader extends LinearLayout {
    @Nullable @Bind(R.id.title) TextView tv;
    @Nullable @Bind(R.id.icon) ImageView icon;

    public CheckoutHeader(Context context) {
        this(context, null);
    }

    public CheckoutHeader(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CheckoutHeader(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        inflateLayout(context);

        ButterKnife.bind(this);

        TypedArray a =context.obtainStyledAttributes(attrs, R.styleable.CheckoutHeader);
        CharSequence ab = a.getString(R.styleable.CheckoutHeader_text);

        tv.setText(ab);
    }

    public void setText(String str) {
        tv.setText(str);
    }

    public void inflateLayout(Context context) {
        LayoutInflater.from(context).inflate(R.layout.checkout_header, this);
    }

    public CheckoutItem getCheckoutItemById(int id) {
        return (CheckoutItem) findViewById(id);
    }

    public CheckoutAddress getDeliveryAddress() {
        return (CheckoutAddress) findViewById(R.id.delivery_address);
    }

    public CheckoutAddress getBillingAddress() {
        return  (CheckoutAddress) findViewById(R.id.billing_address);
    }

    public void setIcon(int res) {
        icon.setVisibility(VISIBLE);
        icon.setImageResource(res);
    }
}
