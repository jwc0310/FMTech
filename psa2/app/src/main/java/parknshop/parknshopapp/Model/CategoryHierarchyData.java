package parknshop.parknshopapp.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Howard Chang on 2015/9/24
 */
public class CategoryHierarchyData {

    private List<SubCategories> subcategories;

    public List<SubCategories> getSubcategories() {
        return subcategories != null ? subcategories : new ArrayList<SubCategories>();
    }
}
