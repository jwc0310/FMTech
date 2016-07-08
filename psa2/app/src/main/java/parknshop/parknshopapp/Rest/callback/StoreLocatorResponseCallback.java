package parknshop.parknshopapp.Rest.callback;

import parknshop.parknshopapp.Model.StoreLocatorResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.StoreLocatorResponseEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by chrisyu on 14/5/16.
 */
public class StoreLocatorResponseCallback implements Callback<StoreLocatorResponse> {
    StoreLocatorResponseEvent event = new StoreLocatorResponseEvent();
    String productId;

    public StoreLocatorResponseCallback(int successCode, String productId) {
        event.setSuccessCode(successCode);
        this.productId = productId;
    }

    @Override
    public void onResponse(Call<StoreLocatorResponse> call, Response<StoreLocatorResponse> response) {
        if (response != null) {
            StoreLocatorResponse storeLocatorResponse = response.body();
            event.setSuccess(true);
            event.setDataObject(storeLocatorResponse);
            event.setMessage(productId);
            MyApplication.getInstance().mBus.post(event);
        }
    }

    @Override
    public void onFailure(Call<StoreLocatorResponse> call, Throwable t) {
        event.setMessage(t.getMessage());
        MyApplication.getInstance().mBus.post(event);
    }
}
