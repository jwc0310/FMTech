package parknshop.parknshopapp.Rest.event;

import parknshop.parknshopapp.Model.CouponResponse;

/**
 * Created by kwongyuenpan on 22/4/16.
 */
public class CouponListEvent extends BaseEvent {
    CouponResponse couponResponse;

    public void setCouponResponse(CouponResponse couponResponse) {
        this.couponResponse = couponResponse;
    }

    public CouponResponse getCouponResponse() {
        return couponResponse;
    }
}
