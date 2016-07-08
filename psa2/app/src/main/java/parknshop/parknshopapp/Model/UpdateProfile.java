package parknshop.parknshopapp.Model;

/**
 * Created by Kate on 2015/3/31
 */
public class UpdateProfile {
    public UpdateProfileForm updateProfileForm;

    public UpdateProfile() {
        updateProfileForm = new UpdateProfileForm();
    }

    public UpdateProfileForm getUpdateProfileForm() {
        return updateProfileForm;
    }

    public static class UpdateProfileForm {

        public String lastName;
        public String title;
        public String firstName;
        public String email;
        public String oldEmail;
        public String homeBusinessNumber;
        public String mobile;
        public String cardNumber;
        public String checkCardNumber;
        public String childrenNumber;
        public String pwd;
        public DateOfBirth dateOfBirth;
        public String maritalStatus;
        public String numberOfChildren;
        public String emailFlag;
        public String language;
        public String nationalType;
        public String home;
        public String preferredDistrictCode;

        public void setCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
        }

        public void setHomeBusinessNumber(String homeBusinessNumber) {
            this.homeBusinessNumber = homeBusinessNumber;
        }

        public void setOldEmail(String oldEmail) {
            this.oldEmail = oldEmail;
        }

        public void setPwd(String pwd) {
            this.pwd = pwd;
        }

        public void setNationalType(String nationalType) {
            this.nationalType = nationalType;
        }

        public void setCheckCardNumber(String checkCardNumber) {
            this.checkCardNumber = checkCardNumber;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public void setPreferredDistrictCode(String preferredDistrictCode) {
            this.preferredDistrictCode = preferredDistrictCode;
        }

        public void setEmailFlag(String emailFlag) {
            this.emailFlag = emailFlag;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setChildrenNumber(String childrenNumber) {
            this.childrenNumber = childrenNumber;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setMaritalStatus(String maritalStatus) {
            this.maritalStatus = maritalStatus;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public void setDateOfBirth(DateOfBirth dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }

        public DateOfBirth getDateOfBirth() {
            if(dateOfBirth == null)
                dateOfBirth = new DateOfBirth();
            return dateOfBirth;
        }

        public class DateOfBirth {
            public String day;
            public String month;
            public String year;

            public String getDay() {
                return day;
            }

            public String getMonth() {
                return month;
            }

            public String getYear() {
                return year;
            }

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
    }
}
