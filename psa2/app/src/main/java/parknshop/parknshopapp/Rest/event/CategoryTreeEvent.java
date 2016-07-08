package parknshop.parknshopapp.Rest.event;

import parknshop.parknshopapp.Model.Category.CategoryTree;

/**
 * Created by kwongyuenpan on 14/3/16.
 */
public class CategoryTreeEvent extends BaseEvent {

    CategoryTree categoryTree;

    public void setCategoryTree(CategoryTree categoryTree) {
        this.categoryTree = categoryTree;
    }

    public CategoryTree getCategoryTree() {
        return categoryTree;
    }
}
