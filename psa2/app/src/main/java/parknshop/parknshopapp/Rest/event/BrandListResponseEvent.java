package parknshop.parknshopapp.Rest.event;

import parknshop.parknshopapp.Model.BrandListResponse;

/**
 * Created by kwongyuenpan on 15/3/16.
 */
public class BrandListResponseEvent extends BaseEvent {
    BrandListResponse brandListResponse;

    public BrandListResponse getBrandListResponse() {
        return brandListResponse;
    }

    public void setBrandListResponse(BrandListResponse brandListResponse) {
        this.brandListResponse = brandListResponse;
    }
}
