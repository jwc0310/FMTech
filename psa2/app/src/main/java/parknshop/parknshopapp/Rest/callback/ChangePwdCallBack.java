package parknshop.parknshopapp.Rest.callback;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

import java.io.IOException;

import parknshop.parknshopapp.ConfigHelper;
import parknshop.parknshopapp.Model.ChangePwdResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.ChangePwdEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by chrisyu on 17/3/16.
 */
public class ChangePwdCallBack implements Callback<ChangePwdResponse> {
    ChangePwdEvent changePwdEvent = new ChangePwdEvent();

    @Override
    public void onResponse(Call<ChangePwdResponse> call, Response<ChangePwdResponse> response) {

        if(response != null){
            ChangePwdResponse changePwdResponse = response.body();
            switch (response.code()){
                case 200:
                    if (changePwdResponse != null) {
                        changePwdEvent.setChangePwdResponse(changePwdResponse);
                        if (response.isSuccess()) {
                            changePwdEvent.setSuccess(true);
                        }
                    }
                    break;
                case 400:
                    Gson gson = new Gson();
                    TypeAdapter<ChangePwdResponse> adapter = gson.getAdapter(ChangePwdResponse.class);
                    try {
                        if (response.errorBody() != null) {
                            changePwdResponse = adapter.fromJson(response.errorBody().string());
                            changePwdEvent.setChangePwdResponse(changePwdResponse);
                            changePwdEvent.setErrorCode(changePwdResponse.getErrorCode());
                            changePwdEvent.setMessage(ConfigHelper.getValue(null, "RC_" + changePwdResponse.getErrorCode()));
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
            }
        }

        MyApplication.getInstance().mBus.post(changePwdEvent);
    }

    @Override
    public void onFailure(Call<ChangePwdResponse> call, Throwable t) {
        changePwdEvent.setMessage(t.toString());
        MyApplication.getInstance().mBus.post(changePwdEvent);
    }
}
