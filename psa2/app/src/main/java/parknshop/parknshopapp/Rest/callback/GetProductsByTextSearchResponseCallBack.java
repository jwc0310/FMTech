package parknshop.parknshopapp.Rest.callback;

/**
 * Created by kwongyuenpan on 14/3/16.
 */

import parknshop.parknshopapp.Model.TextSearchResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.GetProductsByTextSearchResponseEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GetProductsByTextSearchResponseCallBack implements Callback<TextSearchResponse> {

    GetProductsByTextSearchResponseEvent getProductsByTextSearchResponseEvent = new GetProductsByTextSearchResponseEvent();
    int successCode;
    String type;

    public GetProductsByTextSearchResponseCallBack(int id, String type) {
        this.successCode = id;
        this.type = type;
    }
    
    @Override
    public void onResponse(Call<TextSearchResponse> call, Response<TextSearchResponse> response) {
        if(response != null && response.isSuccess()){
            TextSearchResponse textSearchResponse = response.body();
            if (textSearchResponse != null) {
                getProductsByTextSearchResponseEvent.setSuccess(true);
                getProductsByTextSearchResponseEvent.successCode = successCode;
                getProductsByTextSearchResponseEvent.setType(type);
                getProductsByTextSearchResponseEvent.setTextSearchResponse(textSearchResponse);
            }
        }else{
            getProductsByTextSearchResponseEvent.setMessage(response.message());
        }
        MyApplication.getInstance().mBus.post(getProductsByTextSearchResponseEvent);

    }

    @Override
    public void onFailure(Call<TextSearchResponse> call, Throwable t) {
        getProductsByTextSearchResponseEvent.setMessage(t.getMessage());
        MyApplication.getInstance().mBus.post(getProductsByTextSearchResponseEvent);
    }
}
