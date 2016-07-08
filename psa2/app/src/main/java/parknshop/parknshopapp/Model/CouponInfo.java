package parknshop.parknshopapp.Model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Howard Chang on 2015/8/11
 */
public class CouponInfo implements Serializable {
    public int id;
    private String title;
    private FeatureImage feature_image;
    private String summary;
    private String content;
    private String edit_datetime;
    private String online_datetime;
    private String offline_datetime;
    private String obtain_start_datetime;
    private String obtain_end_datetime;
    private String redeem_start_datetime;
    private String redeem_end_datetime;
    private String current_datetime;
    private String publish_status;
    private String status;
    public boolean sticky;
    public int read_count;
    public int obtain_count;
    public int redeem_count;
    public int obtain_limit_number;
    private String type;
    private String product_code;
    private String product_name;
    private String redeem_secret;
    private ArrayList<Meta> meta;
    private String share_link;
    private String member_only;
    private String show_type;

    public String getFeatureImageUrl() {
        return feature_image != null ? feature_image.url : "";
    }

    public String getTitle() {
        return title != null ? title : "";
    }

    public String getSummary() {
        return summary != null ? summary : "";
    }

    public String getContent() {
        return content != null ? content : "";
    }

    public String getEditDatetime() {
        return edit_datetime != null ? edit_datetime : "";
    }

    public String getOnlineDatetime() {
        return online_datetime != null ? online_datetime : "";
    }

    public String getOfflineDatetime() {
        return offline_datetime != null ? offline_datetime : "";
    }

    public String getObtainStartDatetime() {
        return obtain_start_datetime != null ? obtain_start_datetime : "";
    }

    public String getObtainEndDatetime() {
        return obtain_end_datetime != null ? obtain_end_datetime : "";
    }

    public String getRedeemStartDatetime() {
        return redeem_start_datetime != null ? redeem_start_datetime : "";
    }

    public String getRedeemEndDatetime() {
        return redeem_end_datetime != null ? redeem_end_datetime : "";
    }

    public String getCurrentDatetime() {
        return current_datetime != null ? current_datetime : "";
    }

    public String getPublishStatus() {
        return publish_status != null ? publish_status : "";
    }

    public String getStatus() {
        return status != null ? status : "";
    }

    public String getType() {
        return type != null ? type : "";
    }

    public String getProductCode() {
        return product_code != null ? product_code : "";
    }

    public String getProductName() {
        return product_name != null ? product_name : "";
    }

    public String getRedeemSecret() {
        return redeem_secret != null ? redeem_secret : "";
    }

    public String getShareLink() {
        return share_link != null ? share_link : "";
    }

    public String getMemberOnly() {
        return member_only != null ? member_only : "";
    }

    public String getShowType() {
        return show_type != null ? show_type : "";
    }

    public CouponInfo() {

    }
}
