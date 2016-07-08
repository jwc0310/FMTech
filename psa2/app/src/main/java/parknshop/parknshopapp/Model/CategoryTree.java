package parknshop.parknshopapp.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by panther945 on 2015/6/16.
 */
public class CategoryTree {
    private List<SubCategory> subcategories;

    public List<String> getLv1CategoryList() {
        List<String> list = new ArrayList<String>();
        if (subcategories != null) {
            for (SubCategory category : subcategories) {
                list.add(category.name /* + " (" + category.totalNumber + ")"*/);
            }
        }

        return list;
    }

    public List<CategoryDrawerItem> getLv2CategoryList(int index) {
        List<CategoryDrawerItem> list = new ArrayList<CategoryDrawerItem>();
        if (subcategories != null) {
            list.add(
            new CategoryDrawerItem(subcategories.get(index).id,
                    "所有商品 (" + subcategories.get(index).totalNumber + ")"));
            try {
                for (SubCategory category : subcategories.get(index).subcategories) {
                    list.add(new CategoryDrawerItem(category.id, category.getCateString()));
                }
            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
            }
        }

        return list;
    }

    public class SubCategory {
        public String id;
        public String name;
        public int totalNumber;
        public List<SubCategory> subcategories;

        public String getCateString() {
            try {
                return name + " (" + totalNumber + ")";
            } catch (NullPointerException e) {
                return "";
            }
        }
    }
}
