package parknshop.parknshopapp.Model;

/**
 * Created by Howard Chang on 2015/9/15
 */
public class ReportOrderInfo {

    private String id;
    private int order_item_count;

    public ReportOrderInfo(String id, int order_item_count) {
        this.id = id;
        this.order_item_count = order_item_count;
    }

}
