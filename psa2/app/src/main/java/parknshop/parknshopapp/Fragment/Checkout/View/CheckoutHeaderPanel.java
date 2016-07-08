package parknshop.parknshopapp.Fragment.Checkout.View;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import com.orhanobut.hawk.Hawk;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 6/5/16.
 */
public class CheckoutHeaderPanel extends LinearLayout {
    //@Bind(R.id.checkout_back) ImageView back;

    @Bind(R.id.new_checkout_dot_1) CheckoutDot checkoutDot1;
    @Bind(R.id.new_checkout_dot_2) CheckoutDot checkoutDot2;
    @Bind(R.id.new_checkout_dot_3) CheckoutDot checkoutDot3;
    @Bind(R.id.new_checkout_dot_4) CheckoutDot checkoutDot4;
    @Bind(R.id.new_checkout_dot_5) CheckoutDot checkoutDot5;

    ArrayList<CheckoutDot> checkoutDotArrayList = new ArrayList<>();

    Context context;

    int totalNumber;
    int currentStep;
    String prefix;
    boolean tick;

    public CheckoutHeaderPanel(Context context) {
        this(context, null);
    }

    public CheckoutHeaderPanel(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CheckoutHeaderPanel(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater.from(context).inflate(R.layout.checkout_header_panel_layout, this);
        ButterKnife.bind(this);
        this.context = context;

        checkoutDotArrayList.clear();
        checkoutDotArrayList.add(checkoutDot1);
        checkoutDotArrayList.add(checkoutDot2);
        checkoutDotArrayList.add(checkoutDot3);
        checkoutDotArrayList.add(checkoutDot4);
        checkoutDotArrayList.add(checkoutDot5);


        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CheckoutHeaderPanel);
        totalNumber = a.getInteger(R.styleable.CheckoutHeaderPanel_checkout_dot_panel_number, -1);
        currentStep = a.getInteger(R.styleable.CheckoutHeaderPanel_checkout_dot_panel_current_step, -1);
        prefix = a.getString(R.styleable.CheckoutHeaderPanel_checkout_dot_panel_prefix);
        tick = a.getBoolean(R.styleable.CheckoutHeaderPanel_checkout_dot_panel_tick, false);

        for(int i = 0; i < checkoutDotArrayList.size(); i++) {
            if(totalNumber > i)
                checkoutDotArrayList.get(i).setVisibility(View.VISIBLE);
            else
                checkoutDotArrayList.get(i).setVisibility(View.GONE);

            if(prefix != null && prefix.length() > 0)
                checkoutDotArrayList.get(i).setPrefix(prefix);

            if(currentStep >= i + 1)
                checkoutDotArrayList.get(i).setIsDimmed(false);

            if(currentStep == i + 1)
                checkoutDotArrayList.get(i).setCurrentStep(true);

            //if(currentStep == i + 1 )
            if(currentStep == i + 1)
                checkoutDotArrayList.get(i).setTick(tick);

            checkoutDotArrayList.get(i).setTotalSize(totalNumber);

        }
    }


    @OnClick(R.id.new_checkout_dot_1)
    public void checkoutDotOne() {
        Hawk.put("goToConfirmation", false);

        if(currentStep > 1) {
            //CheckoutDeliveryMethodFragment checkoutDeliveryMethodFragment = new CheckoutDeliveryMethodFragment();
            //((BaseActivity) context).placeFragmentWithBackStack(checkoutDeliveryMethodFragment);
            for(int i = 1; i < currentStep + (tick == true ? 1 : 0) ; i ++) {
                ((Activity)context).onBackPressed();
            }
        }
    }

    @OnClick(R.id.new_checkout_dot_2)
    public void checkoutDotTwo() {
        Hawk.put("goToConfirmation", false);

        if(currentStep > 2) {
            for(int i = 2; i < currentStep + (tick == true ? 1 : 0) ; i ++) {
                ((Activity)context).onBackPressed();
            }
        }
        /*
        if(currentStep > 2) {
            if(!tick) {
                DeliveryTimeslotFragment deliveryTimeslotFragment = new DeliveryTimeslotFragment();
                deliveryTimeslotFragment.goBackToConfirmation = true;
                ((BaseActivity) context).placeFragmentWithBackStack(deliveryTimeslotFragment);
            } else {
                CheckoutPaymentFragment checkoutPaymentFragment = new CheckoutPaymentFragment();
                checkoutPaymentFragment.goBackToConfirmation = true;
                ((BaseActivity) context).placeFragmentWithBackStack(checkoutPaymentFragment);
            }
        }*/

    }


    @OnClick(R.id.new_checkout_dot_3)
    public void checkoutDotThree() {
        Hawk.put("goToConfirmation", false);

        if(currentStep > 3) {
            for(int i = 3; i < currentStep + (tick == true ? 1 : 0) ; i ++) {
                ((Activity)context).onBackPressed();
            }
        }
        /*
        if(currentStep > 3) {
            if(!tick) {
                CheckoutPaymentFragment checkoutPaymentFragment = new CheckoutPaymentFragment();
                checkoutPaymentFragment.goBackToConfirmation = true;
                ((BaseActivity) context).placeFragmentWithBackStack(checkoutPaymentFragment);
            } else {
                ((BaseActivity)context).placeFragmentWithBackStack(new CheckoutConfirmationFragment());
            }
        }*/
    }

    @OnClick(R.id.new_checkout_dot_4)
    public void checkoutDotFour() {
        ///((BaseActivity)context).placeFragmentWithBackStack(new CheckoutConfirmationFragment());
    }

    @OnClick(R.id.new_checkout_dot_5)
    public void checkoutDotFive() {

    }

    //@Nullable @OnClick (R.id.checkout_back)
    //public void checkoutBack() {
    //    Activity activity = (Activity) context;
    //    activity.onBackPressed();
    //}
}
