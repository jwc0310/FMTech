package parknshop.parknshopapp.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Howard Chang on 2015/12/3
 */
public class BrandListResponse {

    private List<BrandList> brandList;

    public List<BrandList> getBrandList() {
        return brandList != null ? brandList : new ArrayList<BrandList>();
    }

    public String[] getStringBrandList() {
        ArrayList<String> listing = new ArrayList<>();
        if(brandList != null) {
            for (int i = 0; i < brandList.size(); i++) {
                for(int y = 0; y < brandList.get(i).getBrands().size(); y++) {
                    listing.add(brandList.get(i).getBrands().get(y).getName());
                }
            }
        }
        String [] strings = listing.toArray(new String[listing.size()]);
        return strings;
    }
}
