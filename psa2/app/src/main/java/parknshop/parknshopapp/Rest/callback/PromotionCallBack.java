package parknshop.parknshopapp.Rest.callback;

import parknshop.parknshopapp.Model.Category.CategoryDrawerItem;
import parknshop.parknshopapp.Model.PromotionResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.PromotionEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by chrisyu on 16/3/17.
 */
public class PromotionCallBack implements Callback<PromotionResponse> {
    PromotionEvent promotionEvent = new PromotionEvent();
    public int successCode;
    String requestedId;
    CategoryDrawerItem categoryDrawerItem;

    public PromotionCallBack() {
    }

    public PromotionCallBack(String requestedId, CategoryDrawerItem categoryDrawerItem, int successCode) {
        this.requestedId = requestedId;
        this.successCode = successCode;
        this.categoryDrawerItem = categoryDrawerItem;
    }

    @Override
    public void onResponse(Call<PromotionResponse> call, Response<PromotionResponse> response) {
        PromotionResponse promotionResponse = response.body();
        if (response.body() != null){
            if(promotionResponse.getStatus().getCode() == 200){
                promotionEvent.setSuccess(true);
                promotionEvent.setSuccessCode(successCode);
                promotionEvent.setCategoryDrawerItem(categoryDrawerItem);
                promotionEvent.setPromotionResponse(promotionResponse);
            }else{
                promotionEvent.setMessage(promotionResponse.getStatus().getMessage());
            }
        }
        MyApplication.getInstance().mBus.post(promotionEvent);
    }

    @Override
    public void onFailure(Call<PromotionResponse> call, Throwable t) {
        promotionEvent.setMessage(t.toString());
        MyApplication.getInstance().mBus.post(promotionEvent);
    }

}
