package parknshop.parknshopapp.common;

import android.content.Context;
import android.content.SharedPreferences;

import com.orhanobut.hawk.Hawk;

import parknshop.parknshopapp.Model.LoginResponse;
import parknshop.parknshopapp.Model.MemberProfile;

/**
 * Created by kwongyuenpan on 17/3/16.
 */
public class MemberHelper {
    private final String TAG = "MemberHelper";

    private static final String MEMBER_PREFS = "members";
    private static final String MEMBER_STATUS = "member_status";
    private static final String USER_TOKEN = "user_token";
    private static final String CARD_NUMBER = "card_number";
    private static final String CARD_PWD = "card_pwd";
    private static final String BUNDLE_CARD_NUMBER = "bundle_card_number";
    private static final String LAST_NAME = "last_name";
    private static final String GENDER = "gender";
    private static final String OFFLINE_BUNDLE_COUNT = "OfflineBundleCount";
    private static final String CARD_POINT = "card_point";
    private static final String QRCODE_CARD_NUMBER = "qrcode_card_number";
    private static final String CREDIT_CARD_NUMBER = "creditCardNumber";
    private static final String IS_SAVE_CREDIT = "isSaveCredit";
    private static final String SIEBEL_CARD_NUMBER = "siebelCardNumber";
    private static final String DEVICE_TOKEN = "DEVICE_TOKEN";
    private static final String RMB_LOGIN = "RMB_LOGIN";

    private static final String LOGIN_RESPONSE = "LOGIN_RESPONSE";
    private static final String MEMBER_PROFILE = "MEMBER_PROFILE";

    // member status
    public static final int LOGOUT = 0;
    public static final int MEMBER = 1;
    public static final int IMEMBER = 2;

    public static String getUserToken(Context context) {
//        SharedPreferences prefs = context.getSharedPreferences(MEMBER_PREFS, Context.MODE_PRIVATE);
//        return prefs.getString(USER_TOKEN, "");
        return Hawk.get(USER_TOKEN, "");
    }

    public static void saveUserToken(Context context, String token) {
//        SharedPreferences.Editor editor = context.getSharedPreferences(MEMBER_PREFS, Context.MODE_PRIVATE).edit();
//        editor.putString(USER_TOKEN, token);
//        editor.apply();
        Hawk.put(USER_TOKEN, token);
    }

    public static void rmbLogin(boolean isRmb) {
        Hawk.put(RMB_LOGIN, isRmb);
    }

    public static boolean isRmbLogin() {
        return Hawk.get(RMB_LOGIN, false);
    }

    public synchronized static boolean isCardLogin(Context context) {
        return !getCardPwd(context).isEmpty();
    }

    public  static String getCardNumber(Context context) {
//        SharedPreferences prefs = context.getSharedPreferences(MEMBER_PREFS, Context.MODE_PRIVATE);
//        return prefs.getString(CARD_NUMBER, "");
        return Hawk.get(CARD_NUMBER, "");
    }

    public  static void saveCardNumber(Context context, String token) {
//        SharedPreferences.Editor editor = context.getSharedPreferences(MEMBER_PREFS, Context.MODE_PRIVATE).edit();
//        editor.putString(CARD_NUMBER, token);
//        editor.apply();
        Hawk.put(CARD_NUMBER, token);
    }

    public  static String getCardPwd(Context context) {
//        SharedPreferences prefs = context.getSharedPreferences(MEMBER_PREFS, Context.MODE_PRIVATE);
//        return prefs.getString(CARD_PWD, "");
        return Hawk.get(CARD_PWD, "");
    }

    public  static void saveCardPwd(Context context, String token) {
//        SharedPreferences.Editor editor = context.getSharedPreferences(MEMBER_PREFS, Context.MODE_PRIVATE).edit();
//        editor.putString(CARD_PWD, token);
//        editor.apply();
        Hawk.put(CARD_PWD, token);
    }

    public synchronized static String getBundleCardNumber(Context context) {
        SharedPreferences prefs = context.getSharedPreferences(MEMBER_PREFS, Context.MODE_PRIVATE);
        return prefs.getString(BUNDLE_CARD_NUMBER, "");
    }

    public synchronized static String getQRCodeCardNumber(Context context) {
        SharedPreferences prefs = context.getSharedPreferences(MEMBER_PREFS, Context.MODE_PRIVATE);
        return prefs.getString(QRCODE_CARD_NUMBER, "");
    }

