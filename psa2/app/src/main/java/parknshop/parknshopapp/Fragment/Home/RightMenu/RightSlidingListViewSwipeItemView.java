package parknshop.parknshopapp.Fragment.Home.RightMenu;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.Model.CartResponse;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 22/3/16.
 */
public class RightSlidingListViewSwipeItemView extends com.daimajia.swipe.SwipeLayout{
    @Bind(R.id.front_wrapper) LinearLayout frontWrapper;
    @Bind(R.id.bottom_wrapper) LinearLayout bottoWrapper;

    public RightSlidingListViewSwipeItemView(Context context) {
        super(context);
        init(context);
    }

    public void init(Context context){
        LayoutInflater.from(context).inflate(R.layout.home_activity_sliding_menu_right_item, null);
        ButterKnife.bind(this);
    }

    public void setContent(CartResponse.Entry entry) {
        ((RightSlidingListViewFrontItemView)getFrontWrapper()).setContent(entry);
    }

    public LinearLayout getFrontWrapper() {
        return frontWrapper;
    }

    public LinearLayout getButtonWrapper() {
        return bottoWrapper;
    }
}
