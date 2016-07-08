package parknshop.parknshopapp.Fragment.Home;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.Model.PromotionCategoryResponse;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 25/4/16.
 */
public class DynamicTag extends LinearLayout{
    PromotionCategoryResponse.Data data;

    public @Bind(R.id.content_dynamic_tag) TextView textView;
    public DynamicTag(Context context) {
        this(context, null);
    }

    public DynamicTag(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DynamicTag(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater.from(context).inflate(R.layout.shopping_cart_item_layout,this);
        ButterKnife.bind(this);
    }

    public void setData(PromotionCategoryResponse.Data data) {
        this.data = data;
    }

    public PromotionCategoryResponse.Data getData() {
        return data;
    }
}
