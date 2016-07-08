package parknshop.parknshopapp.Rest.callback;

import java.util.List;

import parknshop.parknshopapp.Model.Product;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.MultipleProductsEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by kwongyuenpan on 13/5/16.
 */
public class GetProductRatingCallBack implements Callback<List<Product>> {
    MultipleProductsEvent event = new MultipleProductsEvent();

    @Override
    public void onResponse(Call<List<Product>> call, Response<List<Product>> response) {
        if(response != null) {
            if(response.body() != null) {
                event.setSuccess(true);
                event.setProducts(response.body());
                MyApplication.getInstance().mBus.post(event);
            }
        }
    }

    @Override
    public void onFailure(Call<List<Product>> call, Throwable t) {
        event.setMessage(t.getMessage());
        MyApplication.getInstance().mBus.post(event);
    }
}