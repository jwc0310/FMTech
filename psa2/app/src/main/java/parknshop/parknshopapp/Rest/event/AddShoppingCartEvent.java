package parknshop.parknshopapp.Rest.event;

/**
 * Created by chrisyu on 18/3/16.
 */
public class AddShoppingCartEvent extends BaseEvent {

    public int successCode;
    public int quantity;
    public String type;

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        if(type == null)
            type = "";
        return type;
    }
}
