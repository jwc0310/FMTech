package parknshop.parknshopapp.Model;

import java.util.ArrayList;

/**
 * Created by chrisyu on 14/5/16.
 */
public class StoreLocatorResponse extends BaseStatus {
    ArrayList<StoreLcoatorItem> data = new ArrayList<>();

    public class StoreLcoatorItem {
        private String updatedAt;
        private String storeId;
        private String productId;
        private String quantity;

        public String getUpdatedAt() {
            return updatedAt;
        }

        public String getStoreId() {
            return storeId;
        }

        public String getProductId() {
            return productId;
        }

        public String getQuantity() {
            return quantity;
        }
    }

    public ArrayList<StoreLcoatorItem> getStoreLcoatorItems() {
        return data;
    }
    /*
    {
      "updatedAt": null,
      "storeId": "183",
      "productId": "158985",
      "quantity": 10
    },*/
}
