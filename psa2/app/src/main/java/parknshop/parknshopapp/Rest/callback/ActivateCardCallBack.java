package parknshop.parknshopapp.Rest.callback;

import parknshop.parknshopapp.Model.MemberProfile;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.ActivateCardEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by kwongyuenpan on 6/5/16.
 */
public class ActivateCardCallBack implements Callback<MemberProfile> {
    ActivateCardEvent activateCardEvent = new ActivateCardEvent();

    @Override
    public void onResponse(Call<MemberProfile> call, Response<MemberProfile> response) {
        if(response != null && response.isSuccess()){
            MemberProfile memberProfile = response.body();
            if (memberProfile != null) {
                activateCardEvent.setSuccess(true);
                activateCardEvent.setMemberProfile(memberProfile);
            }
        } else {
            activateCardEvent.setMessage(response.message());
        }
        MyApplication.getInstance().mBus.post(activateCardEvent);
    }

    @Override
    public void onFailure(Call<MemberProfile> call, Throwable t) {
        activateCardEvent.setMessage(t.getMessage());
        MyApplication.getInstance().mBus.post(activateCardEvent);
    }
}
