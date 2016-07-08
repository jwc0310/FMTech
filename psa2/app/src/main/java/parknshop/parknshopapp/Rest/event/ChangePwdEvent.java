package parknshop.parknshopapp.Rest.event;

import parknshop.parknshopapp.Model.ChangePwdResponse;

/**
 * Created by kwongyuenpan on 27/4/16.
 */
public class ChangePwdEvent extends BaseEvent {
    ChangePwdResponse changePwdResponse;

    public void setChangePwdResponse(ChangePwdResponse changePwdResponse) {
        this.changePwdResponse = changePwdResponse;
    }

    public ChangePwdResponse getChangePwdResponse() {
        return changePwdResponse;
    }
}
