package parknshop.parknshopapp.EventUpdate;

import java.util.ArrayList;

import parknshop.parknshopapp.Model.WishListResponse;

/**
 * Created by kwongyuenpan on 23/3/16.
 */
public class GroceryChooseListAdapterOnItemClickEvent extends BaseAdapterEvent {
    ArrayList<WishListResponse> wishListResponses;

    public void setWishListResponses(ArrayList<WishListResponse> wishListResponses) {
        this.wishListResponses = wishListResponses;
    }

    public ArrayList<WishListResponse> getWishListResponses() {
        return wishListResponses;
    }
}
