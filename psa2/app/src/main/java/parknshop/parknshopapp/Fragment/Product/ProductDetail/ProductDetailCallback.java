package parknshop.parknshopapp.Fragment.Product.ProductDetail;

import parknshop.parknshopapp.Model.Product;
import parknshop.parknshopapp.MyApplication;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by chrisyu on 17/3/16.
 */
public class ProductDetailCallback implements Callback<Product> {

    ProductDetailEvent productDetailEvent = new ProductDetailEvent();

    public ProductDetailCallback(int hashCode) {
        productDetailEvent.setSuccessCode(hashCode);
    }

    @Override
    public void onResponse(Call<Product> call, Response<Product> response) {
        //Log.i("ProductDetailCallback s", "ProductDetailCallback s" + response.message());
        if(response != null && response.isSuccess()){
            Product product = response.body();

            if (product != null) {
                productDetailEvent.setProduct(product);
                productDetailEvent.setSuccess(true);
            }
        }else{
            productDetailEvent.setMessage(response.message());
        }
        MyApplication.getInstance().mBus.post(productDetailEvent);
    }

    @Override
    public void onFailure(Call<Product> call, Throwable t) {
        //Log.i("ProductDetailCallback f", "ProductDetailCallback f" + t.getMessage());
        productDetailEvent.setMessage(t.getMessage());
        MyApplication.getInstance().mBus.post(productDetailEvent);
    }
}
