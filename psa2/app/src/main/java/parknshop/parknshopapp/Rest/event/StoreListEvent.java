package parknshop.parknshopapp.Rest.event;

import parknshop.parknshopapp.Model.StoreRecordsResponse;

/**
 * Created by chrisyu on 27/4/16.
 */
public class StoreListEvent extends BaseEvent {
    StoreRecordsResponse storeRecordsResponse;

    public void setStoreRecordsResponse(StoreRecordsResponse storeRecordsResponse) {
        this.storeRecordsResponse = storeRecordsResponse;
    }

    public StoreRecordsResponse getCustomizeProductResponse() {
        return storeRecordsResponse;
    }
}
