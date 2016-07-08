package parknshop.parknshopapp.Model;

/**
 * Created by Kate on 2015/4/8
 */
public class LuckyDrawInfoResponse extends BackendResponse {
    public Results results;

    public class Results {
        public LuckyDrawInfo lucky_draw_info;
    }
}
