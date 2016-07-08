package parknshop.parknshopapp.Rest.event;

import parknshop.parknshopapp.Model.MemberProfile;

/**
 * Created by kwongyuenpan on 15/3/16.
 */
public class RegisterEvent extends BaseEvent {
    MemberProfile memberProfile;

    public void setMemberProfile(MemberProfile memberProfile) {
        this.memberProfile = memberProfile;
    }

    public MemberProfile getMemberProfile() {
        return memberProfile;
    }
}
