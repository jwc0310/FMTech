package parknshop.parknshopapp.Rest.event;

import parknshop.parknshopapp.Model.StoreListResponse;

/**
 * Created by chrisyu on 28/4/16.
 */
public class OnMarkerPressedEvent extends BaseEvent {
    StoreListResponse.Store store;

    public void setStore(StoreListResponse.Store store) {
        this.store = store;
    }

    public StoreListResponse.Store getStore() {
        return store;
    }
}