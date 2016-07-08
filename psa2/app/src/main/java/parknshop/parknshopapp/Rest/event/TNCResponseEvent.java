package parknshop.parknshopapp.Rest.event;

import parknshop.parknshopapp.Model.TNCResponse;

/**
 * Created by kwongyuenpan on 30/4/16.
 */
public class TNCResponseEvent extends BaseEvent {
    TNCResponse tNCResponse;

    public void setTNCResponse(TNCResponse tNCResponse) {
        this.tNCResponse = tNCResponse;
    }

    public TNCResponse getTNCResponse() {
        return tNCResponse;
    }
}
