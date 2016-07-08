package parknshop.parknshopapp.Fragment.Home.RightMenu;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;
import com.daimajia.swipe.SwipeLayout;
import com.daimajia.swipe.adapters.BaseSwipeAdapter;
import com.orhanobut.hawk.Hawk;

import java.util.ArrayList;
import java.util.List;

import parknshop.parknshopapp.Base.BaseActivity;
import parknshop.parknshopapp.Fragment.Product.ProductList.ProductListFragment;
import parknshop.parknshopapp.GlobalConstant;
import parknshop.parknshopapp.Model.CartResponse;
import parknshop.parknshopapp.Model.WishListResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.OneActivity;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.ShoppingCartSelectAllEvent;
import parknshop.parknshopapp.Utils.AppUtils;
import parknshop.parknshopapp.Utils.LogUtil;
import parknshop.parknshopapp.View.ShoppingCartAddMinusCountPanel;
import parknshop.parknshopapp.View.ShoppingCartProductItem;
import parknshop.parknshopapp.WebServiceModel;

/**
 * Created by chrisyu on 8/3/16.
 */
public class RightSlidingListViewAdapter extends BaseSwipeAdapter implements AdapterView.OnItemClickListener {
    public List<CartResponse.Entry> data = new ArrayList<>();
    public List<CartResponse.Entry> cloneData = new ArrayList<>();
    public List<CartResponse.Entry> removedData = new ArrayList<>();
    public List<CartResponse.Entry> editedData = new ArrayList<>();

    public ArrayList<Boolean> selectedList = new ArrayList<>();
    Context context;

    public RightSlidingListViewAdapter(List<CartResponse.Entry> data, Context context) {
        MyApplication.getInstance().register(this);

        this.data = data;
        this.context = context;
        for(int i = 0 ; i < data.size(); i++) {
            selectedList.add(false);
        }
    }

    @Override
    public void notifyDataSetChanged() {
        for(int i = 0 ; i < data.size(); i++) {
            selectedList.add(false);
        }
        super.notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        if(BaseActivity.editMode)
            return cloneData.size();

        return (data).size();
    }

    @Override
    public CartResponse.Entry getItem(int position) {

        if(BaseActivity.editMode)
            return cloneData.get(position);

        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        if(BaseActivity.editMode)
            return cloneData.get(position).hashCode();

        return data.get(position).hashCode();
    }

    @Override
    public int getSwipeLayoutResourceId(int position) {
        return R.id.swipe_layout;
    }

    @Override
    public View generateView(final int position, ViewGroup parent) {
        final SwipeLayout swipeLayout = (SwipeLayout)LayoutInflater.from(context).inflate(R.layout.home_activity_sliding_menu_right_item, null);

        //Log.i("open", "open" + ((BaseActivity) context).swipePosition);

        //if(position == ((BaseActivity)context).swipePosition) {
        //    swipeLayout.postDelayed(new Runnable() {
        //        @Override
        //        public void run() {
        //            swipeLayout.open();
        //       }
        //   }, 200);
        //}

        /*if( ((BaseActivity)context).swipedPositionProductCode != null && ((BaseActivity)context).swipedPositionProductCode.equals(data.get(position).product.getCode() ) ) {
            swipeLayout.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            swipeLayout.open();
                       }
                  }, 200);
        } else {
            swipeLayout.postDelayed(new Runnable() {
                @Override
                public void run() {
                    swipeLayout.close();
                }
            }, 200);
        }*/

        return swipeLayout;
    }

