package parknshop.parknshopapp.Model;

import android.content.Context;

import java.io.Serializable;

import parknshop.parknshopapp.R;

/**
 * Created by panther945 on 2015/6/24.
 */
public class AddressData {
    private AddressForm addressForm;

    public AddressData() {

    }

    public AddressForm getAddressForm() {
        if(addressForm == null)
            addressForm = new AddressForm();

        return addressForm;
    }

    public void setAddressForm(AddressForm addressForm) {
        this.addressForm = addressForm;
    }

    public AddressData(String firstName, String mobile, String regionCode, String districtCode, String streetName,
                       String phoneArea, String phone, String phoneEx) {
        addressForm = new AddressForm(firstName, mobile, regionCode, districtCode, streetName, phoneArea, phone, phoneEx);
    }

    /*"addressForm": {
						"addressBookName": "k0315",
						"titleCode": "mr",
						"firstName": "kKkK0315",
						"lastName": "k0315",
						"companyName": "k0315",
						"mobile": "98745636",
						"phone": "98745636",
						"room": "k0315",
						"floor": "k0315",
						"line3": "line30315",
						"alley": "k0315",
						"lane": "lane0315",
						"streetNumber": "strno0315",
						"streetName": "strname0315",
						"town": "kowloon",
						"district": "lamtin",
						"shippingAddress": true
	}*/

    /* [13/4/2016上午11:55:31] Martin So: Line3 == block
       [13/4/2016上午11:55:47] Martin So: Alley == building
       [13/4/2016上午11:56:04] Martin So: Lane == Estate Name */

    public class AddressForm extends ErrorCode implements Serializable{

