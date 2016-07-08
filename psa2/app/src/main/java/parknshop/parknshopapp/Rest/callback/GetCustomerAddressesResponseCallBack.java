package parknshop.parknshopapp.Rest.callback;

import parknshop.parknshopapp.Model.MemberProfile;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.GetCustomerAddressesResponseEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by chrisyu on 8/4/16.
 */
public class GetCustomerAddressesResponseCallBack implements Callback<MemberProfile> {
    GetCustomerAddressesResponseEvent getCustomerAddressesResponseEvent = new GetCustomerAddressesResponseEvent();

    @Override
    public void onResponse(Call<MemberProfile> call, Response<MemberProfile> response) {
        if(response != null && response.isSuccess()){
            MemberProfile memberProfile = response.body();
            if (memberProfile != null) {
                getCustomerAddressesResponseEvent.setSuccess(true);
                getCustomerAddressesResponseEvent.setMemberProfile(memberProfile);
            }
        } else {
            getCustomerAddressesResponseEvent.setMessage(response.message());
        }
        MyApplication.getInstance().mBus.post(getCustomerAddressesResponseEvent);
    }

    @Override
    public void onFailure(Call<MemberProfile> call, Throwable t) {
        getCustomerAddressesResponseEvent.setMessage(t.getMessage());
        MyApplication.getInstance().mBus.post(getCustomerAddressesResponseEvent);
    }
}
