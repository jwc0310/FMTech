package parknshop.parknshopapp.Model.Category;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by chrisyu on 9/3/16.
 */
public class CategoryHierarchyData {
    private List<SubCategories> subcategories;

    public List<SubCategories> getSubcategories() {
        return subcategories != null ? subcategories : new ArrayList<SubCategories>();
    }
}
