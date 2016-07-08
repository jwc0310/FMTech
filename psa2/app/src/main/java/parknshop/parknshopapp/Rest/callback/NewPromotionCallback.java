package parknshop.parknshopapp.Rest.callback;

import java.util.ArrayList;

import parknshop.parknshopapp.Model.NewPromotionResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.NewPromotionEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by chrisyu on 13/5/16.
 */
public class NewPromotionCallback implements Callback<ArrayList<NewPromotionResponse.PromotionResponseItem>> {
    NewPromotionEvent event = new NewPromotionEvent();

    @Override
    public void onResponse(Call<ArrayList<NewPromotionResponse.PromotionResponseItem>> call, Response<ArrayList<NewPromotionResponse.PromotionResponseItem>> response) {
        if(response != null) {
            if(response.body() != null) {
                event.setSuccess(true);
                event.setNewPromotionResponse(response.body());
                MyApplication.getInstance().mBus.post(event);
            }
        }
    }

    @Override
    public void onFailure(Call<ArrayList<NewPromotionResponse.PromotionResponseItem>> call, Throwable t) {
        event.setMessage(t.getMessage());
        MyApplication.getInstance().mBus.post(event);
    }
}
