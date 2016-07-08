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

import parknshop.parknshopapp.EventUpdate.GroceryListAdapterItemClickEvent;
import parknshop.parknshopapp.Model.WishListResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.OneActivity;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Utils.LogUtil;
import parknshop.parknshopapp.WebServiceModel;
import se.emilsjolander.stickylistheaders.StickyListHeadersAdapter;

/**
 * Created by kwongyuenpan on 24/3/16.
 */
public class GroceryListAdapter extends BaseSwipeAdapter implements StickyListHeadersAdapter {
    Context context;
    private LayoutInflater inflater;
    ArrayList<WishListResponse> mWishListResponses = new ArrayList<>();

    boolean isMyList;

    public GroceryListAdapter(WishListResponse[] wishStaticListResponse, WishListResponse[] wishListResponse, Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);
        setList(wishStaticListResponse, wishListResponse);
    }

    public void setList(WishListResponse[] wishStaticListResponse, WishListResponse[] wishListResponse){
        mWishListResponses.clear();
        if(wishStaticListResponse == null && wishListResponse == null)
        return;

        if(wishStaticListResponse != null)
        for(int i = 0; i < wishStaticListResponse.length; i++){
            mWishListResponses.add(wishStaticListResponse[i]);
        }

        if(wishListResponse != null) {
            isMyList = true;
            for (int i = 0; i < wishListResponse.length; i++) {
                mWishListResponses.add(wishListResponse[i]);
            }
        }
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return mWishListResponses.size();
    }

    @Override
    public Object getItem(int position) {
        return mWishListResponses.get(position);
    }

    @Override
    public long getItemId(int position) {
        return mWishListResponses.get(position).hashCode();
    }

    @Override
    public int getSwipeLayoutResourceId(int position) {
        return R.id.swipe_layout;
    }

    @Override
    public View generateView(int position, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.item_grocery_list, null);
    }

    @Override
    public void fillValues(final int position, View convertView) {

        TextView txtName = (TextView) convertView.findViewById(R.id.txtName);
        TextView txtCount = (TextView) convertView.findViewById(R.id.txtCount);

        txtName.setText(mWishListResponses.get(position).getName());
        txtCount.setText(mWishListResponses.get(position).getEntries().size() + "");

        RelativeLayout front_wrapper = (RelativeLayout) convertView.findViewById(R.id.front_wrapper);
        LinearLayout btnDelete = (LinearLayout) convertView.findViewById(R.id.btnDelete);
        front_wrapper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GroceryListAdapterItemClickEvent groceryListAdapterItemClickEvent = new GroceryListAdapterItemClickEvent();
                groceryListAdapterItemClickEvent.setPosition(position);
                groceryListAdapterItemClickEvent.setMyList(isMyList);
                groceryListAdapterItemClickEvent.setWishListResponse(mWishListResponses.get(position));
                MyApplication.getInstance().mBus.post(groceryListAdapterItemClickEvent);
            }
        });
        LogUtil.info("", "mWishListResponses321312:"+mWishListResponses.get(position).getPrimaryKey()+", "+(mWishListResponses.get(position).getPrimaryKey() == null));
//        if(mWishListResponses.get(position).getPrimaryKey() == null){
        if(mWishListResponses.get(position).isStaticList()){
            btnDelete.setVisibility(View.GONE);
        }else{
            btnDelete.setVisibility(View.VISIBLE);
        }
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((OneActivity)context).showLoadingView();
                WebServiceModel.getInstance(context).requestRemoveWishList(context, mWishListResponses.get(position).getPrimaryKey());
            }
        });

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
//        LogUtil.info("", "isStatic:"+mWishListResponses.get(position).isStatic()+", "+position);
//        if(TextUtils.isEmpty(mWishListResponses.get(position).getPrimaryKey())){
        if(mWishListResponses.get(position).isStaticList()){
            holder.txtName.setText(context.getString(R.string.home_activity_sliding_menu_suggest_list));
        }else{
            holder.txtName.setText(context.getString(R.string.home_activity_sliding_menu_my_list));
        }
        holder.txtName.setVisibility(View.GONE);
//        holder.txtName.setText(headerText);

        return convertView;
    }

    class HeaderViewHolder {
        TextView txtName;
    }

    class ViewHolder {
        TextView txtName;
        TextView txtCount;
    }

    @Override
    public long getHeaderId(int position) {
//        return mWishListResponses.get(position).getName().subSequence(0, 1).charAt(0);
//        if(TextUtils.isEmpty(mWishListResponses.get(position).getPrimaryKey())){
        if(mWishListResponses.get(position).isStaticList()){
            return 0;
        }else{
            return 1;
        }
    }
}
