package parknshop.parknshopapp.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Howard Chang on 2015/9/30
 */
public class CouponSearchResponse extends BackendResponse  {

    private Results results;

    private Integer next;

    private String current_datetime;

    public Integer getNext() {
        return next;
    }

    public String getCurrentDatetime(){
        return current_datetime!=null?current_datetime:"";
    }


    public List<CouponInfo> getData() {
        if(results==null){
            return null;
        }
        return results.coupon_info != null ? results.coupon_info : new ArrayList<CouponInfo>();
    }

    public class Results {
        private List<CouponInfo> coupon_info;
    }

}
