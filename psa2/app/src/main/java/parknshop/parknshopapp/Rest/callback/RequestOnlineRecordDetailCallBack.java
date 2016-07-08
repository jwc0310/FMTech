package parknshop.parknshopapp.Rest.callback;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

import java.io.IOException;

import parknshop.parknshopapp.ConfigHelper;
import parknshop.parknshopapp.Model.OnlineRecordDetail;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.RequestOnlineRecordDetailEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by hp on 13/4/2016.
 */
public class RequestOnlineRecordDetailCallBack implements Callback<OnlineRecordDetail> {
    RequestOnlineRecordDetailEvent requestOnlineRecordDetailEvent = new RequestOnlineRecordDetailEvent();

    @Override
    public void onResponse(Call<OnlineRecordDetail> call, Response<OnlineRecordDetail> response) {
        if(response != null){
            OnlineRecordDetail form = response.body();
            switch (response.code()){
                case 200:
                    if (form != null) {
                        requestOnlineRecordDetailEvent.setOnlineRecordDetail(form);
                        if (response.isSuccess()) {
                            requestOnlineRecordDetailEvent.setSuccess(true);
                        } /*else if (form != null && form.isActivation()) {

                        }*/
                    }
                    break;
                case 400:
                    Gson gson = new Gson();
                    TypeAdapter<OnlineRecordDetail> adapter = gson.getAdapter(OnlineRecordDetail.class);
                    try {
                        if (response.errorBody() != null) {
                            form = adapter.fromJson(response.errorBody().string());
                            requestOnlineRecordDetailEvent.setOnlineRecordDetail(form);
                            requestOnlineRecordDetailEvent.setErrorCode(form.getErrorCode());
                            requestOnlineRecordDetailEvent.setMessage(ConfigHelper.getValue(null, "RC_" + form.getErrorCode()));
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
            }
        }

        MyApplication.getInstance().mBus.post(requestOnlineRecordDetailEvent);
    }

    @Override
    public void onFailure(Call<OnlineRecordDetail> call, Throwable t) {
        requestOnlineRecordDetailEvent.setMessage(t.getMessage());
        MyApplication.getInstance().mBus.post(requestOnlineRecordDetailEvent);
    }
}
