package parknshop.parknshopapp;

import android.content.Context;

import com.orhanobut.hawk.Hawk;

import parknshop.parknshopapp.Model.Config;
import parknshop.parknshopapp.Model.ConfigInfoResponse;


/**
 * Created by Kate on 2015/4/2
 */
public class ConfigHelper {
    private final String TAG = "ConfigHelper";

    private static final String PREFS = "configs";
    private static final String HOME_CATEGORY_1_ID = "home_category_1_id";
    private static final String HOME_CATEGORY_2_ID = "home_category_2_id";
    private static final String HOME_CATEGORY_1_TITLE = "home_category_1_title";
    private static final String HOME_CATEGORY_2_TITLE = "home_category_2_title";
    private static final String BANNER_NEWS_CATEGORY_ID = "banner_news_category_id";
    private static final String ANDROID_APP_LATEST_VERSION = "android_app_latest_version";
    private static final String ANDROID_APP_DOWNLOAD_LINK = "android_app_download_link";
    private static final String IMEMBER_NEWS_CATEGORY_ID = "imember_news_category_id";
    private static final String HOT_NEWS_CATEGORY_ID = "hot_news_category_id";
    private static final String DEMO_CATEGORY_ID = "demo_category_id";
    private static final String NONDEMO_CATEGORY_ID = "nondemo_category_id";
    private static final String CONTACT_TEL = "contact_tel";
    private static final String CONTACT_TEL_MSG = "contact_tel_msg";
    private static final String CONTACT_EMAIL = "contact_email";
    private static final String CONTACT_EMAIL_TITLE = "contact_email_title";
    private static final String CONTACT_EMAIL_BODY = "contact_email_body";
    private static final String RECORD_EMAIL = "record_email";
    private static final String RECORD_EMAIL_TITLE = "record_email_title";
    private static final String RECORD_EMAIL_BODY = "record_email_body";
    private static final String CARD_DESCRIPTION = "card_description";
    private static final String TOS = "tos";
    private static final String ACTIVATE_INFO = "activate_info";
    private static final String BROADCAST_TEXT = "broadcast_text";
    private static final String AD_IMAGE_LEFT = "ad_image_left";
    private static final String AD_IMAGE_RIGHT = "ad_image_right";
    private static final String CART_TOS = "cart_tos";
    private static final String PRODUCT_CAUTION = "product_caution";
    private static final String CREDIT_REDEM_BANK_NUMBER = "credit_card_redem_bank_no";
    private static final String CREDIT_INSTAL_BANK_NUMBER = "credit_card_instal_bank_no";
    private static final String CREDIT_REDEM_BANK_HTML = "credit_card_redem_bank_list";
    private static final String CREDIT_INSTAL_BANK_HTML = "credit_card_instal_bank_list";
    private static final String GROUPBUY_CATEGORY_ID = "groupbuy_category_id";
    private static final String GROUPBUY_DESCRIPTION = "groupbuy_description";
    private static final String LASTMINUTE_CATEGORY_ID = "lastminute_category_id";
    private static final String LASTMINUTE_DESCRIPTION = "lastminute_description";
    private static final String BANKDAY_TITLE_SUFFIX = "_title";
    private static final String BANKDAY_DESCRIPTION_SUFFIX = "_description";
    private static final String BANKDAY_CHECKBOX_TEXT_SUFFIX = "_checkbox_text";
    private static final String BANKDAY_TEXT_COLOR_SUFFIX = "_text_color";
    private static final String BANKDAY_BG_COLOR_SUFFIX = "_background_color";
    private static final String BANKDAY_CREDITCARD_TITLE = "_creditcard_title";
    private static final String HALF_BANNER_NEWS_CATEGORY_ID = "half_banner_news_category_id";
    private static final String TEXT_BANNER_NEWS_CATEGORY_ID = "text_banner_news_category_id";
    private static final String LASTMINUTE_SIDEBAR_ENABLED = "lastminute_sidebar_enabled";
    private static final String GROUPBUY_SIDEBAR_ENABLED = "groupbuy_sidebar_enabled";
    private static final String COUPON_SIDEBAR_ENABLED = "coupon_sidebar_enabled";
    private static final String EVENT_SIDEBAR_ENABLED = "event_sidebar_enabled";
    private static final String COUPON_VALID_TIME = "coupon_valid_time";
    private static final String COUPON_BARCODE_HINT = "coupon_barcode_hint";
    private static final String COUPON_SERIAL_HINT = "coupon_serial_hint";
    private static final String COUPON_DESCRIPTION = "coupon_description";
    private static final String RM_GENERAL_ERROR = "RM_GENERAL_ERROR";
    private static final String RM_COUPON_IDENTIFY_INVALID = "RM_COUPON_IDENTIFY_INVALID";
    private static final String RM_EVENT_IDENTIFY_INVALID = "RM_EVENT_IDENTIFY_INVALID";
    private static final String RC_ = "RC_";

