package parknshop.parknshopapp.Model;

/**
 * Created by chrisyu on 17/3/16.
 */
public class LoginResponse extends ErrorCode {
    public String result;
    public String token;
    public MemberProfile customer = new MemberProfile();
    public RegisterForm registerForm = new RegisterForm();

    public boolean isSuccess() {
        return result != null && result.equals("success");
    }

    public boolean isActivation() {
        return result != null && result.equals("Activation");
    }

    public MemberProfile getMemberProfile() {
        if(customer == null)
            return new MemberProfile();
        else
            return customer;
    }

    public RegisterForm getRegisterForm() {
        return registerForm;
    }
}

