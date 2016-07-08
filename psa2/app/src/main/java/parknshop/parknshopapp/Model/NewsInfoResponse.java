package parknshop.parknshopapp.Model;

/**
 * Created by Kate on 2015/4/8
 */
public class NewsInfoResponse extends BackendResponse {
    public Results results;

    public class Results {
        public NewsInfo news_info;
    }
}
