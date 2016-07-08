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
 * Created by chrisyu on 9/5/16.
 */
public class CheckoutSelectorPanel extends LinearLayout {
    @Bind (R.id.label) TextView label;
    @Bind (R.id.select) TextView select;

    public CheckoutSelectorPanel(Context context) {
        this(context, null);
    }

    public CheckoutSelectorPanel(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CheckoutSelectorPanel(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater.from(context).inflate(R.layout.ecoupon_selector_panel, this);

        ButterKnife.bind(this);

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CheckoutSelectorPanel);
        CharSequence titleString = a.getString(R.styleable.CheckoutSelectorPanel_selector_panel_label);

        label.setText(titleString);
    }
}
