package parknshop.parknshopapp.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by panther945 on 2015/4/10.
 */
public class StoresInfo {
    private ArrayList<Store> stores;
    private final String businessTimePrefix = "營業時間 ";

    public StoresInfo clone() {
        StoresInfo storesInfo = new StoresInfo();
        storesInfo.stores = (ArrayList<Store>)stores.clone();

        return storesInfo;
    }

    public void filterBranch(Set<String> branch) {
        ArrayList<Store> filteredList = new ArrayList<Store>();
        try {
            for (Store store : stores) {
                if (branch.contains(store.storeNumber)) {
                    filteredList.add(store);
                }
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        stores = filteredList;
    }

    public void filterRegion(String region) {
        ArrayList<Store> filteredList = new ArrayList<Store>();

        try {
            for (Store store : stores) {
                if (store.addressData.region.equals(region)) {
                    filteredList.add(store);
                }
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        stores = filteredList;
    }

    public void filterDistrict(String district) {
        ArrayList<Store> filteredList = new ArrayList<Store>();

        try {
            for (Store store : stores) {
                if (store.addressData.district.equals(district)) {
                    filteredList.add(store);
                }
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        stores = filteredList;
    }

    public List<Store> getStores() {
        return stores != null ? stores : new ArrayList<Store>();
    }

    public int size() {
        return stores.size();
    }

    public String getStoreNumber(int index) {
        try {
            return index < stores.size() ? stores.get(index).storeNumber : "";
        } catch (NullPointerException e) {
            return "";
        }
    }

    public String getName(int index) {
        try {
            return index < stores.size() ? stores.get(index).name : "";
        } catch (NullPointerException e) {
            return "";
        }
    }

    public String getBusinessTime(int index) {
        try {
            return index < stores.size()
                    ? businessTimePrefix + stores.get(index).openingScheduleData.getCode() : businessTimePrefix;
        } catch (NullPointerException e) {
            return businessTimePrefix;
        }
    }

    public String getPhone(int index) {
        try {
            return index < stores.size() ? stores.get(index).addressData.phone : "";
        } catch (NullPointerException e) {
            return "";
        }
    }

    public String getAddress(int index) {
        try {
            return index < stores.size() ? stores.get(index).addressData.line1 : "";
        } catch (NullPointerException e) {
            return "";
        }
    }

    public double getLatitude(int index) {
        try {
            return index < stores.size() ? stores.get(index).latitude : 0.0;
        } catch (NullPointerException e) {
            return 0.0;
        }
    }

    public double getLongitude(int index) {
        try {
            return index < stores.size() ? stores.get(index).longitude : 0.0;
        } catch (NullPointerException e) {
            return 0.0;
        }
    }

    public String getDistance(int index) {
        return index < stores.size() ? stores.get(index).distance : "";
    }

    public void setDistance(int index, String distance) {
        if (index < stores.size()) {
            stores.get(index).distance = distance;
        }
    }

    public class Store {
        private String id;
        private String name;
        private double latitude;
        private double longitude;
        private AddressData addressData;
        private String storeNumber;
        private OpeningScheduleData openingScheduleData;
        private String distance;

        public class AddressData {
            private String id;
            private String line1;
            private String line2;
            private String region;
            private String postalCode;
            private String phone;
            private boolean contactAddress;
            private String streetName;
            private String streetNumber;
            private String district;
            private String floor;
            private boolean isSpecialAddress;
            private Country country;

            public class Country {
                private String isoCode;
                private String name;
            }
        }

        public class OpeningScheduleData {
            private String code;

            public String getCode() {
                return code != null ? code.replace("^", "").replace("zt", "") : "";
            }
        }
    }
}
