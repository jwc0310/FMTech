package parknshop.parknshopapp.EventUpdate;

import parknshop.parknshopapp.Model.Product;

/**
 * Created by kwongyuenpan on 24/3/16.
 */
public class GroceryListAdapterItemClickAddToCartEvent extends BaseAdapterEvent {
    Product product;

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }
}
