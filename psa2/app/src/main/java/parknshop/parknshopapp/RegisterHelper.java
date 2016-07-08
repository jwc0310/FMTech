package parknshop.parknshopapp;

import com.orhanobut.hawk.Hawk;

import parknshop.parknshopapp.Model.RegisterForm;

/**
 * Created by chrisyu on 17/3/16.
 */
public class RegisterHelper {
    public static String REGISTER_INFO = "REGISTER_INFO";

    public static void saveInfo(RegisterForm registerForm) {
        Hawk.put(REGISTER_INFO, registerForm);
    }

    public static RegisterForm getInfo() {
        return Hawk.get(REGISTER_INFO, new RegisterForm());
    }

    public static void clear() {
        Hawk.put(REGISTER_INFO, new RegisterForm());
    }

}
