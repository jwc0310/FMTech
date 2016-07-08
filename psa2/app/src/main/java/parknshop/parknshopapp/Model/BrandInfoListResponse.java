package parknshop.parknshopapp.Model;

import java.util.List;

/**
 * Created by Kate on 2015/4/8
 */
public class BrandInfoListResponse extends BackendResponse {
    public Results results;

    public class Results {
        public List<BrandInfo> brand_info;
    }
}
