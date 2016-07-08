package parknshop.parknshopapp.Adapter;

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
 * Created by Gigi Wong on 2016年04月22日.
 */
public class TransactionHistoryListAdapter extends BaseAdapter {
    Context context;
    private LayoutInflater inflater;
    ArrayList<String> transactionList = new ArrayList<>();
    ViewHolder holder;

    public TransactionHistoryListAdapter(List<String> transactionList, Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);
        setList(transactionList);
    }

    public void setList(List<String> transactionList) {
        this.transactionList.clear();
        for (String transaction : transactionList) {
            this.transactionList.add(transaction);
        }
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return transactionList.size();
    }

    @Override
    public Object getItem(int position) {
        return transactionList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return transactionList.get(position).hashCode();
    }

    @Override
    public View getView(final int position, View view, ViewGroup viewGroup) {

        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_transaction_history, null);
            holder = new ViewHolder();
            holder.txtShop = (TextView) view.findViewById(R.id.txtShop);
            holder.txtPrice = (TextView) view.findViewById(R.id.txtPrice);
            holder.txtDate = (TextView) view.findViewById(R.id.txtDate);
            holder.txtPoint = (TextView) view.findViewById(R.id.txtPoint);

            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }

        holder.txtShop.setText("PARKnSHOP - Central Store");
        holder.txtPrice.setText("HK$680.00");
        holder.txtDate.setText("16/10/2014 8:40");
        holder.txtPoint.setText("380 PTS");



        return view;
    }

    class ViewHolder {
        TextView txtShop;
        TextView txtPrice;
        TextView txtDate;
        TextView txtPoint;
    }
}