package parknshop.parknshopapp.Rest.callback;

import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.BaseEvent;
import parknshop.parknshopapp.Utils.LogUtil;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by chrisyu on 8/4/16.
 */
public class GenericCallBack<T> implements Callback<T> {
    BaseEvent<T> baseEvent = new BaseEvent<T>();

    @Override
    public void onResponse(Call<T> call, Response<T> response) {
        //Log.i("response", "response" +)

        if(response != null && response.isSuccess()){
            T data = response.body();
            if (response != null) {
                baseEvent.setClassName(data.getClass().getSimpleName());
                baseEvent.setSuccess(true);
                baseEvent.setDataObject(data);
            }
        } else {
            baseEvent.setMessage(response.message());
        }
        MyApplication.getInstance().mBus.post(baseEvent);
    }

    @Override
    public void onFailure(Call<T> call, Throwable t) {
        LogUtil.info("", "response:onFailure:"+t.toString());
        baseEvent.setMessage(t.getMessage());
        MyApplication.getInstance().mBus.post(baseEvent);
    }

/*
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
    }*/
}
