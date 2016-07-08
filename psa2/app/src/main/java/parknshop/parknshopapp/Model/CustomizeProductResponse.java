package parknshop.parknshopapp.Model;

import java.util.ArrayList;

import parknshop.parknshopapp.GlobalConstant;

/**
 * Created by kwongyuenpan on 15/4/16.
 */
public class CustomizeProductResponse extends BaseStatus {

    public Data data;

    public Data getData() {
        return data;
    }

    public class Data {
        public int id;
        public String updateAt;
        public String promotionType;
        public String nameTc;
        public String nameEn;
        public String productType;
        public ArrayList<mProducts> products;

        public ArrayList<mProducts> getProducts() {
            return products;
        }

        public int getId() {
            return id;
        }

        public String getUpdateAt() {
            return updateAt;
        }

        public String getPromotionType() {
            return promotionType;
        }

        public String getProductType() {
            return productType;
        }

        public String getName() {
            if(GlobalConstant.language.equals(GlobalConstant.LANG_ZH)){
                return nameTc;
            }
            return nameEn;
        }

        public class mProducts {
            public String updateAt;
            public String productId;

            public String getUpdateAt() {
                return updateAt;
            }

            public String getProductId() {
                return productId;
            }
        }
    }
}
