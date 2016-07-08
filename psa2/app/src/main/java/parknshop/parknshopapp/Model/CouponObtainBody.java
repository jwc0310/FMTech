package parknshop.parknshopapp.Model;

/**
 * Created by Howard Chang on 2015/9/30
 */
public class CouponObtainBody {
    private int coupon_id;
    private String user_id;

    public CouponObtainBody(int coupon_id, String user_id) {
        this.coupon_id = coupon_id;
        this.user_id = user_id;
    }
}
