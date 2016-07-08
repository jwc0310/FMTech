package parknshop.parknshopapp.Rest.callback;

import parknshop.parknshopapp.Model.BaseStatus;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.ReadMsgEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by chrisyu on 17/3/16.
 */
public class ReadMsgCallBack implements Callback<BaseStatus> {
    ReadMsgEvent readMsgEvent = new ReadMsgEvent();

    @Override
    public void onResponse(Call<BaseStatus> call, Response<BaseStatus> response) {

        if(response != null){
            BaseStatus baseStatus = response.body();
            switch (baseStatus.getStatus().getCode()){
                case 200:
                        if (response.isSuccess()) {
                            readMsgEvent.setSuccess(true);
                        }
                    break;
                default:
                    readMsgEvent.setMessage(baseStatus.getStatus().getMessage());
                    break;
            }
        }

        MyApplication.getInstance().mBus.post(readMsgEvent);
    }

    @Override
    public void onFailure(Call<BaseStatus> call, Throwable t) {
        readMsgEvent.setMessage(t.toString());
        MyApplication.getInstance().mBus.post(readMsgEvent);
    }
}
