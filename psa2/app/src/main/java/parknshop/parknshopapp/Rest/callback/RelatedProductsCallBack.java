package parknshop.parknshopapp.Rest.callback;

import parknshop.parknshopapp.Model.RelatedProductsResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.RelatedProductEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by chrisyu on 4/5/16.
 */
public class RelatedProductsCallBack implements Callback<RelatedProductsResponse> {
    RelatedProductEvent event = new RelatedProductEvent();

    int successCode;
    public RelatedProductsCallBack (int successCode) {
        this.successCode = successCode;
    }

    @Override
    public void onResponse(Call<RelatedProductsResponse> call, Response<RelatedProductsResponse> response) {

        if (response.isSuccess()) {
            RelatedProductsResponse relatedProductsResponse = response.body();
            event.setSuccess(true);
            event.setSuccessCode(successCode);
            event.setResponse(relatedProductsResponse);
            MyApplication.getInstance().mBus.post(event);
        }
    }

    @Override
    public void onFailure(Call<RelatedProductsResponse> call, Throwable t) {
        event.setMessage(t.getMessage());
        MyApplication.getInstance().mBus.post(event);
    }
}
