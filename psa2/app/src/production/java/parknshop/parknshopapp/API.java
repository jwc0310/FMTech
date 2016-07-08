package parknshop.parknshopapp;

/**
 * Created by kwongyuenpan on 14/03/16.
 */
public class API {
//    public static String WASTSONS_DOMAIN = "https://www.watsons.com.tw";
    public static String WASTSONS_DOMAIN = "https://www.parknshop.com";
    public static String WASTSONS_API = WASTSONS_DOMAIN + "/rest/v1/hybris/";
    public static final String BACKEND_API_URL = "http://app.watsons.com.tw/watsons_backend/api_1/";

    // Production
    public static final String MTEL_DOMAIN = "http://ec2-52-221-231-195.ap-southeast-1.compute.amazonaws.com";

//    public static final String PNS_MEDIA_API_URL = MTEL_DOMAIN + "/mediaServerAPI/";
//
//    public static final String PNS_API_URL = MTEL_DOMAIN + "/pns_api/";
//
//    public static final String NOTIFY_API_URL = MTEL_DOMAIN + "/notifyServerAPI/";

    public static final String PNS_MEDIA_API_URL = "http://ec2-52-77-122-221.ap-southeast-1.compute.amazonaws.com/mediaServerAPI/";

    //UAT
    public static final String PNS_API_URL = "http://ec2-52-77-86-126.ap-southeast-1.compute.amazonaws.com/pns_api/";

    public static final String NOTIFY_API_URL = "http://ec2-52-221-231-195.ap-southeast-1.compute.amazonaws.com/notifyServerAPI/";

    public static final String SHARING_URL = "https://www.parknshop.com/checkout/appCheckout?";
}