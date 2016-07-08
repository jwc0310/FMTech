package parknshop.parknshopapp.Model;

import java.util.ArrayList;

import parknshop.parknshopapp.GlobalConstant;

/**
 * Created by hp on 22/4/2016.
 */
public class RedemptionItemResponse extends BaseStatus{
    Redemption data = new Redemption();

    /*
    "id": 1,
    "updatedAt": "2016-04-01 07:54:28",
    "image_tc": "http://devsvr8.mtel.ws/mediaServerCMS/resources/ParknShop2016/cat/533fdae4-837c-49ad-a30e-2df9f2cee780.png",
    "image_en": "http://devsvr8.mtel.ws/mediaServerCMS/resources/ParknShop2016/cat/533fdae4-837c-49ad-a30e-2df9f2cee780.png",
    "title_tc": "一Redemption ",
    "title_en": "1Redemption",
    "startDate": "2016-04-01 07:54:43",
    "endDate": "2017-04-01 12:00:00",
    "description_tc": "afasfdasd",
    "description_en": "ersdg4wt",
    "valid_until": "2016-04-01 07:55:02",*/

    public class Redemption {
        public int id;
        public String updatedAt;
        public String image_tc,image_en,title_tc,title_en,startDate,endDate,description_tc,description_en,valid_until;
        public ArrayList<RedemptionItem> redemeptionItemVOList = new ArrayList<RedemptionItem>();


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

        public String getDescription() {
            if(GlobalConstant.language.equals(GlobalConstant.LANG_EN))
                return description_en;
            return description_tc;
        }
    }

    public class RedemptionItem {
        int id;
        String brandTc;
        String brandEn;
        String titleTc;
        String titleEn;
        String descriptionTc;
        String descriptionEn;
        ArrayList<Image> images = new ArrayList<Image>();
        ArrayList<Option> options = new ArrayList<Option>();

        public ArrayList<Image> getImages() {
            return images;
        }

        public int getId() {
            return id;
        }

        public String getBrandTc() {
            return brandTc;
        }

        public String getBrandEn() {
            return brandEn;
        }

        public String getTitleTc() {
            return titleTc;
        }

        public String getTitleEn() {
            return titleEn;
        }

        public ArrayList<Option> getOption() {
            if(options == null)
                options = new ArrayList<>();
            return options;
        }

        public String getBrand() {
            if(GlobalConstant.language.equals(GlobalConstant.LANG_EN))
                return getBrandEn();
            return getBrandTc();
        }

        public String getTitle() {
            if(GlobalConstant.language.equals(GlobalConstant.LANG_EN))
                return getTitleEn();
            return getTitleTc();
        }

        public String getDescription() {
            if(GlobalConstant.language.equals(GlobalConstant.LANG_EN))
                return descriptionEn;
            return descriptionTc;
        }

        public String getImageUrl() {
            if(images.size() == 0 || images.get(0) == null)
                return "";
            return images.get(0).value;
        }


    }

    public class Image {
        String updatedAt;
        String value;
        int redemptionItemId;

        public String getValue() {
            return value;
        }
    }

    public class Option {
        String updatedAt;
        String value;
        int redemptionItemId;
        String line_tc;
        String line_en;

        public String getLine() {
            if(GlobalConstant.language.equals(GlobalConstant.LANG_EN))
                return line_en;
            return line_tc;
        }
    }

    public Redemption getData() {
        return data;
    }
    /*
  "data": {
    "id": 1,
    "updatedAt": "2016-04-01 07:54:28",
    "image_tc": "http://devsvr8.mtel.ws/mediaServerCMS/resources/ParknShop2016/cat/533fdae4-837c-49ad-a30e-2df9f2cee780.png",
    "image_en": "http://devsvr8.mtel.ws/mediaServerCMS/resources/ParknShop2016/cat/533fdae4-837c-49ad-a30e-2df9f2cee780.png",
    "title_tc": "一Redemption ",
    "title_en": "1Redemption",
    "startDate": "2016-04-01 07:54:43",
    "endDate": "2017-04-01 12:00:00",
    "description_tc": "afasfdasd",
    "description_en": "ersdg4wt",
    "valid_until": "2016-04-01 07:55:02",
    "redemeptionItemVOList": [
      {
        "id": 1,
        "updatedAt": "2016-04-01 07:59:56",
        "brandTc": "產品品牌",
        "brandEn": "brand",
        "titleTc": "產品標題XYZ",
        "titleEn": "title xyz",
        "descriptionTc": "產品內容XYZ",
        "descriptionEn": "descritpion xyz",
        "images": [
          {
            "updatedAt": "2016-04-21 02:24:36",
            "value": "http://devsvr8.mtel.ws/mediaServerCMS/resources/ParknShop2016/cat/dfc155a8-d836-4c01-a97a-1e90427c5427.jpeg",
            "redemptionItemId": 1
          },
          {
            "updatedAt": "2016-04-21 02:25:56",
            "value": "http://devsvr8.mtel.ws/mediaServerCMS/resources/ParknShop2016/cat/533fdae4-837c-49ad-a30e-2df9f2cee780.png",
            "redemptionItemId": 1
          }
        ],
        "options": [
          {
            "updatedAt": "2016-04-21 02:27:54",
            "redemptionItemId": 1,
            "line_tc": "1,000PT + HK$17.90",
            "line_en": "1,000PT + HK$17.90"
          },
          {
            "updatedAt": "2016-04-21 02:27:54",
            "redemptionItemId": 1,
            "line_tc": "1,500PT + HK$7.90",
            "line_en": "1,500PT + HK$7.90"
          }
        ]
      },*/
}
