package parknshop.parknshopapp.Rest.event;

import parknshop.parknshopapp.Model.ECouponResponse;

/**
 * Created by hp on 13/4/2016.
 */
public class CouponPickerCancelEvent extends BaseEvent {
    String areaCanceled;
    String type;
    ECouponResponse.ECoupon eCoupon;

    public void seteCoupon(ECouponResponse.ECoupon eCoupon) {
        this.eCoupon = eCoupon;
    }

    public ECouponResponse.ECoupon geteCoupon() {
        return  this.eCoupon;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getAreaCanceled() {
        return areaCanceled;
    }

    public ECouponResponse.ECoupon getCouponCancaled() {
        return eCoupon;
    }

    public void setAreaCanceled(String areaCanceled) {
        this.areaCanceled = areaCanceled;
    }
}
