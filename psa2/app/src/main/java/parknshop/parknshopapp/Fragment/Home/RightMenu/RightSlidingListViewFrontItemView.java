package parknshop.parknshopapp.Fragment.Home.RightMenu;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.Model.CartResponse;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 22/3/16.
 */
public class RightSlidingListViewFrontItemView extends LinearLayout {
    @Bind(R.id.image) ImageView image;
    @Bind(R.id.title) TextView title;
    @Bind(R.id.small_desc) TextView small_desc;
    @Bind(R.id.weight) TextView weight;
    @Bind(R.id.price) TextView price;

    public RightSlidingListViewFrontItemView(Context context) {
        super(context);
    }

    public void init(Context context){
        ButterKnife.bind(this);
    }

    public void setContent(CartResponse.Entry entry) {
        title.setText(entry.product.getName());
        small_desc.setText(entry.product.getDescription());
        weight.setText(entry.product.getDescSpec());
    }
}
