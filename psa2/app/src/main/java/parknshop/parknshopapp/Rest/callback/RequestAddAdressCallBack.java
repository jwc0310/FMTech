package parknshop.parknshopapp.Rest.callback;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

import java.io.IOException;
import java.util.ArrayList;

import parknshop.parknshopapp.ConfigHelper;
import parknshop.parknshopapp.Model.AddressData;
import parknshop.parknshopapp.Model.FieldErrors;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.RequestAddAddressEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by hp on 13/4/2016.
 */
public class RequestAddAdressCallBack implements Callback<AddressData.AddressForm> {
    RequestAddAddressEvent event = new RequestAddAddressEvent();

    @Override
    public void onResponse(Call<AddressData.AddressForm> call, Response<AddressData.AddressForm> response) {
        if(response != null){
            AddressData.AddressForm form = response.body();
            switch (response.code()){
                case 200:
                    if (form != null) {
                        event.setDataObject(form);
                        if (response.isSuccess()) {
                            event.setSuccess(true);
                            event.setDataObject(form);
                        } /*else if (form != null && form.isActivation()) {

                        }*/
                    }
                    break;
                case 400:
                    Gson gson = new Gson();
                    TypeAdapter<AddressData.AddressForm> adapter = gson.getAdapter(AddressData.AddressForm.class);
                    try {
                        if (response.errorBody() != null) {
                            form = adapter.fromJson(response.errorBody().string());
                            String[] errorCodes = form.getErrorCode().split(",");
                            event.setDataObject(form);
                            event.setErrorCode(form.getErrorCode());
                            event.setErrorCodes(errorCodes);
                            String strCodes = "";
                            for(String errorCode:errorCodes){
                                strCodes = strCodes + ConfigHelper.getValue(null, "RC_" + errorCode) + "\n";
                            }

                            ArrayList<String> errorMessage = new ArrayList<>();

                            for(FieldErrors fieldErrors : form.getFieldErrors()) {
                                errorMessage.add(fieldErrors.getField());
                            }

                            event.setFieldErrorList(errorMessage);

                            event.setMessage(strCodes);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
            }
        }

        MyApplication.getInstance().mBus.post(event);
    }

    @Override
    public void onFailure(Call<AddressData.AddressForm> call, Throwable t) {

    }
    //AddressData.AddressForm
}
