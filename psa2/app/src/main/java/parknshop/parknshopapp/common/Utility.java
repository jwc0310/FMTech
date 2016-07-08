package parknshop.parknshopapp.common;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by kwongyuenpan on 17/3/16.
 */
public class Utility {

    public static final SimpleDateFormat DEFAULT_DATE_FORMAT = new SimpleDateFormat("yyyy/MM/dd");
    public static final SimpleDateFormat SHOW_TIME_FORMAT = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    public static final SimpleDateFormat WATSON_TIME_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
    public static final SimpleDateFormat Saibei_DATE_FORMAT = new SimpleDateFormat("MM/dd/yyyy");
    public static final SimpleDateFormat Saibei_TIME_FORMAT = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
    public static final SimpleDateFormat CHINESE_DATE_FORMATE = new SimpleDateFormat(" yyyy 年 MM 月 dd 日");

    public static String formatShowDate(Date date) {
        String formattedDate = "";
        if (date != null) {
            try {
                formattedDate = SHOW_TIME_FORMAT.format(date);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return formattedDate;
    }
}
