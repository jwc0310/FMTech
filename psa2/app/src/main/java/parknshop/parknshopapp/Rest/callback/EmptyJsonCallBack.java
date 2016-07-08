package parknshop.parknshopapp.Rest.callback;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

import java.io.IOException;

import parknshop.parknshopapp.ConfigHelper;
import parknshop.parknshopapp.Model.EmptyJson;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.EmptyJsonEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by chrisyu on 11/4/16.
 */


public class EmptyJsonCallBack implements Callback<EmptyJson> {
    EmptyJsonEvent emptyJsonEvent = new EmptyJsonEvent();

    String type;
    String code;
    int hashCode;

    public EmptyJsonCallBack(String type) {
        this.type = type;
        emptyJsonEvent.setType(type);
    }

    public EmptyJsonCallBack(String type, int hashCode) {
        this.type = type;
        emptyJsonEvent.setType(type);
        emptyJsonEvent.setSuccessCode(hashCode);
    }

    public EmptyJsonCallBack(String type, String code) {
        this.type = type;
        this.code = code;
        emptyJsonEvent.setType(type);
    }

    @Override
    public void onResponse(Call<EmptyJson> call, Response<EmptyJson> response) {

        if(response != null) {
            switch (response.code()) {
                case 200:
                    emptyJsonEvent.setSuccess(true);
                    emptyJsonEvent.setDataObject(code);
                    emptyJsonEvent.setType(type);
                    break;

                default:
                    Gson gson = new Gson();
                    TypeAdapter<EmptyJson> adapter = gson.getAdapter(EmptyJson.class);
                    try {
                        if (response.errorBody() != null) {
                            EmptyJson emptyJson;
                            emptyJson = adapter.fromJson(response.errorBody().string());
                            emptyJsonEvent.setErrorCode(emptyJson.getErrorCode());
                            emptyJsonEvent.setMessage(ConfigHelper.getValue(null, "RC_" + emptyJson.getErrorCode()));
                            Log.i("emptyJsonEvent", "emptyJsonEvent" + emptyJson.getErrorCode() );
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                        Log.i("exception", "exception " + e.getMessage());

                    }
                    break;
            }
        }

        MyApplication.getInstance().mBus.post(emptyJsonEvent);
    }

    @Override
    public void onFailure(Call<EmptyJson> call, Throwable t) {
        emptyJsonEvent.setSuccess(false);
        emptyJsonEvent.setMessage(t.toString());
        MyApplication.getInstance().mBus.post(emptyJsonEvent);
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
