package parknshop.parknshopapp.Fragment.Checkout.old_stuff.Details;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 31/3/16.
 */
public class CheckOutDetailAdapter extends BaseAdapter {
    Context context;

    public CheckOutDetailAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return 5;
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
        View view = LayoutInflater.from(context).inflate(R.layout.home_activity_sliding_menu_front_item, null);
        return view;
    }
}
