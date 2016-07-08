package parknshop.parknshopapp.Rest.event;

import parknshop.parknshopapp.Model.RecipeDetailItemResponse;

/**
 * Created by chrisyu on 5/5/16.
 */
public class RecipeDetailItemEvent extends BaseEvent {
    RecipeDetailItemResponse response;

    public void setResponse(RecipeDetailItemResponse response) {
        this.response = response;
    }

    public RecipeDetailItemResponse getResponse() {
        return this.response;
    }
}