    public synchronized static void saveBundleCardNumber(Context context, String number) {
//        SharedPreferences.Editor editor = context.getSharedPreferences(MEMBER_PREFS, Context.MODE_PRIVATE).edit();
//        editor.putString(BUNDLE_CARD_NUMBER, number);
//        editor.apply();
        Hawk.put(BUNDLE_CARD_NUMBER, number);
    }

    public synchronized static void saveQRCodeCardNumber(Context context, String number) {
        SharedPreferences.Editor editor = context.getSharedPreferences(MEMBER_PREFS, Context.MODE_PRIVATE).edit();
        editor.putString(QRCODE_CARD_NUMBER, number);
        editor.apply();
    }

//    public static String getHelloString(Context context) {
//        SharedPreferences prefs = context.getSharedPreferences(MEMBER_PREFS, Context.MODE_PRIVATE);
//        String lastName = prefs.getString(LAST_NAME, "");
//        int gender = prefs.getInt(GENDER, 2);
//
//        switch (prefs.getInt(MEMBER_STATUS, LOGOUT)) {
//            case MEMBER:
//            case IMEMBER:
//                if (!lastName.trim().isEmpty() && gender != 2) {
//                    return context.getString(R.string.g_menu_hello_login, lastName
//                            + context.getResources().getStringArray(R.array.salutation)[gender]);
//                }
//                else {
//                    return context.getString(R.string.g_menu_hello_loginsimple);
//                }
//            default:
//            case LOGOUT:
//                return context.getString(R.string.g_menu_hello_logout);
//        }
//    }

    public static void saveUserInfo(Context context, String lastName, int gender) {
//        SharedPreferences.Editor editor = context.getSharedPreferences(MEMBER_PREFS, Context.MODE_PRIVATE).edit();
//        editor.putString(LAST_NAME, lastName);
//        editor.putInt(GENDER, gender);
//        editor.apply();
        Hawk.put(LAST_NAME, lastName);
        Hawk.put(GENDER, gender);
    }

    public static void saveUserInfo(Context context, String lastName, String genderStr, boolean isMale) {
        MemberHelper.saveUserInfo(context, lastName, genderStr == null || genderStr.isEmpty() ? 2 : isMale ? 0 : 1);
    }

    public static void setLogin(Context context, int status) {
//        SharedPreferences.Editor editor = context.getSharedPreferences(MEMBER_PREFS, Context.MODE_PRIVATE).edit();
//        editor.putInt(MEMBER_STATUS, status);
//        editor.apply();
        Hawk.put(MEMBER_STATUS, status);
    }

    public static void setLogout(Context context) {
//        SharedPreferences.Editor editor = context.getSharedPreferences(MEMBER_PREFS, Context.MODE_PRIVATE).edit();
//        editor.remove(USER_TOKEN);
//        editor.remove(LAST_NAME);
//        editor.remove(GENDER);
//        editor.putInt(MEMBER_STATUS, LOGOUT);
//        editor.remove(CARD_NUMBER);
//        editor.remove(CARD_PWD);
//        editor.remove(CARD_POINT);
//        editor.remove(CREDIT_CARD_NUMBER);
//        editor.remove(SIEBEL_CARD_NUMBER);
//        editor.apply();

        Hawk.remove(USER_TOKEN);
        Hawk.remove(LAST_NAME);
        Hawk.remove(GENDER);
        Hawk.put(MEMBER_STATUS, LOGOUT);
        Hawk.remove(CARD_NUMBER);
        Hawk.remove(CARD_PWD);
        Hawk.remove(CARD_POINT);
        Hawk.remove(CREDIT_CARD_NUMBER);
        Hawk.remove(SIEBEL_CARD_NUMBER);

        WishListHelper.reset(context);
//        ((MyApplication) context.getApplicationContext()).clearCookies();
    }

    private static int getStatus(Context context) {
//        SharedPreferences prefs = context.getSharedPreferences(MEMBER_PREFS, Context.MODE_PRIVATE);
//        return prefs.getInt(MEMBER_STATUS, LOGOUT);
        return Hawk.get(MEMBER_STATUS, LOGOUT);
    }

    public static boolean isLogout(Context context) {
        return getStatus(context) == LOGOUT;
    }

    public static boolean isIMember(Context context) {
        return getStatus(context) == IMEMBER;
    }

    public static String getLastName(Context context) {
//        SharedPreferences prefs = context.getSharedPreferences(MEMBER_PREFS, Context.MODE_PRIVATE);
//        return prefs.getString(LAST_NAME, "");
        return Hawk.get(LAST_NAME, "");
    }

