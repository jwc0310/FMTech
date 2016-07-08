package parknshop.parknshopapp.Rest.callback;

import parknshop.parknshopapp.Model.AddressData;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.UpdateAddressEvent;
import parknshop.parknshopapp.Utils.LogUtil;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by hp on 13/4/2016.
 */
public class UpdateAddressCallBack implements Callback<AddressData> {
    UpdateAddressEvent updateAddressEvent = new UpdateAddressEvent();

    @Override
    public void onResponse(Call<AddressData> call, Response<AddressData> response) {
        if(response != null && response.isSuccess()){
            AddressData addressData = response.body();
            if (addressData != null) {
                updateAddressEvent.setSuccess(true);
                updateAddressEvent.setDataObject(addressData);
            }
        } else {
            updateAddressEvent.setMessage(response.message());
        }
        MyApplication.getInstance().mBus.post(updateAddressEvent);
    }

    @Override
    public void onFailure(Call<AddressData> call, Throwable t) {
        LogUtil.info("", "response:onFailure:" + t.toString());
        updateAddressEvent.setMessage(t.getMessage());
        MyApplication.getInstance().mBus.post(updateAddressEvent);
    }
}
