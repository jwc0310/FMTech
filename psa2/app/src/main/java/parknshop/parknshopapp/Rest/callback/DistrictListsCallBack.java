package parknshop.parknshopapp.Rest.callback;

import parknshop.parknshopapp.Model.DistrictsResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.DistrictListEvent;
import parknshop.parknshopapp.Utils.LogUtil;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by chrisyu on 8/4/16.
 */
public class DistrictListsCallBack implements Callback<DistrictsResponse>  {
    DistrictListEvent districtListEvent = new DistrictListEvent();

    @Override
    public void onResponse(Call<DistrictsResponse> call, Response<DistrictsResponse> response) {
        if(response != null && response.isSuccess()){
            DistrictsResponse districtsResponse = response.body();
            if (districtsResponse != null) {
                districtListEvent.setSuccess(true);
                districtListEvent.setRegionsResponse(districtsResponse);
            }
        } else {
            districtListEvent.setMessage(response.message());
        }
        MyApplication.getInstance().mBus.post(districtListEvent);
    }

    @Override
    public void onFailure(Call<DistrictsResponse> call, Throwable t) {
        LogUtil.info("", "response:onFailure:"+t.toString());
        districtListEvent.setMessage(t.getMessage());
        MyApplication.getInstance().mBus.post(districtListEvent);
    }
}