    @Override
    public void fillValues(final int position, final View convertView) {
        if(data.size() <= position) {
            return;
        }

        final CartResponse.Entry entry = (cloneData != null && cloneData.size() > 0) ? cloneData.get(position) : data.get(position);

        LinearLayout frontView = (LinearLayout) convertView.findViewById(R.id.right_slide_front_wrapper);
        LinearLayout bottomView = (LinearLayout) convertView.findViewById(R.id.right_slide_bottom_wrapper);

        final SwipeLayout swipeLayout = (SwipeLayout) convertView;

        swipeLayout.addSwipeListener(new SwipeLayout.SwipeListener() {
            @Override
            public void onStartOpen(SwipeLayout layout) {

            }

            @Override
            public void onOpen(SwipeLayout layout) {
                ((BaseActivity)context).swipePosition =  position;
                if(position < data.size())
                    ((BaseActivity)context).swipedPositionProductCode = data.get(position).product.getCode();
                //Log.i("open", "open" + ((BaseActivity)context).swipePosition );
            }

            @Override
            public void onStartClose(SwipeLayout layout) {

            }


            @Override
            public void onClose(SwipeLayout layout) {
                ((BaseActivity)context).swipePosition = -1;
                ((BaseActivity)context).swipedPositionProductCode = "";
            }

            @Override
            public void onUpdate(SwipeLayout layout, int leftOffset, int topOffset) {
            }

            @Override
            public void onHandRelease(SwipeLayout layout, float xvel, float yvel) {

            }
        });

        if(entry.totalPrice.getValue() == 0 || BaseActivity.editMode) {
            //bottomView.findViewById(R.id.wrapper_bottom).setVisibility(View.GONE);
            //bottomView.setVisibility(View.GONE);
            swipeLayout.setSwipeEnabled(false);
        } else {
            //bottomView.findViewById(R.id.wrapper_bottom).setVisibility(View.VISIBLE);
            //bottomView.setVisibility(View.VISIBLE);
            swipeLayout.setSwipeEnabled(true);
        }

        LinearLayout btnAddToWishList = (LinearLayout) convertView.findViewById(R.id.btnAddToWishList);
        ImageView imgHeart = (ImageView) convertView.findViewById(R.id.imgHeart);

        ShoppingCartProductItem shoppingCartProductItem = (ShoppingCartProductItem) frontView.findViewById(R.id.shopping_cart_product_item);

        shoppingCartProductItem.setEntry(entry);
        shoppingCartProductItem.rightSlidingListViewAdapter = this;

        if( ((BaseActivity)context).shoppingCartEditMode) {
            shoppingCartProductItem.showEditMode();
        } else {
            shoppingCartProductItem.hideEditMode();
        }

        //if(((BaseActivity)context).isSelectAll) {
        //if(selectedList.get(position)) {
        //    shoppingCartProductItem.shoppingCartCheckoutBox.setSelected(true);
        //    shoppingCartProductItem.shoppingCartCheckoutBox.productCode = entry.product.getCode();
        //} else {
        //    shoppingCartProductItem.shoppingCartCheckoutBox.setSelected(false);
        //     shoppingCartProductItem.shoppingCartCheckoutBox.productCode = entry.product.getCode();
        //}
        //}

        //  Glide.with(context).load(API.WASTSONS_DOMAIN + entry.product.getImageUrl()).placeholder(R.drawable.food_default).into(((ImageView) frontView.findViewById(R.id.cart_product_image)));

        // Check if added to Grocery list already
        Glide.with(context).load(R.drawable.on_sale_tag_heart_dim);

        ArrayList<String> simpleWishLists = Hawk.get(AppUtils.simple_grocery_list);
        String simpleWishList = null;

        if (!(entry.product == null || simpleWishLists == null)) {
            for (String s : simpleWishLists) {
                if (s.equals(entry.product.getCode())) {
                    simpleWishList = s;
                    continue;
                }
            }
        }

        if(simpleWishList == null) {
            Glide.with(context).load(R.drawable.shoppingcarticnheart).into(imgHeart);
        } else {
            Glide.with(context).load(R.drawable.on_sale_tag_heart).into(imgHeart);
        }

        btnAddToWishList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                WishListResponse[] wishListResponses = Hawk.get(AppUtils.grocery_list);
                WishListResponse currwishListResponse = null;


                try {
                    if (!(entry.product == null || wishListResponses == null)) {
                        for (WishListResponse wishListResponse : wishListResponses) {
                            for (WishListResponse.Entry tempEntry : wishListResponse.getEntries()) {
                                if (tempEntry.getProduct().getCode().equals(entry.product.getCode())) {
                                    currwishListResponse = wishListResponse;
                                    continue;
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                }

                final WishListResponse finalCurrwishListResponse = currwishListResponse;

                if(!GlobalConstant.isLogin)
                    ((OneActivity) context).closeDrawer();

                if (finalCurrwishListResponse == null) {
                    ((OneActivity) context).addToWishList(entry.product, -1);
                } else {
                    ((OneActivity) context).showProgressDialog();
                    WebServiceModel.getInstance(context).requestRemoveProductFromWishList(context, finalCurrwishListResponse.getPrimaryKey(), entry.quantity, entry.product.getCode());
                }
            }
        });
/**/
        frontView.findViewById(R.id.remove_shopping_cart_entry).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //((BaseActivity)context).showProgressDialog();
                //WebServiceModel.getInstance(context).deleteShoppingCartEntry(entry.entryNumber, context);
                //HomePresenter.handleLocalShoppingCartData((entry.product.getCode()), 0);
                for(int i = 0; i < cloneData.size(); i++){
                    if(cloneData.get(i).entryNumber.equals(entry.entryNumber)) {
                        cloneData.remove(i);
                        removedData.add(entry);
                        RightSlidingListViewAdapter.this.notifyDataSetChanged();
                    }
                }
            }
        });


        ShoppingCartAddMinusCountPanel scamcp = new ShoppingCartAddMinusCountPanel(frontView.findViewById(R.id.add_minus_count_panel), entry, (BaseActivity)context, cloneData);
        scamcp.isProductDetailController = true;

        if( ((BaseActivity)context).swipedPositionProductCode != null && ((BaseActivity)context).swipedPositionProductCode.equals(data.get(position).product.getCode() ) ) {
            swipeLayout.postDelayed(new Runnable() {
                @Override
                public void run() {
                    swipeLayout.open();
                }
            }, 200);
        } else {
            swipeLayout.postDelayed(new Runnable() {
                @Override
                public void run() {
                    swipeLayout.close();
                }
            }, 200);
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        if(getItem(position).totalPrice.getValue() == 0) {
            return;
        }
        if(!((BaseActivity)context).shoppingCartEditMode) {
            ((BaseActivity) context).closeDrawer();
            ProductListFragment pf = ProductListFragment.newInstance((getItem(position).product.getCode()), false);
            LogUtil.info("", "getGATagq145:" + getItem(position).product.getName());
            pf.setGATag(getItem(position).product.getName());
            ((BaseActivity) context).placeFragmentWithBackStack(pf);
        }
    }
    public void onEvent(ShoppingCartSelectAllEvent event) {
        if(event.isSelectAll()) {
            for(int i = 0; i < selectedList.size(); i++)
                selectedList.set(i, true);

        } else {
            for(int i = 0; i < selectedList.size(); i++)
                selectedList.set(i, false);

        }
    }
}
