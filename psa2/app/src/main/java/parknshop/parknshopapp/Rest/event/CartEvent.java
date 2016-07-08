package parknshop.parknshopapp.Rest.event;

import parknshop.parknshopapp.Model.CartResponse;

/**
 * Created by kwongyuenpan on 15/3/16.
 */
public class CartEvent extends BaseEvent {
    CartResponse cartResponse;
    String type;
    public int successCode;

    public void setCartResponse(CartResponse cartResponse) {
        this.cartResponse = cartResponse;
    }

    public CartResponse getCartResponse() {
        if(cartResponse == null)
            cartResponse = new CartResponse();
        return cartResponse;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType(){
        if(type == null)
            return "";
        return type;
    }
}
