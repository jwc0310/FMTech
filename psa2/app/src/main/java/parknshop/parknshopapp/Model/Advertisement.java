package parknshop.parknshopapp.Model;

import java.util.ArrayList;

import parknshop.parknshopapp.GlobalConstant;

/**
 * Created by kwongyuenpan on 11/4/16.
 */
public class Advertisement extends BaseStatus {
    public ArrayList<Data> data;

    public ArrayList<Data> getData() {
        return data;
    }
    public class Data{
        public int id;
        public String updatedAt;
        public String type;
        public String colorCode;
        public String content_type;
        public String title_tc;
        public String content_tc;
        public String description_tc;
        public String image_tc;
        public String title_en;
        public String content_en;
        public String description_en;
        public String image_en;
        public String startTime;
        public String endTime;
        public Integer sequence;

        public int getId() {
            return id;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public String getType() {
            return type;
        }

        public String getColorCode() {
            if(colorCode == null)
                return "#000000";
            return colorCode;
        }

        public String getContent_type() {
            return content_type;
        }

        public String getTitle_tc() {
            return title_tc;
        }

        public String getContent_tc() {
            return content_tc;
        }

        public String getDescription_tc() {
            return description_tc;
        }

        public String getImage_tc() {
            return image_tc;
        }

        public String getTitle_en() {
            return title_en;
        }

        public String getTitle() {
            if(GlobalConstant.language.equals(GlobalConstant.LANG_EN))
                return getTitle_en();
            return getTitle_tc();
        }

        public String getContent() {
            if(GlobalConstant.language.equals(GlobalConstant.LANG_EN))
                return getContent_en();
            return getContent_tc();
        }

        public String getContent_en() {
            return content_en;
        }

        public String getDescription() {
            if(GlobalConstant.language.equals(GlobalConstant.LANG_EN))
                return getDescription_en();
            return getDescription_tc();
        }

        public String getDescription_en() {
            return description_en;
        }

        public String getImage_en() {
            return image_en;
        }

        public String getImage() {
            if(GlobalConstant.language.equals(GlobalConstant.LANG_EN))
                return getImage_en();
            return getImage_tc();
        }

        public String getStartTime() {
            return startTime;
        }

        public String getEndTime() {
            return endTime;
        }

        public Integer getSequence() {
            return sequence;
        }
    }

}
