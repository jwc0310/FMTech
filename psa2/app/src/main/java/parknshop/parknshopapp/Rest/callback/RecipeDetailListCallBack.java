package parknshop.parknshopapp.Rest.callback;


import parknshop.parknshopapp.Model.RecipeDetailResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.RecipeDetailListEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by chrisyu on 4/5/16.
 */
public class RecipeDetailListCallBack implements Callback<RecipeDetailResponse> {
    RecipeDetailListEvent event = new RecipeDetailListEvent();
    String id;

    public RecipeDetailListCallBack(String id) {
        this.id = id;
    }

    @Override
    public void onResponse(Call<RecipeDetailResponse> call, Response<RecipeDetailResponse> response) {
        if(response != null && response.isSuccess()){
            RecipeDetailResponse recipeDetailItemResponse = response.body();
            if (recipeDetailItemResponse != null) {
                event.setResponse(recipeDetailItemResponse);
                event.setId(id);
                event.setSuccess(true);
            }
        }else{
            event.setMessage(response.message());
        }
        MyApplication.getInstance().mBus.post(event);
    }

    @Override
    public void onFailure(Call<RecipeDetailResponse> call, Throwable t) {
        event.setMessage(t.getMessage());
        MyApplication.getInstance().mBus.post(event);
    }
}
