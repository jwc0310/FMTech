package parknshop.parknshopapp.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by panther945 on 2015/4/13.
 */
public class DistrictsResponse {
    private List<District> districts;

    public int size() {
        return districts != null ? districts.size() : 0;
    }

    public String getName(int index) {
        return index < districts.size() ? districts.get(index).name : "";
    }

    public String getRegion(int index) {
        return index < districts.size() ? districts.get(index).region : "";
    }

    public class District {
        public String name;
        public String region;
    }

    public String[] getListOfDistrict(String region) {
        if(districts == null || districts.size() == 0) return null;

        ArrayList<String> regionList = new ArrayList<String>();//[districts.size()];
        for(int i = 0; districts != null && i < districts.size(); i ++) {
            if(region.equals(districts.get(i).region))
            regionList.add(districts.get(i).name);
        }

        return regionList.toArray(new String[regionList.size()]);
    }
}
