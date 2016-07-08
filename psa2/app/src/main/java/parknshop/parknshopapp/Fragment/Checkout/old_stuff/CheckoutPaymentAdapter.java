package parknshop.parknshopapp.Fragment.Checkout.old_stuff;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;

import java.util.ArrayList;

import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 1/4/16.
 */
public class CheckoutPaymentAdapter extends BaseAdapter implements AdapterView.OnItemClickListener {
    public ArrayList<Object> data = new ArrayList<Object>();
    public Context context;

    public CheckoutPaymentAdapter(ArrayList<Object> data, Context context) {
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size() + 1;
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.checkout_payment_method_item, null);
/*
        parknshop.parknshopapp.Fragment.Checkout.old_stuff.CheckoutPayment.CheckoutPaymentItemViewHolder checkoutPaymentItemViewHolder = new parknshop.parknshopapp.Fragment.Checkout.old_stuff.CheckoutPayment.CheckoutPaymentItemViewHolder(view, context);

        if(position == data.size()) {
            checkoutPaymentItemViewHolder.cashOnDelivery.setVisibility(View.VISIBLE);
            checkoutPaymentItemViewHolder.useAsDeliveryAddress.setVisibility(View.GONE);

            checkoutPaymentItemViewHolder.cardPaymentLayout.setVisibility(View.GONE);
        } else {
            checkoutPaymentItemViewHolder.cashOnDelivery.setVisibility(View.GONE);
            checkoutPaymentItemViewHolder.useAsDeliveryAddress.setVisibility(View.VISIBLE);

            checkoutPaymentItemViewHolder.cardPaymentLayout.setVisibility(View.VISIBLE);
        }*/
        return view;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
