package parknshop.parknshopapp.View;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.API;
import parknshop.parknshopapp.Base.BaseActivity;
import parknshop.parknshopapp.Fragment.Home.RightMenu.RightSlidingListViewAdapter;
import parknshop.parknshopapp.Model.CartResponse;
import parknshop.parknshopapp.Model.Product;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.EditShoppingCartEvent;

/**
 * Created by chrisyu on 7/4/16.
 */
public class ShoppingCartProductItem extends LinearLayout {
    @Bind (R.id.cart_product_image) ImageView productImage;
    @Bind (R.id.title) TextView productTitle;
    @Bind (R.id.small_desc) TextView smallDescription;
    @Bind (R.id.weight) TextView productWeight;
    @Bind (R.id.price) TextView productPrice;
    @Bind (R.id.item_price) TextView itemPrice;
    @Bind (R.id.sold_out_text_view) TextView soldOut;
    @Bind (R.id.arrow) ImageView arrow;
    @Bind (R.id.promotion_tag) LinearLayout promotionTag;
    @Bind (R.id.edit_panel) View editPanelView;

    public @Bind (R.id.sub_drawable) ImageView sub;
    public @Bind (R.id.plus_drawable) ImageView plus;

    boolean shown;
    Context context;

    public RightSlidingListViewAdapter rightSlidingListViewAdapter;

    public ShoppingCartProductItem(Context context) {
        this(context, null);
    }

    public ShoppingCartProductItem(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ShoppingCartProductItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;

        MyApplication.getInstance().register(this);
        LayoutInflater.from(context).inflate(R.layout.home_activity_sliding_menu_front_item, this);
        ButterKnife.bind(this);
    }

    int position;
    public void setPosition(int position) {
        this.position = position;
    }

    public void showEditMode() {
        editPanelView.setVisibility(View.VISIBLE);
    }

    public void hideEditMode() {
        editPanelView.setVisibility(View.GONE);
    }

    public void setProduct(Product product) {
        Glide.with(context).load(API.WASTSONS_DOMAIN + product.getThumbnail()).error(R.drawable.parknshop_square).into(productImage);
        //Log.i("ddd", "ddd" + API.WASTSONS_DOMAIN + product.getImageUrl());

        productTitle.setText(product.getBrandName());
        smallDescription.setText(product.getName());
        productWeight.setText(product.getPnsContentSizeUnit());
        productPrice.setText(product.getPrice());

        //#292d84
        itemPrice.setTextColor(Color.parseColor("#292d84"));

        if(entry != null && entry.totalPrice != null && entry.totalPrice.getValue() == 0) {
            itemPrice.setText(context.getResources().getString(R.string.free_gift));

            if(BaseActivity.editMode) {
                itemPrice.setVisibility(View.GONE);
            } else {
                itemPrice.setVisibility(View.VISIBLE);
            }
        } else {
            itemPrice.setText(entry != null ? entry.totalPrice.getFormattedPrice() + "" : (product != null ?product.getPrice() : ""));
        }

        if (product.hasStock()) {
            soldOut.setVisibility(View.GONE);
        } else {
            Glide.with(context).load(R.drawable.shopping_cart_add_disabled).into(plus);
            Glide.with(context).load(R.drawable.shopping_cart_sub_disabled).into(sub);
            soldOut.setVisibility(View.VISIBLE);
            itemPrice.setTextColor(Color.parseColor("#949494"));
        }

        //Log.i("product", "product sold out" + product.hasStock());

        promotionTag.setVisibility(View.GONE);
        ArrayList<String> saved = new ArrayList<>();
        ArrayList<String> discount = new ArrayList<>();

        //Log.i("promotion" , "promotion " +product.getPromotionList());
        if(entry != null && entry.appliedIwaPromotions != null && entry.appliedIwaPromotions.size() > 0) {
            Product p = entry.product;
            for(int i = 0; i < entry.appliedIwaPromotions.size(); i++) {
                if(p.iwaPromotionsData != null )
                    for(int x = 0; x < p.iwaPromotionsData.size(); x++) {
                        Product.PromotionData pd = p.iwaPromotionsData.get(x);
                        CartResponse.Entry.Promotion promo = entry.appliedIwaPromotions.get(i);
                        if(promo.promotionNumber == pd.promoCode) {
                            saved.add(promo.promotionDescription);
                            discount.add("-" + promo.rewardAmount);
                        }
                    }
            }

            if(saved.size() > 0) {
                if(BaseActivity.editMode) {
                    arrow.setVisibility(View.GONE);
                } else {
                    arrow.setVisibility(View.VISIBLE);
                }
                promotionTag.removeAllViews();

                for (int i = 0; i < saved.size(); i++) {
                    CheckoutCheckBoxWithText checkoutCheckBoxWithText = getCheckoutView(saved.get(i), i);
                    //Log.i("saved", "saved" + saved.get(i));

                    checkoutCheckBoxWithText.setTextColor("#000000");
                    promotionTag.addView(checkoutCheckBoxWithText);
                    /*IngredientViewHolder ingredientViewHolder = new IngredientViewHolder(getContext());
                    ingredientViewHolder.setIngredientItem(saved.get(i));
                    ingredientViewHolder.setIngredientWeight(discount.get(i));

                    ingredientViewHolder.ingredientItem.setTextSize(12);
                    ingredientViewHolder.ingredientItem.setTypeface(Typeface.create("sans-serif-light", Typeface.NORMAL));

                    ingredientViewHolder.ingredientWeight.setTextSize(12);
                    ingredientViewHolder.ingredientWeight.setTypeface(Typeface.create("sans-serif-light", Typeface.NORMAL));

                    // android:fontFamily="sans-serif-light"
                    //android:textSize="12sp"*/
                    //promotionTag.addView(ingredientViewHolder.view);
                }
                //#292d84
                itemPrice.setTextColor(Color.parseColor("#fc6475"));
            }

        } else {
            arrow.setVisibility(View.GONE);
        }
    }

