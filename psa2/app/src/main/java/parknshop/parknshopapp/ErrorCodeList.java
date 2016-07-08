package parknshop.parknshopapp;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by chrisyu on 9/5/16.
 */
public class ErrorCodeList {
    public static String getErrorMessage(String errorCode) {
        Map<String, String> errorMap = new TreeMap<>();
        errorMap.put("E300080", "firstName is invalid");
        errorMap.put("E300081", "lastName is invalid");
        errorMap.put("E190001", "email is blank");
        errorMap.put("E190002", "email format is invalid");
        errorMap.put("E180002", "email is not unique");
        errorMap.put("E300047", "emailFlag is blank");
        errorMap.put("E400002", "mobile format is invalid");
        errorMap.put("E100007", "Siebel is not available");
        errorMap.put("E400035", "MoneyBack card update is failed");

        errorMap.put("E400008", "addressBookName is blank");
        errorMap.put("E400009", "firstName is blank");
        errorMap.put("E400010", "firstName is invalid");
        errorMap.put("E400011", "lastName is blank");
        errorMap.put("E400012", "lastName is invalid");
        errorMap.put("E400002", "mobile is invalid");
        errorMap.put("E400005", "phone is invalid");
        errorMap.put("E400013", "room and floor are empty");
        errorMap.put("E400014", "room and floor are empty");
        errorMap.put("E400015", "line3 and alley are empty");
        errorMap.put("E400016", "line3 and alley are empty");
        errorMap.put("E400017", "lane and streetName are empty");
        errorMap.put("E400018", "lane and streetName are empty");
        errorMap.put("E400019", "town is empty");
        errorMap.put("E400020", "district is empty");
        errorMap.put("E150001", "applied coupon cannot reset");
        errorMap.put("E150002", "voucherCode is invalid");

        return errorMap.get(errorCode);
    }
}
