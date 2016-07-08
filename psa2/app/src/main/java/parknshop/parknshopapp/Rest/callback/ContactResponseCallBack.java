package parknshop.parknshopapp.Rest.callback;

import parknshop.parknshopapp.Model.ContactResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.ContactResponseEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by kwongyuenpan on 16/3/16.
 */
public class ContactResponseCallBack implements Callback<ContactResponse> {
    ContactResponseEvent contactResponseEvent = new ContactResponseEvent();

    @Override
    public void onResponse(Call<ContactResponse> call, Response<ContactResponse> response) {
        if(response != null && response.isSuccess()){
            ContactResponse contactResponse = response.body();
            if (contactResponse != null) {
                contactResponseEvent.setContactResponse(contactResponse);
                contactResponseEvent.setSuccess(true);
            }
        } else {
            contactResponseEvent.setMessage(response.message());
        }
        MyApplication.getInstance().mBus.post(contactResponseEvent);

    }

    @Override
    public void onFailure(Call<ContactResponse> call, Throwable t) {
        contactResponseEvent.setMessage(t.getMessage());
        MyApplication.getInstance().mBus.post(contactResponseEvent);
    }
}
