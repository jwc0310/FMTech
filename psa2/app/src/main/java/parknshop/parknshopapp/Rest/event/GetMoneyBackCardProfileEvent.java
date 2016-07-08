package parknshop.parknshopapp.Rest.event;

import parknshop.parknshopapp.Model.MemberProfile;

/**
 * Created by kwongyuenpan on 6/5/16.
 */
public class GetMoneyBackCardProfileEvent extends BaseEvent {
    MemberProfile memberProfile;

    public MemberProfile getMemberProfile() {
        return memberProfile;
    }

    public void setMemberProfile(MemberProfile memberProfile) {
        this.memberProfile = memberProfile;
    }
}
