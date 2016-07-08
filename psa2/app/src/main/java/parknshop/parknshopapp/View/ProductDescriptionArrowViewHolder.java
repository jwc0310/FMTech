package parknshop.parknshopapp.View;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 29/3/16.
 */
public class ProductDescriptionArrowViewHolder {
    ImageView iv;
    LinearLayout descPanel;
    boolean shown = false;

    public ProductDescriptionArrowViewHolder(ImageView iv, LinearLayout ll) {
        this.iv = iv;
        this.descPanel = ll;
    }

    public void onItemClick() {
        if(!shown) {
            iv.setImageResource(R.drawable.home_activity_sliding_menu_item_arrow_down);
            descPanel.setVisibility(View.VISIBLE);
            shown = true;
        } else {
            iv.setImageResource(R.drawable.home_activity_sliding_menu_item_arrow_up);
            descPanel.setVisibility(View.GONE);
            shown = false;
        }
    }
}
