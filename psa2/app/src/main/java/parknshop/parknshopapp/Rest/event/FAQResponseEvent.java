package parknshop.parknshopapp.Rest.event;

import parknshop.parknshopapp.Model.FAQResponse;

/**
 * Created by kwongyuenpan on 30/4/16.
 */
public class FAQResponseEvent extends BaseEvent {
    FAQResponse faqResponse;
    int type;

    public void setType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setFaqResponse(FAQResponse faqResponse) {
        this.faqResponse = faqResponse;
    }

    public FAQResponse getFaqResponse() {
        return faqResponse;
    }
}
