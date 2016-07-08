package parknshop.parknshopapp.Model;

/**
 * Created by chrisyu on 17/3/16.
 */

public class RegisterForm {
    public String sendEmailFlag;
    public String title;
    public String firstName;
    public String lastName;
    public String email;
    public String oldEmail;
    public String mobile;
    public DateOfBirth dateOfBirth;
    public String city;
    public String district;
    public String postCode;
    public String streetName;
    public String building;
    public String floor;
    public String streetNumber;
    public String province;
    public String registerType;
    public String education;
    public String maritalStatus;
    public String numberOfChildren;
    public String cardNumber;
    public String smsFlag;
    public String emailFlag;
    public String mailFlag;
    public boolean isSpecialAddress;
    public boolean notRequiredPasswordFlag;
    public PhoneForm phoneForm = new PhoneForm();
    public String memberNumber;
    public String language;
    public String isOnlyExistInSiebel;
    public boolean alertImemberIfFieldDuplicate;
    public String reEnterMobile;
    public String correspondingEmail;
    public int activationCodeSentCount;
    public String iwaAssociatedMemberNumber;
    public boolean moneyBackMemberLoginSuccess;
    public String chineseName;
    public String homeBusinessNumber;
    public String room;
    public String block;
    public String estate;
    public String town;
    public String country;
    public boolean ownCar;
    public boolean ownPet;
    public boolean petCat;
    public boolean petDog;
    public boolean petOthers;
    public String customerType;
    public String[] healthBeautyInterests;
    public String[] productInterests;
    public String pwd;
    public String checkPwd;
    public String reEnterEmailAddr;
    public String nationalType;

    public void setSendEmailFlag(String sendEmailFlag) {
        this.sendEmailFlag = sendEmailFlag;
    }

    public void setSmsFlag(String smsFlag) {
        this.smsFlag = smsFlag;
    }

    public void setMailFlag(String mailFlag) {
        this.mailFlag = mailFlag;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setCheckPwd(String checkPwd) {
        this.checkPwd = checkPwd;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setReEnterEmailAddr(String reEnterEmailAddr) {
        this.reEnterEmailAddr = reEnterEmailAddr;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setPhoneForm(PhoneForm phoneForm) {
        this.phoneForm = phoneForm;
    }

    public void setEmailFlag(String emailFlag) {
        this.emailFlag = emailFlag;
    }

    public void setNationalType(String nationalType) {
        this.nationalType = nationalType;
    }

    public void setDateOfBirth(DateOfBirth dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setNumberOfChildren(String numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

    public void setRegisterType(String registerType) {
        this.registerType = registerType;
    }

//    public void setGenderForm(GenderForm genderForm) {
//        this.genderForm = genderForm;
//    }


    public String getRegisterType() {
        return registerType;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailFlag() {
        return emailFlag;
    }

    public String getReEnterEmailAddr() {
        return reEnterEmailAddr;
    }

    public String getEmail() {
        return email;
    }

    public String getSendEmailFlag() {
        return sendEmailFlag;
    }

    public String getMobile() {
        return mobile;
    }

    public String getNumberOfChildren() {
        return numberOfChildren;
    }

    public String getNationalType() {
        return nationalType;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public String getLanguage() {
        return language;
    }

    public String getCheckPwd() {
        return checkPwd;
    }

    public String getPwd() {
        return pwd;
    }

    public String getTitle() {
        return title;
    }


//    public GenderForm genderForm = new GenderForm();

    public class DateOfBirth {
        public String day;
        public String month;
        public String year;
        public boolean editable;

        public void setDay(String day) {
            this.day = day;
        }

        public void setMonth(String month) {
            this.month = month;
        }

        public void setYear(String year) {
            this.year = year;
        }
    }

    public DateOfBirth getDateOfBirth() {
        return dateOfBirth;
    }

//    public class GenderForm {
//        public String gender;
//
//        public void setGender(String gender) {
//            this.gender = gender;
//        }
//    }

    public class PhoneForm {
        public String prefix;
        public String phoneNumber;

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public void setPrefix(String prefix) {
            this.prefix = prefix;
        }
    }

    public PhoneForm getPhoneForm() {
        return phoneForm;
    }

    public RegisterForm() {
    }
}
