package parknshop.parknshopapp.Rest.event;

import parknshop.parknshopapp.Model.RecipeListResponse;

/**
 * Created by chrisyu on 3/5/16.
 */
public class RecipeListResponseEvent extends BaseEvent {
    RecipeListResponse remoteResponse;

    public void setResponseObject(RecipeListResponse remoteResponse) {
        this.remoteResponse = remoteResponse;
    }

    public RecipeListResponse getRemoteResponse() {
        return remoteResponse;
    }
}
