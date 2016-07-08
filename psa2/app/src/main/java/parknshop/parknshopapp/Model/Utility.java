package parknshop.parknshopapp.Model;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.widget.PopupMenu;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by chrisyu on 9/3/16.
 */

public class Utility {

    private static boolean hasCartItem = false;
    private static final String SHPOOING_STATUS = "shopping_status";
    private static final String CART_NUMBER = "cart_number";

//    public synchronized static boolean getHasCartItem() {
//        return hasCartItem;
//    }

    public synchronized static void setHasCartItem(boolean flag) {
        hasCartItem = flag;
    }

    public static String getPhoneNumber(String area, String number, String ex) {
        StringBuilder builder = new StringBuilder();
        if (area != null) {
            builder.append(area);
            builder.append("-");
        }

        if (number != null) {
            builder.append(number);
        }

        if (ex != null) {
            builder.append("-");
            builder.append(ex);
        }

        return builder.toString();
    }

    public static String getDistanceString(int distance) {
        StringBuilder builder = new StringBuilder();
        if (distance >= 1000) {
            builder.append(distance / 1000);
            builder.append("km");
        } else {
            builder.append(distance);
            builder.append("m");
        }

        return builder.toString();
    }

    public static void launchMap(Context context, double latitude, double longitude, String labelText) {
        String label = "";
        if (labelText != null) {
            label = "(" + labelText + ")";
        }
//        Uri uri = Uri.parse("geo:" + latitude + "," + longitude + "?q=" + latitude + "," + longitude);
        Uri uri = Uri.parse("http://maps.google.com/maps?q=" + latitude + "," + longitude + label);
//        Uri uri = Uri.parse("http://maps.google.com/maps?q=" + label + "@"+ latitude  +"," + longitude);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        context.startActivity(intent);
    }

    public static void launchNav(Context context, double sLatitude, double sLongitude, double dLatitude,
                                 double dLongitude) {
//        Uri uri = Uri.parse("https://maps.google.com/maps?f=d&saddr="
//                + sLatitude + "," + sLongitude
//                + "&daddr=" + dLatitude + "," + dLongitude);
        Uri uri = Uri.parse("https://maps.google.com/maps?f=d&daddr=" + dLatitude + "," + dLongitude);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        context.startActivity(intent);
    }

