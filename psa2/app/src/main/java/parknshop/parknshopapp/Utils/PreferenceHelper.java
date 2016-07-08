package parknshop.parknshopapp.Utils;

import android.content.Context;

import com.orhanobut.hawk.Hawk;

import parknshop.parknshopapp.Model.ConfigInfoResponse;

/**
 * Created by kwongyuenpan on 16/3/16.
 */
public class PreferenceHelper {

    private final String TAG = "PreferenceHelper";

    private static final String PREFERENCE = "PREFERENCE";

    private static final String CONFIG = "CONFIG";

    public static void setConfig(Context context, ConfigInfoResponse.ConfigInfo configInfo) {
        Hawk.put(CONFIG, configInfo);
    }

    public static ConfigInfoResponse.ConfigInfo getConfig(Context context) {
        return Hawk.get(CONFIG);
    }
}
