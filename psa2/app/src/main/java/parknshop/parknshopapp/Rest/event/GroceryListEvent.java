package parknshop.parknshopapp.Rest.event;

import parknshop.parknshopapp.Model.GroceryList;

/**
 * Created by hp on 13/4/2016.
 */
public class GroceryListEvent extends BaseEvent{
    GroceryList groceryList;

    public GroceryList getGroceryList() {
        return groceryList;
    }

    public void setGroceryList(GroceryList groceryList) {
        this.groceryList = groceryList;
    }
}
