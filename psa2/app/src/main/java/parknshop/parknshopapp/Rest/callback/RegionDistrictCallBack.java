package parknshop.parknshopapp.Rest.callback;

import parknshop.parknshopapp.Model.RegionDistrictResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.RegionDistrictEvent;
import parknshop.parknshopapp.Utils.LogUtil;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by chrisyu on 28/4/16.
 */
public class RegionDistrictCallBack implements Callback<RegionDistrictResponse> {
    RegionDistrictEvent regionDistrictEvent = new RegionDistrictEvent();

    @Override
    public void onResponse(Call<RegionDistrictResponse> call, Response<RegionDistrictResponse> response) {
        if(response != null && response.isSuccess()){
            RegionDistrictResponse regionsResponse = response.body();
            if (regionsResponse != null) {
                regionDistrictEvent.setSuccess(true);
                regionDistrictEvent.setDataObject(regionsResponse);
            }
        } else {
            regionDistrictEvent.setMessage(response.message());
        }
        MyApplication.getInstance().mBus.post(regionDistrictEvent);
    }

    @Override
    public void onFailure(Call<RegionDistrictResponse> call, Throwable t) {
        LogUtil.info("", "response:onFailure:"+t.toString());
        regionDistrictEvent.setMessage(t.getMessage());
        MyApplication.getInstance().mBus.post(regionDistrictEvent);
    }

}
