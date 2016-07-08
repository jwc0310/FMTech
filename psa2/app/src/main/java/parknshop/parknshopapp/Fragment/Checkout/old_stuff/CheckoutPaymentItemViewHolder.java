package parknshop.parknshopapp.Fragment.Checkout.old_stuff;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 1/4/16.
 */
public class CheckoutPaymentItemViewHolder {
    public @Bind(R.id.card_payment_layout) LinearLayout cardPaymentLayout;

    @Bind(R.id.credit) ImageView cardImage;
    @Bind(R.id.name) TextView cardHolderName;

    public @Bind(R.id.use_as_delivery_address) TextView useAsDeliveryAddress;
    public @Bind(R.id.cash_on_delivery) TextView cashOnDelivery;

    //CheckoutPaymentDictionaryViewHolder

    Object data;

    public CheckoutPaymentItemViewHolder (View view, Object data) {
        ButterKnife.bind(this, view);
        this.data = data;
    }
}
