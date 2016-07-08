package parknshop.parknshopapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by chrisyu on 17/3/16.
 */
public class WishListHelper {
    private static final String KEY_WISH_LIST = "wishList";
    private static final String KEY_PRIMARY_KEY = "wishListKey";
    public static final String DEFAULT_PRIMARY_KEY = "-1";
    public static final String WISH_LIST_NAME = "watsons-mobile-app";

    public static void reset(Context context) {
        SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(context).edit();
        editor.remove(KEY_PRIMARY_KEY);
        editor.remove(KEY_WISH_LIST);
        editor.apply();
    }

    public static void setList(Context context, Set<String> idSet) {
        SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(context).edit();
        editor.putStringSet(KEY_WISH_LIST, idSet);
        editor.apply();
    }

    public static Set<String> getList(Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        return prefs.getStringSet(KEY_WISH_LIST, new HashSet<String>());
    }

    public static void add(Context context, String id) {
        Set<String> idSet = getList(context);
        idSet.add(id);
        setList(context, idSet);
    }

    public static void remove(Context context, String id) {
        Set<String> idSet = getList(context);
        idSet.remove(id);
        setList(context, idSet);
    }

    public static void setPrimaryKey(Context context, String id) {
        SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(context).edit();
        editor.putString(KEY_PRIMARY_KEY, id);
        editor.apply();
    }

    public static String getPrimaryKey(Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        return prefs.getString(KEY_PRIMARY_KEY, DEFAULT_PRIMARY_KEY);
    }

    public static boolean isDefaultKey(Context context) {
        return getPrimaryKey(context).equals(DEFAULT_PRIMARY_KEY);
    }
}
