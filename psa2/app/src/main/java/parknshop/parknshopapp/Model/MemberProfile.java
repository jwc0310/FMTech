package parknshop.parknshopapp.Model;

import java.util.ArrayList;

/**
 * Created by chrisyu on 17/3/16.
 */

public class MemberProfile extends ErrorCode {
    public String uid;
    public String name;
    public DefaultAddress defaultAddress = new DefaultAddress();
    public String titleCode;

    public boolean hasSufficientInformation() {
        if(getFirstName() == null || getFirstName().length() == 0)
            return false;
        if(getLastName() == null || getLastName().length() == 0)
            return false;
        if(getEmail() == null || getEmail().length() == 0)
            return false;
        if(getDefaultAddress() == null || getDefaultAddress().phone == null || getDefaultAddress().phone.length() == 0)
            return false;

        return true;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DefaultAddress getDefaultAddress() {
        return defaultAddress;
    }

    public void setDefaultAddress(DefaultAddress defaultAddress) {
        this.defaultAddress = defaultAddress;
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

    public _Currency getCurrency() {
        return currency;
    }

    public void setCurrency(_Currency currency) {
        this.currency = currency;
    }

    public _Language getLanguage() {
        return language;
    }

    public void setLanguage(_Language language) {
        this.language = language;
    }

    public String getDisplayUid() {
        return displayUid;
    }

    public void setDisplayUid(String displayUid) {
        this.displayUid = displayUid;
    }

    public _ContactAddress getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(_ContactAddress contactAddress) {
        this.contactAddress = contactAddress;
    }

    public boolean isSmsFlag() {
        return smsFlag;
    }

    public void setSmsFlag(boolean smsFlag) {
        this.smsFlag = smsFlag;
    }

    public boolean isEmailFlag() {
        return emailFlag;
    }

    public void setEmailFlag(boolean emailFlag) {
        this.emailFlag = emailFlag;
    }

    public boolean isMailFlag() {
        return mailFlag;
    }

    public void setMailFlag(boolean mailFlag) {
        this.mailFlag = mailFlag;
    }

    public boolean isOthersFlag() {
        return othersFlag;
    }

    public void setOthersFlag(boolean othersFlag) {
        this.othersFlag = othersFlag;
    }

    public boolean isLoyaltyCustomer() {
        return loyaltyCustomer;
    }

    public void setLoyaltyCustomer(boolean loyaltyCustomer) {
        this.loyaltyCustomer = loyaltyCustomer;
    }

    public String[] getFavBrands() {
        return favBrands;
    }

    public void setFavBrands(String[] favBrands) {
        this.favBrands = favBrands;
    }

    public String[] getFavouriteHobbies() {
        return favouriteHobbies;
    }

    public void setFavouriteHobbies(String[] favouriteHobbies) {
        this.favouriteHobbies = favouriteHobbies;
    }

    public MaritalStatus getMaritalStatus() {
        if(maritalStatus == null)
            maritalStatus = new MaritalStatus();
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public ChildrenNumber getChildrenNumber() {
        if(childrenNumber == null)
            childrenNumber = new ChildrenNumber();
        return childrenNumber;
    }

    public void setChildrenNumber(ChildrenNumber childrenNumber) {
        this.childrenNumber = childrenNumber;
    }

    public String[] getChildren() {
        return children;
    }

    public void setChildren(String[] children) {
        this.children = children;
    }

    public String getIgcNickname() {
        return igcNickname;
    }

    public void setIgcNickname(String igcNickname) {
        this.igcNickname = igcNickname;
    }

    public boolean isIgcReceivePromotionFlag() {
        return igcReceivePromotionFlag;
    }

    public void setIgcReceivePromotionFlag(boolean igcReceivePromotionFlag) {
        this.igcReceivePromotionFlag = igcReceivePromotionFlag;
    }

    public boolean isIgcReceivePartnerPromoFlag() {
        return igcReceivePartnerPromoFlag;
    }

    public void setIgcReceivePartnerPromoFlag(boolean igcReceivePartnerPromoFlag) {
        this.igcReceivePartnerPromoFlag = igcReceivePartnerPromoFlag;
    }

    public _LanguagePreference getLanguagePreference() {
        return languagePreference;
    }

    public void setLanguagePreference(_LanguagePreference languagePreference) {
        this.languagePreference = languagePreference;
    }

    public boolean isIgcPet() {
        return igcPet;
    }

    public void setIgcPet(boolean igcPet) {
        this.igcPet = igcPet;
    }

    public boolean isIgcPetDog() {
        return igcPetDog;
    }

    public void setIgcPetDog(boolean igcPetDog) {
        this.igcPetDog = igcPetDog;
    }

    public String getIgcMainCardNumber() {
        return igcMainCardNumber;
    }

    public void setIgcMainCardNumber(String igcMainCardNumber) {
        this.igcMainCardNumber = igcMainCardNumber;
    }

    public _IgcContact getIgcContact() {
        return igcContact;
    }

    public void setIgcContact(_IgcContact igcContact) {
        this.igcContact = igcContact;
    }

    public PersonalIncome getPersonalIncome() {
        return personalIncome;
    }

    public void setPersonalIncome(PersonalIncome personalIncome) {
        this.personalIncome = personalIncome;
    }

    public boolean isEmailChanged() {
        return emailChanged;
    }

    public void setEmailChanged(boolean emailChanged) {
        this.emailChanged = emailChanged;
    }

    public boolean isiMember() {
        return iMember;
    }

    public void setiMember(boolean iMember) {
        this.iMember = iMember;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String[] getChoosenShopReasons() {
        return choosenShopReasons;
    }

    public void setChoosenShopReasons(String[] choosenShopReasons) {
        this.choosenShopReasons = choosenShopReasons;
    }

    public String[] getChoosenWatsonsCardChannels() {
        return choosenWatsonsCardChannels;
    }

    public void setChoosenWatsonsCardChannels(String[] choosenWatsonsCardChannels) {
        this.choosenWatsonsCardChannels = choosenWatsonsCardChannels;
    }

    public String[] getChoosenWatsonsCardSignupReasons() {
        return choosenWatsonsCardSignupReasons;
    }

    public void setChoosenWatsonsCardSignupReasons(String[] choosenWatsonsCardSignupReasons) {
        this.choosenWatsonsCardSignupReasons = choosenWatsonsCardSignupReasons;
    }

    public String[] getChoosenWatsonsCardInformChannels() {
        return choosenWatsonsCardInformChannels;
    }

    public void setChoosenWatsonsCardInformChannels(String[] choosenWatsonsCardInformChannels) {
        this.choosenWatsonsCardInformChannels = choosenWatsonsCardInformChannels;
    }

    public String getAssociatedMemberNumber() {
        return associatedMemberNumber;
    }

    public void setAssociatedMemberNumber(String associatedMemberNumber) {
        this.associatedMemberNumber = associatedMemberNumber;
    }

    public String[] getHealthBeautyInterests() {
        return healthBeautyInterests;
    }

    public void setHealthBeautyInterests(String[] healthBeautyInterests) {
        this.healthBeautyInterests = healthBeautyInterests;
    }

    public String[] getProductInterests() {
        return productInterests;
    }

    public void setProductInterests(String[] productInterests) {
        this.productInterests = productInterests;
    }

    public String getPoints() {
        return points;
    }

    public String getPointsExpiryDate() {
        return pointsExpiryDate;
    }

    public boolean isPnsTeleShopperFlag() {
        return pnsTeleShopperFlag;
    }

    public void setPnsTeleShopperFlag(boolean pnsTeleShopperFlag) {
        this.pnsTeleShopperFlag = pnsTeleShopperFlag;
    }

    public boolean isPnsCorporateFlag() {
        return pnsCorporateFlag;
    }

    public void setPnsCorporateFlag(boolean pnsCorporateFlag) {
        this.pnsCorporateFlag = pnsCorporateFlag;
    }

    public boolean isPnsVipFlag() {
        return pnsVipFlag;
    }

    public void setPnsVipFlag(boolean pnsVipFlag) {
        this.pnsVipFlag = pnsVipFlag;
    }

    public _NationalityType getNationalityType() {
        return NationalityType;
    }

    public void setNationalityType(_NationalityType nationalityType) {
        NationalityType = nationalityType;
    }

    public ArrayList<_DeliveryAddresses> getDeliveryAddresses() {
        return deliveryAddresses;
    }

    public void setDeliveryAddresses(ArrayList<_DeliveryAddresses> deliveryAddresses) {
        this.deliveryAddresses = deliveryAddresses;
    }

    public String getCorrespondingEmail() {
        return correspondingEmail;
    }

    public void setCorrespondingEmail(String correspondingEmail) {
        this.correspondingEmail = correspondingEmail;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public _DistrictData getDistrictData() {
        return districtData;
    }

    public void setDistrictData(_DistrictData districtData) {
        this.districtData = districtData;
    }

    public String getMemberNumber() {
        return memberNumber;
    }

    public void setMemberNumber(String memberNumber) {
        this.memberNumber = memberNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public boolean isNeedCartMerge() {
        return needCartMerge;
    }

    public void setNeedCartMerge(boolean needCartMerge) {
        this.needCartMerge = needCartMerge;
    }

    public String getMergeCardId() {
        return mergeCardId;
    }

    public void setMergeCardId(String mergeCardId) {
        this.mergeCardId = mergeCardId;
    }

    public String getPk() {
        return pk;
    }

    public void setPk(String pk) {
        this.pk = pk;
    }

    public String getBackofficeID() {
        return backofficeID;
    }

    public void setBackofficeID(String backofficeID) {
        this.backofficeID = backofficeID;
    }

    public boolean isVipFlag() {
        return vipFlag;
    }

    public void setVipFlag(boolean vipFlag) {
        this.vipFlag = vipFlag;
    }

    public boolean isVmFlag() {
        return vmFlag;
    }

    public void setVmFlag(boolean vmFlag) {
        this.vmFlag = vmFlag;
    }

    public boolean isVrFlag() {
        return vrFlag;
    }

    public void setVrFlag(boolean vrFlag) {
        this.vrFlag = vrFlag;
    }

    public boolean isVncFlag() {
        return vncFlag;
    }

    public void setVncFlag(boolean vncFlag) {
        this.vncFlag = vncFlag;
    }

    public boolean iseMailVerifyFlag() {
        return eMailVerifyFlag;
    }

    public void seteMailVerifyFlag(boolean eMailVerifyFlag) {
        this.eMailVerifyFlag = eMailVerifyFlag;
    }

    public boolean isPnsPaymentFlag() {
        return pnsPaymentFlag;
    }

    public void setPnsPaymentFlag(boolean pnsPaymentFlag) {
        this.pnsPaymentFlag = pnsPaymentFlag;
    }

    public int getLoginTrialCount() {
        return loginTrialCount;
    }

    public void setLoginTrialCount(int loginTrialCount) {
        this.loginTrialCount = loginTrialCount;
    }

    public boolean isTosRegisterFlag() {
        return tosRegisterFlag;
    }

    public void setTosRegisterFlag(boolean tosRegisterFlag) {
        this.tosRegisterFlag = tosRegisterFlag;
    }

    public boolean isFirstTimeEmailVerifyFlag() {
        return isFirstTimeEmailVerifyFlag;
    }

    public void setFirstTimeEmailVerifyFlag(boolean firstTimeEmailVerifyFlag) {
        isFirstTimeEmailVerifyFlag = firstTimeEmailVerifyFlag;
    }

    public ArrayList<_PnsMobileTokens> getPnsMobileTokens() {
        return pnsMobileTokens;
    }

    public void setPnsMobileTokens(ArrayList<_PnsMobileTokens> pnsMobileTokens) {
        this.pnsMobileTokens = pnsMobileTokens;
    }

    public String getSiebelCardNumber() {
        return siebelCardNumber;
    }

    public void setSiebelCardNumber(String siebelCardNumber) {
        this.siebelCardNumber = siebelCardNumber;
    }

    public static String getMALE() {
        return MALE;
    }

    public static String getFEMALE() {
        return FEMALE;
    }

    public String firstName = "";
    public String lastName = "";
    public _Currency currency;
    public _Language language;
    public String displayUid;
    public _ContactAddress contactAddress;
    public boolean smsFlag;
    public boolean emailFlag;
    public boolean mailFlag;
    public boolean othersFlag;
    public boolean loyaltyCustomer;
    public String[] favBrands;
    public String[] favouriteHobbies;
    public MaritalStatus maritalStatus;
    public ChildrenNumber childrenNumber;
    public String[] children;
    public String igcNickname;
    public boolean igcReceivePromotionFlag;
    public boolean igcReceivePartnerPromoFlag;
    public _LanguagePreference languagePreference;
    public boolean igcPet;
    public boolean igcPetDog;
    public String igcMainCardNumber;
    public _IgcContact igcContact;
    public PersonalIncome personalIncome;
    public boolean emailChanged;
    public boolean iMember;
    public String token;
    public String[] choosenShopReasons;
    public String[] choosenWatsonsCardChannels;
    public String[] choosenWatsonsCardSignupReasons;
    public String[] choosenWatsonsCardInformChannels;
    public String associatedMemberNumber;
    public String[] healthBeautyInterests;
    public String[] productInterests;
    public String points;
    public String pointsExpiryDate;
    public boolean pnsTeleShopperFlag;
    public boolean pnsCorporateFlag;
    public boolean pnsVipFlag;
    public _NationalityType NationalityType;
    public ArrayList<_DeliveryAddresses> deliveryAddresses;
    public String correspondingEmail;
    public String customerType;
    public String accountType;
    public boolean active;
    public String email = "";
    public _DistrictData districtData;
    public String memberNumber;
    public String cardNumber;
    public boolean needCartMerge;
    public String mergeCardId;
    public String pk;
    public String backofficeID;
    public boolean vipFlag;
    public boolean vmFlag;
    public boolean vrFlag;
    public boolean vncFlag;
    public boolean eMailVerifyFlag;
    public boolean pnsPaymentFlag;
    public boolean allowCODPayment;
    public int loginTrialCount;
    public boolean tosRegisterFlag;
    public boolean isFirstTimeEmailVerifyFlag;
    public ArrayList<_PnsMobileTokens> pnsMobileTokens;
    public String siebelCardNumber;


    public boolean isAllowCODPayment() {
        return allowCODPayment;
    }

    public class DefaultAddress {
        public String generateTitle() {
            return getTitle() + " " + getFirstName() + " " + getLastName();
        }

        public String generateAddress() {
            return getCompanyName() + ", \n" +
                    "Room " + getRoom() + ", \n" +
                    getFloor() + "/F , \n" +
                    "Block B" + getBlock() + ", \n" +
                    getStreetName() + ", \n" +
                    getRegion().toUpperCase();
        }

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
            if(phone == null)
                phone = "";
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

        public boolean isSpecialAddress() {
            return isSpecialAddress;
        }

        public void setSpecialAddress(boolean specialAddress) {
            isSpecialAddress = specialAddress;
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

        public String getRegionText() {
            return regionText;
        }

        public String id;
        public String title;
        public String titleCode;
        public String firstName;
        public String lastName;
        public String companyName;
        public String line1;
        public String region;
        public String phone = "";
        public String email;
        public boolean shippingAddress;
        public boolean contactAddress;
        public String streetName;
        public String streetNumber;
        public String floor;
        public String mobilePhone;
        public String district;
        public String districtCode;
        public String districtText;
        public String regionText;
        public String alley;
        public String lane;
        public String room;
        public boolean isSpecialAddress;
        public String line3;
        public String addressBookName;
        public String block;
    }

    public class _Currency {
        public String isocode;
        public String name;
        public boolean active;
        public String symbol;
    }

    public class _Language {
        public String isocode;
        public String nativeName;
        public boolean active;
    }

    public class _ContactAddress {
        public String id;
        public String title;

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

        public String getLine1() {
            return line1;
        }

        public void setLine1(String line1) {
            this.line1 = line1;
        }

        public String getLine2() {
            return line2;
        }

        public void setLine2(String line2) {
            this.line2 = line2;
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

        public _Country getCountry() {
            return country;
        }

        public void setCountry(_Country country) {
            this.country = country;
        }

        public String getShippingAddress() {
            return shippingAddress;
        }

        public void setShippingAddress(String shippingAddress) {
            this.shippingAddress = shippingAddress;
        }

        public String getContactAddress() {
            return contactAddress;
        }

        public void setContactAddress(String contactAddress) {
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

        public String getDayOfBirth() {
            return dayOfBirth;
        }

        public void setDayOfBirth(String dayOfBirth) {
            this.dayOfBirth = dayOfBirth;
        }

        public String getMonthOfBirth() {
            return monthOfBirth;
        }

        public void setMonthOfBirth(String monthOfBirth) {
            this.monthOfBirth = monthOfBirth;
        }

        public String getYearOfBirth() {
            return yearOfBirth;
        }

        public void setYearOfBirth(String yearOfBirth) {
            this.yearOfBirth = yearOfBirth;
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

        public boolean isSpecialAddress() {
            return isSpecialAddress;
        }

        public void setSpecialAddress(boolean specialAddress) {
            isSpecialAddress = specialAddress;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getLine3() {
            return line3;
        }

        public void setLine3(String line3) {
            this.line3 = line3;
        }

        public String getBlock() {
            return block;
        }

        public void setBlock(String block) {
            this.block = block;
        }

        public String titleCode;
        public String firstName;
        public String lastName;
        public String line1;
        public String line2;
        public String region;
        public String phone;
        public String email;
        public _Country country;
        public class _Country{
            public String isocode;
            public String name;
        }
        public String shippingAddress;
        public String contactAddress;
        public String streetName;
        public String streetNumber;
        public String floor;
        public String mobilePhone;
        public String dayOfBirth;
        public String monthOfBirth;
        public String yearOfBirth;
        public String district;
        public String districtCode;
        public String districtText;
        public String alley;
        public String lane;
        public String room;
        public boolean isSpecialAddress;
        public String gender;
        public String line3;
        public String block;
    }

    public class MaritalStatus{
        public String code;
        public String name;

        public String getName() {
            if(name == null)
                name = "";
            return name;
        }
    }

    public class ChildrenNumber{
        public String code;
        public String name;

        public String getName() {
            if(name == null)
                name = "";
            return name;
        }
    }

    public class _LanguagePreference{
        public String code;
        public String name;
    }

    public class _IgcContact{
        public String education;
        public String monthlyIncome;
        public boolean receivePromotionFlag;
        public String preferLanguage;
        public boolean blackListSMS;
        public boolean blackListEmail;
        public boolean blackListDM;
    }

    public class _NationalityType{
        public String code;
        public String name;
    }

    public class _DeliveryAddresses{
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

        public String getLine1() {
            return line1;
        }

        public void setLine1(String line1) {
            this.line1 = line1;
        }

        public String getLine2() {
            return line2;
        }

        public void setLine2(String line2) {
            this.line2 = line2;
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

        public _Country getCountry() {
            return country;
        }

        public void setCountry(_Country country) {
            this.country = country;
        }

        public String getShippingAddress() {
            return shippingAddress;
        }

        public void setShippingAddress(String shippingAddress) {
            this.shippingAddress = shippingAddress;
        }

        public String getContactAddress() {
            return contactAddress;
        }

        public void setContactAddress(String contactAddress) {
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

        public String getDayOfBirth() {
            return dayOfBirth;
        }

        public void setDayOfBirth(String dayOfBirth) {
            this.dayOfBirth = dayOfBirth;
        }

        public String getMonthOfBirth() {
            return monthOfBirth;
        }

        public void setMonthOfBirth(String monthOfBirth) {
            this.monthOfBirth = monthOfBirth;
        }

        public String getYearOfBirth() {
            return yearOfBirth;
        }

        public void setYearOfBirth(String yearOfBirth) {
            this.yearOfBirth = yearOfBirth;
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

        public boolean isSpecialAddress() {
            return isSpecialAddress;
        }

        public void setSpecialAddress(boolean specialAddress) {
            isSpecialAddress = specialAddress;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getLine3() {
            return line3;
        }

        public void setLine3(String line3) {
            this.line3 = line3;
        }

        public String getBlock() {
            return block;
        }

        public void setBlock(String block) {
            this.block = block;
        }

        public String id;
        public String title;
        public String titleCode;
        public String firstName;
        public String lastName;
        public String line1;
        public String line2;
        public String region;
        public String phone;
        public String email;
        public _Country country;
        public class _Country{
            public String isocode;
            public String name;
        }
        public String shippingAddress;
        public String contactAddress;
        public String streetName;
        public String streetNumber;
        public String floor;
        public String mobilePhone;
        public String dayOfBirth;
        public String monthOfBirth;
        public String yearOfBirth;
        public String district;
        public String districtCode;
        public String districtText;
        public String alley;
        public String lane;
        public String room;
        public boolean isSpecialAddress;
        public String gender;
        public String line3;
        public String block;
    }

    public class _DistrictData{
        public String code;
        public String postCode;
        public String name;
        public String pickingCenterCode;
        public String fulfillmentType;
    }

    public class _PnsMobileTokens{
        public String token;
        public String expireDate;
    }

    public class PersonalIncome{
        public String code;
        public String name;
    }

    public static final String MALE = "MALE";
    public static final String FEMALE = "FEMALE";
    public boolean isMale() {
        return getGender() != null && contactAddress.gender.equals(MALE);
    }

    public String getGender() {
        if (contactAddress != null && contactAddress.gender != null) {
            return contactAddress.gender;
        }
        return null;
    }
}
