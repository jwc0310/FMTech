package parknshop.parknshopapp.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Howard Chang on 2015/12/3
 */
public class BrandList {
    private String prefix;
    private List<Brands> brands;

    public String getPrefix() {
        return prefix != null ? prefix : "";
    }

    public List<Brands> getBrands() {
        return brands != null ? brands : new ArrayList<Brands>();
    }
}
