package parknshop.parknshopapp;

import android.content.Context;

import com.orhanobut.hawk.Hawk;

import java.util.ArrayList;
import java.util.Collections;

import parknshop.parknshopapp.Model.Product;
import parknshop.parknshopapp.Utils.LogUtil;

/**
 * Created by chrisyu on 17/3/16.
 */
public class HistoryHelper {
    public static String HISTORY_LIST = "HISTORY_LIST";

    public static void addToList(Context context, Product product) {
        ArrayList<Product> products = Hawk.get(HISTORY_LIST, new ArrayList<Product>());
        products.add(product);
        Hawk.put(HISTORY_LIST, products);
        LogUtil.info("", "ssssss:"+Hawk.get(HISTORY_LIST, new ArrayList<Product>()).size());
    }

    public static ArrayList<Product> getList(Context context) {
        ArrayList<Product> products = Hawk.get(HISTORY_LIST, new ArrayList<Product>());
//        ArrayList<Long> lastModifiedDate =new ArrayList<Long>();
//        for (Product product:products){
//            lastModifiedDate.add(product.getLastModifiedDate());
//        }
//        Collections.sort(lastModifiedDate);
        ArrayList<Product> productFixedSizeList = new ArrayList<Product>();
        Collections.reverse(products);

        for(int i = 0 ; i < products.size() && i < 12 ; i++){
            productFixedSizeList.add(products.get(i));
        }
        return productFixedSizeList;
    }

    public static void remove(Context context, Product product) {
        ArrayList<Product> products = Hawk.get(HISTORY_LIST, new ArrayList<Product>());
        if(products.contains(product))
            products.remove(product);
    }

    public static void clearAll(Context context) {
        Hawk.put(HISTORY_LIST, new ArrayList<Product>());
    }

}
