package parknshop.parknshopapp.View;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.orhanobut.hawk.Hawk;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.EventUpdate.PaymentMethodOnItemClickEvent;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 5/4/16.
 */
public class CheckoutPaymentItem extends LinearLayout {
    @Bind (R.id.payment_drawable) ImageView paymentImageView;
    @Bind (R.id.title) TextView titleTextView;
    @Bind (R.id.tick) View tick;

    int successCode;

    public CheckoutPaymentItem(Context context) {
        this(context, null);
    }

    public CheckoutPaymentItem(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CheckoutPaymentItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        LayoutInflater.from(context).inflate(R.layout.payment_item, this);
        ButterKnife.bind(this);

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CheckoutPaymentItem);
        CharSequence titleString = a.getString(R.styleable.CheckoutPaymentItem_checkout_payment_title);
        Drawable paymentDrawable = a.getDrawable(R.styleable.CheckoutPaymentItem_checkout_payment_drawable);
        Boolean isSelected = a.getBoolean(R.styleable.CheckoutPaymentItem_checkout_payment_selected, false);

        titleTextView.setText(titleString);
        paymentImageView.setImageDrawable(paymentDrawable);

        if(isSelected) {
            tick.setVisibility(View.VISIBLE);
        } else {
            tick.setVisibility(View.GONE);
        }

        try {
            MyApplication.getInstance().register(this);
        } catch (Exception e) {

        }
        successCode = this.hashCode();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MyApplication.getInstance().unRegister(this);
    }

    @OnClick(R.id.root)
    public void onClick() {
        tick.setVisibility(tick.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);

        String paymentType = null;
        String selectedCardType = null;

        switch (this.getId()){
            case R.id.btnVisa:
                paymentType = "CreditCardFull";
                selectedCardType = "visa";
                break;
            case R.id.btnMaster:
                paymentType = "CreditCardFull";
                selectedCardType = "master";
                break;
            case R.id.btnAMEX:
                paymentType = "CreditCardFullAmex";
                selectedCardType = "amex";
                break;
            case R.id.btnCOD:
                paymentType = "COD";
                selectedCardType = "cod";
                break;
        }

        Hawk.put("selectedCardType", selectedCardType);

        PaymentMethodOnItemClickEvent event = new PaymentMethodOnItemClickEvent();
        event.setPaymentType(paymentType);
        event.setSuccess(true);
        event.setSuccessCode(this.getId());
        MyApplication.getInstance().mBus.post(event);
    }

    public void onEvent(PaymentMethodOnItemClickEvent event) {

        if(this.getId() == event.getSuccessCode()) {
            tick.setVisibility(View.VISIBLE);
        } else {
            tick.setVisibility(View.GONE);
        }
    }
}
