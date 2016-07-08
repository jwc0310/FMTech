package parknshop.parknshopapp;

import android.provider.Settings;
import android.text.TextUtils;

import com.google.firebase.iid.FirebaseInstanceId;
import com.orhanobut.hawk.Hawk;

/**
 * Created by chrisyu on 17/3/16.
 */
public class TokenHelper {
    public static final String REGISTRATION_ID = "REGISTRATION_ID";
    public static final String DEVICE_ID = "DEVICE_ID";

    public static void saveRegistrationId(String token) {
        if(!TextUtils.isEmpty(token)){
            Hawk.put(REGISTRATION_ID, token);
        }else{
            saveDeviceId();
        }
    }

    public static void saveDeviceId() {
        String deviceId = Settings.Secure.getString(MyApplication.getInstance().getContentResolver(),
                Settings.Secure.ANDROID_ID)+System.currentTimeMillis();
        Hawk.put(DEVICE_ID, deviceId);
    }

    public static String getTokenHeader() {
        String header;
//        String registrationId = Hawk.get(REGISTRATION_ID);
        String registrationId =  FirebaseInstanceId.getInstance().getToken();
        String deviceId = Hawk.get(DEVICE_ID);
        if(!TextUtils.isEmpty(registrationId)){
            header = "aos";
        }else{
            header = "UDID";
        }
        return header;
    }

    public static String getToken() {
        String token;
//        String registrationId = Hawk.get(REGISTRATION_ID);
        String registrationId =  FirebaseInstanceId.getInstance().getToken();
        String deviceId = Hawk.get(DEVICE_ID);
        if(!TextUtils.isEmpty(registrationId)){
            token = registrationId;
        }else{
            token = deviceId;
        }
        return token;
    }

    public static void clearAll() {
        Hawk.put(REGISTRATION_ID, null);
        Hawk.put(DEVICE_ID, null);
    }

}
