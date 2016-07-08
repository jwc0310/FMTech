package parknshop.parknshopapp.Fragment.Checkout.CouponAdapter;

import parknshop.parknshopapp.EventUpdate.StringPickerAdapterOnItemClickEvent;
import parknshop.parknshopapp.Model.ECouponResponse;

/**
 * Created by hp on 14/4/2016.
 */
public class CouponPickerAdapterOnItemClickEvent extends StringPickerAdapterOnItemClickEvent {
    ECouponResponse.ECoupon ecoupon;

    public void setEcoupon(ECouponResponse.ECoupon ecoupon) {
        this.ecoupon = ecoupon;
    }

    public ECouponResponse.ECoupon getEcoupon() {
        return this.ecoupon;
    }
}