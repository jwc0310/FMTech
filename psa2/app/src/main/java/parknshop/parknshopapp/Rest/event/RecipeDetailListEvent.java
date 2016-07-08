package parknshop.parknshopapp.Rest.event;

import parknshop.parknshopapp.Model.RecipeDetailResponse;

/**
 * Created by chrisyu on 4/5/16.
 */
public class RecipeDetailListEvent extends BaseEvent{
    RecipeDetailResponse response;
    String id;

    public void setResponse(RecipeDetailResponse response) {
        this.response = response;
    }

    public RecipeDetailResponse getResponse() {
        return this.response;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
