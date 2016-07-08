package parknshop.parknshopapp.View;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.CheckoutButtonGroupEvent;


/**
 * Created by hp on 5/4/2016.
 */
public class CheckoutButtonGroup extends LinearLayout {
    public CheckoutButtonGroup(Context context) {
        this(context, null);
    }

    public CheckoutButtonGroup(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CheckoutButtonGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater.from(context).inflate(R.layout.checkout_button_group_layout, this);
    }

    public static boolean checkSource(CheckoutButtonGroupEvent checkoutButtonGroupEvent, LinearLayout layout) {
        return  checkoutButtonGroupEvent.getSuccessCode() == layout.hashCode();
    }

    public static void handleGroup(final LinearLayout btnGroupLayout) {

        for(int i = 0; i < btnGroupLayout.getChildCount(); i ++) {
            if(btnGroupLayout.getChildAt(i) instanceof  CheckoutButton) {
                CheckoutButton selectedCheckoutButton = (CheckoutButton) btnGroupLayout.getChildAt(i);
                selectedCheckoutButton.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        CheckoutButton selectedButton = (CheckoutButton) v;

                        for (int y = 0; y < btnGroupLayout.getChildCount(); y++) {
                            CheckoutButton checkoutButton = (CheckoutButton) btnGroupLayout.getChildAt(y);
                            checkoutButton.unSelect();

                            if(selectedButton == checkoutButton)
                                selectedButton.setPosition(y);
                        }

                        selectedButton.setSelected();
                        CheckoutButtonGroupEvent checkoutButtonGroupEvent = new CheckoutButtonGroupEvent();
                        checkoutButtonGroupEvent.setSuccessCode(btnGroupLayout.hashCode());
                        checkoutButtonGroupEvent.setChildSuccessCode(selectedButton.hashCode());
                        checkoutButtonGroupEvent.setPosition(selectedButton.getPosition());
                        checkoutButtonGroupEvent.setText(selectedButton.getText());
                        MyApplication.getInstance().mBus.post(checkoutButtonGroupEvent);
                    }
                });
            }
        }
    }

    public static void manualOnClickButton(LinearLayout btnGroupLayout, int position) {
        CheckoutButtonGroupEvent checkoutButtonGroupEvent = new CheckoutButtonGroupEvent();
        checkoutButtonGroupEvent.setSuccessCode(btnGroupLayout.hashCode());

        for (int y = 0; y < btnGroupLayout.getChildCount(); y++) {
            CheckoutButton checkoutButton = (CheckoutButton) btnGroupLayout.getChildAt(y);

            if(position == y) {
                checkoutButtonGroupEvent.setChildSuccessCode(checkoutButton.hashCode());
                checkoutButtonGroupEvent.setPosition(position);
            }
        }
        checkoutButtonGroupEvent.callApi = false;
        MyApplication.getInstance().mBus.post(checkoutButtonGroupEvent);
    }

    public static boolean getSelectedPosition(LinearLayout btnGroupLayout) {
        for(int i = 0; i < btnGroupLayout.getChildCount(); i ++) {
            if(btnGroupLayout.getChildAt(i) instanceof  CheckoutButton) {
                CheckoutButton checkoutButton = (CheckoutButton) btnGroupLayout.getChildAt(i);
                if(checkoutButton.isStandardButton)
                    return true;
            }
        }
        return false;
    }
}
