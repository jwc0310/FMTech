package parknshop.parknshopapp.Rest.event;

import parknshop.parknshopapp.Model.ForceUpdateResponse;

/**
 * Created by kwongyuenpan on 10/5/16.
 */
public class ForceUpdateResponseEvent extends BaseEvent {
    ForceUpdateResponse forceUpdateResponse;

    public void setForceUpdateResponse(ForceUpdateResponse forceUpdateResponse) {
        this.forceUpdateResponse = forceUpdateResponse;
    }

    public ForceUpdateResponse getForceUpdateResponse() {
        return forceUpdateResponse;
    }
}
