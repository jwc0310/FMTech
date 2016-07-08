package parknshop.parknshopapp.Rest.callback;

import parknshop.parknshopapp.Model.PromotionItemResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.PromotionItemEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by chrisyu on 12/5/16.
 */
public class PromotionItemCallBack implements Callback<PromotionItemResponse> {
    PromotionItemEvent promotionItemEvent = new PromotionItemEvent();

    @Override
    public void onResponse(Call<PromotionItemResponse> call, Response<PromotionItemResponse> response) {
        PromotionItemResponse promotionItemResponse = response.body();
        if (response.body() != null){
            if(promotionItemResponse.getStatus().getCode() == 200){
                promotionItemEvent.setSuccess(true);
                promotionItemEvent.setPromotionItemResponse(promotionItemResponse);
            }else{
                promotionItemEvent.setMessage(promotionItemResponse.getStatus().getMessage());
            }
        }
        MyApplication.getInstance().mBus.post(promotionItemEvent);
    }

    @Override
    public void onFailure(Call<PromotionItemResponse> call, Throwable t) {
        promotionItemEvent.setMessage(t.toString());
        MyApplication.getInstance().mBus.post(promotionItemEvent);
    }
}
