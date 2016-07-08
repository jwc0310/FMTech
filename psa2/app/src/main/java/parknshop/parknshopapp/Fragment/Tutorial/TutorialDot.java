package parknshop.parknshopapp.Fragment.Tutorial;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 8/3/16.
 */
public class TutorialDot extends LinearLayout {
    @Bind(R.id.enabled) View enabled;
    @Bind(R.id.disabled) View disabled;
    boolean isProductDot;

    public TutorialDot(Context context) {
        this(context, null);
    }

    public TutorialDot(Context context, boolean isProductDot) {
        super(context, null);
        LayoutInflater.from(context).inflate(R.layout.product_dot_layout, this, true);
        ButterKnife.bind(this);
    }

    public TutorialDot(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TutorialDot(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context ctx) {
        LayoutInflater.from(ctx).inflate(R.layout.tutorial_dot_layout, this, true);
        ButterKnife.bind(this);
    }

    public void enable() {
        enabled.setVisibility(View.VISIBLE);
        disabled.setVisibility(View.GONE);
    }


    public void disable() {
        enabled.setVisibility(View.GONE);
        disabled.setVisibility(View.VISIBLE);
    }
}
