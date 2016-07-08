package parknshop.parknshopapp.Rest.event;

import parknshop.parknshopapp.Model.NewsInfoListResponse;

/**
 * Created by kwongyuenpan on 16/3/16.
 */
public class NewsSearchEvent extends BaseEvent{
    NewsInfoListResponse newsInfoListResponse;
    String type;

    public void setNewsInfoListResponse(NewsInfoListResponse newsInfoListResponse) {
        this.newsInfoListResponse = newsInfoListResponse;
    }

    public NewsInfoListResponse getNewsInfoListResponse() {
        return newsInfoListResponse;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
