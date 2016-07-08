package parknshop.parknshopapp.Rest.event;

import parknshop.parknshopapp.Model.Product;
import parknshop.parknshopapp.Model.WishListResponse;

/**
 * Created by kwongyuenpan on 15/3/16.
 */
public class WishListResponseEvent extends BaseEvent {
    WishListResponse[] wishListResponses;
    Product product;
    boolean showDialog = true;
    public String type;

    public void setShowDialog(boolean showDialog) {
        this.showDialog = showDialog;
    }

    public boolean getShowDialog() {
        return showDialog;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setWishListResponses(WishListResponse[] wishListResponses) {
        this.wishListResponses = wishListResponses;
    }

    public WishListResponse[] getWishListResponses() {
        return wishListResponses;
    }
}
