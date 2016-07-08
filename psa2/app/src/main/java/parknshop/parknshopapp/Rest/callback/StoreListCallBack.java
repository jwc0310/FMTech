package parknshop.parknshopapp.Rest.callback;

import parknshop.parknshopapp.Model.StoreListResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.StoreListEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by chrisyu on 27/4/16.
 */
public class StoreListCallBack implements Callback<StoreListResponse> {
    StoreListEvent storeListEvent = new StoreListEvent();

    @Override
    public void onResponse(Call<StoreListResponse> call, Response<StoreListResponse> response) {
        StoreListResponse storeListResponse = response.body();
        if (response.body() != null){
            storeListEvent.setSuccess(true);
            storeListEvent.setDataObject(storeListResponse);
        }
        MyApplication.getInstance().mBus.post(storeListEvent);
    }

    @Override
    public void onFailure(Call<StoreListResponse> call, Throwable t) {
        storeListEvent.setMessage(t.toString());
        MyApplication.getInstance().mBus.post(storeListEvent);
    }
}
