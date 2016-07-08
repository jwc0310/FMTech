package parknshop.parknshopapp.Rest.callback;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

import java.io.IOException;

import parknshop.parknshopapp.ConfigHelper;
import parknshop.parknshopapp.Model.BarcodeScanResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.BarcodeScanResponseEvent;
import parknshop.parknshopapp.Utils.LogUtil;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by kwongyuenpan on 6/4/16.
 */
public class BarcodeScanResponseCallback implements Callback<BarcodeScanResponse> {
    BarcodeScanResponseEvent barcodeScanResponseEvent = new BarcodeScanResponseEvent();

    @Override
    public void onResponse(Call<BarcodeScanResponse> call, Response<BarcodeScanResponse> response) {

        if(response != null){
            BarcodeScanResponse barcodeScanResponse = response.body();
            switch (response.code()){
                case 200:
                    if (barcodeScanResponse != null) {
                        barcodeScanResponseEvent.setBarcodeScanResponse(barcodeScanResponse);
                        if (response.isSuccess()) {
                            barcodeScanResponseEvent.setSuccess(true);
                        }
                    }
                    break;
                case 400:
                    Gson gson = new Gson();
                    TypeAdapter<BarcodeScanResponse> adapter = gson.getAdapter(BarcodeScanResponse.class);
                    try {
                        if (response.errorBody() != null) {
                            barcodeScanResponse = adapter.fromJson(response.errorBody().string());
                            barcodeScanResponseEvent.setBarcodeScanResponse(barcodeScanResponse);
                            barcodeScanResponseEvent.setErrorCode(barcodeScanResponse.getErrorCode());
                            barcodeScanResponseEvent.setMessage(ConfigHelper.getValue(null, "RC_" + barcodeScanResponse.getErrorCode()));
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
            }
        }

        MyApplication.getInstance().mBus.post(barcodeScanResponseEvent);
    }

    @Override
    public void onFailure(Call<BarcodeScanResponse> call, Throwable t) {
        LogUtil.info("", "response:onFailure:"+t.toString());
        barcodeScanResponseEvent.setMessage(t.toString());
        MyApplication.getInstance().mBus.post(barcodeScanResponseEvent);
    }
}
