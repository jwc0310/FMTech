package parknshop.parknshopapp.Rest.callback;

import parknshop.parknshopapp.Model.NewsInfoListResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.NewsSearchEvent;
import parknshop.parknshopapp.Utils.LogUtil;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by kwongyuenpan on 16/3/16.
 */
public class NewsSearchCallBack implements Callback<NewsInfoListResponse> {
    String type;
    public NewsSearchCallBack (String type) {
        this.type = type;
    }

    NewsSearchEvent mNewsSearchEvent = new NewsSearchEvent();

    @Override
    public void onResponse(Call<NewsInfoListResponse> call, Response<NewsInfoListResponse> response) {
        if(response != null && response.isSuccess()){
            NewsInfoListResponse newsInfoListResponse = response.body();
            if (newsInfoListResponse != null) {
                mNewsSearchEvent.setNewsInfoListResponse(newsInfoListResponse);
                mNewsSearchEvent.setSuccess(true);
                mNewsSearchEvent.setType(type);
            }
        } else {
            mNewsSearchEvent.setMessage(response.message());
        }
        MyApplication.getInstance().mBus.post(mNewsSearchEvent);

    }

    @Override
    public void onFailure(Call<NewsInfoListResponse> call, Throwable t) {
        LogUtil.info("", "response:onFailure:"+t.toString());
        mNewsSearchEvent.setMessage(t.getMessage());
        MyApplication.getInstance().mBus.post(mNewsSearchEvent);
    }
}
