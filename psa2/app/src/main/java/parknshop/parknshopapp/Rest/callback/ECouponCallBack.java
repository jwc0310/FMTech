package parknshop.parknshopapp.Rest.callback;

import parknshop.parknshopapp.Model.ECouponResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.ECouponEvent;
import parknshop.parknshopapp.Utils.LogUtil;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by hp on 12/4/2016.
 */
public class ECouponCallBack implements Callback<ECouponResponse> {
    ECouponEvent baseEvent = new ECouponEvent();

    @Override
    public void onResponse(Call<ECouponResponse> call, Response<ECouponResponse> response) {
        if(response != null && response.isSuccess()){
            ECouponResponse data = response.body();
            if (response != null) {
                baseEvent.setSuccess(true);
                baseEvent.setDataObject(response.body());
            }
        } else {
            baseEvent.setMessage(response.message());
        }
        MyApplication.getInstance().mBus.post(baseEvent);
    }

    @Override
    public void onFailure(Call<ECouponResponse> call, Throwable t) {
        LogUtil.info("", "response:onFailure:" + t.toString());
        baseEvent.setMessage(t.getMessage());
        MyApplication.getInstance().mBus.post(baseEvent);
    }
}
