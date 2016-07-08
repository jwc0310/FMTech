package parknshop.parknshopapp.Model;

import java.io.Serializable;
import java.util.ArrayList;

import parknshop.parknshopapp.GlobalConstant;

/**
 * Created by kwongyuenpan on 30/4/16.
 */
public class ContactResponse extends BaseStatus {

    public ArrayList<Data> data;

    public ArrayList<Data> getData() {
        return data;
    }

    public class Data  implements Serializable {
        public int id;
        public String nameTc;
        public String nameEn;
        public String telephone1;
        public String telephone2;
        public String fax;
        public String email;
        public String officeHours;
        public String officeHoursTc;
        public String officeHoursEn;
        public String addressTc;
        public String addressEn;
        public double latitude;
        public double longitude;
        public int headOffice;

        public int getId() {
            return id;
        }

        public int getHeadOffice() {
            return headOffice;
        }

        public String getAddress() {
            if(GlobalConstant.language.equals(GlobalConstant.LANG_ZH))
                return addressTc;
            return addressEn;
        }

        public String getEmail() {
            return email;
        }

        public String getFax() {
            return fax;
        }

        public Double getLatitude() {
            return latitude;
        }

        public Double getLongitude() {
            return longitude;
        }

        public String getName() {
            if(GlobalConstant.language.equals(GlobalConstant.LANG_ZH))
                return nameTc;
            return nameEn;
        }

        public String getNameEn() {
            return nameEn;
        }

        public String getOfficeHours() {
            if(GlobalConstant.language.equals(GlobalConstant.LANG_ZH))
                return officeHoursTc;
            return officeHoursEn;
        }

        public String getTelephone1() {
            return telephone1;
        }

        public String getTelephone2() {
            return telephone2;
        }
    }

}
