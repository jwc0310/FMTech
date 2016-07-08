package parknshop.parknshopapp.Rest.event;

import parknshop.parknshopapp.Model.GetUserProfilePicResponse;

/**
 * Created by kwongyuenpan on 27/4/16.
 */
public class GetUserProfilePicEvent extends BaseEvent{
    GetUserProfilePicResponse getUserProfilePicResponse;

    public void setGetUserProfilePicResponse(GetUserProfilePicResponse getUserProfilePicResponse) {
        this.getUserProfilePicResponse = getUserProfilePicResponse;
    }

    public GetUserProfilePicResponse getGetUserProfilePicResponse() {
        return getUserProfilePicResponse;
    }
}
