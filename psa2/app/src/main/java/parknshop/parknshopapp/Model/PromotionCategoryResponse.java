package parknshop.parknshopapp.Model;

import java.util.ArrayList;

import parknshop.parknshopapp.GlobalConstant;
import parknshop.parknshopapp.Model.Category.SubCategory;

/**
 * Created by kwongyuenpan on 15/4/16.
 */
public class PromotionCategoryResponse extends BaseStatus {
    public ArrayList<Data> data;

    public ArrayList<Data> getData() {
        return data;
    }

    public class Data {
        public Integer id;
        public String titleTc;
        public String imageTc;
        public String titleEn;
        public String imageEn;
        public String contentType;
        public String contentTc;
        public String contentEn;

        public ArrayList<SubCategory> subMenu;

        public Integer getId() {
            return id;
        }

        public String getTitle() {
            if (GlobalConstant.language.equals(GlobalConstant.LANG_ZH)) {
                return titleTc;
            }
            return titleEn;
        }

        public String getTitleTc() {
            return titleTc;
        }

        public String getTitleEn() {
            return titleEn;
        }

        public String getImage() {
            if (GlobalConstant.language.equals(GlobalConstant.LANG_ZH)) {
                return imageTc;
            }
            return imageEn;
        }

        public String getContentType() {
            return contentType;
        }

        public String getContent() {
            if (GlobalConstant.language.equals(GlobalConstant.LANG_ZH)) {
                return contentTc;
            }
            return contentEn;
        }

        public ArrayList<SubCategory> getSubMenu() {
            return subMenu;
        }
    }
}
