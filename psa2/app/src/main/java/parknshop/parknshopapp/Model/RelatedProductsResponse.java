package parknshop.parknshopapp.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chrisyu on 4/5/16.
 */
public class RelatedProductsResponse {
    List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }
}
