package parknshop.parknshopapp.Fragment.MemberZone.View;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 16/4/2.
 */
public class MoneyBackCardProfileItem extends LinearLayout {
    public @Bind(R.id.header) TextView header;
    public @Bind (R.id.btnSwitch)
    SwitchCompat btnSwitch;
    Context context;

    public MoneyBackCardProfileItem(Context context) {
        this(context, null);
    }

    public MoneyBackCardProfileItem(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MoneyBackCardProfileItem(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.context = context;

        inflateLayout(context);

        ButterKnife.bind(this);

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.MemberZoneItemPicker);
        CharSequence title = a.getString(R.styleable.MemberZoneItemPicker_member_picker_header);

        int textStyle = a.getInteger(R.styleable.MemberZoneItemPicker_member_picker_textStyle, 0);

        if(textStyle == 11) {
            header.setTypeface(Typeface.DEFAULT_BOLD);
        }

        header.setText(title);
    }

    public void setSwitch(boolean switchOn){
        btnSwitch.toggle();
        btnSwitch.setChecked(switchOn);
    }

    public boolean getBtnSwitch() {
        return btnSwitch.isChecked();
    }

    public void setHeader(String headerText) {
        header.setText(headerText);
    }

    public void setHeaderColor(int color) {
        header.setTextColor(color);
    }

    public void inflateLayout(Context context) {
        LayoutInflater.from(context).inflate(R.layout.moneyback_card_profile_item, this);
    }
}
