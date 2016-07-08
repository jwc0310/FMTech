package parknshop.parknshopapp.Rest.callback;

import parknshop.parknshopapp.Model.MemberProfile;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.GetMoneyBackCardProfileEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by kwongyuenpan on 6/5/16.
 */
public class GetMoneyBackCardProfileCallBack implements Callback<MemberProfile> {
    GetMoneyBackCardProfileEvent getMoneyBackCardProfileEvent = new GetMoneyBackCardProfileEvent();

    @Override
    public void onResponse(Call<MemberProfile> call, Response<MemberProfile> response) {
        if(response != null && response.isSuccess()){
            MemberProfile memberProfile = response.body();
            if (memberProfile != null) {
                getMoneyBackCardProfileEvent.setSuccess(true);
                getMoneyBackCardProfileEvent.setMemberProfile(memberProfile);
            }
        } else {
            getMoneyBackCardProfileEvent.setMessage(response.message());
        }
        MyApplication.getInstance().mBus.post(getMoneyBackCardProfileEvent);
    }

    @Override
    public void onFailure(Call<MemberProfile> call, Throwable t) {
        getMoneyBackCardProfileEvent.setMessage(t.getMessage());
        MyApplication.getInstance().mBus.post(getMoneyBackCardProfileEvent);
    }
}
