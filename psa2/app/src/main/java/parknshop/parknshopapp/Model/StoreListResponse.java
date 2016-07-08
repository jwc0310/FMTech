package parknshop.parknshopapp.Model;

import java.util.ArrayList;
import java.util.List;

public class StoreListResponse {
    public void setStores(List<Store> stores) {
        this.data = stores;
    }

    List<Store> data = new ArrayList<>();
    List<Store> stores = new ArrayList<>();

    public class Store {

        public OpeningScheduleData getOpeningScheduleData() {
            return openingScheduleData;
        }

        public ArrayList<WeekDay> getWeekDayOpeningList() {
            return weekDayOpeningList;
        }

        private ArrayList<WeekDay> weekDayOpeningList = new ArrayList<WeekDay>();
        private OpeningScheduleData openingScheduleData;
        String brandlogo;
        String id;
        String name;
        double latitude;
        double longitude;
        String tel;
        String brandlogo_tc;
        String name_tc;
        String brandlogo_en;
        String name_en;
        String line1;
        String region;

        List<List<String>> features;

        public List<List<String>> getFeatures() {
            return features;
        }
        //AddressData.AddressForm addressData;


        public void setBrandLog(String brandLogo) {
            this.brandlogo = brandLogo;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
            /*
            if (GlobalConstant.language.equals(GlobalConstant.LANG_ZH)) {
                if(name_tc == null)
                    return "";
                return name_tc;
            }
            if(name_en == null)
                return "";
            return name_en;*/
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTel() {
            return tel;
        }

        public void setTel(String tel) {
            this.tel = tel;
        }

        //public AddressData.AddressForm getAddressData() {
        //   return addressData;
        //}

        //public void setAddressData(AddressData.AddressForm addressData) {
        //    this.addressData = addressData;
        //}

        public void setLatitude(double latitude) {
            this.latitude = latitude;
        }

        public double getLatitude() {
            return latitude;
        }

        public double getLongitude() {
            return longitude;
        }

        public void setLongitude(float longitude) {
            this.longitude = longitude;
        }

        public String getBrandlogo_tc() {
            return brandlogo_tc;
        }

        public void setBrandlogo_tc(String brandlogo_tc) {
            this.brandlogo_tc = brandlogo_tc;
        }

        public String getName_tc() {
            return name_tc;
        }

        public void setName_tc(String name_tc) {
            this.name_tc = name_tc;
        }

        public String getBrandlogo_en() {
            return brandlogo_en;
        }

        public void setBrandlogo_en(String brandlogo_en) {
            this.brandlogo_en = brandlogo_en;
        }

        public String getName_en() {
            return name_en;
        }

        public void setName_en(String name_en) {
            this.name_en = name_en;
        }

        public void setLatitude(int latitude) {
            this.latitude = latitude;
        }

        public void setLongitude(int longitude) {
            this.longitude = longitude;
        }

        public String getBrandLogo() {
            return brandlogo
                    ;
        }

        Address addressData;
        public Address getAddress() {
            if(addressData == null)
                addressData = new Address();
            return addressData;
        }
    }

    public class Address {
        String id;
        String line1;
        String region;
        String postalCode;
        boolean shippingAddress;
        boolean defaultAddress;
        boolean contactAddress;
        String district;
        String districtCode;
        String regionCode;
        String districtText;
        String room;
        boolean isSpecialAddress;
        Country country;


