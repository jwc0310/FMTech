package parknshop.parknshopapp.Rest.callback;

import parknshop.parknshopapp.Model.AddressesResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.AddressesEvent;
import parknshop.parknshopapp.Utils.LogUtil;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by hp on 13/4/2016.
 */
public class AddressesCallBack implements Callback<AddressesResponse> {
    AddressesEvent addressesEvent = new AddressesEvent();

    @Override
    public void onResponse(Call<AddressesResponse> call, Response<AddressesResponse> response) {
        if(response != null && response.isSuccess()){
            AddressesResponse addressResponse = response.body();
            if (addressResponse != null) {
                addressesEvent.setSuccess(true);
                addressesEvent.setDataObject(addressResponse);
            }
        } else {
            addressesEvent.setMessage(response.message());
        }
        MyApplication.getInstance().mBus.post(addressesEvent);
    }

    @Override
    public void onFailure(Call<AddressesResponse> call, Throwable t) {
        LogUtil.info("", "response:onFailure:" + t.toString());
        addressesEvent.setMessage(t.getMessage());
        MyApplication.getInstance().mBus.post(addressesEvent);
    }
}
