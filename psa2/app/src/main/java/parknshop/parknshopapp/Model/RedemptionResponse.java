package parknshop.parknshopapp.Model;

import java.util.ArrayList;

import parknshop.parknshopapp.GlobalConstant;

/**
 * Created by hp on 22/4/2016.
 */
public class RedemptionResponse extends BaseStatus  {
    ArrayList<RedemptionListData> data = new ArrayList<RedemptionListData>();

    public ArrayList<RedemptionListData> getData() {
        return data;
    }

    public class RedemptionListData {
        public int id;
        String image_tc;
        String image_en;
        String title_tc;
        String title_en;
        String description_tc;
        String description_en;

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

    /*
  "data": [
    {
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
      "redemeptionItemVOList": []
    },*/
}
