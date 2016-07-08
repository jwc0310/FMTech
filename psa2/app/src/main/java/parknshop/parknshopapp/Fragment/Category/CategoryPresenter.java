package parknshop.parknshopapp.Fragment.Category;

import com.orhanobut.hawk.Hawk;

import java.util.ArrayList;
import java.util.List;

import parknshop.parknshopapp.Model.Category.CategoryDrawerItem;
import parknshop.parknshopapp.Model.Category.CategoryTree;
import parknshop.parknshopapp.Utils.AppUtils;

/**
 * Created by chrisyu on 16/3/16.
 */
public class CategoryPresenter {
    public static List<CategoryDrawerItem> getCategoryDrawerItemsByTitle(String title) {

        CategoryTree categoryTree = Hawk.get(AppUtils.category_tree, new CategoryTree());
        if(title == null || title.length() == 0 || categoryTree.getData().getLv1CategoryList().size() == 0) return null;

        List<CategoryDrawerItem> categoryDrawerItems = new ArrayList();

        for(int i = 0; i < categoryTree.getData().getLv1CategoryList().size(); i ++) {
            if(title.equals(categoryTree.getData().getLv1CategoryList().get(i))) {
                return categoryTree.getData().getLv2CategoryList(i);
            }
        }
        return null;
    }


    public static List<CategoryDrawerItem> getCategoryDrawerItemsByPosition(int groupPos) {
        CategoryTree categoryTree = Hawk.get(AppUtils.category_tree, new CategoryTree());
        if(categoryTree.getData().getLv1CategoryList().size() == 0) return null;

        List<CategoryDrawerItem> categoryDrawerItems = new ArrayList();

        return categoryTree.getData().getLv2CategoryList(groupPos);
    }
}
