package parknshop.parknshopapp.Rest.callback;

/**
 * Created by kwongyuenpan on 14/3/16.
 */

import com.google.gson.Gson;
import com.google.gson.JsonElement;

import parknshop.parknshopapp.Model.ConfigInfoResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.BackendConfigEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BackendConfigCallback implements Callback<JsonElement> {

    BackendConfigEvent mBackendConfigEvent = new BackendConfigEvent();

    @Override
    public void onResponse(Call<JsonElement> call, Response<JsonElement> response) {

        if(response != null && response.isSuccess()){
            ConfigInfoResponse configInfoResponse = new Gson().fromJson(response.body(), ConfigInfoResponse.class);
            if (configInfoResponse != null) {
                mBackendConfigEvent.setConfigInfoResponse(configInfoResponse);
                mBackendConfigEvent.setSuccess(true);
            }
        }else{
            mBackendConfigEvent.setMessage(response.message());
        }
        MyApplication.getInstance().mBus.post(mBackendConfigEvent);

    }

    @Override
    public void onFailure(Call<JsonElement> call, Throwable t) {
        mBackendConfigEvent.setMessage(t.getMessage());
        MyApplication.getInstance().mBus.post(mBackendConfigEvent);
    }
}
