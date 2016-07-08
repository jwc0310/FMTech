package parknshop.parknshopapp.Model;

import java.util.ArrayList;
import java.util.List;

import parknshop.parknshopapp.GlobalConstant;

/**
 * Created by chrisyu on 13/5/16.
 */
public class NewPromotionResponse {
    private ArrayList<PromotionResponseItem> promotionResponseItemList = new ArrayList<>();

    public class PromotionResponseItem {
        private String imgUrl;
        private String urlPath;
        private String urlName;
        private List<NameMap> urlNameMap;
        private String categoryId;

        public String getImgUrl() {
            return imgUrl;
        }

        public String getUrlPath() {
            return urlPath;
        }
        public String getUrlName() {
            return urlName;
        }

        public List<NameMap> getUrlNameMap() {
            return urlNameMap;
        }

        public String getNameViaMap() {
            for(int i = 0; i < urlNameMap.size(); i++ ) {
                if (GlobalConstant.language.equals(GlobalConstant.LANG_ZH) && urlNameMap.get(i).lang.equals("zh")) {
                    return urlNameMap.get(i).desc;
                }
                if (GlobalConstant.language.equals(GlobalConstant.LANG_EN) && urlNameMap.get(i).lang.equals("en")) {
                    return urlNameMap.get(i).desc;
                }
            }
            return "";
        }

        public String getNameEnViaMap() {
            for(int i = 0; i < urlNameMap.size(); i++ ) {
                if (GlobalConstant.language.equals(GlobalConstant.LANG_EN) && urlNameMap.get(i).lang.equals("en"))
                    return urlNameMap.get(i).desc;
            }
            return "";
        }

        public String getNameEnViaMapForGA() {
            for(int i = 0; i < urlNameMap.size(); i++ ) {
                    return urlNameMap.get(i).desc;
            }
            return "";
        }

        public String getCategoryId() {
            return categoryId;
        }
    }

    public ArrayList<PromotionResponseItem> getPromotionResponseItemList () {
        return promotionResponseItemList;
    }


    public class NameMap {
        String lang;
        String desc;

        public String getLang() {
            return lang;
        }

        public String getDesc() {
            return desc;
        }
        /* {
        "lang": "zt",
        "desc": "1元頂級和黑牛zt"
      }*/
    }
}
/*[
  {
    "urlName": "1元頂級和黑牛zt",
    "imgUrl": "/medias/sys_master/hce/hc2/8827791933470/box4.jpg",
    "urlPath": "/products/010200?type=cat",
    "categoryId": "010200",
    "urlNameMap": [
      [
        "zt",
        "1元頂級和黑牛zt"
      ],
      [
        "en",
        "1元頂級和黑牛en"
      ]
    ]
  }
]*/