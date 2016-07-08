package parknshop.parknshopapp.Rest.event;

/**
 * Created by chrisyu on 7/6/16.
 */
public class ShoppingCartSelectAllEvent {
    public boolean selectAll;

    public boolean isSelectAll() {
        return selectAll;
    }

    public ShoppingCartSelectAllEvent(boolean selectAll) {
        this.selectAll = selectAll;
    }
}
