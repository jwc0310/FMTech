package parknshop.parknshopapp.Rest.event;

import parknshop.parknshopapp.Model.DistrictsResponse;

/**
 * Created by chrisyu on 8/4/16.
 */
public class DistrictListEvent extends BaseEvent {

    DistrictsResponse districtsResponse;

    public void setRegionsResponse(DistrictsResponse districtsResponse) {
        this.districtsResponse = districtsResponse;
    }

    public DistrictsResponse getDistrictsResponse() {
        return this.districtsResponse;
    }
}
