package parknshop.parknshopapp.Model;

/**
 * Created by Howard Chang on 2015/9/30
 */
public class CouponObtainResponse extends BackendResponse {


    private Results results;

    public CouponObtainInfo getData() {
        if (results == null) {
            return null;
        }
        return results.coupon_obtain_info != null ? results.coupon_obtain_info : new CouponObtainInfo();
    }

    public class Results {
        private CouponObtainInfo coupon_obtain_info;
    }


}
