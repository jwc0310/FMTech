package parknshop.parknshopapp.Rest.callback;

/**
 * Created by kwongyuenpan on 14/3/16.
 */

import parknshop.parknshopapp.Model.AddWishListResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.AddProductToWishListResponseEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AddProductToWishListResponseCallBack implements Callback<AddWishListResponse> {

    AddProductToWishListResponseEvent addProductToWishListResponseEvent = new AddProductToWishListResponseEvent();

    @Override
    public void onResponse(Call<AddWishListResponse> call, Response<AddWishListResponse> response) {
        if(response != null && response.isSuccess()){
            AddWishListResponse addWishListResponse = response.body();
            if (addWishListResponse != null) {
                addProductToWishListResponseEvent.setSuccess(true);
            }
        }else{
            addProductToWishListResponseEvent.setMessage(response.message());
        }
        MyApplication.getInstance().mBus.post(addProductToWishListResponseEvent);

    }

    @Override
    public void onFailure(Call<AddWishListResponse> call, Throwable t) {
        addProductToWishListResponseEvent.setMessage(t.getMessage());
        MyApplication.getInstance().mBus.post(addProductToWishListResponseEvent);
    }
}
