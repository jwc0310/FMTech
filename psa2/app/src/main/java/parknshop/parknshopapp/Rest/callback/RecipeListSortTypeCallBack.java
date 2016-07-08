package parknshop.parknshopapp.Rest.callback;


import parknshop.parknshopapp.Model.DishTypeResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.RecipeListSortTypeEvent;
import retrofit2.Call;
import retrofit2.Response;

/**
 * Created by chrisyu on 3/5/16.
 */
public class RecipeListSortTypeCallBack implements retrofit2.Callback<DishTypeResponse> {
    RecipeListSortTypeEvent event = new RecipeListSortTypeEvent();

    @Override
    public void onResponse(Call<DishTypeResponse> call, Response<DishTypeResponse> response) {
        if(response != null && response.isSuccess()){
            DishTypeResponse remoteResponse = response.body();
            if (response != null) {
                event.setResponseObject(remoteResponse);
                event.setSuccess(true);
            }
        } else {
            event.setMessage(response.message());
        }
        MyApplication.getInstance().mBus.post(event);
    }

    @Override
    public void onFailure(Call<DishTypeResponse> call, Throwable t) {
        event.setMessage(t.getMessage());
        MyApplication.getInstance().mBus.post(event);
    }
}
