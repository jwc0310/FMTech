package parknshop.parknshopapp.Rest.callback;

import parknshop.parknshopapp.Model.PromotionCategoryResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.PromotionListEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by chrisyu on 16/3/17.
 */
public class PromotionListCallBack implements Callback<PromotionCategoryResponse> {
    PromotionListEvent promotionListEvent = new PromotionListEvent();

    @Override
    public void onResponse(Call<PromotionCategoryResponse> call, Response<PromotionCategoryResponse> response) {
        PromotionCategoryResponse promotionCategoryResponse = response.body();
        if (response.body() != null){
            if(promotionCategoryResponse.getStatus().getCode() == 200){
                promotionListEvent.setSuccess(true);
                promotionListEvent.setPromotionCategoryResponse(promotionCategoryResponse);
            }else{
                promotionListEvent.setMessage(promotionCategoryResponse.getStatus().getMessage());
            }
        }
        MyApplication.getInstance().mBus.post(promotionListEvent);
    }

    @Override
    public void onFailure(Call<PromotionCategoryResponse> call, Throwable t) {
        promotionListEvent.setMessage(t.toString());
        MyApplication.getInstance().mBus.post(promotionListEvent);
    }

}
