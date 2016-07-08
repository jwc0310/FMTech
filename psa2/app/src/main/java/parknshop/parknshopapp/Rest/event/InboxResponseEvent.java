package parknshop.parknshopapp.Rest.event;

import parknshop.parknshopapp.Model.InboxResponse;

/**
 * Created by kwongyuenpan on 4/5/16.
 */
public class InboxResponseEvent extends BaseEvent{
    InboxResponse inboxResponse;

    public void setInboxResponse(InboxResponse inboxResponse) {
        this.inboxResponse = inboxResponse;
    }

    public InboxResponse getInboxResponse() {
        return inboxResponse;
    }
}
