package parknshop.parknshopapp.Rest.event;

import parknshop.parknshopapp.Model.ContactResponse;

/**
 * Created by kwongyuenpan on 30/4/16.
 */
public class ContactResponseEvent extends BaseEvent {
    ContactResponse contactResponse;

    public void setContactResponse(ContactResponse contactResponse) {
        this.contactResponse = contactResponse;
    }

    public ContactResponse getContactResponse() {
        return contactResponse;
    }
}
