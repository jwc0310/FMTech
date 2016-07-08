package parknshop.parknshopapp.Rest.event;


import java.util.ArrayList;
import java.util.List;

import parknshop.parknshopapp.Model.Product;



/**

 * Created by hp on 25/4/2016.

 */

public class ProductUpdateDetailEvent extends BaseEvent {
    List<Product> redemptionList = new ArrayList<>();
    Product product;

    public List<Product> getRedemptionList() {
        return redemptionList;
    }

    public void setRedemptionList(List<Product> redemptionList) {
        this.redemptionList = redemptionList;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

}