        public Country getCountry() {
            return country;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getLine1() {
            return line1;
        }

        public void setLine1(String line1) {
            this.line1 = line1;
        }

        public String getRegion() {
            if (region == null)
                return "";
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getPostalCode() {
            return postalCode;
        }

        public void setPostalCode(String postalCode) {
            this.postalCode = postalCode;
        }

        public boolean isShippingAddress() {
            return shippingAddress;
        }

        public void setShippingAddress(boolean shippingAddress) {
            this.shippingAddress = shippingAddress;
        }

        public boolean isDefaultAddress() {
            return defaultAddress;
        }

        public void setDefaultAddress(boolean defaultAddress) {
            this.defaultAddress = defaultAddress;
        }

        public String getDistrict() {
            return district;
        }

        public void setDistrict(String district) {
            this.district = district;
        }

        public String getDistrictCode() {
            return districtCode;
        }

        public void setDistrictCode(String districtCode) {
            this.districtCode = districtCode;
        }

        public String getRegionCode() {
            return regionCode;
        }

        public void setRegionCode(String regionCode) {
            this.regionCode = regionCode;
        }

        public String getDistrictText() {
            return districtText;
        }

        public void setDistrictText(String districtText) {
            this.districtText = districtText;
        }

        public String getRoom() {
            return room;
        }

        public void setRoom(String room) {
            this.room = room;
        }

        public boolean isSpecialAddress() {
            return isSpecialAddress;
        }

        public void setSpecialAddress(boolean specialAddress) {
            isSpecialAddress = specialAddress;
        }

        public class Country {
            String isocode;
            String name;

            public String getName(){
                return name;
            }
        }

        public OpeningScheduleData getOpeningScheduleData() {
            return openingScheduleData;
        }

        private OpeningScheduleData openingScheduleData;
    }

    public class OpeningScheduleData {
        private String name;
        private String code;

        public String getName() {
            return name;
        }
    }

    public class WeekDay {
        private String weekDay;
        private String closed;

        public WeekDay(String weekDay, String closed) {
            this.weekDay = weekDay;
            this.closed = closed;
        }
    }
/*{
            "weekDay": "Mon",
            "closed": true
          },*/
    /*{
04-29 12:47:29.829 30172-30188/? D/OkHttp:       "brandlogo": "FUSION",
04-29 12:47:29.829 30172-30188/? D/OkHttp:       "id": "201",
04-29 12:47:29.829 30172-30188/? D/OkHttp:       "name": "梅窩",
04-29 12:47:29.829 30172-30188/? D/OkHttp:       "latitude": 22.2641896,
04-29 12:47:29.830 30172-30188/? D/OkHttp:       "longitude": 114.0007585,
04-29 12:47:29.830 30172-30188/? D/OkHttp:       "tel": "29840249 & 29840265",
04-29 12:47:29.830 30172-30188/? D/OkHttp:       "addressData": {
04-29 12:47:29.830 30172-30188/? D/OkHttp:         "id": "8806461177879",
04-29 12:47:29.830 30172-30188/? D/OkHttp:         "line1": "大嶼山梅窩碼頭路12號梅窩大廈地下及1樓",
04-29 12:47:29.830 30172-30188/? D/OkHttp:         "region": "離島",
04-29 12:47:29.830 30172-30188/? D/OkHttp:         "postalCode": "29840249 & 29840265",
04-29 12:47:29.830 30172-30188/? D/OkHttp:         "country": {
04-29 12:47:29.830 30172-30188/? D/OkHttp:           "isocode": "HK",
04-29 12:47:29.830 30172-30188/? D/OkHttp:           "name": "香港"
04-29 12:47:29.831 30172-30188/? D/OkHttp:         },
04-29 12:47:29.831 30172-30188/? D/OkHttp:         "shippingAddress": false,
04-29 12:47:29.831 30172-30188/? D/OkHttp:         "defaultAddress": false,
04-29 12:47:29.831 30172-30188/? D/OkHttp:         "contactAddress": false,
04-29 12:47:29.831 30172-30188/? D/OkHttp:         "district": "大嶼山",
04-29 12:47:29.831 30172-30188/? D/OkHttp:         "districtCode": "大嶼山",
04-29 12:47:29.831 30172-30188/? D/OkHttp:         "regionCode": "NT",
04-29 12:47:29.831 30172-30188/? D/OkHttp:         "districtText": "大嶼山",
04-29 12:47:29.831 30172-30188/? D/OkHttp:         "room": "大嶼山梅窩碼頭路12號梅窩大廈地下及1樓",
04-29 12:47:29.831 30172-30188/? D/OkHttp:         "isSpecialAddress": false
04-29 12:47:29.831 30172-30188/? D/OkHttp:       },
04-29 12:47:29.832 30172-30188/? D/OkHttp:       "features": [],
04-29 12:47:29.832 30172-30188/? D/OkHttp:       "openingScheduleData": {
04-29 12:47:29.832 30172-30188/? D/OkHttp:         "name": "^en^9.30am - 10.00pm^zt^9.30am - 10.00pm",
04-29 12:47:29.832 30172-30188/? D/OkHttp:         "code": "^en^9.30am - 10.00pm^zt^9.30am - 10.00pm",
04-29 12:47:29.832 30172-30188/? D/OkHttp:         "weekDayOpeningList": [
04-29 12:47:29.832 30172-30188/? D/OkHttp:           {
04-29 12:47:29.832 30172-30188/? D/OkHttp:             "openingTime": {
04-29 12:47:29.832 30172-30188/? D/OkHttp:               "hour": 0,
04-29 12:47:29.832 30172-30188/? D/OkHttp:               "minute": 0
04-29 12:47:29.832 30172-30188/? D/OkHttp:             },
04-29 12:47:29.832 30172-30188/? D/OkHttp:             "closingTime": {
04-29 12:47:29.832 30172-30188/? D/OkHttp:               "hour": 0,
04-29 12:47:29.833 30172-30188/? D/OkHttp:               "minute": 0
04-29 12:47:29.833 30172-30188/? D/OkHttp:             },
04-29 12:47:29.833 30172-30188/? D/OkHttp:             "closed": false
04-29 12:47:29.833 30172-30188/? D/OkHttp:           },
04-29 12:47:29.833 30172-30188/? D/OkHttp:           {
04-29 12:47:29.833 30172-30188/? D/OkHttp:             "openingTime": {
04-29 12:47:29.833 30172-30188/? D/OkHttp:               "hour": 0,
04-29 12:47:29.833 30172-30188/? D/OkHttp:               "minute": 0
04-29 12:47:29.834 30172-30188/? D/OkHttp:             },
04-29 12:47:29.834 30172-30188/? D/OkHttp:             "closingTime": {
04-29 12:47:29.834 30172-30188/? D/OkHttp:               "hour": 0,
04-29 12:47:29.834 30172-30188/? D/OkHttp:               "minute": 0
04-29 12:47:29.835 30172-30188/? D/OkHttp:             },
04-29 12:47:29.835 30172-30188/? D/OkHttp:             "closed": false
04-29 12:47:29.835 30172-30188/? D/OkHttp:           },
04-29 12:47:29.835 30172-30188/? D/OkHttp:           {
04-29 12:47:29.835 30172-30188/? D/OkHttp:             "openingTime": {
04-29 12:47:29.835 30172-30188/? D/OkHttp:               "hour": 0,
04-29 12:47:29.835 30172-30188/? D/OkHttp:               "minute": 0
04-29 12:47:29.835 30172-30188/? D/OkHttp:             },
04-29 12:47:29.835 30172-30188/? D/OkHttp:             "closingTime": {
04-29 12:47:29.835 30172-30188/? D/OkHttp:               "hour": 0,
04-29 12:47:29.835 30172-30188/? D/OkHttp:               "minute": 0
04-29 12:47:29.835 30172-30188/? D/OkHttp:             },
04-29 12:47:29.835 30172-30188/? D/OkHttp:             "closed": false
04-29 12:47:29.836 30172-30188/? D/OkHttp:           },
04-29 12:47:29.836 30172-30188/? D/OkHttp:           {
04-29 12:47:29.836 30172-30188/? D/OkHttp:             "openingTime": {
04-29 12:47:29.836 30172-30188/? D/OkHttp:               "hour": 0,
04-29 12:47:29.836 30172-30188/? D/OkHttp:               "minute": 0
04-29 12:47:29.836 30172-30188/? D/OkHttp:             },
04-29 12:47:29.836 30172-30188/? D/OkHttp:             "closingTime": {
04-29 12:47:29.836 30172-30188/? D/OkHttp:               "hour": 0,
04-29 12:47:29.836 30172-30188/? D/OkHttp:               "minute": 0
04-29 12:47:29.836 30172-30188/? D/OkHttp:             },
04-29 12:47:29.836 30172-30188/? D/OkHttp:             "closed": false
04-29 12:47:29.836 30172-30188/? D/OkHttp:           },
04-29 12:47:29.836 30172-30188/? D/OkHttp:           {
04-29 12:47:29.837 30172-30188/? D/OkHttp:             "openingTime": {
04-29 12:47:29.837 30172-30188/? D/OkHttp:               "hour": 0,
04-29 12:47:29.837 30172-30188/? D/OkHttp:               "minute": 0
04-29 12:47:29.837 30172-30188/? D/OkHttp:             },
04-29 12:47:29.837 30172-30188/? D/OkHttp:             "closingTime": {
04-29 12:47:29.837 30172-30188/? D/OkHttp:               "hour": 0,
04-29 12:47:29.837 30172-30188/? D/OkHttp:               "minute": 0
04-29 12:47:29.837 30172-30188/? D/OkHttp:             },
04-29 12:47:29.837 30172-30188/? D/OkHttp:             "closed": false
04-29 12:47:29.837 30172-30188/? D/OkHttp:           },
04-29 12:47:29.837 30172-30188/? D/OkHttp:           {
04-29 12:47:29.837 30172-30188/? D/OkHttp:             "openingTime": {
04-29 12:47:29.837 30172-30188/? D/OkHttp:               "hour": 0,
04-29 12:47:29.837 30172-30188/? D/OkHttp:               "minute": 0
04-29 12:47:29.838 30172-30188/? D/OkHttp:             },
04-29 12:47:29.838 30172-30188/? D/OkHttp:             "closingTime": {
04-29 12:47:29.838 30172-30188/? D/OkHttp:               "hour": 0,
04-29 12:47:29.838 30172-30188/? D/OkHttp:               "minute": 0
04-29 12:47:29.838 30172-30188/? D/OkHttp:             },
04-29 12:47:29.838 30172-30188/? D/OkHttp:             "closed": false
04-29 12:47:29.839 30172-30188/? D/OkHttp:           },
04-29 12:47:29.839 30172-30188/? D/OkHttp:           {
04-29 12:47:29.839 30172-30188/? D/OkHttp:             "openingTime": {
04-29 12:47:29.840 30172-30188/? D/OkHttp:               "hour": 0,
04-29 12:47:29.840 30172-30188/? D/OkHttp:               "minute": 0
04-29 12:47:29.840 30172-30188/? D/OkHttp:             },
04-29 12:47:29.840 30172-30188/? D/OkHttp:             "closingTime": {
04-29 12:47:29.840 30172-30188/? D/OkHttp:               "hour": 0,
04-29 12:47:29.840 30172-30188/? D/OkHttp:               "minute": 0
04-29 12:47:29.841 30172-30188/? D/OkHttp:             },
04-29 12:47:29.841 30172-30188/? D/OkHttp:             "closed": false
04-29 12:47:29.841 30172-30188/? D/OkHttp:           }
04-29 12:47:29.841 30172-30188/? D/OkHttp:         ],
04-29 12:47:29.841 30172-30188/? D/OkHttp:         "specialDayOpeningList": []
04-29 12:47:29.841 30172-30188/? D/OkHttp:       }
04-29 12:47:29.841 30172-30188/? D/OkHttp:     },*/
    public List<Store> getStores() {
        //if(data != null)
        //    return data;
        //else if(data == null)
        //    data = new ArrayList<>();

        if(stores != null)
            return stores;
        else if(stores == null)
            stores = new ArrayList<>();
        return stores;
        //return data;
    }
}
