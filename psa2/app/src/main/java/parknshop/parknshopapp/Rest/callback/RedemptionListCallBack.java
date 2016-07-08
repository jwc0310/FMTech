package parknshop.parknshopapp.Rest.callback;

import parknshop.parknshopapp.Model.RedemptionResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.RedemptionListEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by hp on 22/4/2016.
 */
public class RedemptionListCallBack implements Callback<RedemptionResponse> {
    RedemptionListEvent redemptionListEvent = new RedemptionListEvent();

    @Override
    public void onResponse(Call<RedemptionResponse> call, Response<RedemptionResponse> response) {
        RedemptionResponse redemptionResponse = response.body();
        if (response.body() != null){
            if(redemptionResponse.getStatus().getCode() == 200){
                redemptionListEvent.setSuccess(true);
                redemptionListEvent.setDataObject(redemptionResponse);
            }else{
                redemptionListEvent.setMessage(redemptionResponse.getStatus().getMessage());
            }
        }
        MyApplication.getInstance().mBus.post(redemptionListEvent);
    }

    @Override
    public void onFailure(Call<RedemptionResponse> call, Throwable t) {
        redemptionListEvent.setMessage(t.toString());
        MyApplication.getInstance().mBus.post(redemptionListEvent);
    }
}
