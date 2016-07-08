package parknshop.parknshopapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.daimajia.swipe.adapters.BaseSwipeAdapter;

import java.util.ArrayList;

import parknshop.parknshopapp.API;
import parknshop.parknshopapp.EventUpdate.GroceryCategoriesListAdapterOnItemClickEvent;
import parknshop.parknshopapp.EventUpdate.GroceryListAdapterItemClickAddToCartEvent;
import parknshop.parknshopapp.Model.WishListResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.OneActivity;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Utils.LogUtil;
import parknshop.parknshopapp.WebServiceModel;

/**
 * Created by kwongyuenpan on 24/3/16.
 */
public class GroceryCategoriesListAdapter extends BaseSwipeAdapter{
    Context context;
    private LayoutInflater inflater;
    ArrayList<WishListResponse.Entry> entries;
    WishListResponse wishListResponse;

    public GroceryCategoriesListAdapter(WishListResponse wishListResponse, Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);
        this.wishListResponse = wishListResponse;
        setList(wishListResponse.getEntries());
    }

    public void setList(ArrayList<WishListResponse.Entry> entries){
        this.entries = entries;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return entries.size();
    }

    @Override
    public Object getItem(int position) {
        return entries.get(position);
    }

    @Override
    public long getItemId(int position) {
        return entries.get(position).hashCode();
    }

    @Override
    public int getSwipeLayoutResourceId(int position) {
        return R.id.swipe_layout;
    }

    @Override
    public View generateView(int position, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.item_grocery_categories_list, null);
    }

    @Override
    public void fillValues(final int position, View convertView) {

        ImageView imgIcon = (ImageView) convertView.findViewById(R.id.imgIcon);
        TextView txtName = (TextView) convertView.findViewById(R.id.txtName);
        TextView txtDesc = (TextView) convertView.findViewById(R.id.txtDesc);
        TextView txtG = (TextView) convertView.findViewById(R.id.txtG);
        TextView txtPrice = (TextView) convertView.findViewById(R.id.txtPrice);

        txtName.setText(entries.get(position).getProduct().getName());
        txtDesc.setText(entries.get(position).getProduct().getDescription());
        txtG.setText(entries.get(position).getProduct().getDescOrigin());
        txtPrice.setText(entries.get(position).getProduct().getPrice());

        RelativeLayout front_wrapper = (RelativeLayout) convertView.findViewById(R.id.front_wrapper);
        LinearLayout btnAddToCart = (LinearLayout) convertView.findViewById(R.id.btnAddToCart);
        LinearLayout btnDelete = (LinearLayout) convertView.findViewById(R.id.btnDelete);
        TextView txtOutOfStock = (TextView) convertView.findViewById(R.id.txtOutOfStock);

        if(wishListResponse.getPrimaryKey() == null){
            btnDelete.setVisibility(View.GONE);
        }else{
            btnDelete.setVisibility(View.VISIBLE);
        }


        LogUtil.info("", "entries:"+entries.get(position).getProduct().hasStock());
        if(entries.get(position).getProduct().hasStock()){
            txtOutOfStock.setVisibility(View.GONE);
        }else{
            txtOutOfStock.setVisibility(View.VISIBLE);
        }


        front_wrapper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(entries.get(position).getProduct() == null) return;

//                if(entries.get(position).getProduct().appliedIwaPromotionsgetIwaPromotionsData() == null)
//                    GATrackerHelper.getInstance(context).setGATracker(entries.get(position).getProduct().appliedIwaPromotionsgetIwaPromotionsData().get(0).getUrl());

                GroceryCategoriesListAdapterOnItemClickEvent groceryCategoriesListAdapterOnItemClickEvent = new GroceryCategoriesListAdapterOnItemClickEvent();
                groceryCategoriesListAdapterOnItemClickEvent.setProduct(entries.get(position).getProduct());
                MyApplication.getInstance().mBus.post(groceryCategoriesListAdapterOnItemClickEvent);
            }
        });
        btnAddToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GroceryListAdapterItemClickAddToCartEvent groceryListAdapterItemClickAddToCartEvent = new GroceryListAdapterItemClickAddToCartEvent();
                groceryListAdapterItemClickAddToCartEvent.setProduct(entries.get(position).getProduct());
                MyApplication.getInstance().mBus.post(groceryListAdapterItemClickAddToCartEvent);
            }
        });
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((OneActivity)context).showLoadingView();
                WebServiceModel.getInstance(context).requestRemoveProductFromWishList(context, wishListResponse.getPrimaryKey(), entries.get(position).getQuantity(), entries.get(position).getProduct().getCode());
            }
        });

        LogUtil.info("", "GlideGlide:"+API.WASTSONS_DOMAIN + entries.get(position).getProduct().getImageUrl());
        Glide.with(context).load(API.WASTSONS_DOMAIN + entries.get(position).getProduct().getImageUrl()).placeholder(R.drawable.parknshop_square).into(imgIcon);
//        ShoppingCartAddMinusCountPanel scamcp = new ShoppingCartAddMinusCountPanel((LinearLayout)bottomView.findViewById(R.id.add_minus_count_panel), entry.product, (BaseActivity)context);
    }

}
