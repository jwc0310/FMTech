package parknshop.parknshopapp.Rest.event;

/**
 * Created by chrisyu on 7/6/16.
 */
public class ShoppingCartRemoveEvent extends BaseEvent{
    public String productCode;
    public boolean isSelected;

    public ShoppingCartRemoveEvent(String productCode, boolean isSelected) {
        this.productCode = productCode;
        this.isSelected = isSelected;
    }
}
