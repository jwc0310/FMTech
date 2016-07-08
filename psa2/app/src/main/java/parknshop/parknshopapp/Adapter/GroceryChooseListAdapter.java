package parknshop.parknshopapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

import parknshop.parknshopapp.EventUpdate.GroceryChooseListAdapterOnItemClickEvent;
import parknshop.parknshopapp.Model.WishListResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.R;

/**
 * Created by kwongyuenpan on 23/3/16.
 */
public class GroceryChooseListAdapter extends BaseAdapter {
    Context context;
    ArrayList<WishListResponse> wishListResponse;
    ViewHolder myViewHolder;
    ArrayList<Boolean> isClicked;

    public GroceryChooseListAdapter(Context context, ArrayList<WishListResponse> wishListResponse){
        this.wishListResponse = wishListResponse;
        this.context = context;
        isClicked = new ArrayList<>();
        for(int i = 0; i < wishListResponse.size(); i++){
            isClicked.add(false);
        }
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return wishListResponse.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public void setItemClick(int position){
//        for(int i = 0; i < isClicked.size(); i++){
//            isClicked.set(i, false);
//        }

        if(isClicked.get(position)){
            isClicked.set(position, false);
        }else{
            isClicked.set(position, true);
        }
//        isClicked.set(position, true);
        notifyDataSetChanged();

        ArrayList<WishListResponse> selectedWishListResponses = new ArrayList<>();
        for(int i = 0; i < isClicked.size(); i++){
            if(isClicked.get(i)){
                selectedWishListResponses.add(wishListResponse.get(i));
            }
        }
        if(selectedWishListResponses.size() > 0){
            GroceryChooseListAdapterOnItemClickEvent groceryChooseListAdapterOnItemClickEvent = new GroceryChooseListAdapterOnItemClickEvent();
            groceryChooseListAdapterOnItemClickEvent.setPosition(position);
            groceryChooseListAdapterOnItemClickEvent.setWishListResponses(selectedWishListResponses);
            MyApplication.getInstance().mBus.post(groceryChooseListAdapterOnItemClickEvent);
        }
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item_radio_button, null);
            myViewHolder = new ViewHolder();
            myViewHolder.txtTitle = (TextView) convertView.findViewById(R.id.txtTitle);
            myViewHolder.cbtn = (CheckBox) convertView.findViewById(R.id.cbtn);

            convertView.setTag(myViewHolder);
        }
        else{
            myViewHolder = (ViewHolder) convertView.getTag();
        }

        myViewHolder.txtTitle.setText(wishListResponse.get(position).getName() + "(" + wishListResponse.get(position).getEntries().size() + ")");

        myViewHolder.cbtn.setChecked(false);
        if(isClicked.get(position)){
            myViewHolder.cbtn.setChecked(true);
            myViewHolder.cbtn.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.filter_tick));
        }else{
            myViewHolder.cbtn.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.filter_without_tick));
        }


        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setItemClick(position);
            }
        });
        myViewHolder.cbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setItemClick(position);
            }
        });
        return convertView;
    }

    class ViewHolder {
        TextView txtTitle;
        CheckBox cbtn;
    }
}
