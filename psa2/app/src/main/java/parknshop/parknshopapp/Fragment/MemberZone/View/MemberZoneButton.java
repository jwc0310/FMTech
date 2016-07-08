package parknshop.parknshopapp.Fragment.MemberZone.View;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 12/4/16.
 */
public class MemberZoneButton extends RelativeLayout {
    @Bind(R.id.title) TextView title;
    @Bind(R.id.title_layout) View titleLayout;
    @Bind (R.id.disabled_view) View disabledView;

    String isLeft = null;
    Boolean isStandardButton = false, is;
    boolean isDisabled = false;
    int position;
    CharSequence titleDefaultText;

    public MemberZoneButton(Context context) {this(context, null);}

    public MemberZoneButton(Context context, AttributeSet attrs) {this(context, attrs, 0);}

    public MemberZoneButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater.from(context).inflate(R.layout.checkout_btn, this);
        ButterKnife.bind(this);

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CheckoutButton);
        titleDefaultText = a.getString(R.styleable.CheckoutButton_checkout_button_title);
        isStandardButton = a.getBoolean(R.styleable.CheckoutButton_checkout_button_is_alternative, false);
        is = a.getBoolean(R.styleable.CheckoutButton_checkout_button_is, false);

        isLeft = a.getString(R.styleable.CheckoutButton_checkout_button_direction_left);
        isDisabled = a.getBoolean(R.styleable.CheckoutButton_checkout_button_is_disabled, false);

        title.setText(titleDefaultText);
        drawBackground();
    }

    public void setText(String itemString) {
        title.setText(itemString);
    }

    public void resetDefaultText() {
        title.setText(titleDefaultText);
    }

    public String getText() {
        return title.getText().toString();
    }

    public void drawBackground() {
        //#326190
        title.setTextColor(getResources().getColor(android.R.color.white));

        if(is) {
            titleLayout.setBackgroundResource(R.drawable.checkout_next_btn_background);
        } else if(isStandardButton)
            titleLayout.setBackgroundResource(R.drawable.member_zone_link_bg);
        else
            titleLayout.setBackgroundResource(R.drawable.member_zone_link_trans_bg);
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
}

