package parknshop.parknshopapp.Rest.event;

import parknshop.parknshopapp.Model.UploadImageResponse;

/**
 * Created by kwongyuenpan on 27/4/16.
 */
public class UploadImageEvent extends BaseEvent {
    UploadImageResponse uploadImageResponse;

    public void setUploadImageResponse(UploadImageResponse uploadImageResponse) {
        this.uploadImageResponse = uploadImageResponse;
    }

    public UploadImageResponse getUploadImageResponse() {
        return uploadImageResponse;
    }
}
