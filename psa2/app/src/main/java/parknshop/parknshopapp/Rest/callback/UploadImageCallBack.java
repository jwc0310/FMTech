package parknshop.parknshopapp.Rest.callback;

import parknshop.parknshopapp.Model.UploadImageResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.UploadImageEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by chrisyu on 17/3/16.
 */
public class UploadImageCallBack implements Callback<UploadImageResponse> {
    UploadImageEvent uploadImageEvent = new UploadImageEvent();

    @Override
    public void onResponse(Call<UploadImageResponse> call, Response<UploadImageResponse> response) {

        if(response != null){
            UploadImageResponse uploadImageResponse = response.body();
            switch (uploadImageResponse.getStatus().getCode()) {
                case 200:
                    if (uploadImageResponse != null) {
                        if (response.isSuccess()) {
                            uploadImageEvent.setSuccess(true);
                            uploadImageEvent.setUploadImageResponse(uploadImageResponse);
                        }
                    }
                    break;
                default:
                    uploadImageEvent.setMessage(response.message());
                    break;
            }
        }

        MyApplication.getInstance().mBus.post(uploadImageEvent);
    }

    @Override
    public void onFailure(Call<UploadImageResponse> call, Throwable t) {
        uploadImageEvent.setMessage(t.toString());
        MyApplication.getInstance().mBus.post(uploadImageEvent);
    }
}
