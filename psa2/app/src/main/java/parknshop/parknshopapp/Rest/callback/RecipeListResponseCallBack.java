package parknshop.parknshopapp.Rest.callback;

import parknshop.parknshopapp.Model.RecipeListResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.RecipeListResponseEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by chrisyu on 3/5/16.
 */
public class RecipeListResponseCallBack implements Callback<RecipeListResponse> {
    RecipeListResponseEvent recipeListResponseEvent = new RecipeListResponseEvent();

    @Override
    public void onResponse(Call<RecipeListResponse> call, Response<RecipeListResponse> response) {
        if(response != null && response.isSuccess()){
            RecipeListResponse remoteResponse = response.body();
            if (response != null) {
                recipeListResponseEvent.setResponseObject(remoteResponse);
                recipeListResponseEvent.setSuccess(true);
            }
        } else {
            recipeListResponseEvent.setMessage(response.message());
        }
        MyApplication.getInstance().mBus.post(recipeListResponseEvent);
    }

    @Override
    public void onFailure(Call<RecipeListResponse> call, Throwable t) {
        recipeListResponseEvent.setMessage(t.getMessage());
        MyApplication.getInstance().mBus.post(recipeListResponseEvent);
    }
}

/*public class TNCResponseCallBack implements Callback<TNCResponse> {
    TNCResponseEvent mTNCResponseEvent = new TNCResponseEvent();

    @Override
    public void onResponse(Call<TNCResponse> call, Response<TNCResponse> response) {
        if(response != null && response.isSuccess()){
            TNCResponse tNCResponse = response.body();
            if (tNCResponse != null) {
                mTNCResponseEvent.setTNCResponse(tNCResponse);
                mTNCResponseEvent.setSuccess(true);
            }
        } else {
            mTNCResponseEvent.setMessage(response.message());
        }
        MyApplication.getInstance().mBus.post(mTNCResponseEvent);

    }

    @Override
    public void onFailure(Call<TNCResponse> call, Throwable t) {
        mTNCResponseEvent.setMessage(t.getMessage());
        MyApplication.getInstance().mBus.post(mTNCResponseEvent);
    }
}
*/