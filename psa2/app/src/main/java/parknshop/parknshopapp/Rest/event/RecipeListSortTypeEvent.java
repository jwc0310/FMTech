package parknshop.parknshopapp.Rest.event;

import parknshop.parknshopapp.Model.DishTypeResponse;

/**
 * Created by chrisyu on 3/5/16.
 */
public class RecipeListSortTypeEvent extends BaseEvent {

    DishTypeResponse remoteResponse;

    public void setResponseObject(DishTypeResponse remoteResponse) {
        this.remoteResponse = remoteResponse;
    }

    public DishTypeResponse getRemoteResponse() {
        return remoteResponse;
    }
}
