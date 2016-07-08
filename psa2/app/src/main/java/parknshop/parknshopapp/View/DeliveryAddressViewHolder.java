package parknshop.parknshopapp.View;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Base.BaseActivity;
import parknshop.parknshopapp.Fragment.Checkout.old_stuff.DeliveryMethod.CheckoutAddDeliveryAddressFragment;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 1/4/16.
 */

public class DeliveryAddressViewHolder {
    @Bind(R.id.name) TextView name;
    @Bind(R.id.address) TextView address;
    @Bind(R.id.check_box) ImageView checkBox;

    @Bind(R.id.edit) ImageView edit;
    @Bind(R.id.title) TextView title;
    @Bind(R.id.check_box_panel) View checkBoxPanel;

    public boolean isListViewItem;

    BaseActivity baseActivity;

    public DeliveryAddressViewHolder (View view, BaseActivity baseActivity) {
        ButterKnife.bind(this, view);
        this.baseActivity = baseActivity;

        if(isListViewItem) {
            title.setVisibility(View.GONE);
        } else {
            edit.setVisibility(View.GONE);
            checkBoxPanel.setVisibility(View.GONE);
        }
    }

    public void isListViewItem(boolean isListViewItem) {
        this.isListViewItem = isListViewItem;
    }

    public void setPlaceHolder(String titleString) {
        title.setText(titleString);
    }

    @OnClick(R.id.edit)
    public void editDeliveryAddress() {
        baseActivity.placeFragmentWithBackStack(new CheckoutAddDeliveryAddressFragment());
    }

    @OnClick(R.id.check_box)
    public void checkboxReverseOnclick() {
        if(checkBox.getDrawable()== baseActivity.getResources().getDrawable(R.drawable.sign_in_icn_tick_selected))
            checkBox.setImageResource(R.drawable.sign_in_icn_tick_unselect);
        else
            checkBox.setImageResource(R.drawable.sign_in_icn_tick_selected);
    }
}