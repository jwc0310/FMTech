package parknshop.parknshopapp.Fragment.Category;

import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.orhanobut.hawk.Hawk;

import java.util.HashMap;
import java.util.Map;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Fragment.Product.ProductList.ProductListFragment;
import parknshop.parknshopapp.Model.Product;
import parknshop.parknshopapp.Model.WishListResponse;
import parknshop.parknshopapp.OneActivity;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Utils.AppUtils;
import parknshop.parknshopapp.Utils.LogUtil;
import parknshop.parknshopapp.View.ShoppingCartAddMinusCountPanel;
import parknshop.parknshopapp.WebServiceModel;

/**
 * Created by chrisyu on 11/3/16.
 */

public class ProductItemViewHolder extends RecyclerView.ViewHolder {
    public @Bind(R.id.placeholder_root) View placeholderRoot;

    //HeaderView
    public @Bind(R.id.recycler_view_header) View headerView;
    public @Bind(R.id.recycler_view_item) View itemView;
    public @Bind(R.id.items) TextView items;
    public @Bind(R.id.loading) View loadingView;

    public @Bind(R.id.product_list_header) View productListHeader;
    public @Bind(R.id.crazy_sale_header) View crazySaleHeader;
    public @Bind(R.id.gallery_viewpager) ViewPager viewPager;

    //Product Item
    public View root;
    public @Bind(R.id.product_image) ImageView squareImage;
    public @Bind(R.id.btnAddToWishList)ImageView btnAddToWishList;
    public @Bind(R.id.title)TextView title;
    public @Bind(R.id.description) TextView description;
    public @Bind(R.id.price) TextView price;
    public @Bind(R.id.out_of_stock) TextView out_of_stock;
    public @Bind(R.id.add_to_cart) TextView add_to_cart;
    public @Bind(R.id.count) TextView count = null;
    public @Bind(R.id.add_panel) View addPanel;
    public @Bind(R.id.add_minus_count_panel) LinearLayout addMinusCountPanel;
    public @Bind(R.id.notify_me) View notifyMe;
    public @Bind(R.id.buy_n_give_n) TextView promotionText;
    public @Bind(R.id.item_weight) TextView itemWeight;
    public @Bind(R.id.original_price) TextView originalPrice;

    public boolean isHeader;
    public boolean isFooter;


    public boolean isCrazySale;
    public boolean isProductList = true;
    public boolean isProductDetail;

    ProductListFragment productListFragment;
    Product product;

    int totalCount;
    Map<Integer, Integer> localShoppingCart = new HashMap<>();

    public ProductItemViewHolder(View v, ProductListFragment productListFragment) {
        super(v);
        root = v;
        ButterKnife.bind(this, v);

        notifyMe.setOnClickListener(null);

        this.productListFragment = productListFragment;
    }

    public void setProduct(Product product) {
        showItemView();
        localShoppingCart = Hawk.get(AppUtils.local_shopping_cart);
        setProductToView(product);

        ShoppingCartAddMinusCountPanel scamcp = new ShoppingCartAddMinusCountPanel(addMinusCountPanel, product, productListFragment.getBaseActivity());
        handleLocalShoppingCart();

        Glide.with(productListFragment.getContext()).load(AppUtils.WASTSONS_IMG_DOMAIN + product.getImageUrl()).into(this.squareImage);
    }

    public void setProductToView(Product product) {
        this.product = product;
        this.title.setText(product.getBrandName());
        this.description.setText(product.getName());
        this.price.setText("HK" + product.getPrice());
        if(product.getDescSpec() == null) {
            this.itemWeight.setVisibility(View.VISIBLE);
            this.itemWeight.setText(product.getDescSpec());
        } else {
            this.itemWeight.setVisibility(View.GONE);
        }

        if(product.getOldPrice() != null)
            this.originalPrice.setText("was" +product.getOldPrice());
        else
            this.originalPrice.setText("");

        this.out_of_stock.setVisibility(product.hasStock() ? View.GONE : View.VISIBLE);
        this.notifyMe.setVisibility(product.hasStock() ? View.GONE : View.VISIBLE);
        handlePromoteText();
    }

