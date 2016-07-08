package parknshop.parknshopapp.Rest.callback;

import parknshop.parknshopapp.Model.ForceUpdateResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.ForceUpdateResponseEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by kwongyuenpan on 10/5/16.
 */
public class ForceUpdateResponseCallBack implements Callback<ForceUpdateResponse> {
    ForceUpdateResponseEvent forceUpdateResponseEvent = new ForceUpdateResponseEvent();

    @Override
    public void onResponse(Call<ForceUpdateResponse> call, Response<ForceUpdateResponse> response) {
        if(response != null && response.isSuccess()){
            ForceUpdateResponse forceUpdateResponse = response.body();
            if (forceUpdateResponse != null) {
                forceUpdateResponseEvent.setForceUpdateResponse(forceUpdateResponse);
                forceUpdateResponseEvent.setSuccess(true);
            }
        } else {
            forceUpdateResponseEvent.setMessage(response.message());
        }
        MyApplication.getInstance().mBus.post(forceUpdateResponseEvent);

    }

    @Override
    public void onFailure(Call<ForceUpdateResponse> call, Throwable t) {
        forceUpdateResponseEvent.setMessage(t.getMessage());
        MyApplication.getInstance().mBus.post(forceUpdateResponseEvent);
    }
}
