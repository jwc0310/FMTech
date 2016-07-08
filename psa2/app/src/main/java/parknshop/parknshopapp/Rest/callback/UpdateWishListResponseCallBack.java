package parknshop.parknshopapp.Rest.callback;

/**
 * Created by kwongyuenpan on 14/3/16.
 */

import parknshop.parknshopapp.Model.UpdateWishListResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.UpdateWishListResponseEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UpdateWishListResponseCallBack implements Callback<UpdateWishListResponse> {

    UpdateWishListResponseEvent updateWishListResponseEvent = new UpdateWishListResponseEvent();

    @Override
    public void onResponse(Call<UpdateWishListResponse> call, Response<UpdateWishListResponse> response) {
        if(response != null && response.isSuccess()){
            UpdateWishListResponse updateWishListResponse = response.body();
            if (updateWishListResponse != null) {
                updateWishListResponseEvent.setUpdateWishListResponse(updateWishListResponse);
                updateWishListResponseEvent.setSuccess(true);
            }
        }else{
            updateWishListResponseEvent.setMessage(response.message());
        }
        MyApplication.getInstance().mBus.post(updateWishListResponseEvent);

    }

    @Override
    public void onFailure(Call<UpdateWishListResponse> call, Throwable t) {
        updateWishListResponseEvent.setMessage(t.getMessage());
        MyApplication.getInstance().mBus.post(updateWishListResponseEvent);
    }
}
