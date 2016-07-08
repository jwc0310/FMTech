package parknshop.parknshopapp.Model;

/**
 * Created by Howard Chang on 2015/8/11
 */
public class CouponDetailResponse extends BackendResponse {

    private Results results;

    public class Results {
        private CouponInfo coupon_info;
    }


    public CouponInfo getData() {
        if (results == null) {
            return null;
        }
        return results.coupon_info != null ? results.coupon_info : new CouponInfo();
    }

}
