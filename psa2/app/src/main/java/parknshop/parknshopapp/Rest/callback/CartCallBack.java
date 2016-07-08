package parknshop.parknshopapp.Rest.callback;

import android.content.Context;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.orhanobut.hawk.Hawk;

import java.io.IOException;

import parknshop.parknshopapp.ConfigHelper;
import parknshop.parknshopapp.Model.CartResponse;
import parknshop.parknshopapp.Model.Utility;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.CartEvent;
import parknshop.parknshopapp.Utils.AppUtils;
import parknshop.parknshopapp.Utils.LogUtil;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by chrisyu on 16/3/17.
 */
public class CartCallBack implements Callback<CartResponse> {
    CartEvent cartEvent = new CartEvent();
    Context context;
    String type;
    CartResponse cartResponse;
    int successCode;

    public CartCallBack(Context context, String type) {
        this.context = context;
        this.type = type;
    }

    public CartCallBack(Context context, String type, int successCode) {
        this.context = context;
        this.type = type;
        this.successCode = successCode;
    }

    @Override
    public void onResponse(Call<CartResponse> call, Response<CartResponse> response) {
        LogUtil.info("", "response result:"+response.code()+", "+(response != null));
        Log.i("successCode", "successCode " + successCode);
        if(response != null) {
            switch (response.code()) {
                case 200:
                    Hawk.put(AppUtils.remote_shopping_cart, response.body());
                    //Log.i("CartCallBack success", "CartCallBack success" + response.message() + " " + response.body().getTotalItems() + " " + response.body().getTotalUnitCount());
                    if (response.body() != null)
                        Utility.setCartItemNumber(context, response.body().getTotalUnitCount());

                    cartEvent.setSuccess(true);
                    cartEvent.setSuccessCode(successCode);
                    cartEvent.setCartResponse(response.body());
                    cartEvent.setType(type);
                    break;
                case 400:
                    Gson gson = new Gson();
                    TypeAdapter<CartResponse> adapter = gson.getAdapter(CartResponse.class);
                    try {
                        if (response.errorBody() != null) {
                            cartResponse = adapter.fromJson(response.errorBody().string());
                            cartEvent.setCartResponse(cartResponse);
                            cartEvent.setErrorCode(cartResponse.getErrorCode());
                            cartEvent.setMessage(ConfigHelper.getValue(null, "RC_" + cartResponse.getErrorCode()));
                            Log.i("cartEvent", "cartEvent" + cartResponse.getErrorCode() );
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                        Log.i("exception", "exception " + e.getMessage());

                    }
                    break;
            }
            MyApplication.getInstance().mBus.post(cartEvent);
        }
    }

    @Override
    public void onFailure(Call<CartResponse> call, Throwable t) {
        Log.i("CartCallBack failure", "CartCallBack failure" + t.getMessage());
        cartEvent.setMessage(t.toString());
        MyApplication.getInstance().mBus.post(cartEvent);
    }

    public String getType() {
        return type;
    }
}
