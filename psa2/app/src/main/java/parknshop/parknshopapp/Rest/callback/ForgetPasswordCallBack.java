package parknshop.parknshopapp.Rest.callback;

import parknshop.parknshopapp.Model.EmptyJson;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.ForgetPasswordEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by chrisyu on 18/3/16.
 */
public class ForgetPasswordCallBack implements Callback<EmptyJson> {
    ForgetPasswordEvent forgetPasswordEvent = new ForgetPasswordEvent();

    @Override
    public void onResponse(Call<EmptyJson> call, Response<EmptyJson> response) {
        if(response.raw().code() == 200){
            forgetPasswordEvent.setSuccess(true);
        }else{
            forgetPasswordEvent.setMessage(response.raw().message());
        }
        MyApplication.getInstance().mBus.post(forgetPasswordEvent);
    }

    @Override
    public void onFailure(Call<EmptyJson> call, Throwable t) {
        forgetPasswordEvent.setMessage(t.toString());
        MyApplication.getInstance().mBus.post(forgetPasswordEvent);
    }
}