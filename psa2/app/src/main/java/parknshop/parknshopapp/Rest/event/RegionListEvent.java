package parknshop.parknshopapp.Rest.event;

import parknshop.parknshopapp.Model.RegionsResponse;

/**
 * Created by chrisyu on 8/4/16.
 */
public class RegionListEvent extends BaseEvent {
    RegionsResponse regionsResponse;

    public void setRegionsResponse(RegionsResponse regionsResponse) {
        this.regionsResponse = regionsResponse;
    }

    public RegionsResponse getRegionsResponse() {
        return this.regionsResponse;
    }
}
