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
 * Created by chrisyu on 20/5/16.
 */
public class PromotionTextView extends LinearLayout {
    @Bind(R.id.title_textview) TextView titleTextView;

    public PromotionTextView(Context context) {
        this(context, null);
    }

    public PromotionTextView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public PromotionTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater.from(context).inflate(R.layout.promotion_textview, this);
        ButterKnife.bind(this);

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.PromotionTextView, defStyleAttr, 0);
        String promotionText = a.getString(R.styleable.PromotionTextView_promotion_text);

        setPromotionText(promotionText);
    }

    public void setPromotionText(String promotionTextString) {
        this.titleTextView.setText(promotionTextString);
    }
}
