package parknshop.parknshopapp.Rest.callback;

import parknshop.parknshopapp.Model.GetUserProfilePicResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.GetUserProfilePicEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by kwongyuenpan on 27/4/16.
 */
public class GetUserProfilePicResponseCallBack implements Callback<GetUserProfilePicResponse> {
    GetUserProfilePicEvent getUserProfilePicEvent = new GetUserProfilePicEvent();

    @Override
    public void onResponse(Call<GetUserProfilePicResponse> call, Response<GetUserProfilePicResponse> response) {

        if (response != null) {
            GetUserProfilePicResponse getUserProfilePicResponse = response.body();
            if(getUserProfilePicResponse.getStatus() != null)
                switch (getUserProfilePicResponse.getStatus().getCode()) {
                    case 200:
                        if (getUserProfilePicResponse != null) {
                            if (response.isSuccess()) {
                                getUserProfilePicEvent.setSuccess(true);
                                getUserProfilePicEvent.setGetUserProfilePicResponse(getUserProfilePicResponse);
                            }
                        }
                        break;
                    default:
                        getUserProfilePicEvent.setMessage(response.message());
                        break;
                }
        }

        MyApplication.getInstance().mBus.post(getUserProfilePicEvent);
    }

    @Override
    public void onFailure(Call<GetUserProfilePicResponse> call, Throwable t) {
        getUserProfilePicEvent.setMessage(t.toString());
        MyApplication.getInstance().mBus.post(getUserProfilePicEvent);
    }
}
