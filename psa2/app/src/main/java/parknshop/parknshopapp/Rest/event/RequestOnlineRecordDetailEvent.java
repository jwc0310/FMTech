package parknshop.parknshopapp.Rest.event;

import parknshop.parknshopapp.Model.OnlineRecordDetail;

/**
 * Created by kwongyuenpan on 28/4/16.
 */
public class RequestOnlineRecordDetailEvent extends BaseEvent{
    OnlineRecordDetail onlineRecordDetail;

    public void setOnlineRecordDetail(OnlineRecordDetail onlineRecordDetail) {
        this.onlineRecordDetail = onlineRecordDetail;
    }

    public OnlineRecordDetail getOnlineRecordDetail() {
        return onlineRecordDetail;
    }
}
