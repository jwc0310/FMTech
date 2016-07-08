package parknshop.parknshopapp.Rest.callback;

import parknshop.parknshopapp.Model.InboxResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.InboxResponseEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by chrisyu on 17/3/16.
 */
public class InboxResponseCallBack implements Callback<InboxResponse> {
    InboxResponseEvent inboxResponseEvent = new InboxResponseEvent();

    @Override
    public void onResponse(Call<InboxResponse> call, Response<InboxResponse> response) {

        if(response != null && response.body() != null){
            InboxResponse inboxResponse = response.body();
            switch (inboxResponse.getStatus().getCode()) {
                case 200:
                    if (inboxResponse != null) {
                        if (response.isSuccess()) {
                            inboxResponseEvent.setSuccess(true);
                            inboxResponseEvent.setInboxResponse(inboxResponse);
                        }
                    }
                    break;
                default:
                    inboxResponseEvent.setMessage(response.message());
                    break;
            }
        }

        MyApplication.getInstance().mBus.post(inboxResponseEvent);
    }

    @Override
    public void onFailure(Call<InboxResponse> call, Throwable t) {
        inboxResponseEvent.setMessage(t.toString());
        MyApplication.getInstance().mBus.post(inboxResponseEvent);
    }
}
