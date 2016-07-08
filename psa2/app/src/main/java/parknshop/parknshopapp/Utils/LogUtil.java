package parknshop.parknshopapp.Utils;

import android.util.Log;

import parknshop.parknshopapp.Constants;


/**
 * Created by kwongyuenpan on 10/12/15.
 */
public class LogUtil {

    public static void info(String tag, String str) {
        if(Constants.TEST_MODE){
            Log.i(tag, str);
        }
    }

    public static void error(String tag, String str) {
        if(Constants.TEST_MODE){
            Log.e(tag, str);
        }
    }
}
