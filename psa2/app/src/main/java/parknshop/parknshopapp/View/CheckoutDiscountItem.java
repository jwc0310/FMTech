package parknshop.parknshopapp.View;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 10/5/16.
 */
public class CheckoutDiscountItem extends LinearLayout {
    @Bind(R.id.delivery_fee_placeholder) TextView delivery_fee_placeholder;
    @Bind(R.id.delivery_fee_value) TextView delivery_fee_value;

    public CheckoutDiscountItem(Context context) {
        this(context, null);
    }

    public CheckoutDiscountItem(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CheckoutDiscountItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater.from(context).inflate(R.layout.delivery_price_dicount_iem, this);
        ButterKnife.bind(this);


        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CheckoutDiscountItem);
        CharSequence titleString = a.getString(R.styleable.CheckoutDiscountItem_checkout_discount_title);
        CharSequence dataString = a.getString(R.styleable.CheckoutDiscountItem_checkout_discount_data);

        delivery_fee_placeholder.setText(titleString);
        delivery_fee_value.setText(dataString);
    }

    public void setPlaceholder(CharSequence titleString) {
        delivery_fee_placeholder.setText(titleString);
    }

    public void setValue(CharSequence titleString) {
        delivery_fee_value.setText(titleString);
    }
}
