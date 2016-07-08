package parknshop.parknshopapp.Model;

/**
 * Created by Kate on 2015/3/12
 */
public class RegisterData {

    public RegisterForm registerForm;

    public RegisterData() {
        registerForm = new RegisterForm();
    }

    public RegisterData(RegisterForm registerForm) {
        this.registerForm = registerForm;
    }

}
