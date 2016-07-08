package parknshop.parknshopapp.Rest.event;

import parknshop.parknshopapp.Model.OnlineRecords;

/**
 * Created by kwongyuenpan on 28/4/16.
 */
public class RequestOnlineRecordsEvent extends BaseEvent{
    OnlineRecords onlineRecords;

    public void setOnlineRecords(OnlineRecords onlineRecords) {
        this.onlineRecords = onlineRecords;
    }

    public OnlineRecords getOnlineRecords() {
        return onlineRecords;
    }
}
