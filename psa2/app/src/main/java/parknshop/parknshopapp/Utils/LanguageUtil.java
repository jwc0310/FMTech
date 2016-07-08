package parknshop.parknshopapp.Utils;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.DisplayMetrics;

import com.orhanobut.hawk.Hawk;

import java.util.Locale;

import parknshop.parknshopapp.EventUpdate.LanguageUpdateEvent;
import parknshop.parknshopapp.GlobalConstant;
import parknshop.parknshopapp.MyApplication;

/**
 * Created by kwongyuenpan on 3/5/16.
 */
public class LanguageUtil {

    final static String PREVIOUS_LANGUAGE = "PREVIOUS_LANGUAGE";

    public static Locale findLanguage(Context mContext) {
        Resources resources = mContext.getResources();
        Configuration config = resources.getConfiguration();

        return config.locale;
    }

    public static void switchLanguage(Context context, Locale locale) {
        Resources resources = context.getResources();
        Configuration config = resources.getConfiguration();
        DisplayMetrics dm = resources.getDisplayMetrics();
        config.locale = locale;
        resources.updateConfiguration(config, dm);
    }

    public static void initLanguage(Context mContext, String type) {

//        if (type == GlobalConstant.LANG_ZH) {

//            type = Hawk.get(PREVIOUS_LANGUAGE, GlobalConstant.LANG_ZH);

//            if (type.equals(GlobalConstant.LANG_ZH)) {

//                Locale mLocale = findLanguage(mContext);
//                if (!mLocale.getLanguage().equals("zh")) {
//                    type = GlobalConstant.LANG_EN;
//                } else {
//                    type = GlobalConstant.LANG_ZH;
//                }
//            }

//        }

        if(TextUtils.isEmpty(type)){
            String previousLang = Hawk.get(PREVIOUS_LANGUAGE, GlobalConstant.LANG_ZH);
            type = previousLang;
        }

        Hawk.put(PREVIOUS_LANGUAGE, type);

        initAppLanguage(mContext, type);

        // Language update finish
        MyApplication.getInstance().mBus.post(new LanguageUpdateEvent());

    }

    private static void initAppLanguage(Context mContext, String type) {

        if (type.equals(GlobalConstant.LANG_ZH)) {

            GlobalConstant.language = GlobalConstant.LANG_ZH;
            LanguageUtil.switchLanguage(mContext, Locale.TRADITIONAL_CHINESE);

        } else if (type.equals(GlobalConstant.LANG_EN)) {

            GlobalConstant.language = GlobalConstant.LANG_EN;
            LanguageUtil.switchLanguage(mContext, Locale.ENGLISH);
        }
    }
}
