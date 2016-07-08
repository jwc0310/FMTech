package parknshop.parknshopapp.Rest.callback;

/**
 * Created by kwongyuenpan on 14/3/16.
 */

import parknshop.parknshopapp.Model.AddWishListResponse;
import parknshop.parknshopapp.Model.Product;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.AddWishListResponseEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AddWishListResponseCallBack implements Callback<AddWishListResponse> {

    AddWishListResponseEvent addWishListResponseEvent = new AddWishListResponseEvent();
    Product product;

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public void onResponse(Call<AddWishListResponse> call, Response<AddWishListResponse> response) {
        if(response != null && response.isSuccess()){
            AddWishListResponse addWishListResponse = response.body();
            if (addWishListResponse != null) {
                addWishListResponseEvent.setAddWishListResponse(addWishListResponse);
                addWishListResponseEvent.setProduct(getProduct());
                addWishListResponseEvent.setSuccess(true);
            }
        }else{
            addWishListResponseEvent.setMessage(response.message());
        }
        MyApplication.getInstance().mBus.post(addWishListResponseEvent);

    }

    @Override
    public void onFailure(Call<AddWishListResponse> call, Throwable t) {
        addWishListResponseEvent.setMessage(t.getMessage());
        MyApplication.getInstance().mBus.post(addWishListResponseEvent);
    }
}
