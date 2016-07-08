package parknshop.parknshopapp.Rest.event;

import parknshop.parknshopapp.Model.MemberProfile;

/**
 * Created by kwongyuenpan on 26/4/16.
 */
public class GetProfileEvent extends BaseEvent{
    MemberProfile memberProfile;

    public void setMemberProfile(MemberProfile memberProfile) {
        this.memberProfile = memberProfile;
    }

    public MemberProfile getMemberProfile() {
        return memberProfile;
    }
}
