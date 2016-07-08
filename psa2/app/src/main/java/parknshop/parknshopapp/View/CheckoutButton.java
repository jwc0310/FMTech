package parknshop.parknshopapp.View;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.CheckoutBoxEvent;
import parknshop.parknshopapp.Rest.event.CheckoutButtonGroupEvent;

/**
 * Created by chrisyu on 16/4/2.
 */
public class CheckoutButton extends RelativeLayout {
    public @Bind(R.id.title_layout) LinearLayout titleLayout;
    public @Bind (R.id.title) TextView title;
    public @Bind (R.id.disabled_view) View disabledView;
    public @Bind (R.id.forward) ImageView forward;
    public @Bind (R.id.forward_dummy) ImageView forwardDummy;

    String isLeft = null;
    Boolean isStandardButton = false;
    public boolean isDisabled = false;
    public boolean isForward = false;
    public boolean isLowerCase = false;
    int position;
    CharSequence titleDefaultText;
    Context context;

    public CheckoutButton(Context context) {this(context, null);}

    public CheckoutButton(Context context, AttributeSet attrs) {this(context, attrs, 0);}

    public CheckoutButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater.from(context).inflate(R.layout.checkout_btn, this);
        ButterKnife.bind(this);

        this.context = context;

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CheckoutButton);
        titleDefaultText = a.getString(R.styleable.CheckoutButton_checkout_button_title);
        isStandardButton = a.getBoolean(R.styleable.CheckoutButton_checkout_button_is_alternative, false);
        isLeft = a.getString(R.styleable.CheckoutButton_checkout_button_direction_left);
        isDisabled = a.getBoolean(R.styleable.CheckoutButton_checkout_button_is_disabled, false);
        isForward = a.getBoolean(R.styleable.CheckoutButton_checkout_button_is_forward, false);
        isLowerCase = a.getBoolean(R.styleable.CheckoutButton_checkout_button_is_lower_case, false);

        title.setText(titleDefaultText);

        if(isLowerCase) {
            title.setAllCaps(false);
        } else {
            title.setAllCaps(true);
        }

        drawBackground();

        try {
            MyApplication.getInstance().register(this);
        }catch (Exception e) {
            //Log.i("null", "null pointer exeception found @ My Application");
        }
    }

    public void resetDefaultText() {
        title.setText(titleDefaultText);
    }

    public String getText() {
        return title.getText().toString();
    }

    public void drawBackground() {
        title.setTextColor(getResources().getColor(isStandardButton ? android.R.color.white : R.color.colorPrimary));

        disabledView.setVisibility(View.GONE);

        if(isDisabled) {
            disabledView.setVisibility(View.VISIBLE);
        } else if(isLeft == null) {
            titleLayout.setBackgroundResource(isStandardButton ? (R.drawable.checkout_next_btn_background) : (R.drawable.checkout_next_btn_alternative));
        } else {
            LayoutParams params = (LayoutParams)titleLayout.getLayoutParams();
            params.setMargins(isLeft.equals("left") ? 20 : 0, 0, isLeft.equals("right") ? 20 : 0, 0); //substitute parameters for left, top, right, bottom
            titleLayout.setLayoutParams(params);

            if(isLeft.equals("left")) {
                titleLayout.setBackgroundResource(isStandardButton ? (R.drawable.checkout_next_btn_background_left) : (R.drawable.checkout_next_btn_alternative_left));
            } else if(isLeft.equals("right")) {
                titleLayout.setBackgroundResource(isStandardButton ? (R.drawable.checkout_next_btn_background_right) : (R.drawable.checkout_next_btn_alternative_right));
            }
        }

        if(isForward) {
            forward.setVisibility(View.VISIBLE);
            forwardDummy.setVisibility(View.INVISIBLE);
        } else {
            forward.setVisibility(View.GONE);
            forwardDummy.setVisibility(View.GONE);
        }
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public void unSelect() {
        isStandardButton = false;
        drawBackground();
    }
    public void setSelected() {
        isStandardButton = true;
        drawBackground();
    }

    public boolean isSelected() {
        return isStandardButton;
    }

    public boolean isDisabled() {
        return isDisabled;
    }

    public void setDisabled(boolean setDisabled) {
        isDisabled = setDisabled;
        drawBackground();
    }

    public void onEvent(CheckoutButtonGroupEvent bEvent) {
        if(this.getParent().hashCode() == bEvent.getSuccessCode()) {
            if(this.hashCode() == bEvent.getChildSuccessCode()) {
                setSelected();
            } else {
                unSelect();
            }
        }
    }

    public void onEvent(CheckoutBoxEvent checkoutBoxEvent) {
        if(checkoutBoxEvent.getSuccessCode() != 1234 && (title.getText().equals(context.getString(R.string.checkout_cheung_chau)) || title.getText().equals(context.getString(R.string.checkout_lautau_island)) ))
            unSelect();
    }
}
