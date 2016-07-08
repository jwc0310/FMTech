package parknshop.parknshopapp.Rest.callback;

import android.util.Log;

import java.util.List;

import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.HotSearchEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by chrisyu on 4/5/16.
 */
public class HotSearchCallBack implements Callback<List<String>> {
    HotSearchEvent event = new HotSearchEvent();

    @Override
    public void onResponse(Call<List<String>> call, Response<List<String>> response) {

        if(response != null && response.isSuccess()){
            List<String> listOfString = response.body();
            if (listOfString != null) {
                event.setData(listOfString);
                event.setSuccess(true);
            }
        } else {
            event.setMessage(response.message());
        }
        MyApplication.getInstance().mBus.post(event);
    }

    @Override
    public void onFailure(Call<List<String>> call, Throwable t) {
        event.setMessage(t.getMessage() + "\n");
        MyApplication.getInstance().mBus.post(event);
    }
}
