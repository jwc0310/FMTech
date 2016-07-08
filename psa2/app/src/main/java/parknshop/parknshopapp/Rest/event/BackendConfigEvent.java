package parknshop.parknshopapp.Rest.event;

import parknshop.parknshopapp.Model.ConfigInfoResponse;

/**
 * Created by kwongyuenpan on 15/3/16.
 */
public class BackendConfigEvent extends BaseEvent {
    ConfigInfoResponse configInfoResponse;

    public void setConfigInfoResponse(ConfigInfoResponse configInfoResponse) {
        this.configInfoResponse = configInfoResponse;
    }

    public ConfigInfoResponse getConfigInfoResponse() {
        return configInfoResponse;
    }
}
