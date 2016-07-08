package parknshop.parknshopapp.Model;

/**
 * Created by Howard Chang on 2015/9/30
 */
public class CouponObtainInfo {

    public int id;
    private String user_id;
    public int coupon_id;
    private String coupon_code;
    private String coupon_title;
    private String obtain_datetime;
    private String redeem_datetime;
    private String status;
    private String status_description;
    private FeatureImage feature_image;
    private String show_type;
    private String current_datetime;

    public String getUserId() {
        return user_id != null ? user_id : null;
    }

    public String getCouponCode() {
        return coupon_code != null ? coupon_code : null;
    }

    public String getCouponTitle() {
        return coupon_title != null ? coupon_title : null;
    }

    public String getObtainDatetime() {
        return obtain_datetime != null ? obtain_datetime : null;
    }

    public String getRedeemDatetime() {
        return redeem_datetime != null ? redeem_datetime : null;
    }

    public String getStatus() {
        return status != null ? status : null;
    }

    public String getStatusDescription() {
        return status_description != null ? status_description : null;
    }

    public String getFeatureImageUrl() {
        return feature_image != null ? feature_image.url : "";
    }

    public String getShowType() {
        return show_type != null ? show_type : "";
    }

    public String getCurrentDatetime() {
        return current_datetime != null ? current_datetime : "";
    }
}
