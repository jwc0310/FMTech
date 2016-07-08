package parknshop.parknshopapp.Rest.callback;

import parknshop.parknshopapp.Model.FAQResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.FAQResponseEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by kwongyuenpan on 16/3/16.
 */
public class FAQResponseCallBack implements Callback<FAQResponse> {
    FAQResponseEvent mFAQResponseEvent = new FAQResponseEvent();
    int type;

    public FAQResponseCallBack (int type){
        this.type = type;
    }

    @Override
    public void onResponse(Call<FAQResponse> call, Response<FAQResponse> response) {
        if(response != null && response.isSuccess()){
            FAQResponse fAQResponse = response.body();
            if (fAQResponse != null) {
                mFAQResponseEvent.setFaqResponse(fAQResponse);
                mFAQResponseEvent.setType(type);
                mFAQResponseEvent.setSuccess(true);
            }
        } else {
            mFAQResponseEvent.setMessage(response.message());
        }
        MyApplication.getInstance().mBus.post(mFAQResponseEvent);

    }

    @Override
    public void onFailure(Call<FAQResponse> call, Throwable t) {
        mFAQResponseEvent.setMessage(t.getMessage());
        MyApplication.getInstance().mBus.post(mFAQResponseEvent);
    }
}
