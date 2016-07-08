package parknshop.parknshopapp.Rest.event;

import parknshop.parknshopapp.Model.AddWishListResponse;
import parknshop.parknshopapp.Model.Product;

/**
 * Created by kwongyuenpan on 15/3/16.
 */
public class AddWishListResponseEvent extends BaseEvent {
    AddWishListResponse AddWishListResponse;
    Product product;

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setAddWishListResponse(parknshop.parknshopapp.Model.AddWishListResponse addWishListResponse) {
        AddWishListResponse = addWishListResponse;
    }

    public parknshop.parknshopapp.Model.AddWishListResponse getAddWishListResponse() {
        return AddWishListResponse;
    }
}
