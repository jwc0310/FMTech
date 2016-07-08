package parknshop.parknshopapp.Fragment.Home.Search;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.daimajia.swipe.SwipeLayout;
import com.daimajia.swipe.adapters.BaseSwipeAdapter;
import com.orhanobut.hawk.Hawk;

import java.util.ArrayList;
import java.util.List;

import parknshop.parknshopapp.API;
import parknshop.parknshopapp.Base.BaseActivity;
import parknshop.parknshopapp.Fragment.Home.HomePresenter;
import parknshop.parknshopapp.Fragment.Product.ProductList.ProductListFragment;
import parknshop.parknshopapp.HistoryHelper;
import parknshop.parknshopapp.Model.Product;
import parknshop.parknshopapp.Model.WishListResponse;
import parknshop.parknshopapp.OneActivity;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Utils.AppUtils;
import parknshop.parknshopapp.Utils.LogUtil;
import parknshop.parknshopapp.WebServiceModel;

/**
 * Created by chrisyu on 8/3/16.
 */
public class HistoryListViewAdapter extends BaseSwipeAdapter implements AdapterView.OnItemClickListener {
    List<Product> data = new ArrayList<>();
    Context context;

    public HistoryListViewAdapter(List<Product> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @Override
    public int getCount() {
        return (data).size();
    }

    @Override
    public Product getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return data.get(position).hashCode();
    }

    @Override
    public int getSwipeLayoutResourceId(int position) {
        return R.id.swipe_layout;
    }

    @Override
    public View generateView(final int position, ViewGroup parent) {
        final SwipeLayout swipeLayout = (SwipeLayout)LayoutInflater.from(context).inflate(R.layout.history_sliding_menu_right_item, null);
        swipeLayout.addSwipeListener(new SwipeLayout.SwipeListener() {
            @Override
            public void onStartOpen(SwipeLayout layout) {

            }

            @Override
            public void onOpen(SwipeLayout layout) {
                ((BaseActivity)context).swipePosition = position;
                //Log.i("open", "open" + ((BaseActivity)context).swipePosition );
            }

            @Override
            public void onStartClose(SwipeLayout layout) {

            }

            @Override
            public void onClose(SwipeLayout layout) {
                ((BaseActivity)context).swipePosition = -1;
            }

            @Override
            public void onUpdate(SwipeLayout layout, int leftOffset, int topOffset) {
            }

            @Override
            public void onHandRelease(SwipeLayout layout, float xvel, float yvel) {

            }
        });

        //Log.i("open", "open" + ((BaseActivity) context).swipePosition);
        if(position == ((BaseActivity)context).swipePosition) {
            swipeLayout.postDelayed(new Runnable() {
                @Override
                public void run() {
                    swipeLayout.open();
                }
            }, 200);
        }
        return swipeLayout;
    }

    @Override
    public void fillValues(final int position, View convertView) {
        final Product product = data.get(position);


        LinearLayout frontView = (LinearLayout) convertView.findViewById(R.id.front_wrapper);
        LinearLayout bottomView = (LinearLayout) convertView.findViewById(R.id.bottom_wrapper);
        final ImageView imgHeart = (ImageView) convertView.findViewById(R.id.imgHeart);

        ((TextView)frontView.findViewById(R.id.title)).setText(product.getBrandName());
        ((TextView)frontView.findViewById(R.id.small_desc)).setText(product.getName());
        ((TextView)frontView.findViewById(R.id.weight)).setText(product.getDescSpec());
        ((ImageView)frontView.findViewById(R.id.arrow)).setVisibility(View.GONE);
        if(product.hasStock()){
            ((TextView)frontView.findViewById(R.id.price)).setText(product.getPrice() + " x " + 1);
        }else{
            ((TextView)frontView.findViewById(R.id.price)).setText(context.getString(R.string.product_list_fragment_sold_out));
        }


        if(product.getImageUrl() != null)
            Glide.with(context).load(API.WASTSONS_DOMAIN + product.getImageUrl()).into(((ImageView)frontView.findViewById(R.id.cart_product_image)));

        bottomView.findViewById(R.id.remove_shopping_cart_entry).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.remove(position);
                HistoryHelper.remove(context, data.get(position));
                notifyDataSetChanged();
            }
        });

        bottomView.findViewById(R.id.add_to_cart).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(HomePresenter.getLocalShoppingCart().get(Integer.valueOf(data.get(position).getCode())) == null || HomePresenter.getLocalShoppingCart().get(Integer.valueOf(data.get(position).getCode())) == 0) {
                    WebServiceModel.getInstance(context).addShoppingCart(data.get(position).getCode(), 1, context);
                } else {
                    WebServiceModel.getInstance(context).editShoppingCart(HomePresenter.getRemoteShoppingCart().getEntryById(data.get(position).getCode()).entryNumber, 1, context);
                }
                HomePresenter.handleLocalShoppingCartData((data.get(position).getCode()), 1);
            }
        });


        // Grocery list
        Glide.with(context).load(R.drawable.on_sale_tag_heart_dim).into(imgHeart);
        WishListResponse[] wishListResponses = Hawk.get(AppUtils.grocery_list);
        WishListResponse currwishListResponse = null;
        int qty = 0;
        if(wishListResponses == null)
            return;
        for(WishListResponse wishListResponse : wishListResponses){
            for(WishListResponse.Entry tempEntry : wishListResponse.getEntries()) {
                if (tempEntry.getProduct().getCode().equals(product.getCode())){
                    qty = tempEntry.getQuantity();
                    currwishListResponse = wishListResponse;
                    Glide.with(context).load(R.drawable.on_sale_tag_heart).into(imgHeart);
                    continue;
                }
            }
        }
        final WishListResponse finalCurrwishListResponse = currwishListResponse;
        final int finalQty = qty;

        bottomView.findViewById(R.id.add_to_grocery).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (finalCurrwishListResponse == null) {
                    ((OneActivity)context).addToWishList(product, -1);
                }else{
                    WebServiceModel.getInstance(context).requestRemoveProductFromWishList(context, finalCurrwishListResponse.getPrimaryKey(), finalQty, product.getCode());
                }
            }
        });

//        ShoppingCartAddMinusCountPanel scamcp = new ShoppingCartAddMinusCountPanel(bottomView.findViewById(R.id.add_minus_count_panel), product, (BaseActivity)context);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//        ((BaseActivity)context).closeDrawer();
        ProductListFragment pf = ProductListFragment.newInstance( getItem(position).getCode() , false);
        pf.setGATag(getItem(position).getName());
        LogUtil.info("", "getGATagq1455:"+getItem(position).getName());
        ((BaseActivity)context).placeFragmentWithBackStack(pf);
    }
}
