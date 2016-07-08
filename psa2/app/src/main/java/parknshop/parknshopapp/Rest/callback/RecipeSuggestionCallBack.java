package parknshop.parknshopapp.Rest.callback;


import parknshop.parknshopapp.Model.RecipeDetailResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.RecipeSuggestionEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by chrisyu on 5/5/16.
 */
public class RecipeSuggestionCallBack implements Callback<RecipeDetailResponse> {
    RecipeSuggestionEvent event = new RecipeSuggestionEvent();

    @Override
    public void onResponse(Call<RecipeDetailResponse> call, Response<RecipeDetailResponse> response) {
        if(response != null && response.isSuccess()){
            RecipeDetailResponse remoteResponse = response.body();
            if (response != null) {
                event .setRecipeDetailResponse(remoteResponse);
                event.setSuccess(true);
            }
        } else {
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
