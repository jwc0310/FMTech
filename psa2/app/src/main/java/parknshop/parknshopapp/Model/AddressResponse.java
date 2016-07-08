package parknshop.parknshopapp.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by panther945 on 2015/6/23.
 */
public class AddressResponse {
    private List<Address> addresses = new ArrayList<>();

    public List<Address> getAddresses() {
        return addresses;
    }

    public int size() {
        return addresses != null ? addresses.size() : 0;
    }

    public String getName(int index) {
        try {
            return addresses != null ? addresses.get(index).firstName : null;
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        return null;
    }

    public String getStreetName(int index) {
        try {
            return addresses != null ? addresses.get(index).streetName : null;
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        return null;
    }

    public String getDistrictCode(int index) {
        try {
            return addresses != null ? addresses.get(index).districtCode : null;
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        return null;
    }

//    public String getRegionCode(int index) {
//        try {
//            return addresses != null ? addresses.get(index).regionCode : null;
//        } catch (IndexOutOfBoundsException e) {
//            e.printStackTrace();
//        }
//
//        return null;
//    }

    public String getMobile(int index) {
        try {
            return addresses != null ? addresses.get(index).mobilePhone : null;
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        return null;
    }

//    public String getPhoneNumber(int index) {
//        try {
//            Address address = addresses.get(index);
//            return addresses != null ? Utility.getPhoneNumber(address.phone2, address.phone, address.extension) : null;
//        } catch (IndexOutOfBoundsException e) {
//            e.printStackTrace();
//        }
//
//        return null;
//    }
//
//    public String getPhoneArea(int index) {
//        try {
//            Address address = addresses.get(index);
//            return address != null ? address.phone2 : null;
//        } catch (IndexOutOfBoundsException e) {
//            e.printStackTrace();
//        }
//
//        return null;
//    }

    public String getPhone(int index) {
        try {
            Address address = addresses.get(index);
            return address != null ? address.phone : null;
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        return null;
    }

    //    public String getPhoneEx(int index) {
//        try {
//            Address address = addresses.get(index);
//            return address != null ? address.extension : null;
//        } catch (IndexOutOfBoundsException e) {
//            e.printStackTrace();
//        }
//
//        return null;
//    }
    public class Address {
        private String id;
        private String title;
        private String titleCode;
        private String firstName;
        private String lastName;
        private String companyName;
        private String line1;
        private String region;
        private String phone;
        private String email;
        private boolean shippingAddress;
        private boolean contactAddress;
        private String streetName;
        private String streetNumber;
        private String floor;
        private String mobilePhone;
        private String district;
        private String districtCode;
        private String districtText;
        private String alley;
        private String lane;
        private String room;
        private String isSpecialAddress;
        private String line3;
        private String addressBookName;
        private String block;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getTitleCode() {
            return titleCode;
        }

        public void setTitleCode(String titleCode) {
            this.titleCode = titleCode;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getCompanyName() {
            return companyName;
        }

        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }

        public String getLine1() {
            return line1;
        }

        public void setLine1(String line1) {
            this.line1 = line1;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public boolean isShippingAddress() {
            return shippingAddress;
        }

        public void setShippingAddress(boolean shippingAddress) {
            this.shippingAddress = shippingAddress;
        }

        public boolean isContactAddress() {
            return contactAddress;
        }

        public void setContactAddress(boolean contactAddress) {
            this.contactAddress = contactAddress;
        }

        public String getStreetName() {
            return streetName;
        }

        public void setStreetName(String streetName) {
            this.streetName = streetName;
        }

        public String getStreetNumber() {
            return streetNumber;
        }

        public void setStreetNumber(String streetNumber) {
            this.streetNumber = streetNumber;
        }

        public String getFloor() {
            return floor;
        }

        public void setFloor(String floor) {
            this.floor = floor;
        }

        public String getMobilePhone() {
            return mobilePhone;
        }

        public void setMobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
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

        public String getDistrictText() {
            return districtText;
        }

        public void setDistrictText(String districtText) {
            this.districtText = districtText;
        }

        public String getAlley() {
            return alley;
        }

        public void setAlley(String alley) {
            this.alley = alley;
        }

        public String getLane() {
            return lane;
        }

        public void setLane(String lane) {
            this.lane = lane;
        }

        public String getRoom() {
            return room;
        }

        public void setRoom(String room) {
            this.room = room;
        }

        public String getIsSpecialAddress() {
            return isSpecialAddress;
        }

        public void setIsSpecialAddress(String isSpecialAddress) {
            this.isSpecialAddress = isSpecialAddress;
        }

        public String getLine3() {
            return line3;
        }

        public void setLine3(String line3) {
            this.line3 = line3;
        }

        public String getAddressBookName() {
            return addressBookName;
        }

        public void setAddressBookName(String addressBookName) {
            this.addressBookName = addressBookName;
        }

        public String getBlock() {
            return block;
        }

        public void setBlock(String block) {
            this.block = block;
        }

    }
}