    public static void setConfig(Context context, String key, ConfigInfoResponse.ConfigInfo configInfo) {
//        Gson gson = new Gson();
//        SharedPreferences.Editor editor = context.getSharedPreferences(PREFS, Context.MODE_PRIVATE).edit();
//        editor.putString(key, gson.toJson(configInfo));
//        editor.apply();
        Hawk.put(configInfo.getKey(), configInfo);
    }

    public static ConfigInfoResponse.ConfigInfo getConfig(Context context, String key) {
//        Gson gson = new Gson();
//        SharedPreferences prefs = context.getSharedPreferences(PREFS, Context.MODE_PRIVATE);
        Config config = Hawk.get("config");
        for(int i = 0; i < config.data.size(); i++) {
            if(key.equals(config.data.get(i).getKey() ))
                return config.data.get(i);
        }
        return null;
        //return Hawk.get(key, null);
//        return gson.fromJson(prefs.getString(key, ""), ConfigInfoResponse.ConfigInfo.class);
    }

    public static String getValue(Context context, String key) {
        ConfigInfoResponse.ConfigInfo config = getConfig(context, key);
        if (config == null) {
            return "";
        }
        return getConfig(context, key).getValue();
    }

    public static String getImageUrl(Context context, String key) {
        ConfigInfoResponse.ConfigInfo config = getConfig(context, key);
        if (config == null) {
            return "";
        }
        return getConfig(context, key).getImageUrl();
    }

    public static String getHomeCategory1Id(Context context) {
        return getValue(context, HOME_CATEGORY_1_ID);
    }

    public static String getHomeCategory2Id(Context context) {
        return getValue(context, HOME_CATEGORY_2_ID);
    }

    public static String getHomeCategory1Title(Context context) {
        return getValue(context, HOME_CATEGORY_1_TITLE);
    }

    public static String getHomeCategory2Title(Context context) {
        return getValue(context, HOME_CATEGORY_2_TITLE);
    }

    public static String getBannerNewsCategoryId(Context context) {
        return getValue(context, BANNER_NEWS_CATEGORY_ID);
    }

    public static String getHalfBannerNewsCategoryId(Context context) {
        return getValue(context, HALF_BANNER_NEWS_CATEGORY_ID);
    }

    public static String getTextBannerNewsCategoryId(Context context) {
        return getValue(context, TEXT_BANNER_NEWS_CATEGORY_ID);
    }

    public static String getImemberNewsCategoryId(Context context) {
        return getValue(context, IMEMBER_NEWS_CATEGORY_ID);
    }

    public static String getAndroidAppLatestVersion(Context context) {
        return getValue(context, ANDROID_APP_LATEST_VERSION);
    }

    public static String getAndroidAppDownloadLink(Context context) {
        return getValue(context, ANDROID_APP_DOWNLOAD_LINK);
    }

    public static String getHotNewsCategoryId(Context context) {
        return getValue(context, HOT_NEWS_CATEGORY_ID);
    }

    public static String getDemoCategoryId(Context context) {
        return getValue(context, DEMO_CATEGORY_ID);
    }

    public static String getNondemoCategoryId(Context context) {
        return getValue(context, NONDEMO_CATEGORY_ID);
    }

    public static String getContactTel(Context context) {
        return getValue(context, CONTACT_TEL);
    }

    public static String getContactTelMsg(Context context) {
        return getValue(context, CONTACT_TEL_MSG);
    }

    public static String getContactEmail(Context context) {
        return getValue(context, CONTACT_EMAIL);
    }

    public static String getContactEmailTitle(Context context) {
        return getValue(context, CONTACT_EMAIL_TITLE);
    }

    public static String getContactEmailBody(Context context) {
        return getValue(context, CONTACT_EMAIL_BODY);
    }

    public static String getRecordEmail(Context context) {
        return getValue(context, RECORD_EMAIL);
    }

    public static String getRecordEmailTitle(Context context) {
        return getValue(context, RECORD_EMAIL_TITLE);
    }

    public static String getRecordEmailBody(Context context) {
        return getValue(context, RECORD_EMAIL_BODY);
    }

    public static String getTos(Context context) {
        return getValue(context, TOS);
    }

    public static String getCardDescription(Context context) {
        return getValue(context, CARD_DESCRIPTION);
    }

    public static String getActivateInfo(Context context) {
        return getValue(context, ACTIVATE_INFO);
    }

    public static String getBroadcastText(Context context) {
        return getValue(context, BROADCAST_TEXT);
    }

    public static String getAdImageLeft(Context context) {
        return getImageUrl(context, AD_IMAGE_LEFT);
    }

