package parknshop.parknshopapp.Rest.callback;

import parknshop.parknshopapp.Model.RecipeDetailItemResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.RecipeDetailItemEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by chrisyu on 5/5/16.
 */
public class RecipeDetailItemCallBack implements Callback<RecipeDetailItemResponse> {
    RecipeDetailItemEvent event = new RecipeDetailItemEvent();

    @Override
    public void onResponse(Call<RecipeDetailItemResponse> call, Response<RecipeDetailItemResponse> response) {
        if(response != null && response.isSuccess()){
            RecipeDetailItemResponse recipeDetailItemResponse = response.body();
            if (recipeDetailItemResponse != null) {
                event.setResponse(recipeDetailItemResponse);
                event.setSuccess(true);
            }
        }else{
            event.setMessage(response.message());
        }
        MyApplication.getInstance().mBus.post(event);
    }

    @Override
    public void onFailure(Call<RecipeDetailItemResponse> call, Throwable t) {
        event.setMessage(t.getMessage());
        MyApplication.getInstance().mBus.post(event);
    }
}
