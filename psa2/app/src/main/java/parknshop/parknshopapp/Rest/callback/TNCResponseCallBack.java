package parknshop.parknshopapp.Rest.callback;

import parknshop.parknshopapp.Model.TNCResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.TNCResponseEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by kwongyuenpan on 16/3/16.
 */
public class TNCResponseCallBack implements Callback<TNCResponse> {
    TNCResponseEvent mTNCResponseEvent = new TNCResponseEvent();

    @Override
    public void onResponse(Call<TNCResponse> call, Response<TNCResponse> response) {
        if(response != null && response.isSuccess()){
            TNCResponse tNCResponse = response.body();
            if (tNCResponse != null) {
                mTNCResponseEvent.setTNCResponse(tNCResponse);
                mTNCResponseEvent.setSuccess(true);
            }
        } else {
            mTNCResponseEvent.setMessage(response.message());
        }
        MyApplication.getInstance().mBus.post(mTNCResponseEvent);

    }

    @Override
    public void onFailure(Call<TNCResponse> call, Throwable t) {
        mTNCResponseEvent.setMessage(t.getMessage());
        MyApplication.getInstance().mBus.post(mTNCResponseEvent);
    }
}
