package parknshop.parknshopapp.Rest.callback;

import parknshop.parknshopapp.Model.RedemptionItemResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.RedemptionItemEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by hp on 23/4/2016.
 */
public class RedemptionItemCallBack implements Callback<RedemptionItemResponse> {
    RedemptionItemEvent redemptionItemEvent = new RedemptionItemEvent();

    @Override
    public void onResponse(Call<RedemptionItemResponse> call, Response<RedemptionItemResponse> response) {
        RedemptionItemResponse re = response.body();
        if (re != null){
            redemptionItemEvent.setSuccess(true);
            redemptionItemEvent.setDataObject(re);
            redemptionItemEvent.setMessage(re.getStatus().getMessage());
        }
        MyApplication.getInstance().mBus.post(redemptionItemEvent);
    }

    @Override
    public void onFailure(Call<RedemptionItemResponse> call, Throwable t) {
        redemptionItemEvent.setMessage(t.toString());
        MyApplication.getInstance().mBus.post(redemptionItemEvent);
    }
}
