package parknshop.parknshopapp.Utils;

import android.content.Context;

import parknshop.parknshopapp.API;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.Fragment.Home.HomeFragment;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 7/3/16.
 */
public class AppUtils {
    public static BaseFragment getFragmentByTitle(String title, Context context) {
        if(title.equals(context.getResources().getString(R.string.home_activity_sliding_menu_my_account)))
            return new HomeFragment();
        return null;
    }

    public static final String BACKEND_BASE = API.BACKEND_API_URL;
    public static final String BACKEND_CONFIG = "watsons/api_1/config";

    public static final String WASTONS_BASE = API.WASTSONS_API;

    //public static final String WASTONS_GET_CATEGORY_TREE = "catalogs/hybrisProductCatalog/Online/categories/1?options=SUBCATEGORIES";
    public static final String WASTONS_GET_CATEGORY_TREE = "catalogs/hybrisProductCatalog/Online/categories/Product_Categories?options=SUBCATEGORIES";
    public static final String WASTONS_GET_PRODUCTS = WASTONS_BASE + "products";
    public static final String WASTONS_GET_PRODUCTS_BY_CATEGORY = WASTONS_BASE + "products/{category_id}?type=Cat&currentPage={page}&pageSize=60&query={query}";
    public static final String WASTONS_GET_PRODUCTS_BY_TEXT = WASTONS_BASE + "products?currentPage={page}&pageSize=60&query={query}";

//    public static final String WATSONS_IMG_URL;
    public static final String WATSONS_IMG_URL_DEV = "http://infwtctwu2t.aswatson.net";
    public static final String WATSONS_IMG_URL_FORMAL = "http://www.watsons.com.tw";

    public static final String WASTSONS_IMG_DOMAIN = API.WASTSONS_API;

    public static String WASTSONS_ADD_CART = WASTONS_BASE + "/rest/v1/hybris/cart/entry";
    public static String WASTSONS_GET_CART = WASTONS_BASE + "/rest/v1/hybris/cart";

    //tutorial count
    public static int tutorial_page_count = 4;

    //shared_perference
    public static String category_tree = "category_tree";
    public static String category_name = "category_name";
    public static String remote_shopping_cart = "remote_shopping_cart";
    public static String local_shopping_cart = "local_shopping_cart";
    public static String local_shopping_cart_count = "local_shopping_cart_count";

    public static String category_list = "category_list";
    public static String brand_list = "brand_list";
    public static String event_list = "event_list";
    public static String star_pressed = "star_pressed";

    public static String have_stock = "have_stock";

    public static String selected_min_price = "selected_min_price";
    public static String selected_max_price = "selected_max_price";

    public static String min_price = "min_price";
    public static String max_price = "max_price";

    public static String sort_tag = "sort_tag";
    public static String product_list_has_more = "product_list_has_more";

    public static String user_data = "user_data";
    public static String shopping_dot = "shopping_dot";

    public static String grocery_static_list = "grocery_static_list";
    public static String grocery_list = "grocery_list";
    public static String simple_grocery_list = "simple_grocery_list";

    public static String search_history_list = "search_history_list";
    public static String store_locator_search_history = "store_locator_search_history";
    public static String store_locator_store_list = "store_locator_store_list";
    public static String store_locator_product_item = "store_locator_product_item";
}
