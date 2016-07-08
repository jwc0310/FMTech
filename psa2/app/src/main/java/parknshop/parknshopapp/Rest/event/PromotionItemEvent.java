package parknshop.parknshopapp.Rest.event;

import parknshop.parknshopapp.Model.PromotionItemResponse;

/**
 * Created by chrisyu on 12/5/16.
 */
public class PromotionItemEvent extends BaseEvent {
    PromotionItemResponse promotionItemResponse;

    public void setPromotionItemResponse(PromotionItemResponse promotionItemResponse) {
        this.promotionItemResponse = promotionItemResponse;
    }

    public PromotionItemResponse getPromotionItemResponse(){
        return promotionItemResponse;
    }
}
