package parknshop.parknshopapp.Rest.callback;

import parknshop.parknshopapp.Model.CustomizeProductResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.CustomizeProductEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by chrisyu on 16/3/17.
 */
public class CustomizeProductCallBack implements Callback<CustomizeProductResponse> {
    CustomizeProductEvent customizeProductEvent = new CustomizeProductEvent();
    int successCode;
    int page;

    public CustomizeProductCallBack(int successCode, int page) {
        this.successCode = successCode;
        this.page = page;
    }

    @Override
    public void onResponse(Call<CustomizeProductResponse> call, Response<CustomizeProductResponse> response) {
        CustomizeProductResponse customizeProductResponse = response.body();
        if (response.body() != null){
            if(customizeProductResponse.getStatus().getCode() == 200){
                customizeProductEvent.setSuccess(true);
                customizeProductEvent.setPage(page);
                customizeProductEvent.setSuccessCode(successCode);
                customizeProductEvent.setCustomizeProductResponse(customizeProductResponse);
            }else{
                customizeProductEvent.setMessage(customizeProductResponse.getStatus().getMessage());
            }
        }
        MyApplication.getInstance().mBus.post(customizeProductEvent);
    }

    @Override
    public void onFailure(Call<CustomizeProductResponse> call, Throwable t) {
        customizeProductEvent.setMessage(t.toString());
        MyApplication.getInstance().mBus.post(customizeProductEvent);
    }

}
