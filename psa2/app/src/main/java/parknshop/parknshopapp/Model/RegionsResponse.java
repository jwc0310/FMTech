package parknshop.parknshopapp.Model;

import java.util.List;

/**
 * Created by panther945 on 2015/4/13.
 */
public class RegionsResponse {
    private List<Region> regions;

    public int size() {
        return regions != null ? regions.size() : 0;
    }

    public String getRegion(int index) {
        return index < regions.size() ? regions.get(index).name : "";
    }

    public class Region {
        public String name;
    }

    public List<Region> getRegions() {
        return this.regions;
    }

    public String[] getListOfRegionList() {
        if(regions == null || regions.size() == 0) return null;

        String[] regionList = new String[regions.size()];
        for(int i = 0; regions != null && i < regions.size(); i ++) {
            regionList[i] = regions.get(i).name;
        }

        return regionList;
    }
}
