package parknshop.parknshopapp.Rest.event;

import java.util.ArrayList;
import java.util.List;

import parknshop.parknshopapp.Model.Product;
import parknshop.parknshopapp.Model.TextSearchResponse;

/**
 * Created by chrisyu on 12/5/16.
 */
public class MultipleProductsEvent extends BaseEvent {
    List<Product> products = new ArrayList<>();

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return this.products;
    }
    TextSearchResponse textSearchResponse;

    public void setTextSearchResponse(TextSearchResponse textSearchResponse) {
        this.textSearchResponse = textSearchResponse;
    }

    public TextSearchResponse getTextSearchResponse() {
        return textSearchResponse;
    }
}
