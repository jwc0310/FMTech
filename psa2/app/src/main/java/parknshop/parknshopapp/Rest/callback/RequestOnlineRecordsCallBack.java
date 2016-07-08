package parknshop.parknshopapp.Rest.callback;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

import java.io.IOException;

import parknshop.parknshopapp.ConfigHelper;
import parknshop.parknshopapp.Model.OnlineRecords;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.RequestOnlineRecordsEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by hp on 13/4/2016.
 */
public class RequestOnlineRecordsCallBack implements Callback<OnlineRecords> {
    RequestOnlineRecordsEvent requestOnlineRecordsEvent = new RequestOnlineRecordsEvent();

    @Override
    public void onResponse(Call<OnlineRecords> call, Response<OnlineRecords> response) {
        if(response != null){
            OnlineRecords form = response.body();
            switch (response.code()){
                case 200:
                    if (form != null) {
                        requestOnlineRecordsEvent.setOnlineRecords(form);
                        if (response.isSuccess()) {
                            requestOnlineRecordsEvent.setSuccess(true);
                        } /*else if (form != null && form.isActivation()) {

                        }*/
                    }
                    break;
                case 400:
                    Gson gson = new Gson();
                    TypeAdapter<OnlineRecords> adapter = gson.getAdapter(OnlineRecords.class);
                    try {
                        if (response.errorBody() != null) {
                            form = adapter.fromJson(response.errorBody().string());
                            requestOnlineRecordsEvent.setOnlineRecords(form);
                            requestOnlineRecordsEvent.setErrorCode(form.getErrorCode());
                            requestOnlineRecordsEvent.setMessage(ConfigHelper.getValue(null, "RC_" + form.getErrorCode()));
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
            }
        }

        MyApplication.getInstance().mBus.post(requestOnlineRecordsEvent);
    }

    @Override
    public void onFailure(Call<OnlineRecords> call, Throwable t) {
        requestOnlineRecordsEvent.setMessage(t.getMessage());
        MyApplication.getInstance().mBus.post(requestOnlineRecordsEvent);
    }
}