    private static final int offlineBundleCount = 5;
    public synchronized static int getOfflineBundleCount(Context context) {
//        SharedPreferences prefs = context.getSharedPreferences(MEMBER_PREFS, Context.MODE_PRIVATE);
//        return prefs.getInt(OFFLINE_BUNDLE_COUNT, offlineBundleCount);
        return Hawk.get(OFFLINE_BUNDLE_COUNT, offlineBundleCount);
    }

    public synchronized static void saveOfflineBundleCount(Context context, int token) {
//        SharedPreferences.Editor editor = context.getSharedPreferences(MEMBER_PREFS, Context.MODE_PRIVATE).edit();
//        editor.putInt(OFFLINE_BUNDLE_COUNT, token);
//        editor.apply();
        Hawk.put(OFFLINE_BUNDLE_COUNT, token);
    }

    public synchronized static void resetOfflineBundleCount(Context context) {
        saveOfflineBundleCount(context, offlineBundleCount);
    }

    public synchronized static void removeBundleCard(Context context) {
        saveBundleCardNumber(context, "");
        resetOfflineBundleCount(context);
    }
    public synchronized static String getCardPoint(Context context) {
        SharedPreferences prefs = context.getSharedPreferences(MEMBER_PREFS, Context.MODE_PRIVATE);
        return prefs.getString(CARD_POINT, "");
    }

    public synchronized static void saveCardPoint(Context context, String token) {
        SharedPreferences.Editor editor = context.getSharedPreferences(MEMBER_PREFS, Context.MODE_PRIVATE).edit();
        editor.putString(CARD_POINT, token);
        editor.apply();
    }

    public synchronized static void saveCreditCardNumber(Context context, String number) {
        if (isSaveCredit(context)) {
            SharedPreferences.Editor editor = context.getSharedPreferences(MEMBER_PREFS, Context.MODE_PRIVATE).edit();
            editor.putString(CREDIT_CARD_NUMBER, number);
            editor.apply();
        }
    }

    public synchronized static String getCreditCardNumber(Context context) {
        SharedPreferences prefs = context.getSharedPreferences(MEMBER_PREFS, Context.MODE_PRIVATE);
        return isSaveCredit(context) ? prefs.getString(CREDIT_CARD_NUMBER, "") : "";
    }

    public synchronized static void setIsSaveCredit(Context context, boolean flag) {
        SharedPreferences.Editor editor = context.getSharedPreferences(MEMBER_PREFS, Context.MODE_PRIVATE).edit();
        editor.putBoolean(IS_SAVE_CREDIT, flag);
        if (!flag) editor.remove(CREDIT_CARD_NUMBER);
        editor.apply();
    }

    public synchronized static boolean isSaveCredit(Context context) {
//        SharedPreferences prefs = context.getSharedPreferences(MEMBER_PREFS, Context.MODE_PRIVATE);
//        return prefs.getBoolean(IS_SAVE_CREDIT, true);
        return Hawk.get(IS_SAVE_CREDIT, true);
    }

    public static void saveSiebelCardNumber(Context context,String number){
//        SharedPreferences.Editor editor = context.getSharedPreferences(MEMBER_PREFS, Context.MODE_PRIVATE).edit();
//        editor.putString(SIEBEL_CARD_NUMBER, number);
//        editor.apply();
        Hawk.put(IS_SAVE_CREDIT, true);
    }

    public static String getSiebelCardNumber(Context context){
//        SharedPreferences prefs = context.getSharedPreferences(MEMBER_PREFS, Context.MODE_PRIVATE);
//        return prefs.getString(SIEBEL_CARD_NUMBER, "");
        return Hawk.get(SIEBEL_CARD_NUMBER, "");
    }


    public static void setDeviceToken(Context context, String token) {
        SharedPreferences.Editor editor = context.getSharedPreferences(MEMBER_PREFS, Context.MODE_PRIVATE).edit();
        if (token != null && !token.isEmpty()) {
            editor.putString(DEVICE_TOKEN, token).apply();
        }
    }

    public static String getDeviceToken(Context context) {
        SharedPreferences prefs = context.getSharedPreferences(MEMBER_PREFS, Context.MODE_PRIVATE);
        return prefs.getString(DEVICE_TOKEN, "");
    }

    public static void saveLoginResponse(LoginResponse loginResponse) {
        Hawk.put(LOGIN_RESPONSE, loginResponse);
    }

    public static LoginResponse getLoginResponse() {
        return Hawk.get(LOGIN_RESPONSE, new LoginResponse());
    }

    public static void setMemberProfile(MemberProfile memberProfile) {
        Hawk.put(MEMBER_PROFILE, memberProfile);
    }

    public static MemberProfile getMemberProfile() {
        return Hawk.get(MEMBER_PROFILE, null);
    }
}
