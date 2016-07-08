package parknshop.parknshopapp.Model;

import java.util.ArrayList;

/**
 * Created by kwongyuenpan on 15/4/16.
 */
public class PaymentResponse {
    public String status;
    public String orderNo;
    public String orderDatetime;
    public String payId;
    public String url;
    public ArrayList<myParams> params;

    public ArrayList<myParams> getParams() {
        return params;
    }

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderDatetime() {
        return orderDatetime;
    }

    public void setOrderDatetime(String orderDatetime) {
        this.orderDatetime = orderDatetime;
    }

    public String getUrl() {
        return url;
    }

    public class myParams {
        String key;
        String value;

        public String getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }
    }
}
