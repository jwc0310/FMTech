package parknshop.parknshopapp;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;

import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;
import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;

import java.util.ArrayList;

import parknshop.parknshopapp.Utils.LogUtil;

/**
 * Created by kwongyuenpan on 17/5/16.
 */
public class GATrackerHelper {

    final static String TAG = "GA_TRACKER";

    public static GATrackerHelper mGATrackerHelper;

    static Tracker mTracker;

    synchronized static public GATrackerHelper getInstance(Context context) {
        if (mGATrackerHelper == null) {
            if (mGATrackerHelper == null) {
                mGATrackerHelper = new GATrackerHelper();
                getDefaultTracker(context);
            }
        }
        return mGATrackerHelper;
    }

    // GA Tracker
    synchronized static public Tracker getDefaultTracker(Context context) {
        if (mTracker == null) {
            GoogleAnalytics analytics = GoogleAnalytics.getInstance(context);
            // To enable debug logging use: adb shell setprop log.tag.GAv4 DEBUG
            mTracker = analytics.newTracker(R.xml.global_tracker);
            String versionName = parknshop.parknshopapp.BuildConfig.VERSION_NAME;
            mTracker.setAppVersion(versionName);
            analytics.setLocalDispatchPeriod(1000);
//            mTracker = analytics.newTracker(R.string.ga_tracking_id);
//            mTracker.enableExceptionReporting(true);
//            mTracker.enableAdvertisingIdCollection(true);
//            mTracker.enableAutoActivityTracking(true);
        }
        return mTracker;
    }

//    public static void setGATracker(Fragment fragment){
//        LogUtil.info("", "GAAAAAAAAAA:"+fragment.getClass().getSimpleName());
//        mTracker.setScreenName(fragment.getClass().getSimpleName());
//        mTracker.send(new HitBuilders.ScreenViewBuilder().build());
//    }

    public static void setGATracker(String screenName){
        String logMsg = replacedMsg(screenName);
        sendToGA(logMsg);
    }

    public static void setGATracker(String screenName, String id){
        String logMsg = screenName + "/" + id;
        if(TextUtils.isEmpty(id))
            logMsg.replace("/", "");
        sendToGA(logMsg);
    }

    public static void sendToGA(String msg){
        try {

            msg = replacedMsg(msg);
            mTracker.setScreenName(msg);
            LogUtil.info(TAG, "GA_Log:" + msg);
//            Product product;
//            product.setBrand()
//            mTracker.send(new HitBuilders.ScreenViewBuilder().addProduct(product).build());
            mTracker.send(new HitBuilders.ScreenViewBuilder()
                    .setCustomDimension(1, GlobalConstant.language)
                    .build());
        } catch (Exception e){

        }
    }

    Product product;

    ArrayList<Product> products;
    ProductAction checkoutAction;

    String mCategory = "";

    public void initCheckoutAction(){
        checkoutAction = new ProductAction(ProductAction.ACTION_PURCHASE);
    }

    public void setActionTransactionId(String transactionId){
        checkoutAction.setTransactionId(transactionId);
    }

    public void setActionTransactionRevenue(double revenue){
        checkoutAction.setTransactionRevenue(revenue);
    }

    public void setActionTransactionShipping(double shipping){
        checkoutAction.setTransactionShipping(shipping);
    }

    public void setActionTransactionTax(double tax){
        checkoutAction.setTransactionTax(tax);
    }

    public void setActionTransactionCouponCode(String couponCode){
        checkoutAction.setTransactionCouponCode(couponCode);
    }

    public void initProductsList() {
        products = new ArrayList<>();
    }
    public void addProducts(Product product) {
        products.add(product);
    }

    public ArrayList<Product> getProductsList() {
        return products;
    }

    public void setProduct() {
        this.product = new Product();
    }

    public Product getProduct() {
        if(product == null)
            setProduct();
        return product;
    }

    public void setBrand(String brand){
        getProduct().setBrand(replacedMsg(brand));
    }

