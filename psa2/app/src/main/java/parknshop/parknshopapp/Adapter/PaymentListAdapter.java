package parknshop.parknshopapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.daimajia.swipe.adapters.BaseSwipeAdapter;

import java.util.ArrayList;

import parknshop.parknshopapp.Model.PaymentInfoData;
import parknshop.parknshopapp.R;

/**
 * Created by Gigi Wong on 2016年04月22日.
 */
public class PaymentListAdapter extends BaseSwipeAdapter {
    Context context;
    private LayoutInflater inflater;
    ArrayList<String> mPaymentListResponses = new ArrayList<>();

    public PaymentListAdapter(String[] paymentListResponse, Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);
        setList(paymentListResponse);
    }

    public void setList(String[] paymentListResponse){
        mPaymentListResponses.clear();
        if(paymentListResponse == null)
            return;

        for(int i = 0; i < paymentListResponse.length; i++){
            mPaymentListResponses.add(paymentListResponse[i]);
        }
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return mPaymentListResponses.size();
    }

    @Override
    public Object getItem(int position) {
        return mPaymentListResponses.get(position);
    }

    @Override
    public long getItemId(int position) {
        return mPaymentListResponses.get(position).hashCode();
    }

    @Override
    public int getSwipeLayoutResourceId(int position) {
        return R.id.swipe_layout;
    }

    @Override
    public View generateView(int position, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.item_payment_method, null);
    }

    @Override
    public void fillValues(final int position, View convertView) {

        TextView txtCardType = (TextView) convertView.findViewById(R.id.title);
        TextView txtCardNo = (TextView) convertView.findViewById(R.id.item);
        TextView txtEndDate = (TextView) convertView.findViewById(R.id.txtEndDate);
        TextView txtName = (TextView) convertView.findViewById(R.id.txtName);

        txtCardType.setText("VISA");
        txtCardNo.setText("**** **** **** 2700");
        txtEndDate.setText("End Date 10/20");
        txtName.setText("Chan Wai San");

        RelativeLayout front_wrapper = (RelativeLayout) convertView.findViewById(R.id.front_wrapper);
        LinearLayout btnEdit = (LinearLayout) convertView.findViewById(R.id.btnEdit);
        LinearLayout btnDelete = (LinearLayout) convertView.findViewById(R.id.btnDelete);
        front_wrapper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}
