package parknshop.parknshopapp.Rest.callback;

import parknshop.parknshopapp.Model.AddProfilePicResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.AddProfilePicEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by kwongyuenpan on 15/4/16.
 */
public class AddProfilePicResponseCallBack implements Callback<AddProfilePicResponse> {
    AddProfilePicEvent addProfilePicEvent = new AddProfilePicEvent();

    @Override
    public void onResponse(Call<AddProfilePicResponse> call, Response<AddProfilePicResponse> response) {

        if (response != null) {
            AddProfilePicResponse addProfilePicResponse = response.body();
            if(addProfilePicResponse.getStatus() != null)
            switch (addProfilePicResponse.getStatus().getCode()) {
                case 200:
                    if (addProfilePicResponse != null) {
                        if (response.isSuccess()) {
                            addProfilePicEvent.setSuccess(true);
                            addProfilePicEvent.setAddProfilePicResponse(addProfilePicResponse);
                        }
                    }
                    break;
                default:
                    addProfilePicEvent.setMessage(response.message());
                    break;
            }
        }

        MyApplication.getInstance().mBus.post(addProfilePicEvent);
    }

    @Override
    public void onFailure(Call<AddProfilePicResponse> call, Throwable t) {
        addProfilePicEvent.setMessage(t.toString());
        MyApplication.getInstance().mBus.post(addProfilePicEvent);
    }
}