    public static void launchMarket(Context context, String packageName) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("market://details?id=" + packageName));
        context.startActivity(intent);
    }

    public static boolean isPackageInstalled(Context context, String packageName, boolean openMarket) {
        PackageManager pm = context.getPackageManager();
        try {
            pm.getPackageInfo(packageName, PackageManager.GET_ACTIVITIES);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            if (openMarket) {
                launchMarket(context, packageName);
            }
            return false;
        }
    }

    public static ProgressDialog newCommonProgressDialog(Context context) {
        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progressDialog.setCancelable(false);

        return progressDialog;
    }

    public static final SimpleDateFormat DEFAULT_DATE_FORMAT = new SimpleDateFormat("yyyy/MM/dd");
    public static final SimpleDateFormat SHOW_TIME_FORMAT = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    public static final SimpleDateFormat WATSON_TIME_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
    public static final SimpleDateFormat Saibei_DATE_FORMAT = new SimpleDateFormat("MM/dd/yyyy");
    public static final SimpleDateFormat Saibei_TIME_FORMAT = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
    public static final SimpleDateFormat CHINESE_DATE_FORMATE = new SimpleDateFormat(" yyyy 年 MM 月 dd 日");
    public static final SimpleDateFormat EN_MONTH_DATE_FORMAT = new SimpleDateFormat("MMM yyyy");
    public static final SimpleDateFormat TRANSACTION_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.ss z");
    public static final SimpleDateFormat PROMOTION_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static String formatDate(SimpleDateFormat src, SimpleDateFormat dest, String date) {
        if (date != null) {
            try {
                return dest.format(src.parse(date));
            } catch (ParseException e) {
                return "";
            }
        }

        return "";
    }

    public static String formatDate(SimpleDateFormat src, SimpleDateFormat dest, Date date) {
        if (date != null) {
            return dest.format(date);
        }

        return "";
    }


    public static Date formatDate(String date, SimpleDateFormat format) {
        if (date == null) {
            return new Date();
        } else {
            try {
                return format.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
                return new Date();
            }
        }
    }

    public static Date formatDate(String date) {
        if (date == null) {
            return new Date();
        } else {
            try {
                return DEFAULT_DATE_FORMAT.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
                return new Date();
            }
        }
    }

    public static String formatShowDate(String dateString) {
        String formattedDate = "";
        if (dateString != null) {
            try {
                Date date = WATSON_TIME_FORMAT.parse(dateString);
                formattedDate = SHOW_TIME_FORMAT.format(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        return formattedDate;
    }

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

    public static String formatBackendDate(String dateString) {
        String formattedDate = "";
        if (dateString != null) {
            try {
                Date date = SHOW_TIME_FORMAT.parse(dateString);
                formattedDate = DEFAULT_DATE_FORMAT.format(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        return formattedDate;
    }

    public static String formatSaibeiDate() {
        return Saibei_DATE_FORMAT.format(new Date());
    }

    public static String formatSaibeiDate(String dateString) {
        String formattedDate = "";
        if (dateString != null) {
            try {
                Date date = Saibei_DATE_FORMAT.parse(dateString);
                formattedDate = DEFAULT_DATE_FORMAT.format(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        return formattedDate;
    }

    public static String formatSaibeiTime(String dateString) {
        String formattedDate = "";
        if (dateString != null) {
            try {
                Date date = Saibei_TIME_FORMAT.parse(dateString);
                formattedDate = SHOW_TIME_FORMAT.format(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        return formattedDate;
    }


    public static long subtractionDate(String current_time, String expire_time) {

        Date ct; // Get Calendar Instance
        Date et;
        try {
            ct = SHOW_TIME_FORMAT.parse(current_time);
            et = SHOW_TIME_FORMAT.parse(expire_time);
            return (et.getTime() - ct.getTime()) / 1000;
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return 0;
    }

    public static String covertSecToMinTime(long second) {

        return String.format("%02d：%02d", (second % 3600) / 60, second % 60);

    }

    public static void hackPopupMenuToShowIcon(PopupMenu popup, boolean showIcon) {
        try {
            // 從所有 field 中找出名稱為 mPopup 的 field。
            Field[] fields = popup.getClass().getDeclaredFields();
            for (Field field : fields) {
                if ("mPopup".equals(field.getName())) {
                    // 設定存取權（本來是 private field 不能存取）
                    field.setAccessible(true);
                    // 取得 popup 這個 instance 的 mPopup
                    Object menuPopupHelper = field.get(popup);
                    // 取得 mPopup 的 class
                    Class classPopupHelper = Class.forName(menuPopupHelper.getClass().getName());
                    // 取得 mPopup 的 class 的 setForceShowIcon() 這個 method
                    Method setForceIcons = classPopupHelper.getMethod("setForceShowIcon", boolean.class);
                    // invoke 該 method...
                    setForceIcons.invoke(menuPopupHelper, showIcon);
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void sendMail(Context context, String mailTo, String subject, String message) {

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL,
                new String[]{mailTo});
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, message);
        context.startActivity(intent);
    }

    /**
     * 檢查是否有開啟 Location 設定 (Network與GPS)
     */
    public static boolean isEnableLocationService(Context context) {
        LocationManager locationManager = (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);
        final boolean isEnableGPS = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);
        final boolean isEnableNetwork = locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER);
        return isEnableGPS || isEnableNetwork;
    }

    //設定目前購物狀態，分別為 一般狀態/團購狀態
    public static void setShoppingStats(Context context, int status) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putInt(SHPOOING_STATUS, status);
        edit.apply();
    }


    //設定目前購物車內商品數量
    public static void setCartItemNumber(Context context, int item_nulber) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putInt(CART_NUMBER, item_nulber);
        edit.apply();
    }

    public static String getCartItemNumber(Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        String text;
        if (prefs.getInt(CART_NUMBER, 0) > 99) {
            text = "99+";
        } else {
            text = String.valueOf(prefs.getInt(CART_NUMBER, 0));
        }
        return text;
    }

    public static boolean hasGetCartItem(Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        if (prefs.getInt(CART_NUMBER, 0) > 0) {
            return true;
        } else {
            return false;
        }
    }
}
