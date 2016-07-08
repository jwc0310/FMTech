package parknshop.parknshopapp.Model;

import java.util.List;

/**
 * Created by Howard Chang on 2015/10/27
 */
public class CouponSearchBody {

    private String online_datetime;
    private String offline_datetime;
    private List<String> category_ids;
    private String keyword;
    private boolean full_content;
    private int offset;

    public CouponSearchBody(boolean full_content, int offset) {
        this.full_content = full_content;
        this.offset = offset;
    }

    public CouponSearchBody(String online_datetime, String offline_datetime,
                            List<String> category_ids, String keyword, boolean full_content, int offset) {
        this.online_datetime = online_datetime;
        this.offline_datetime = offline_datetime;
        this.category_ids = category_ids;
        this.keyword = keyword;
        this.full_content = full_content;
        this.offset = offset;
    }
}
