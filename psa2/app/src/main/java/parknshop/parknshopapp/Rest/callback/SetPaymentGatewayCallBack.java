package parknshop.parknshopapp.Rest.callback;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

import java.io.IOException;

import parknshop.parknshopapp.ConfigHelper;
import parknshop.parknshopapp.Model.ErrorCode;
import parknshop.parknshopapp.Model.LoginResponse;
import parknshop.parknshopapp.Model.PaymentResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.SetPaymentGatewayEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by kwongyuenpan on 14/4/16.
 */
public class SetPaymentGatewayCallBack implements Callback<PaymentResponse> {
    SetPaymentGatewayEvent setPaymentGatewayEvent = new SetPaymentGatewayEvent();

    @Override
    public void onResponse(Call<PaymentResponse> call, Response<PaymentResponse> response) {
        if(response != null){
            PaymentResponse paymentResponse = response.body();

            switch (response.code()){
                case 200:
                    if(paymentResponse != null){
                        setPaymentGatewayEvent.setSuccess(true);
                        setPaymentGatewayEvent.setPaymentResponse(paymentResponse);
//                        LogUtil.info("", "paymentResponse:"+paymentResponse.getStatus());
                    }
                    break;
                default:
                    Gson gson = new Gson();
                    TypeAdapter<LoginResponse> adapter = gson.getAdapter(LoginResponse.class);
                    try {
                        if (response.errorBody() != null) {
                            ErrorCode errorCode = adapter.fromJson(response.errorBody().string());
                            setPaymentGatewayEvent.setMessage(ConfigHelper.getValue(null, "RC_" + errorCode.getErrorCode()));
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
            }
        }
        MyApplication.getInstance().mBus.post(setPaymentGatewayEvent);
    }

    @Override
    public void onFailure(Call<PaymentResponse> call, Throwable t) {
        setPaymentGatewayEvent.setMessage(t.toString());
        MyApplication.getInstance().mBus.post(setPaymentGatewayEvent);
    }
}