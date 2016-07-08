package parknshop.parknshopapp.Model;

/**
 * Created by panther945 on 2015/7/16.
 */
public class GroupBuyItem {
    private int id;
    private String product_id;
    private String title;
    private int store_id;
    private String event_start_datetime;
    private String event_end_datetime;
    private String publish_status;
    private String status;
    private int base_item_count;
    private int item_count;
    private int purchased_item_count;
    private int require_item_count;

    public String getEventEndTime() {
        return event_end_datetime;
    }

    public String getProductId() {
        return product_id;
    }

    public int getRequireItemCount() {
        return require_item_count;
    }

    public int getPurchasedItemCount() {
        return purchased_item_count + base_item_count;
    }

    public int getLastItemCount() {
        int count = item_count - getPurchasedItemCount();
        return count > 0 ? count : 0;
    }

    public int getTargetCount() {
        int count = require_item_count - getPurchasedItemCount();
        return count > 0 ? count : 0;
    }

    public boolean isStock() {
        return getLastItemCount() > 0;
    }
}
