package parknshop.parknshopapp.Rest.callback;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

import java.io.IOException;

import parknshop.parknshopapp.ConfigHelper;
import parknshop.parknshopapp.Model.LoginResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.LoginEvent;
import parknshop.parknshopapp.Utils.LogUtil;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by chrisyu on 17/3/16.
 */
public class LoginCallBack implements Callback<LoginResponse> {
    LoginEvent loginEvent = new LoginEvent();

    @Override
    public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {

//        LogUtil.info("", "success:::"+response.raw().headers().size());
//        for(int i = 0; i < response.raw().headers().size(); i++){
//            LogUtil.info("", "success:::"+i+", "+response.raw().headers().name(i));
//        }
//        LogUtil.info("", "success:::1"+response.raw().headers().get("JSESSIONID"));
//
//        LogUtil.info("", "response:"+response.code());
//        LogUtil.info("", "response3333:"+response.raw().headers());

        if(response != null){
            LoginResponse loginResponse = response.body();
            switch (response.code()){
                case 200:
                    if (loginResponse != null) {
                        loginEvent.setLoginResponse(loginResponse);
                        if (response.isSuccess()) {
                            loginEvent.setSuccess(true);
                        } else if (loginResponse != null && loginResponse.isActivation()) {

                        }
                    }
                    break;
                case 400:
                    Gson gson = new Gson();
                    TypeAdapter<LoginResponse> adapter = gson.getAdapter(LoginResponse.class);
                    try {
                        if (response.errorBody() != null) {
                            loginResponse = adapter.fromJson(response.errorBody().string());
                            loginEvent.setLoginResponse(loginResponse);
                            loginEvent.setErrorCode(loginResponse.getErrorCode());
                            loginEvent.setMessage(ConfigHelper.getValue(null, "RC_" + loginResponse.getErrorCode()));
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
            }
        }

        MyApplication.getInstance().mBus.post(loginEvent);
    }

    @Override
    public void onFailure(Call<LoginResponse> call, Throwable t) {
        LogUtil.info("", "response:onFailure:"+t.toString());
        loginEvent.setMessage(t.toString());
        MyApplication.getInstance().mBus.post(loginEvent);
    }
}