    public static String getAdImageRight(Context context) {
        return getImageUrl(context, AD_IMAGE_RIGHT);
    }

    public static String getCartTos(Context context) {
        return getValue(context, CART_TOS);
    }

    public static String getProductCaution(Context context) {
        return getValue(context, PRODUCT_CAUTION);
    }

    public static String getCreditRedemBankNumber(Context context) {
        return getValue(context, CREDIT_REDEM_BANK_NUMBER);
    }

    public static String getCreditInstalBankNumber(Context context) {
        return getValue(context, CREDIT_INSTAL_BANK_NUMBER);
    }

    public static String getCreditRedemBankHtml(Context context) {
        return getValue(context, CREDIT_REDEM_BANK_HTML);
    }

    public static String getCreditInstalBankHtml(Context context) {
        return getValue(context, CREDIT_INSTAL_BANK_HTML);
    }

    public static String getGroupBuyCategoryId(Context context) {
        return getValue(context, GROUPBUY_CATEGORY_ID);
    }

    public static String getGroupBuyDescription(Context context) {
        return getValue(context, GROUPBUY_DESCRIPTION);
    }

    public static String getLastMinuteCategoryId(Context context) {
        return getValue(context, LASTMINUTE_CATEGORY_ID);
    }

    public static String getLastMinuteDescription(Context context) {
        return getValue(context, LASTMINUTE_DESCRIPTION);
    }

    public static boolean getEventSidebarEnabled(Context context) {
        return getValue(context, EVENT_SIDEBAR_ENABLED).equals("1");
    }

    public static boolean getLastminuteSidebarEnabled(Context context) {
        return getValue(context, LASTMINUTE_SIDEBAR_ENABLED).equals("1");
    }

    public static boolean getGroupbuySidebarEnabled(Context context) {
        return getValue(context, GROUPBUY_SIDEBAR_ENABLED).equals("1");
    }

    public static boolean getCouponSlidebarEnabled(Context context) {
        return getValue(context, COUPON_SIDEBAR_ENABLED).equals("1");
    }

    public static String getBankDayTitle(Context context, String prefix) {
        return getValue(context, prefix + BANKDAY_TITLE_SUFFIX);
    }

    public static String getBankDayDesc(Context context, String prefix) {
        return getValue(context, prefix + BANKDAY_DESCRIPTION_SUFFIX);
    }

    public static String getBankDayCheckBoxText(Context context, String prefix) {
        return getValue(context, prefix + BANKDAY_CHECKBOX_TEXT_SUFFIX);
    }


    public static String getBankDayTextColor(Context context, String prefix) {
        String color = getValue(context, prefix + BANKDAY_TEXT_COLOR_SUFFIX);
        return color != null && !color.isEmpty() ? color : "#FFFFFF";
    }

    public static String getBankDayBackGround(Context context, String prefix) {
        String color = getValue(context, prefix + BANKDAY_BG_COLOR_SUFFIX);
        return color != null && !color.isEmpty() ? color : "#19BFBF";
    }

    public static String getBankDayCreditCardTitle(Context context, String prefix) {
        String title = getValue(context, prefix + BANKDAY_CREDITCARD_TITLE);
        return title != null && !title.isEmpty() ? title : context.getString(R.string.fillin_pay_creditall);
    }

    public static int getCouponValidTime(Context context) {
        int time = Integer.parseInt(getValue(context, COUPON_VALID_TIME));
        return time != 0 ? time : 30;
    }

    public static String getRMGeneralError(Context context) {
        String msg = getValue(context, RM_GENERAL_ERROR);

        return msg != null && !msg.isEmpty() ? msg : context.getString(R.string.g_e_network);
    }

    public static String getCouponIdentifyInvalid(Context context) {
        String msg = getValue(context, RM_COUPON_IDENTIFY_INVALID);

        return msg != null && !msg.isEmpty() ? msg : context.getString(R.string.g_e_network);

    }

    public static String getCouponDesciption(Context context) {
        String msg = getValue(context, COUPON_DESCRIPTION);

        return msg != null && !msg.isEmpty() ? msg : context.getString(R.string.g_e_network);

    }

    public static String getEventIdentityInvalid(Context context){
        String msg = getValue(context, RM_EVENT_IDENTIFY_INVALID);

        return msg != null && !msg.isEmpty() ? msg : context.getString(R.string.g_e_network);
    }

    public static String getCouponBarcodeHint(Context context) {
        return getValue(context, COUPON_BARCODE_HINT);
    }

    public static String getCouponSerialHint(Context context) {
        return getValue(context, COUPON_SERIAL_HINT);
    }

    public static String getErrorMsg(Context context, String code) {
        String msg = getValue(context, RC_ + code);

        return msg != null && !msg.isEmpty() ? msg : context.getString(R.string.g_e_network);
    }


}
