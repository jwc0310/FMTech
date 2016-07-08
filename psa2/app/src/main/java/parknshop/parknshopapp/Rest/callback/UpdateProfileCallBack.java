package parknshop.parknshopapp.Rest.callback;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

import java.io.IOException;

import parknshop.parknshopapp.ConfigHelper;
import parknshop.parknshopapp.Model.MemberProfile;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.UpdateProfileEvent;
import parknshop.parknshopapp.Utils.LogUtil;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by chrisyu on 17/3/16.
 */
public class UpdateProfileCallBack implements Callback<MemberProfile> {
    UpdateProfileEvent updateProfileEvent = new UpdateProfileEvent();

    @Override
    public void onResponse(Call<MemberProfile> call, Response<MemberProfile> response) {


        if(response != null){
            MemberProfile memberProfile = response.body();
            switch (response.code()){
                case 200:
                    if (memberProfile != null) {
                        updateProfileEvent.setMemberProfile(memberProfile);
                        if (response.isSuccess()) {
                            updateProfileEvent.setSuccess(true);
                        }
                    }
                    break;
                case 400:
                    Gson gson = new Gson();
                    TypeAdapter<MemberProfile> adapter = gson.getAdapter(MemberProfile.class);
                    try {
                        if (response.errorBody() != null) {
                            memberProfile = adapter.fromJson(response.errorBody().string());
                            updateProfileEvent.setMemberProfile(memberProfile);
                            updateProfileEvent.setErrorCode(memberProfile.getErrorCode());
                            updateProfileEvent.setMessage(ConfigHelper.getValue(null, "RC_" + memberProfile.getErrorCode()));
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
            }
        }

        MyApplication.getInstance().mBus.post(updateProfileEvent);
    }

    @Override
    public void onFailure(Call<MemberProfile> call, Throwable t) {
        LogUtil.info("", "response:onFailure:"+t.toString());
        updateProfileEvent.setMessage(t.toString());
        MyApplication.getInstance().mBus.post(updateProfileEvent);
    }
}