        public String generateTitle() {
            return getTitle() + " " + getFirstName() + " " + getLastName();
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String generateAddress(Context context) {
            return getCompanyName() + (getCompanyName() .length() > 0 ? ", " : "") +
                    context.getResources().getString(R.string.room).replace("%s", getRoom()) + ", " +
                    context.getResources().getString(R.string.floor).replace("%s", getFloor()) +  ", " +
                    context.getResources().getString(R.string.block).replace("%s", getLine3()) + ", " +
                    getAlley() + (getAlley().length() > 0 ? ", " : "") +
                    getStreetName() + (getStreetName().length() > 0 ? ", " : "") +
                    getRegionText();
        }

        public String generateHomeAddress() {
            return  getRoom() + ", \n" +
                    getFloor() + "/F , \n" +
                    getLine3() + ", \n" +
                    getStreetNumber() + " " +getStreetName() + ", \n" +
                    getDistrict() + ", " + getRegion();
        }

        public String getAddressBookName() {
            if(addressBookName == null)
                return "";
            return addressBookName;
        }

        public void setAddressBookName(String addressBookName) {
            this.addressBookName = addressBookName;
        }

        public String getTitleCode() {
            if(titleCode == null)
                return "";
            return titleCode;
        }

        public void setTitleCode(String titleCode) {
            this.titleCode = titleCode;
        }

        public String getFirstName() {
            if(firstName == null)
                return "";
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            if(lastName == null)
                return "";
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getCompanyName() {
            if(companyName == null)
                return "";
            return companyName;
        }

        public String getLine2() {
            if(line2 == null)
                return "";
            return line2;
        }

        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }

        public String getMobile() {
            if(mobile == null)
                return "";
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getPhone() {
            if(phone == null)
                return "";
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getRoom() {
            if(room == null)
                return "";
            return room;
        }

        public void setRoom(String room) {
            this.room = room;
        }

        public String getFloor() {
            if(floor == null)
                return "";
            return floor;
        }

        public void setFloor(String floor) {
            this.floor = floor;
        }

        public String getLine3() {
            if(line3 == null)
                return "";
            return line3;
        }

        public void setLine3(String line3) {
            this.line3 = line3;
        }

        public String getAlley() {
            if(alley == null)
                return "";
            return alley;
        }

        public void setAlley(String alley) {
            this.alley = alley;
        }

        public String getLane() {
            if(lane == null)
                return "";
            return lane;
        }

        public void setLane(String lane) {
            this.lane = lane;
        }

        public String getStreetNumber() {
            if(streetNumber == null)
                return "";
            return streetNumber;
        }

        public void setStreetNumber(String streetNumber) {
            this.streetNumber = streetNumber;
        }

        public String getStreetName() {
            if(streetName == null)
                return "";
            return streetName;
        }

        public void setStreetName(String streetName) {
            this.streetName = streetName;
        }

        public String getTown() {
            if(town == null)
                return "";
            return town;
        }

        public void setTown(String town) {
            this.town = town;
        }

        public String getDistrict() {
            if(district == null)
                return "";
            return district;
        }

        public void setDistrict(String district) {
            this.district = district;
        }

        public boolean getShippingAddress() {
            return shippingAddress;
        }

        public void setShippingAddress(boolean shippingAddress) {
            this.shippingAddress = shippingAddress;
        }

        public void setBillingAddress(boolean billingAddress) {
            this.billingAddress = billingAddress;
        }

        public boolean getBillingAddress() {
            return this.billingAddress;
        }
        public void setId(String id) {
            this.id = id;
        }

        public String getId() {
            return this.id;
        }


        public String addressBookName;
        private String title;
        private String id;
        private String titleCode;
        private String firstName;
        private String lastName;
        private String companyName;
        private String mobile;
        private String phone;
        private String room;
        private String floor;
        private String line3;
        private String alley;
        private String lane;
        private String streetNumber;
        private String streetName;
        private String town;
        private String district;
        private boolean shippingAddress;
        private boolean billingAddress;
        private String line2;

        private Country country;
        private String line1;
        private String region;
        private String regionText;
        private String email;
        private boolean contactAddress;
        private boolean defaultAddress;
        private String mobilePhone;
        private String districtText;
        private String isSpecialAddress;
        private String block;

        private String regionCode;
        private String districtCode;
        private String phone2;
        private String landLine;
        private String extensionNo;

        public boolean isShippingAddress() {
            return shippingAddress;
        }

        public void setContactAddress(boolean contactAddress) {
            this.contactAddress = contactAddress;
        }

        public void setCountry(Country country) {
            this.country = country;
        }

        public void setDistrictCode(String districtCode) {
            this.districtCode = districtCode;
        }

        public void setDistrictText(String districtText) {
            this.districtText = districtText;
        }

        public void setLine2(String line2) {
            this.line2 = line2;
        }

        public void setMobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
        }

        public void setPhone2(String phone2) {
            this.phone2 = phone2;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public void setRegionCode(String regionCode) {
            this.regionCode = regionCode;
        }

        public void setExtensionNo(String extensionNo) {
            this.extensionNo = extensionNo;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setDefaultAddress(boolean defaultAddress) {
            this.defaultAddress = defaultAddress;
        }

        public void setLine1(String line1) {
            this.line1 = line1;
        }

        public void setBlock(String block) {
            this.block = block;
        }


        public boolean isDefaultAddress() {
            return defaultAddress;
        }

        public Country getCountry() {
            return country;
        }

        public class Country {
            public String isocode;
            public String name;

            public String getIsocode() {
                return isocode;
            }

            public String getName() {
                return name;
            }
        }

        public String getLine1() {
            if(line1 == null)
                return "";
            return line1;
        }

        public String getRegion() {
            return region;
        }

        public String getRegionText() {
            return regionText;
        }

        public String getEmail() {
            if(email == null)
                return "";
            return email;
        }

        public boolean isContactAddress() {
            return contactAddress;
        }

        public String getMobilePhone() {
            if(mobilePhone == null)
                return "";
            return mobilePhone;
        }

        public String getDistrictText() {
            return districtText;
        }

        public String getIsSpecialAddress() {
            return isSpecialAddress;
        }

        public String getBlock() {
            if(block == null)
                return "";
            return block;
        }

        public AddressForm() {

        }

        public AddressForm(String firstName, String mobile, String regionCode, String districtCode,
                           String streetName, String phoneArea, String phone, String phoneEx) {
            this.firstName = firstName;
            this.mobile = mobile;
            this.regionCode = regionCode;
            this.districtCode = districtCode;
            this.streetName = streetName;
            this.phone2 = phoneArea;
            this.landLine = phone;
            this.extensionNo = phoneEx;
        }
    }
}
