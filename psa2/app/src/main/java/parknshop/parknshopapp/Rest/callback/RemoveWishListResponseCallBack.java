package parknshop.parknshopapp.Rest.callback;

/**
 * Created by kwongyuenpan on 14/3/16.
 */

import parknshop.parknshopapp.Model.UpdateWishListResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.RemoveWishListResponseEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RemoveWishListResponseCallBack implements Callback<UpdateWishListResponse> {

    RemoveWishListResponseEvent removeWishListResponseEvent = new RemoveWishListResponseEvent();

    @Override
    public void onResponse(Call<UpdateWishListResponse> call, Response<UpdateWishListResponse> response) {
        if(response != null && response.isSuccess()){
            UpdateWishListResponse UpdateWishListResponse = response.body();
            if (UpdateWishListResponse != null) {
                removeWishListResponseEvent.setUpdateWishListResponse(UpdateWishListResponse);
                removeWishListResponseEvent.setSuccess(true);
            }
        }else{
            removeWishListResponseEvent.setMessage(response.message());
        }
        MyApplication.getInstance().mBus.post(removeWishListResponseEvent);

    }

    @Override
    public void onFailure(Call<UpdateWishListResponse> call, Throwable t) {
        removeWishListResponseEvent.setMessage(t.getMessage());
        MyApplication.getInstance().mBus.post(removeWishListResponseEvent);
    }
}
