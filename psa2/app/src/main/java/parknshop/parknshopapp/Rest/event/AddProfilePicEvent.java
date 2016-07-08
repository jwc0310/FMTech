package parknshop.parknshopapp.Rest.event;

import parknshop.parknshopapp.Model.AddProfilePicResponse;

/**
 * Created by hp on 13/4/2016.
 */
public class AddProfilePicEvent extends BaseEvent{
    AddProfilePicResponse addProfilePicResponse;

    public void setAddProfilePicResponse(AddProfilePicResponse addProfilePicResponse) {
        this.addProfilePicResponse = addProfilePicResponse;
    }

    public AddProfilePicResponse getAddProfilePicResponse() {
        return addProfilePicResponse;
    }
}
