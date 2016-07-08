package parknshop.parknshopapp.Fragment.Product.ProductPromotion;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 30/3/16.
 */
public class ProductPromotionAdapter extends BaseAdapter {
    List<String> promotionList = new ArrayList<String>();
    Context context;

    public ProductPromotionAdapter(List<String> promotionList, Context context) {
        this.promotionList = promotionList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return promotionList.size();
    }

    @Override
    public Object getItem(int position) {
        return promotionList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return promotionList.get(position).hashCode();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = null;
        if(convertView == null) {
            view = LayoutInflater.from(context).inflate(R.layout.product_promotion_item, null);
        } else {
            view = convertView;
        }

        TextView tv = (TextView)view.findViewById(R.id.promotion_text);
        tv.setText((String)getItem(position));

        return view;
    }
}
