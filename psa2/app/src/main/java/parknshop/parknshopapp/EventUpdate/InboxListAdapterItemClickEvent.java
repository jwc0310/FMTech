package parknshop.parknshopapp.EventUpdate;

import parknshop.parknshopapp.Model.InboxResponse;

/**
 * Created by kwongyuenpan on 4/5/16.
 */
public class InboxListAdapterItemClickEvent extends BaseAdapterEvent {
    InboxResponse.Data data;

    public void setData(InboxResponse.Data data) {
        this.data = data;
    }

    public InboxResponse.Data getData() {
        return data;
    }
}
