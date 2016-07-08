package parknshop.parknshopapp.Rest.callback;

import java.util.List;

import parknshop.parknshopapp.Model.Timeslot;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.TimeslotEvent;
import parknshop.parknshopapp.Utils.LogUtil;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by chrisyu on 8/4/16.
 */
public class TimeslotCallBack implements Callback<List<Timeslot>> {
    TimeslotEvent timeslotEvent = new TimeslotEvent();

    @Override
    public void onResponse(Call<List<Timeslot>> call, Response<List<Timeslot>> response) {
        if(response != null && response.isSuccess()){
            List<Timeslot> timeslot = response.body();
            if (timeslot != null) {
                timeslotEvent.setSuccess(true);
                timeslotEvent.setTimeslot(timeslot);
            }
        } else {
            timeslotEvent.setMessage(response.message());
        }
        MyApplication.getInstance().mBus.post(timeslotEvent);
    }

    @Override
    public void onFailure(Call<List<Timeslot>> call, Throwable t) {
        LogUtil.info("", "response:onFailure:"+t.toString());
        timeslotEvent.setMessage(t.getMessage());
        MyApplication.getInstance().mBus.post(timeslotEvent);
    }
}
