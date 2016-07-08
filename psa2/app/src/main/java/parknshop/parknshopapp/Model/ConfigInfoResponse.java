package parknshop.parknshopapp.Model;

import java.util.List;

import parknshop.parknshopapp.GlobalConstant;

/**
 * Created by chrisyu on 9/3/16.
 */
public class ConfigInfoResponse extends BackendResponse {
    public Results results;

    public class Results {
        public List<ConfigInfo> config_info;

        public List<ConfigInfo> getConfig_info() {
            return config_info;
        }
    }

    public Results getResults() {
        return results;
    }

    public class ConfigInfo {
        public String title;
        public String titleTc;
        public String titleEn;
        public String imageTc;
        public String imageEn;

        public String key;
        public String type;
        public String value;
        public String valueTc;
        public String valueEn;
        public Image image;
        public int sorting_rank;
        public String edit_datetime;

        public String getImageUrl() {
            if(GlobalConstant.language.equals(GlobalConstant.LANG_EN))
                return imageEn;
            return imageTc;
        }

        public class Image {
            private int width;
            private int height;
            private String url;
        }

        public String getTitle() {
            if(GlobalConstant.language.equals(GlobalConstant.LANG_EN)) {
                if(titleEn == null)
                    return "";
                return titleEn;
            }

            if(titleTc == null)
                return "";

            return titleTc;
        }

        public String getKey() {
            return key;
        }

        public String getType() {
            return type;
        }

        public String getValue() {
            if(GlobalConstant.language.equals(GlobalConstant.LANG_EN))
                return valueEn;
            return valueTc;
        }

        public int getSorting_rank() {
            return sorting_rank;
        }

        public String getEdit_datetime() {
            return edit_datetime;
        }

        public Image getImage() {
            return image;
        }
    }
}
