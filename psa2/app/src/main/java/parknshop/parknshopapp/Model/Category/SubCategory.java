package parknshop.parknshopapp.Model.Category;

import parknshop.parknshopapp.GlobalConstant;

/**
 * Created by chrisyu on 27/4/16.
 */

public class SubCategory {
    public int id;
    public String titleTc;
    public String imageTc;
    public String titleEn;
    public String imageEn;
    public String contentTc;
    public String contentEn;
    public String contentType;

    public int getId() {
        return id;
    }

    public String getTitle() {
        if(GlobalConstant.language.equals(GlobalConstant.LANG_ZH)){
            return titleTc;
        }
        return titleEn;
    }

    public String getTitleEn() {
        return titleEn;
    }

    public String getTitleTc() {
        return titleTc;
    }

    public String getImage() {
        if(GlobalConstant.language.equals(GlobalConstant.LANG_ZH)){
            return imageTc;
        }
        return imageEn;
    }

    public String getValue() {
        if(GlobalConstant.language.equals(GlobalConstant.LANG_ZH)){
            return contentTc;
        }
        return contentEn;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public void setValue(String value) {
        if(GlobalConstant.language.equals(GlobalConstant.LANG_ZH)) {
            this.contentTc = value;
        } else {
            this.contentEn = value;
        }
    }

}
