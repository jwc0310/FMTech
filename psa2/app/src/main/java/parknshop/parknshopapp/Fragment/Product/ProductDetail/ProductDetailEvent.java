package parknshop.parknshopapp.Fragment.Product.ProductDetail;

import parknshop.parknshopapp.Model.Product;
import parknshop.parknshopapp.Rest.event.BaseEvent;

/**
 * Created by chrisyu on 17/3/16.
 */
public class ProductDetailEvent extends BaseEvent {
    Product product;

    public void setProduct(Product product) {
        this.product =  product;
    }

    public Product getProduct() {
        return product;
    }
}
