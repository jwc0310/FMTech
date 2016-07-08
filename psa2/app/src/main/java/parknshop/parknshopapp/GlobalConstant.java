package parknshop.parknshopapp;

/**
 * Created by chrisyu on 17/3/16.
 */
public class GlobalConstant {
    public static final long SECOND = 1000;
    public static final long MINUTE = 60 * SECOND;
    public static final long HOUR = 60 * MINUTE;
    public static final long DAY = 24 * HOUR;

    public static final int WEB_SERVICES_TIMEOUT = 60 * 1000;

    public static final long wait_activity_time = 100;
    public static final long Dialog_Dismiss_time = 100;
    public static final long frame_slide_time = 250;

    public static final String LANG_ZH = "zt";
    public static final String LANG_EN = "en";
    public static String language = "zt";

    public static boolean isLogin = false;
    public static boolean isMoneybackCardLogin = false;
    public static String moneybackCardToken = null;

    // Types for Tips and Ideas, On Sale
    public static final String BRAND = "brand";
    public static final String CATEGORY = "category";
    public static final String RECIPLE = "reciple";
    public static final String CUSTOMIZE_PRODUCT = "customizeproduct";
    public static final String PROMOTION_TAG = "promotiontag";
    public static final String HAPPY_TIME = "happytime";
    public static final String PROMTOION = "promotion";
    public static final String ONLINE_PROMOTION = "onlinepromotion";
    public static final String NEW_PROMOTION = "newpromotion";

    // Grocery list reminder
    public static final String REMINDER_PK_LIST = "REMINDER_PK_LIST";
    public static final String REMINDER_ON_OFF = "REMINDER_ON_OFF";
    public static final String REMINDER_REPEAT_TYPE = "REMINDER_REPEAT_TYPE";
    public static final String REMINDER_SET_DATE = "REMINDER_SET_DATE";

    public static String WATSONS_API_URL;
    public static final String WATSONS_API_URL_DEV = "https://infwtctwu2t.aswatson.net";
//    public static final String WATSONS_API_URL_FORMAL = "https://www.watsons.com.tw";
    public static final String WATSONS_API_URL_FORMAL = "https://infwtctwprd.aswatson.net";

    public static String BACKEND_API_URL;
    public static final String BACKEND_API_URL_DEV = "http://ponpon.cocobook.com.tw/watsons/api_1";
    public static final String BACKEND_API_URL_FORMAL = "http://app.watsons.com.tw/watsons_backend/api_1";

    public static String WATSONS_IMG_URL;
    public static final String WATSONS_IMG_URL_DEV = "http://infwtctwu2t.aswatson.net";
    public static final String WATSONS_IMG_URL_FORMAL = "http://www.watsons.com.tw";
//    public static final String WATSONS_IMG_URL_FORMAL = "https://infwtctwprd.aswatson.net";

    public static String SAIBEI_API_URL;
    public static final String SAIBEI_API_URL_DEV = "http://crmmwbit.watsons.com.tw";
    public static final String SAIBEI_API_URL_FORMAL = "http://crmmw.watsons.com.tw";

    public static final String WATSONS_HOME_PAGE = "http://www.watsons.com.tw";
//    public static final String WATSONS_HOME_PAGE = "https://infwtctwprd.aswatson.net";

    public static final float MAP_DEFAULT_ZOOM = 15f;

    static {
        if (BuildConfig.SERVER_TYPE.equals("dev")) {
            WATSONS_API_URL = WATSONS_API_URL_DEV;
            BACKEND_API_URL = BACKEND_API_URL_DEV;
            WATSONS_IMG_URL = WATSONS_IMG_URL_DEV;
            SAIBEI_API_URL = SAIBEI_API_URL_DEV;
        } else {
            WATSONS_API_URL = WATSONS_API_URL_FORMAL;
            BACKEND_API_URL = BACKEND_API_URL_FORMAL;
            WATSONS_IMG_URL = WATSONS_IMG_URL_FORMAL;
            SAIBEI_API_URL = SAIBEI_API_URL_FORMAL;
        }
    }
}
