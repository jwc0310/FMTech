package parknshop.parknshopapp.Rest.callback;

/**
 * Created by kwongyuenpan on 14/3/16.
 */

import parknshop.parknshopapp.Model.UpdateWishListResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.RemoveProductFromWishListResponseEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RemoveProductFromWishListResponseCallBack implements Callback<UpdateWishListResponse> {

    RemoveProductFromWishListResponseEvent removeProductFromWishListResponseEvent = new RemoveProductFromWishListResponseEvent();

    @Override
    public void onResponse(Call<UpdateWishListResponse> call, Response<UpdateWishListResponse> response) {
        if(response != null && response.isSuccess()){
            UpdateWishListResponse UpdateWishListResponse = response.body();
            if (UpdateWishListResponse != null) {
                removeProductFromWishListResponseEvent.setSuccess(true);
                removeProductFromWishListResponseEvent.setUpdateWishListResponse(UpdateWishListResponse);
            }
        }else{
            removeProductFromWishListResponseEvent.setMessage(response.message());
        }
        MyApplication.getInstance().mBus.post(removeProductFromWishListResponseEvent);

    }

    @Override
    public void onFailure(Call<UpdateWishListResponse> call, Throwable t) {
        removeProductFromWishListResponseEvent.setMessage(t.getMessage());
        MyApplication.getInstance().mBus.post(removeProductFromWishListResponseEvent);
    }
}
