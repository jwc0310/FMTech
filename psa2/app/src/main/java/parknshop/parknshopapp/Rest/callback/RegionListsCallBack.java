package parknshop.parknshopapp.Rest.callback;

import parknshop.parknshopapp.Model.RegionsResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.RegionListEvent;
import parknshop.parknshopapp.Utils.LogUtil;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by chrisyu on 8/4/16.
 */
public class RegionListsCallBack implements Callback<RegionsResponse> {
    RegionListEvent regionListEvent = new RegionListEvent();

    @Override
    public void onResponse(Call<RegionsResponse> call, Response<RegionsResponse> response) {
        if(response != null && response.isSuccess()){
            RegionsResponse regionsResponse = response.body();
            if (regionsResponse != null) {
                regionListEvent.setSuccess(true);
                regionListEvent.setRegionsResponse(regionsResponse);
            }
        } else {
            regionListEvent.setMessage(response.message());
        }
        MyApplication.getInstance().mBus.post(regionListEvent);
    }

    @Override
    public void onFailure(Call<RegionsResponse> call, Throwable t) {
        LogUtil.info("", "response:onFailure:"+t.toString());
        regionListEvent.setMessage(t.getMessage());
        MyApplication.getInstance().mBus.post(regionListEvent);
    }
}
