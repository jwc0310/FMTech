package parknshop.parknshopapp.Fragment.Checkout.old_stuff;

import android.view.View;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 1/4/16.
 */
public class CheckoutPaymentDictionaryViewHolder {
    public @Bind(R.id.title)  TextView title;
    public @Bind(R.id.item) TextView item;


    public CheckoutPaymentDictionaryViewHolder(View view, String titleString, String itemString) {
        ButterKnife.bind(this, view);
        title.setText(titleString);
        item.setText(itemString);
    }
}