    @OnClick({R.id.arrow, R.id.item_price})
    public void showArrow() {
        if (!shown) {
            arrow.setImageResource(R.drawable.buy_more_save_more_arrow_up);
            promotionTag.setVisibility(View.VISIBLE);
            shown = true;
        } else {
            arrow.setImageResource(R.drawable.buy_more_save_more_arrow_down);
            promotionTag.setVisibility(View.GONE);
            shown = false;
        }
    }

    CartResponse.Entry entry;
    public void setEntry(CartResponse.Entry entry) {
        this.entry = entry;
        setProduct(entry.product);
        productPrice.setText(entry.product.getPrice() + " x " + entry.quantity);
    }

    public CheckoutCheckBoxWithText getCheckoutView(String product, int position) {
        CheckoutCheckBoxWithText checkoutCheckBoxWithText = new CheckoutCheckBoxWithText(context);
        checkoutCheckBoxWithText.setText(product);
        checkoutCheckBoxWithText.setSelectedDrawable(R.drawable.shopping_cart_expand_icn_tick, context);
        //checkoutCheckBoxWithText.setSelectedDrawable(R.drawable.checkout_unfilled_circle, context);
        checkoutCheckBoxWithText.disableOnClick(true);
        checkoutCheckBoxWithText.setSelected(true);
        return  checkoutCheckBoxWithText;
    }
/*
    public void onEvent(ShoppingCartSelectAllEvent event) {
        if(event.isSelectAll()) {
            //shoppingCartCheckoutBox.setSelected(true);

            if(rightSlidingListViewAdapter != null)
                rightSlidingListViewAdapter.notifyDataSetChanged();

        } else {
            //shoppingCartCheckoutBox.setSelected(false);

            if(rightSlidingListViewAdapter != null)
                rightSlidingListViewAdapter.notifyDataSetChanged();

        }
    }*/

    public void onEvent(EditShoppingCartEvent event) {
        if(event.isEdit()) {
            showEditMode();
        } else {
            hideEditMode();
        }
    }
}
