package parknshop.parknshopapp.Rest.callback;

/**
 * Created by kwongyuenpan on 14/3/16.
 */

import parknshop.parknshopapp.Model.Advertisement;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.GetAdvertisementListEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GetAdvertisementListCallBack implements Callback<Advertisement> {

    GetAdvertisementListEvent getAdvertisementListEvent = new GetAdvertisementListEvent("");

    String type;

    public String getType() {
        return type;
    }

    public GetAdvertisementListCallBack(String type) {
        this.type = type;
    }


    @Override
    public void onResponse(Call<Advertisement> call, Response<Advertisement> response) {
        getAdvertisementListEvent = new GetAdvertisementListEvent(type);
        if (response != null && response.isSuccess()) {
            Advertisement advertisement = response.body();
            if (advertisement != null) {
                getAdvertisementListEvent.setAdvertisement(advertisement);
                getAdvertisementListEvent.setSuccess(true);
            }
        } else {
            getAdvertisementListEvent.setMessage(response.message());
        }
        MyApplication.getInstance().mBus.post(getAdvertisementListEvent);

    }

    @Override
    public void onFailure(Call<Advertisement> call, Throwable t) {
        getAdvertisementListEvent.setMessage(t.getMessage());
        MyApplication.getInstance().mBus.post(getAdvertisementListEvent);
    }
}
