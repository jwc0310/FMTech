package parknshop.parknshopapp.Model;

import java.util.ArrayList;

import parknshop.parknshopapp.GlobalConstant;

/**
 * Created by kwongyuenpan on 14/4/16.
 */
public class GroceryList extends BaseStatus {

    public ArrayList<Data>  data;

    public ArrayList<Data> getData() {
        return data;
    }

    public class Data {
        public int id;
        public String updatedAt;
        public String titleTc;
        public String titleEn;
        public String startTime;
        public String endTime;
        public ArrayList<GroceryItem> products;

        public class GroceryItem {
            public int id;
            public String updatedAt;
            public String productId;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getUpdatedAt() {
                return updatedAt;
            }

            public void setUpdatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
            }

            public String getProductId() {
                return productId;
            }

            public void setProductId(String productId) {
                this.productId = productId;
            }
        }

        public String getStartTime() {
            return startTime;
        }

        public void setStartTime(String startTime) {
            this.startTime = startTime;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        public String getTitle_tc() {
            return titleTc;
        }

        public void setTitle_tc(String titleTc) {
            this.titleTc = titleTc;
        }

        public String getTitleEn() {
            return titleEn;
        }

        public void setTitleEn(String titleEn) {
            this.titleEn = titleEn;
        }

        public String getTitle() {
            if(GlobalConstant.language.equals(GlobalConstant.LANG_ZH)){
                return titleTc;
            }
            return titleEn;
        }


        public String getEndTime() {
            return endTime;
        }

        public void setEndTime(String endTime) {
            this.endTime = endTime;
        }

        public ArrayList<GroceryItem> getGroceryItem() {
            return products;
        }

        public void setGroceryItem(ArrayList<GroceryItem> products) {
            this.products = products;
        }
    }


}
