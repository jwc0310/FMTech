package parknshop.parknshopapp.Rest.event;

import parknshop.parknshopapp.Model.RelatedProductsResponse;

/**
 * Created by chrisyu on 4/5/16.
 */
public class RelatedProductEvent extends BaseEvent {
    RelatedProductsResponse response;

    public void setResponse(RelatedProductsResponse response) {
        this.response = response;
    }

    public RelatedProductsResponse getResponse() {
        return response;
    }
}
