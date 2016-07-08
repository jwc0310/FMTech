package parknshop.parknshopapp.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.EventUpdate.MembereCouponeVoucherViewPagerFragmentRecyclerViewAdapterOnItemClickEvent;
import parknshop.parknshopapp.Model.ECouponResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.R;

/**
 * Created by kwongyuenpan on 30/4/16.
 */
public class MembereCouponeVoucherViewPagerFragmentRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final LayoutInflater mLayoutInflater;
    private final Context mContext;
    ArrayList<ECouponResponse.ECoupon> mCouponDatas;

    public MembereCouponeVoucherViewPagerFragmentRecyclerViewAdapter(Context context, ArrayList<ECouponResponse.ECoupon> mCouponDatas, boolean b) {
        this.mCouponDatas = mCouponDatas;
        mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new TextViewHolder(mLayoutInflater.inflate(R.layout.view_item_ecoupon_evoucher, parent, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        //if(!TextUtils.isEmpty(mCouponDatas.get(position).getTerms()))
        String desc = mContext.getResources().getString(R.string.expiry_date_ecoupon) + "(" +mCouponDatas.get(position).getFormateStartDate() + " - " + mCouponDatas.get(position).getFormateEndDate() + ")";

        ((TextViewHolder) holder).txtTitle.setText(mCouponDatas.get(position).getType().equals("VOUCHER") ? mCouponDatas.get(position).getDescription() + " HK$" + mCouponDatas.get(position).getIgcValue() : Html.fromHtml(mCouponDatas.get(position).getTerms()));
        ((TextViewHolder) holder).txtContent.setText(desc);//mCouponDatas.get(position).getDescription());

        ((TextViewHolder) holder).rlTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MembereCouponeVoucherViewPagerFragmentRecyclerViewAdapterOnItemClickEvent membereCouponeVoucherViewPagerFragmentRecyclerViewAdapterOnItemClickEvent = new MembereCouponeVoucherViewPagerFragmentRecyclerViewAdapterOnItemClickEvent();
                membereCouponeVoucherViewPagerFragmentRecyclerViewAdapterOnItemClickEvent.setTitle(mCouponDatas.get(position).getTerms());
                membereCouponeVoucherViewPagerFragmentRecyclerViewAdapterOnItemClickEvent.setDesc(mCouponDatas.get(position).getDescription());
                MyApplication.getInstance().mBus.post(membereCouponeVoucherViewPagerFragmentRecyclerViewAdapterOnItemClickEvent);
            }
        });
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return mCouponDatas == null ? 0 : mCouponDatas.size();
    }

    public static class TextViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.txtTitle)
        TextView txtTitle;
        @Bind(R.id.txtContent)
        TextView txtContent;
        @Bind(R.id.rlTitle)
        RelativeLayout rlTitle;

        TextViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    Log.d("TextViewHolder", "onClick--> position = " + getPosition());
                }
            });
        }
    }
}
