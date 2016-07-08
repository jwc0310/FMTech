package parknshop.parknshopapp.Rest.callback;

import parknshop.parknshopapp.Model.BaseStatus;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.DeleteMsgEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by chrisyu on 17/3/16.
 */
public class DeleteMsgCallBack implements Callback<BaseStatus> {
    DeleteMsgEvent deleteMsgEvent = new DeleteMsgEvent();

    @Override
    public void onResponse(Call<BaseStatus> call, Response<BaseStatus> response) {

        if(response != null){
            BaseStatus baseStatus = response.body();
            switch (baseStatus.getStatus().getCode()){
                case 200:
                        if (response.isSuccess()) {
                            deleteMsgEvent.setSuccess(true);
                        }
                    break;
                default:
                    deleteMsgEvent.setMessage(baseStatus.getStatus().getMessage());
                    break;
            }
        }

        MyApplication.getInstance().mBus.post(deleteMsgEvent);
    }

    @Override
    public void onFailure(Call<BaseStatus> call, Throwable t) {
        deleteMsgEvent.setMessage(t.toString());
        MyApplication.getInstance().mBus.post(deleteMsgEvent);
    }
}
