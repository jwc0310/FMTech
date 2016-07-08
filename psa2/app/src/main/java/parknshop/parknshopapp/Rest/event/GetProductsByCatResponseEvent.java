package parknshop.parknshopapp.Rest.event;

import parknshop.parknshopapp.Model.TextSearchResponse;

/**
 * Created by kwongyuenpan on 15/3/16.
 */
public class GetProductsByCatResponseEvent extends BaseEvent {
    TextSearchResponse textSearchResponse;

    public void setTextSearchResponse(TextSearchResponse textSearchResponse) {
        this.textSearchResponse = textSearchResponse;
    }

    public TextSearchResponse getTextSearchResponse() {
        return textSearchResponse;
    }
}
