package parknshop.parknshopapp.Model;

import java.util.ArrayList;

import parknshop.parknshopapp.GlobalConstant;

/**
 * Created by hp on 22/4/2016.
 */
public class CouponResponse extends BaseStatus {
    ArrayList<Data> data = new ArrayList<Data>();

    public ArrayList<Data> getData() {
        return data;
    }

    public class Data {
        int id;
        String updatedAt;
        String type;
        String title_tc;
        String title_en;
        String image_tc;
        String image_en;
        String startTime;
        String endTime;
        String valid_Until;
        String description_tc;
        String description_en;

        public int getId() {
            return id;
        }

        public String getStartTime() {
            return startTime;
        }

        public String getEndTime() {
            return endTime;
        }

        public String getType() {
            return type;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public String getValid_Until() {
            return valid_Until;
        }

        public String getDescription() {
            if(GlobalConstant.language.equals(GlobalConstant.LANG_EN))
                return description_en;
            return description_tc;
        }

        public String getImage() {
            if(GlobalConstant.language.equals(GlobalConstant.LANG_EN))
                return image_en;
            return image_tc;
        }


        public String getTitle() {
            if(GlobalConstant.language.equals(GlobalConstant.LANG_EN))
                return title_en;
            return title_tc;
        }
    }

}
