package parknshop.parknshopapp.Rest.callback;

/**
 * Created by kwongyuenpan on 14/3/16.
 */

import parknshop.parknshopapp.Model.Product;
import parknshop.parknshopapp.Model.WishListResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.WishListResponseEvent;
import parknshop.parknshopapp.Utils.LogUtil;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WishListResponseCallBack implements Callback<WishListResponse[]> {

    WishListResponseEvent wishListResponseEvent = new WishListResponseEvent();
    Product product;
    public String type;

    public WishListResponseCallBack (boolean showDialog) {
        wishListResponseEvent.setShowDialog(showDialog);
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public void onResponse(Call<WishListResponse[]> call, Response<WishListResponse[]> response) {
        if(response != null && response.isSuccess()){
            WishListResponse[] wishListResponses = response.body();
            if (wishListResponses != null) {
                wishListResponseEvent.setWishListResponses(wishListResponses);
                wishListResponseEvent.setProduct(getProduct());
                wishListResponseEvent.type = type;
                wishListResponseEvent.setSuccess(true);
            }
        }else{
            wishListResponseEvent.setMessage(response.message());
        }
        MyApplication.getInstance().mBus.post(wishListResponseEvent);

    }

    @Override
    public void onFailure(Call<WishListResponse[]> call, Throwable t) {
        wishListResponseEvent.setMessage(t.getMessage());
        LogUtil.info("", "onFailure:"+t.getMessage());
        MyApplication.getInstance().mBus.post(wishListResponseEvent);
    }
}