    public void handleLocalShoppingCart() {
        if(localShoppingCart.get(getIntegerValue(product)) == null) {
            this.addPanel.setVisibility(View.GONE);
            this.count.setText(0 + "");
        } else {
            //this.addPanel.setVisibility(View.VISIBLE);
            this.notifyMe.setVisibility(View.GONE);

            int countVal = localShoppingCart.get(getIntegerValue(product));
            this.count.setText(countVal + "");
        }
    }

    public void handlePromoteText() {
        if(product.getPromotionTag(0) != null && product.getPromotionTag(0).length() > 0) {
            promotionText.setText(product.getPromotionTag(0));
            promotionText.setVisibility(View.VISIBLE);
        } else {
            promotionText.setVisibility(View.INVISIBLE);
        }
        Glide.with(productListFragment.getContext()).load(AppUtils.WASTSONS_IMG_DOMAIN + product.getImageUrl()).into(this.squareImage);
        Glide.with(productListFragment.getContext()).load(R.drawable.on_sale_tag_heart_dim).into(btnAddToWishList);
    }

    public void setWishListBtn() {
        Glide.with(productListFragment.getContext()).load(R.drawable.on_sale_tag_heart).into(btnAddToWishList);
    }

    public void setTotalCount(int totalCount) {
        items.setText(totalCount + " items");
    }


    public int getIntegerValue(Product product) {
        try {
            return Integer.valueOf(product.getCode());
        } catch (Exception e) {
            return 0;
        }
    }

    public void hideItemViewAndShowFooter() {
        headerView.setVisibility(View.GONE);
        loadingView.setVisibility(View.VISIBLE);
        itemView.setVisibility(View.GONE);
    }

    public void hideItemViewAndShowHeader() {
        headerView.setVisibility(View.VISIBLE);
        //Log.i("yoyoyoy", "yoyoyyo isCrazySale " + isCrazySale);
        if(isCrazySale) {
            productListHeader.setVisibility(View.GONE);
            crazySaleHeader.setVisibility(View.VISIBLE);
        } else if (isProductDetail) {

        } else if(isProductList){
            productListHeader.setVisibility(View.VISIBLE);
            crazySaleHeader.setVisibility(View.GONE);
        }

        loadingView.setVisibility(View.GONE);
        itemView.setVisibility(View.GONE);
    }

    public void showItemView() {
        headerView.setVisibility(View.GONE);
        loadingView.setVisibility(View.GONE);
        itemView.setVisibility(View.VISIBLE);
    }

    @OnClick(R.id.placeholder_root)
    public void goToProductDetail() {
        if(product == null) return;

        ProductListFragment pf = ProductListFragment.newInstance((product.getCode()), false);
        pf.setGATag(product.getName());
        LogUtil.info("", "getGATagq12:"+product.getName());
        productListFragment.placeFragmentWithBackStack(pf);
    }

    @OnClick (R.id.add_to_cart)
    public void addToCart() {
        //addPanel.setVisibility(View.VISIBLE);
    }

    @OnClick (R.id.btnAddToWishList)
    public void btnAddToWishList() {
        // get the current wishlists, check if any wishlist created before
//        WebServiceModel.getInstance(root.getContext()).requestGetWishList(root.getContext(), product.getCode());

//        ((OneActivity)root.getContext()).addToWishList(product);

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
                    continue;
                }
            }
        }

        final WishListResponse finalCurrwishListResponse = currwishListResponse;
        if (finalCurrwishListResponse == null) {
            ((OneActivity)root.getContext()).addToWishList(product, -1);
        }else{
            WebServiceModel.getInstance(root.getContext()).requestRemoveProductFromWishList(root.getContext(), finalCurrwishListResponse.getPrimaryKey(), qty, product.getCode());
        }
    }

}