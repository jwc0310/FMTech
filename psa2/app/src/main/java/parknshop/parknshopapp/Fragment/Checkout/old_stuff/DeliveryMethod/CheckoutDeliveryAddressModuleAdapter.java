package parknshop.parknshopapp.Fragment.Checkout.old_stuff.DeliveryMethod;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import parknshop.parknshopapp.Base.BaseActivity;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.View.DeliveryAddressViewHolder;

/**
 * Created by chrisyu on 31/3/16.
 */
public class CheckoutDeliveryAddressModuleAdapter extends BaseAdapter{
    Context context;
    View view;
    public CheckoutDeliveryAddressModuleAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.checkout_delivery_address_item, null);
        //getBaseActivity().placeFragmentWithBackStack(new CheckoutAddDeliveryAddressFragment());

        new DeliveryAddressViewHolder(view, (BaseActivity)context);

        return view;
    }

}
