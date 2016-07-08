package parknshop.parknshopapp.Model;

/**
 * Created by panther945 on 2015/6/23.
 */
public class CartUrlHelper {
    public static final String DELIVERY_MODE_POST = "HomeDelivery";
    public static final String DELIVERY_MODE_MART = "CVSPickUp";
    public static final String DELIVERY_MODE_WATSONS = "ClickCollect";

    public static final String PAYMENT_TYPE_CREDIT_FULL = "CreditCardFull";
    public static final String PAYMENT_TYPE_CREDIT_REDEM = "CreditCardRedem";
    public static final String PAYMENT_TYPE_CREDIT_INSTAL = "CreditCardInstal";
    public static final String PAYMENT_TYPE_EXPRESS = "AmericanExpress";
    public static final String PAYMENT_TYPE_MART = "Kiosk";
    public static final String PAYMENT_TYPE_MART_TAKEN = "CVSPickPay";
    public static final String PAYMENT_TYPE_WATSONS = "WatsonsPay";

    public static final String CART_CHECKOUT_CHINA_TRUST = "ChinaTrust";
    public static final String CART_CHECKOUT_NCCC = "NCCC";
    public static final String CART_CHECKOUT_CVS = "CVS";
    public static final String CART_CHECKOUT_WATSONS = "WatsonsPay";

    public static final String CARRIER_TYPE_CHARITY = "CHARITY";
    public static final String CARRIER_TYPE_MEMBER = "MEMBER";
    public static final String CARRIER_TYPE_PAPER = "PAPER";

    public static final String ADDRESS_TYPE_DELIVERY = "delivery";
    public static final String ADDRESS_TYPE_STORE = "store";

    public static final String PAY_COLLECT = "PayCollect";

    public static String getDeliveryAddressType(String mode) {
        if (mode.equals(DELIVERY_MODE_POST)) {
            return ADDRESS_TYPE_DELIVERY;
        }
        else {
            return ADDRESS_TYPE_STORE;
        }
    }

    public static boolean isUCCCCredit(String type) {
        return type.equals(PAYMENT_TYPE_CREDIT_REDEM) || type.equals(PAYMENT_TYPE_CREDIT_INSTAL)
                || type.equals(PAYMENT_TYPE_EXPRESS);
    }
}
