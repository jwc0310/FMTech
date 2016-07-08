package parknshop.parknshopapp.Adapter;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import parknshop.parknshopapp.EventUpdate.OrderHistoryListAdapterReviewBtnClick;
import parknshop.parknshopapp.Model.OnlineRecords;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.R;

/**
 * Created by Gigi Wong on 2016年04月22日.
 */
public class OrderHistoryListAdapter extends BaseAdapter {
    Context context;
    private LayoutInflater inflater;
    ArrayList<OnlineRecords.OnlineRecord> orderList = new ArrayList<>();
    ViewHolder holder;
    String[] arrStatusStr;

    public OrderHistoryListAdapter(Context context, OnlineRecords onlineRecords, FragmentActivity activity) {
        this.context = context;
        inflater = LayoutInflater.from(context);
        arrStatusStr = context.getResources().getStringArray(R.array.delivery_status_filter);
        setList(onlineRecords.getOrders());
    }

    public void setList(List<OnlineRecords.OnlineRecord> orderList) {
        this.orderList.clear();
        this.orderList.addAll(orderList);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return orderList.size();
    }

    @Override
    public Object getItem(int position) {
        return orderList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return orderList.get(position).hashCode();
    }

    @Override
    public View getView(final int position, View view, ViewGroup viewGroup) {

        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_order_history, null);
            holder = new ViewHolder();
            holder.txtOrder = (TextView) view.findViewById(R.id.txtOrder);
            holder.txtAddress = (TextView) view.findViewById(R.id.txtAddress);
            holder.txtPrice = (TextView) view.findViewById(R.id.txtPrice);
            holder.txtDate = (TextView) view.findViewById(R.id.txtDate);
            holder.txtStatus = (TextView) view.findViewById(R.id.txtStatus);
            holder.btnAddReview = (TextView) view.findViewById(R.id.btnAddReview);

            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }

        holder.btnAddReview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OrderHistoryListAdapterReviewBtnClick orderHistoryListAdapterReviewBtnClick = new OrderHistoryListAdapterReviewBtnClick();
                orderHistoryListAdapterReviewBtnClick.setPosition(position);
                MyApplication.getInstance().mBus.post(orderHistoryListAdapterReviewBtnClick);
            }
        });

        if(orderList.get(position).getCanRateProductFlag()){
            holder.btnAddReview.setBackgroundResource(R.drawable.checkout_next_btn_dim);
            holder.btnAddReview.setTextColor(context.getResources().getColor(R.color.white));
        }else{
            holder.btnAddReview.setBackgroundResource(R.drawable.checkout_next_btn_alternative);
            holder.btnAddReview.setTextColor(context.getResources().getColor(R.color.colorPrimary));
            holder.btnAddReview.setOnClickListener(null);
        }

        holder.txtOrder.setText(orderList.get(position).getCode());
        holder.txtAddress.setText(orderList.get(position).getDeliveryAddress().getFirstName() + " " +
                orderList.get(position).getDeliveryAddress().getLastName() + "\n" +
                orderList.get(position).getDeliveryAddress().getRoom() + "\n" +
                orderList.get(position).getDeliveryAddress().getLine1() + "\n" +
                orderList.get(position).getDeliveryAddress().getDistrict() + "\n" +
                orderList.get(position).getDeliveryAddress().getRegion() + "\n" +
                orderList.get(position).getDeliveryAddress().getCountry().getName());
        holder.txtPrice.setText("HK$" + orderList.get(position).getTotalPrice());
        holder.txtDate.setText(orderList.get(position).getPlaced());
        holder.txtStatus.setText(orderList.get(position).getStatusDisplay());


        return view;
    }

    class ViewHolder {
        TextView txtOrder;
        TextView txtAddress;
        TextView txtPrice;
        TextView txtDate;
        TextView txtStatus;
        TextView btnAddReview;
    }
}