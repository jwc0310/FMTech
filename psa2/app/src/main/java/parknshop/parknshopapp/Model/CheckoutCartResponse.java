package parknshop.parknshopapp.Model;

/**
 * Created by panther945 on 2015/6/29.
 */
public class CheckoutCartResponse {
    private String status;
    private String payId;
    private String orderNo;
    private String url;
    private String orderDatetime;

    public String getOrderNo() {
        return orderNo;
    }

    public String getUrl() {
        return url != null ? url : "";
    }

    public boolean hasUrl() {
        return url != null;
    }

    public String getOrderTime() {
        return orderDatetime != null ? Utility.formatShowDate(orderDatetime) : "";
    }
}
