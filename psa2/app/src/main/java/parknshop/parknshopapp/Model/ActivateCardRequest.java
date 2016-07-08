package parknshop.parknshopapp.Model;

/**
 * Created by kwongyuenpan on 6/5/16.
 */
public class ActivateCardRequest {
    public MemberCardForm memberCardForm;

    public MemberCardForm getMemberCardForm() {
        return memberCardForm;
    }

    public void setMemberCardForm(MemberCardForm memberCardForm) {
        this.memberCardForm = memberCardForm;
    }

    public static class MemberCardForm {
        public String memberCardCode;
        public String password;

        public void setMemberCardCode(String memberCardCode) {
            this.memberCardCode = memberCardCode;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }
}