    public void setCategory(String category){
        mCategory = replacedMsg(category);
        getProduct().setCategory(replacedMsg(category));
    }

    public String getCategory(){
        return mCategory;
    }

    public void setId(String id){
        getProduct().setId(replacedMsg(id));
    }

    public void setName(String name){
        getProduct().setName(replacedMsg(name));
    }

    public void setVariant(String variant){
        getProduct().setVariant(replacedMsg(variant));
    }

    public void setPrice(double price){
        getProduct().setPrice(price);
    }

    public void setQuantity(int quantity){
        getProduct().setQuantity(quantity);
    }

    public void sendProductToGA(String msg, String impression){
        getProduct().setCustomDimension(1, GlobalConstant.language);

        msg = replacedMsg(msg);
        impression = replacedMsg(impression);
        mTracker.setScreenName(msg);
        mTracker.send(new HitBuilders.ScreenViewBuilder()
                .addImpression(getProduct(), impression)
                .addProduct(getProduct())
                .build());
        LogUtil.info("", "GATrackerHelperproduct:"+getProduct().toString());
    }

    public void sendCheckOutProductToGA(String msg, String impression){
        getProduct().setCustomDimension(1, GlobalConstant.language);

        msg = replacedMsg(msg);
        impression = impression.replace(" ", "-").replace(",", "-").replace(", ", "-").replace("_", "-").replace("&", "-").toLowerCase().trim();
        mTracker.setScreenName(msg);
        HitBuilders.ScreenViewBuilder hitBuilder = new HitBuilders.ScreenViewBuilder();
        //hitBuilder.addImpression(getProduct(), impression);
        for(int i = 0; i < getProductsList().size(); i++) {
            hitBuilder.addProduct(getProductsList().get(i));
        }

        checkoutAction.setTransactionAffiliation("pnshk-app");
        hitBuilder.setProductAction(checkoutAction);

        HitBuilders.EventBuilder eventBuilder = new HitBuilders.EventBuilder()
                .setProductAction(checkoutAction)
                .setCategory("Ecommerce")
                .setAction("Purchase");

        for(int i = 0; i < getProductsList().size(); i++) {
            eventBuilder.addProduct(getProductsList().get(i));
        }

        mTracker.send(hitBuilder.build());
        mTracker.send(eventBuilder.build());
        LogUtil.info("", "GATrackerHelper_sendCheckOutProductToGA_ProductSize:"+ getProductsList().size());
        LogUtil.info("", "GATrackerHelper_sendCheckOutProductToGA_Products:"+ getProductsList().get(0).toString());
        LogUtil.info("", "GATrackerHelper_sendCheckOutProductToGA_CheckoutAction:"+ checkoutAction.toString());
    }

    public static String replacedMsg(String msg) {
        msg = Uri.decode(msg);
        if(msg == null)
            return "";
        msg = msg.replaceAll(" ", "-").replaceAll(",", "-").replaceAll(", ", "-").replaceAll("&", "-").replace("!", "").replace("//", "/").toLowerCase().trim();

        if(msg.contains("/p/") && !msg.contains("/bp")){
            msg = msg.replace("/p/", "/p/bp_");
        }
        if(msg.substring(0 , 1).equals("/")){
            msg = msg.substring(1, msg.length());
        }
        msg = msg.replace("bp-", "bp_").replaceAll("--", "-").replaceAll("---", "-").replaceAll("----", "-");


        String resultMsg = "";
        for(int i = 0; i < msg.length(); i ++) {
            if(Character.isDigit(msg.charAt(i)) || Character.isLetter(msg.charAt(i)) || msg.charAt(i) == '_' || msg.charAt(i) == '-'  || msg.charAt(i) == '/' || msg.charAt(i) == '+' || msg.charAt(i) == '.' || msg.charAt(i) == '!' || msg.charAt(i) == '%' || msg.charAt(i) == '\\' || msg.charAt(i) == '\''  || msg.charAt(i) == ','  || msg.charAt(i) == '&') {
                resultMsg += msg.charAt(i);
            }
        }

        return resultMsg;
    }

}
