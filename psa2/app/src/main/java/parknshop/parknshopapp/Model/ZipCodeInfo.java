package parknshop.parknshopapp.Model;

import java.util.List;

/**
 * Created by Kate on 2015/4/20
 */
public class ZipCodeInfo {
    public List<RegionInfo> regions;

    public static class RegionInfo {
        public String code;
        public String name;
        public List<DistrictInfo> districts;
    }

    public static class DistrictInfo {
        public String code;
        public String name;
        public String postcode;
    }
}
