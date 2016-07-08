package parknshop.parknshopapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import parknshop.parknshopapp.EventUpdate.TopBrandListAdapterOnItemClickEvent;
import parknshop.parknshopapp.Model.BrandList;
import parknshop.parknshopapp.Model.Brands;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.R;
import se.emilsjolander.stickylistheaders.StickyListHeadersAdapter;

/**
 * Created by kwongyuenpan on 24/3/16.
 */
public class TopBrandListAdapter extends BaseAdapter implements StickyListHeadersAdapter {
    Context context;
    private LayoutInflater inflater;
    ArrayList<Brands> brands = new ArrayList<>();
    ViewHolder holder;

    public TopBrandListAdapter (Context context, List<BrandList> brandList) {
        this.context = context;
        inflater = LayoutInflater.from(context);
        setList(brandList);
    }

    public void setList(List<BrandList> brandList){
        this.brands.clear();
        for(BrandList tempBrandList : brandList){
            for(Brands brand : tempBrandList.getBrands()){
                this.brands.add(brand);
            }
        }
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return brands.size();
    }

    @Override
    public Object getItem(int position) {
        return brands.get(position);
    }

    @Override
    public long getItemId(int position) {
        return brands.get(position).hashCode();
    }

    @Override
    public View getView(final int position, View view, ViewGroup viewGroup) {

        if(view == null){
            view = LayoutInflater.from(context).inflate(R.layout.item_topbrand_list, null);
            holder = new ViewHolder();
            holder.txtName = (TextView) view.findViewById(R.id.txtName);
            holder.llView = (LinearLayout) view.findViewById(R.id.llView);

            view.setTag(holder);
        }
        else{
            holder = (ViewHolder) view.getTag();
        }

        holder.txtName.setText(brands.get(position).getName());
        holder.llView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TopBrandListAdapterOnItemClickEvent topBrandListAdapterOnItemClickEvent = new TopBrandListAdapterOnItemClickEvent();
                topBrandListAdapterOnItemClickEvent.setPosition(position);
                topBrandListAdapterOnItemClickEvent.setBrandName(brands.get(position).getName());
                topBrandListAdapterOnItemClickEvent.setBrandNameEn(brands.get(position).getName());
                topBrandListAdapterOnItemClickEvent.setBrandCode(brands.get(position).getCode());
                MyApplication.getInstance().mBus.post(topBrandListAdapterOnItemClickEvent);
            }
        });

        return view;
    }


    @Override
    public View getHeaderView(int position, View convertView, ViewGroup parent) {
        HeaderViewHolder holder;
        if (convertView == null) {
            holder = new HeaderViewHolder();
            convertView = inflater.inflate(R.layout.item_grocery_list_header, parent, false);
            holder.txtName = (TextView) convertView.findViewById(R.id.txtName);
            convertView.setTag(holder);
        } else {
            holder = (HeaderViewHolder) convertView.getTag();
        }
        //set header text as first char in name
//        String headerText = "" +    mWishListResponses.get(position).getName().subSequence(0, 1).charAt(0);
        holder.txtName.setText(brands.get(position).getPrefix());
        return convertView;
    }

    class HeaderViewHolder {
        TextView txtName;
    }

    class ViewHolder {
        TextView txtName;
        LinearLayout llView;
    }

    @Override
    public long getHeaderId(int position) {
        return brands.get(position).getPrefix().hashCode();
//        return 1;
    }
}
