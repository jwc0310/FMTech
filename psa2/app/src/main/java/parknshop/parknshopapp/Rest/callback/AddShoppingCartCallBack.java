package parknshop.parknshopapp.Rest.callback;

import android.content.Context;
import android.util.Log;
import android.view.View;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

import java.io.IOException;

import parknshop.parknshopapp.Base.BaseActivity;
import parknshop.parknshopapp.Model.EmptyJson;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.AddShoppingCartEvent;
import parknshop.parknshopapp.Rest.event.ToastEvent;
import parknshop.parknshopapp.Utils.ToastUtils;
import parknshop.parknshopapp.WebServiceModel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by chrisyu on 18/3/16.
 */
public class AddShoppingCartCallBack implements Callback<EmptyJson> {
    AddShoppingCartEvent addShoppingCartEvent = new AddShoppingCartEvent();
    Context context;
    String type;
    public int successCode;
    public boolean miniCart;
    public boolean callCartApi = true;

    public AddShoppingCartCallBack(Context context, String type) {
        this.context = context;
        this.type = type;
    }

    public AddShoppingCartCallBack(Context context, boolean callCartApi, String type) {
        this.context = context;
        this.type = type;
        this.callCartApi = callCartApi;
    }

    public AddShoppingCartCallBack(Context context, String type, int successCode) {
        this.successCode = successCode;
        this.context = context;
        this.type = type;
    }

    public AddShoppingCartCallBack(Context context, int quantity, String type, int successCode, boolean miniCart) {
        this.miniCart = true;
        this.successCode = successCode;
        this.context = context;
        this.type = type;
        this.quantity = quantity;
    }

    int quantity;
    public AddShoppingCartCallBack(Context context, int quantity, String type, boolean miniCart) {
        miniCart = true;
        this.context = context;
        this.type = type;
        this.quantity = quantity;
    }

    @Override
    public void onResponse(Call<EmptyJson> call, Response<EmptyJson> response) {
        if(response != null) {

            switch (response.code()) {
                case 200:
                    ((BaseActivity)context).loadingView.setVisibility(View.GONE);
                    Log.i("ShoppingCallBack s", "ShoppingCallBack s" + response.code());
                    addShoppingCartEvent.type = type;
                    addShoppingCartEvent.quantity = quantity;
                    addShoppingCartEvent.successCode = successCode;
                    if(miniCart) {
                        WebServiceModel.getInstance(context).requestGetMiniCart(context, type, successCode);
                    } else if (callCartApi) {
                        WebServiceModel.getInstance(context).requestGetCart(context, type, successCode);
                    }
                    MyApplication.getInstance().mBus.post(addShoppingCartEvent);
                    break;
                case 400:case 500:
                    Gson gson = new Gson();
                    TypeAdapter<EmptyJson> adapter = gson.getAdapter(EmptyJson.class);
                    try {
                        if (response.errorBody() != null) {
                            EmptyJson emptyJson = adapter.fromJson(response.errorBody().string());
                            ToastEvent toastEvent = new ToastEvent();
                            toastEvent.setMessage(context.getString(R.string.process_fail));
                            ((BaseActivity)context).hideProgressDialog();
                            //cartEvent.setCartResponse(cartResponse);
                            //cartEvent.setErrorCode(cartResponse.getErrorCode());
                            //cartEvent.setMessage(ConfigHelper.getValue(null, "RC_" + cartResponse.getErrorCode()));
                            //Log.i("cartEvent", "cartEvent" + cartResponse.getErrorCode() );
                            //ToastUtils.show(context, ConfigHelper.getValue(null, "RC_" + emptyJson.getErrorCode()));
                            MyApplication.getInstance().mBus.post(addShoppingCartEvent);
                            MyApplication.getInstance().mBus.post(toastEvent);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                        Log.i("exception", "exception " + e.getMessage());

                    }
                    break;
            }
        }
    }

    @Override
    public void onFailure(Call<EmptyJson> call, Throwable t) {
        ((BaseActivity)context).loadingView.setVisibility(View.GONE);
        Log.i("ShoppingCallBack f", "ShoppingCallBack f:" + t.toString());
        ToastUtils.show(context, "Error " +t.toString());
        if(miniCart) {
            WebServiceModel.getInstance(context).requestGetMiniCart(context, type, successCode);
        } else  if (callCartApi) {
            WebServiceModel.getInstance(context).requestGetCart(context, type, successCode);
        }
        addShoppingCartEvent.setMessage(t.toString());
        MyApplication.getInstance().mBus.post(addShoppingCartEvent);
    }
}