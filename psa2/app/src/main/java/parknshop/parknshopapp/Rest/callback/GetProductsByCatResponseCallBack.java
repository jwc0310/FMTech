package parknshop.parknshopapp.Rest.callback;

/**
 * Created by kwongyuenpan on 14/3/16.
 */

import parknshop.parknshopapp.Model.TextSearchResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.GetProductsByCatResponseEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GetProductsByCatResponseCallBack implements Callback<TextSearchResponse> {

    GetProductsByCatResponseEvent getProductsByCatResponseEvent = new GetProductsByCatResponseEvent();
    int successCode;

    public GetProductsByCatResponseCallBack(int successCode) {
        this.successCode = successCode;
    }

    @Override
    public void onResponse(Call<TextSearchResponse> call, Response<TextSearchResponse> response) {
        if(response != null && response.isSuccess()){
            TextSearchResponse textSearchResponse = response.body();
            if (textSearchResponse != null) {
                getProductsByCatResponseEvent.setSuccess(true);
                getProductsByCatResponseEvent.setSuccessCode(successCode);
                getProductsByCatResponseEvent.setTextSearchResponse(textSearchResponse);
            }
        } else {
            getProductsByCatResponseEvent.setMessage(response.message());
        }
        MyApplication.getInstance().mBus.post(getProductsByCatResponseEvent);

    }

    @Override
    public void onFailure(Call<TextSearchResponse> call, Throwable t) {
        getProductsByCatResponseEvent.setMessage(t.getMessage());
        MyApplication.getInstance().mBus.post(getProductsByCatResponseEvent);
    }
}
