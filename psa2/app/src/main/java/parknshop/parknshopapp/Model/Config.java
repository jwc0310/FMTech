package parknshop.parknshopapp.Model;

import java.util.ArrayList;

import parknshop.parknshopapp.GlobalConstant;

/**
 * Created by chrisyu on 9/5/16.
 */
public class Config extends BaseStatus {
    public ArrayList<ConfigInfoResponse.ConfigInfo> data = new ArrayList<ConfigInfoResponse.ConfigInfo>();

    /*


    {
      "titleTc": "錯誤代碼 E111011",
      "titleEn": "錯誤代碼 E111011",
      "key": "RC_E111011",
      "type": "text",
      "valueTc": "卡片已註冊",
      "valueEn": "卡片已註冊",
      "imageTc": null,
      "imageEn": null,
      "edit_dateTime": "2015/10/21 23:18:32"

      "titleTc": "錯誤代碼 E111016",
      "titleEn": "錯誤代碼 E111016",
      "key": "RC_E111016",
      "type": "text",
      "valueTc": "購物清單內商品未找到",
      "valueEn": "購物清單內商品未找到",
      "imageTc": null,
      "imageEn": null,
      "edit_dateTime": "2015/10/21 23:39:16"*/

    public class ConfigItem {
        String titleTc;
        String titleEn;
        String key;
        String type;
        String valueTc;
        String valueEn;
        String imageTc;
        String imageEn;
        String edit_dateTime;

        public String getTitle() {
            if(GlobalConstant.language.equals(GlobalConstant.LANG_EN))
                return titleEn;
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

        public String getImage() {
            if(GlobalConstant.language.equals(GlobalConstant.LANG_EN))
                return imageEn;
            return imageTc;
        }

        public String getEdit_dateTime() {
            return edit_dateTime;
        }
    }
}
