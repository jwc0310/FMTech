package parknshop.parknshopapp.Rest.callback;

/**
 * Created by kwongyuenpan on 14/3/16.
 */

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

import java.io.IOException;

import parknshop.parknshopapp.ConfigHelper;
import parknshop.parknshopapp.Model.AddWishListResponse;
import parknshop.parknshopapp.Model.Product;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.AddNewWishListResponseEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AddNewWishListResponseCallBack implements Callback<AddWishListResponse> {

    AddNewWishListResponseEvent addNewWishListResponseEvent = new AddNewWishListResponseEvent();
    Product product;

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public void onResponse(Call<AddWishListResponse> call, Response<AddWishListResponse> response) {

        if (response != null) {
            AddWishListResponse addWishListResponse = response.body();
            switch (response.code()) {
                case 200:
                    if (addWishListResponse != null) {
                        addNewWishListResponseEvent.setAddWishListResponse(addWishListResponse);
                        addNewWishListResponseEvent.setProduct(getProduct());
                        if (response.isSuccess()) {
                            addNewWishListResponseEvent.setSuccess(true);
                        }
                    }
                    break;
                case 400:
                    Gson gson = new Gson();
                    TypeAdapter<AddWishListResponse> adapter = gson.getAdapter(AddWishListResponse.class);
                    try {
                        if (response.errorBody() != null) {
                            addWishListResponse = adapter.fromJson(response.errorBody().string());
                            addNewWishListResponseEvent.setAddWishListResponse(addWishListResponse);
                            addNewWishListResponseEvent.setErrorCode(addWishListResponse.getErrorCode());
                            addNewWishListResponseEvent.setMessage(ConfigHelper.getValue(null, "RC_" + addWishListResponse.getErrorCode()));
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
            }

            MyApplication.getInstance().mBus.post(addNewWishListResponseEvent);

        }
    }

    @Override
    public void onFailure(Call<AddWishListResponse> call, Throwable t) {
        addNewWishListResponseEvent.setMessage(t.getMessage());
        MyApplication.getInstance().mBus.post(addNewWishListResponseEvent);
    }
}
