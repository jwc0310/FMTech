package parknshop.parknshopapp.Rest.event;

/**
 * Created by chrisyu on 7/6/16.
 */
public class EditShoppingCartEvent extends BaseEvent{
    boolean edit;

    public EditShoppingCartEvent(boolean edit) {
        this.edit = edit;
    }

    public boolean isEdit() {
        return edit;
    }
}
