package parknshop.parknshopapp.EventUpdate;

import parknshop.parknshopapp.Model.WishListResponse;

/**
 * Created by kwongyuenpan on 24/3/16.
 */
public class GroceryListAdapterItemClickEvent extends BaseAdapterEvent {
    WishListResponse wishListResponse;
    boolean isMyList;
    boolean isFromAlarm;

    public void setWishListResponse(WishListResponse wishListResponse) {
        this.wishListResponse = wishListResponse;
    }

    public WishListResponse getWishListResponse() {
        return wishListResponse;
    }

    public void setMyList(boolean myList) {
        isMyList = myList;
    }

    public boolean isMyList() {
        return isMyList;
    }

    public void setFromAlarm(boolean fromAlarm) {
        isFromAlarm = fromAlarm;
    }

    public boolean isFromAlarm() {
        return isFromAlarm;
    }
}
