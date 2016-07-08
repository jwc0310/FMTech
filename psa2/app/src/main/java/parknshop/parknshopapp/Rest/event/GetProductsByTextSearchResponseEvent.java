package parknshop.parknshopapp.Rest.event;

import parknshop.parknshopapp.Model.TextSearchResponse;

/**
 * Created by kwongyuenpan on 15/3/16.
 */
public class GetProductsByTextSearchResponseEvent extends BaseEvent {
    TextSearchResponse textSearchResponse;
    public int successCode;
    String type;

    public void setTextSearchResponse(TextSearchResponse textSearchResponse) {
        this.textSearchResponse = textSearchResponse;
    }

    public TextSearchResponse getTextSearchResponse() {
        return textSearchResponse;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
