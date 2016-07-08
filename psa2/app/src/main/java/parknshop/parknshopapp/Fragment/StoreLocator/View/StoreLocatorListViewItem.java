package parknshop.parknshopapp.Fragment.StoreLocator.View;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.Spannable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import me.next.slidebottompanel.SlideBottomPanel;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 28/4/16.
 */
public class StoreLocatorListViewItem extends LinearLayout {
    @Nullable @Bind(R.id.store_locator_title) ImageView storeLocatorTitle;
    public @Nullable @Bind(R.id.address_line_1) TextView address_line_1;
    public @Nullable @Bind(R.id.address_line_2) TextView address_line_2;
    @Nullable @Bind(R.id.address_line_3) TextView address_line_3;
    @Nullable @Bind(R.id.address_line_4) TextView address_line_4;
    @Nullable @Bind(R.id.km_in_distance) TextView km_in_distance;
    //@Bind(R.id.parking_icon) ImageView parkingIcon;
    @Nullable @Bind(R.id.arrow) ImageView arrow;
    @Nullable @Bind(R.id.line) View line;
    public @Nullable @Bind(R.id.wrapper_layout) RelativeLayout wrapper;

    Context context;

    SlideBottomPanel sbv;
    public void setSlidingPanel(SlideBottomPanel sbv) {
        this.sbv = sbv;
    }

    public StoreLocatorListViewItem(Context context) {
        this(context, null);
    }

    public StoreLocatorListViewItem(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public StoreLocatorListViewItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        LayoutInflater.from(context).inflate(R.layout.store_listview_item, this);
        ButterKnife.bind(this);
        line.setVisibility(View.GONE);
        getArrow().setTag(R.drawable.buy_more_save_more_arrow_up);
    }

    public void setStoreLocatorTitle(String type) {
        if(type == null) {
            Glide.with(context).load(R.drawable.pns).into(storeLocatorTitle);
            return;
        }
        if(type.equals("GREAT"))
            Glide.with(context).load(R.drawable.great).into(storeLocatorTitle);
        else if (type.equals("GREAT FOOD"))
            Glide.with(context).load(R.drawable.great).into(storeLocatorTitle);
        else if (type.equals("FUSION"))
            Glide.with(context).load(R.drawable.fusion).into(storeLocatorTitle);
        else if (type.equals("SUPA DEPA"))
            Glide.with(context).load(R.drawable.supadepa).into(storeLocatorTitle);
        else if (type.equals("TASTE"))
            Glide.with(context).load(R.drawable.taste).into(storeLocatorTitle);
        else if (type.equals("INTERNATIONAL"))
            Glide.with(context).load(R.drawable.international).into(storeLocatorTitle);
        else if (type.equals("GOURMET"))
            Glide.with(context).load(R.drawable.food_hall).into(storeLocatorTitle);
        else
            Glide.with(context).load(R.drawable.pns).into(storeLocatorTitle);
    }

    public void setAddressLine1(String addressLine1) {
        address_line_1.setText(addressLine1);
    }

    public void setAddressLine2(Object addressLine2) {
        if(addressLine2 instanceof String)
            address_line_2.setText((String)addressLine2);
        else if(addressLine2 instanceof Spannable)
            address_line_2.setText((Spannable)addressLine2);
    }

    public void setAddressLine3(String addressLine3) {
        address_line_3.setText(addressLine3);
    }

    public void setAddressLine4(String addressLine4) {
        address_line_4.setText(addressLine4);
    }

    public void setKmInDistance(String kmInDistance){
        this.km_in_distance.setText(kmInDistance);
    }

    @Bind(R.id.parking_icon) ImageView parkingIcon;
    public void setParkingIconVisible(boolean set) {
        if(set)
            parkingIcon.setVisibility(View.VISIBLE);
         else
             parkingIcon.setVisibility(View.GONE);
    }

    public ImageView getArrow() {
        return arrow;
    }

    @OnClick(R.id.arrow)
    public void arrowOnClick() {
        //if(getArrow().getId())
        //getArrow().setImageResource(R.drawable.buy_more_save_more_arrow_up);
       // getArrow().setImageResource(R.drawable.buy_more_save_more_arrow_up);
        if((Integer)getArrow().getTag() == R.drawable.buy_more_save_more_arrow_up) {
            getArrow().setImageResource(R.drawable.buy_more_save_more_arrow_down);
            getArrow().setTag(R.drawable.buy_more_save_more_arrow_down);
            if(sbv != null) {
                sbv.displayPanel();
            }
        } else {
            getArrow().setImageResource(R.drawable.buy_more_save_more_arrow_up);
            getArrow().setTag(R.drawable.buy_more_save_more_arrow_up);
            if(sbv != null) {
                sbv.hidePanel();
            }
        }
    }

    /*EXPRESS
    FUSION
    GOURMET
    GREAT
    INTERNATIONAL
    PARKNSHOP
    PARKNSHOPFROZENFOODSTORE
    PARKNSHOPFROZENFOODSTOREINTERNATIONAL
    PARKNSHOPSUPERSTORE
    SUPA DEPA
    TASTE
    滋味佳*/
}
