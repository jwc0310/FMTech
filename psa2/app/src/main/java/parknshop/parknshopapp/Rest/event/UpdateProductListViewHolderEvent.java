package parknshop.parknshopapp.Rest.event;

import parknshop.parknshopapp.Model.Product;

/**
 * Created by hp on 25/4/2016.
 */
public class UpdateProductListViewHolderEvent extends BaseEvent {
    Product product;
    int successCode;

    public void setSuccessCode(int successCode) {
        this.successCode = successCode;
    }

    public int getSuccessCode() {
        return successCode;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return this.product;
    }
}
