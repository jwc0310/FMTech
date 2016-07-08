package parknshop.parknshopapp.Rest.callback;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

import java.io.IOException;

import parknshop.parknshopapp.ConfigHelper;
import parknshop.parknshopapp.Model.CartResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.SetShoppingCartTypeEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by chrisyu on 16/3/17.
 */
public class SetShoppingCartTypeCallBack implements Callback<CartResponse> {
    SetShoppingCartTypeEvent setShoppingCartTypeEvent = new SetShoppingCartTypeEvent();

    @Override
    public void onResponse(Call<CartResponse> call, Response<CartResponse> response) {
        if(response != null){
            CartResponse cartResponse = response.body();
            switch (response.code()){
                case 200:
                    if (cartResponse != null) {
                        setShoppingCartTypeEvent.setCartResponse(cartResponse);
                        if (response.isSuccess()) {
                            setShoppingCartTypeEvent.setSuccess(true);
                        }
                    }
                    break;
                case 400:
                    Gson gson = new Gson();
                    TypeAdapter<CartResponse> adapter = gson.getAdapter(CartResponse.class);
                    try {
                        if (response.errorBody() != null) {
                            cartResponse = adapter.fromJson(response.errorBody().string());
                            setShoppingCartTypeEvent.setCartResponse(cartResponse);
                            setShoppingCartTypeEvent.setErrorCode(cartResponse.getErrorCode());
                            setShoppingCartTypeEvent.setMessage(ConfigHelper.getValue(null, "RC_" + cartResponse.getErrorCode()));
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
            }
        }

        MyApplication.getInstance().mBus.post(setShoppingCartTypeEvent);
    }

    @Override
    public void onFailure(Call<CartResponse> call, Throwable t) {
        setShoppingCartTypeEvent.setMessage(t.toString());
        MyApplication.getInstance().mBus.post(setShoppingCartTypeEvent);
    }

}
