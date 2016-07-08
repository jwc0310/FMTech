package parknshop.parknshopapp.Rest.event;

import parknshop.parknshopapp.Model.CartResponse;

/**
 * Created by kwongyuenpan on 15/3/16.
 */
public class SetShoppingCartTypeEvent extends BaseEvent {
    CartResponse cartResponse;

    public void setCartResponse(CartResponse cartResponse) {
        this.cartResponse = cartResponse;
    }

    public CartResponse getCartResponse() {
        return cartResponse;
    }

}
