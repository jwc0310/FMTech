package parknshop.parknshopapp.Rest.event;

import parknshop.parknshopapp.Model.LoginResponse;

/**
 * Created by kwongyuenpan on 15/3/16.
 */
public class LoginEvent extends BaseEvent {
    LoginResponse loginResponse;

    public void setLoginResponse(LoginResponse loginResponse) {
        this.loginResponse = loginResponse;
    }

    public LoginResponse getLoginResponse() {
        return loginResponse;
    }
}
