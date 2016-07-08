package parknshop.parknshopapp.EventUpdate;

import parknshop.parknshopapp.Rest.event.BaseEvent;

/**
 * Created by chrisyu on 13/6/16.
 */
public class ProductDetailEvent extends BaseEvent {
    public int screenHeight;
    public int dy;

    public ProductDetailEvent(int screenHeight, int dy){
        this.screenHeight = screenHeight;
        this.dy = dy;
    }
}
