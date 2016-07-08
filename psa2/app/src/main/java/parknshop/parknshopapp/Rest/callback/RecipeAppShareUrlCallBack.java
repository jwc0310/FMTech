package parknshop.parknshopapp.Rest.callback;

import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.RecipeAppShareUrlEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by chrisyu on 14/5/16.
 */
public class RecipeAppShareUrlCallBack implements Callback<String> {
    RecipeAppShareUrlEvent event = new RecipeAppShareUrlEvent();

    @Override
    public void onResponse(Call<String> call, Response<String> response) {
        if(response != null && response.isSuccess()){
            //RecipeDetailResponse remoteResponse = response.body();
            //f (response != null) {
            //    event .setRecipeDetailResponse(remoteResponse);
            //    event.setSuccess(true);
            //}
            String responseString = response.body();
            event.setHtmlData(responseString);

            MyApplication.getInstance().mBus.post(event);
        } else {
            event.setMessage(response.message());
        }
        MyApplication.getInstance().mBus.post(event);
    }

    @Override
    public void onFailure(Call<String> call, Throwable t) {
        event.setMessage(t.getMessage());
        MyApplication.getInstance().mBus.post(event);
    }
}
