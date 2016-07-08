package parknshop.parknshopapp.Rest.event;

import parknshop.parknshopapp.Model.UpdateWishListResponse;

/**
 * Created by kwongyuenpan on 15/3/16.
 */
public class UpdateWishListResponseEvent extends BaseEvent {
    UpdateWishListResponse updateWishListResponse;

    public void setUpdateWishListResponse(UpdateWishListResponse updateWishListResponse) {
        this.updateWishListResponse = updateWishListResponse;
    }

    public UpdateWishListResponse getUpdateWishListResponse() {
        return updateWishListResponse;
    }
}
