package parknshop.parknshopapp.Rest.event;

import parknshop.parknshopapp.Model.MemberProfile;

/**
 * Created by kwongyuenpan on 11/4/16.
 */
public class GetCustomerAddressesResponseEvent extends BaseEvent {
    MemberProfile memberProfile;

    public MemberProfile getMemberProfile() {
        return memberProfile;
    }

    public void setMemberProfile(MemberProfile memberProfile) {
        this.memberProfile = memberProfile;
    }
}
