package parknshop.parknshopapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.daimajia.swipe.adapters.BaseSwipeAdapter;

import java.util.ArrayList;

import parknshop.parknshopapp.EventUpdate.InboxCheckBoxOnSelectedEvent;
import parknshop.parknshopapp.EventUpdate.InboxFragmentSelectAllEvent;
import parknshop.parknshopapp.EventUpdate.InboxListAdapterItemClickEvent;
import parknshop.parknshopapp.EventUpdate.InboxRemoveBtnOnClickEvent;
import parknshop.parknshopapp.Model.InboxResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.OneActivity;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Utils.LogUtil;
import parknshop.parknshopapp.WebServiceModel;

/**
 * Created by kwongyuenpan on 24/3/16.
 */
public class InboxListAdapter extends BaseSwipeAdapter {
    Context context;
    ArrayList<InboxResponse.Data> mDatas = new ArrayList<>();
    ArrayList<Boolean> isSelected = new ArrayList<>();
    boolean isRemove;

    public InboxListAdapter(Context context) {
        this.context = context;
    }

    public void setList(ArrayList<InboxResponse.Data> data){
        mDatas.clear();
        isSelected.clear();
        if(data == null)
        return;
        mDatas.addAll(data);
        for(int i = 0; i < mDatas.size(); i++){
            isSelected.add(false);
        }

        // set all item unselected by default
        InboxCheckBoxOnSelectedEvent inboxCheckBoxOnSelectedEvent = new InboxCheckBoxOnSelectedEvent();
        inboxCheckBoxOnSelectedEvent.setIsSelected(isSelected);
        MyApplication.getInstance().mBus.post(inboxCheckBoxOnSelectedEvent);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public Object getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return mDatas.get(position).hashCode();
    }

    @Override
    public int getSwipeLayoutResourceId(int position) {
        return R.id.swipe_layout;
    }

    @Override
    public View generateView(int position, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.item_inbox_list, null);
    }

    @Override
    public void fillValues(final int position, View convertView) {

        final ImageView imgCheckBox = (ImageView) convertView.findViewById(R.id.imgCheckBox);
        TextView txtName = (TextView) convertView.findViewById(R.id.txtName);
        TextView txtDate = (TextView) convertView.findViewById(R.id.txtDate);
        TextView txtDesc = (TextView) convertView.findViewById(R.id.txtDesc);

        txtName.setText(mDatas.get(position).getMessage().getMessage());
        txtDate.setText(mDatas.get(position).getMessage().getPostDate());
        txtDesc.setText(mDatas.get(position).getMessage().getInbox());

        RelativeLayout front_wrapper = (RelativeLayout) convertView.findViewById(R.id.front_wrapper);
        LinearLayout btnDelete = (LinearLayout) convertView.findViewById(R.id.btnDelete);
        front_wrapper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InboxListAdapterItemClickEvent inboxListAdapterItemClickEvent = new InboxListAdapterItemClickEvent();
                inboxListAdapterItemClickEvent.setPosition(position);
                inboxListAdapterItemClickEvent.setData(mDatas.get(position));
                MyApplication.getInstance().mBus.post(inboxListAdapterItemClickEvent);
            }
        });
        if(isRemove){
            imgCheckBox.setVisibility(View.VISIBLE);
        }else{
            imgCheckBox.setVisibility(View.GONE);
        }
        LogUtil.info("", "clcllc1:"+isRemove);

        if(isSelected.get(position)){
            imgCheckBox.setImageResource(R.drawable.filter_tick);
        }else{
            imgCheckBox.setImageResource(R.drawable.filter_without_tick);
        }

        imgCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                for (int j = 0; j < isSelected.size(); j++) {
                    if (position == j) {
                        if (isSelected.get(position)) {
                            isSelected.set(position, false);
                            imgCheckBox.setImageResource(R.drawable.filter_without_tick);
                        } else {
                            isSelected.set(position, true);
                            imgCheckBox.setImageResource(R.drawable.filter_tick);
                        }
                    }
                }

                InboxCheckBoxOnSelectedEvent inboxCheckBoxOnSelectedEvent = new InboxCheckBoxOnSelectedEvent();
                inboxCheckBoxOnSelectedEvent.setIsSelected(isSelected);
                MyApplication.getInstance().mBus.post(inboxCheckBoxOnSelectedEvent);

                notifyDataSetChanged();
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                closeItem(position);
                ((OneActivity)context).showProgressDialog();
                WebServiceModel.getInstance(context).requestDeleteMsg(mDatas.get(position).getMessage().getId());
            }
        });

    }

    public void onEvent(InboxRemoveBtnOnClickEvent inboxRemoveBtnOnClickEvent){
        isRemove = inboxRemoveBtnOnClickEvent.isRemove();
        LogUtil.info("", "clcllc:"+isRemove);
        notifyDataSetChanged();
        LogUtil.info("", "clcllc2:"+isRemove);
    }

    // Select all btn click
    public void onEvent(InboxFragmentSelectAllEvent inboxFragmentSelectAllEvent){
        isSelected = inboxFragmentSelectAllEvent.getIsSelecteAll();
        notifyDataSetChanged();
    }

}
