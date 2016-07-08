package parknshop.parknshopapp.Rest.callback;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

import java.io.IOException;

import parknshop.parknshopapp.ConfigHelper;
import parknshop.parknshopapp.Model.MemberProfile;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.GetProfileEvent;
import parknshop.parknshopapp.Utils.LogUtil;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by kwongyuenpan on 12/4/16.
 */
public class GetProfileCallBack implements Callback<MemberProfile> {
    GetProfileEvent getProfileEvent = new GetProfileEvent();

    @Override
    public void onResponse(Call<MemberProfile> call, Response<MemberProfile> response) {

        if(response != null){
            MemberProfile memberProfile = response.body();
            switch (response.code()){
                case 200:
                    if (memberProfile != null) {
                        getProfileEvent.setMemberProfile(memberProfile);
                        if (response.isSuccess()) {
                            getProfileEvent.setSuccess(true);
                        }
                    }
                    break;
                case 400:
                    Gson gson = new Gson();
                    TypeAdapter<MemberProfile> adapter = gson.getAdapter(MemberProfile.class);
                    try {
                        if (response.errorBody() != null) {
                            memberProfile = adapter.fromJson(response.errorBody().string());
                            String [] arErrorCode;
                            String msg = "";
                            if(memberProfile.getErrorCode().contains(",")){
                                arErrorCode = memberProfile.getErrorCode().split(",");
                                for(String errorCode : arErrorCode){
                                    msg += msg + ConfigHelper.getValue(null, "RC_" + memberProfile.getErrorCode());
                                }
                                LogUtil.info("", "msg1:"+msg);
                            }else{
                                msg = ConfigHelper.getValue(null, "RC_" + memberProfile.getErrorCode());
                                LogUtil.info("", "msg2:"+msg);
                            }
                            LogUtil.info("", "msg:"+msg);

                            getProfileEvent.setMemberProfile(memberProfile);
                            getProfileEvent.setErrorCode(memberProfile.getErrorCode());
                            getProfileEvent.setMessage(msg);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
            }
        }

        MyApplication.getInstance().mBus.post(getProfileEvent);
    }

    @Override
    public void onFailure(Call<MemberProfile> call, Throwable t) {
        getProfileEvent.setMessage(t.toString());
        MyApplication.getInstance().mBus.post(getProfileEvent);
    }
}
