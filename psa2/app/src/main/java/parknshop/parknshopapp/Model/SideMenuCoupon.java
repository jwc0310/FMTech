package parknshop.parknshopapp.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by panther945 on 2015/6/22.
 */
public class SideMenuCoupon extends BackendResponse {
    private Results results;

    public List<CouponDrawerItem> getCouponDrawerItemList() {
        List<CouponDrawerItem> list = new ArrayList<CouponDrawerItem>();
        try {
            for (Coupon coupon : results.store_info.get(0).category_info.discount) {
                list.add(new CouponDrawerItem(coupon.title, coupon.summary));
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        return list;
    }

    public class Results {
        private List<StoreInfo> store_info;
    }

    public class StoreInfo {
        private CategoryInfo category_info;
    }

    public class CategoryInfo {
        private List<Coupon> discount;
    }

    public class Coupon {
        private String title;
        private String summary;
    }
}
