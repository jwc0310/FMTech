package parknshop.parknshopapp.Rest.event;

import parknshop.parknshopapp.Model.PromotionCategoryResponse;

/**
 * Created by kwongyuenpan on 15/3/16.
 */
public class PromotionListEvent extends BaseEvent {
    PromotionCategoryResponse promotionCategoryResponse;

    public PromotionCategoryResponse getPromotionCategoryResponse() {
        return promotionCategoryResponse;
    }

    public void setPromotionCategoryResponse(PromotionCategoryResponse promotionCategoryResponse) {
        this.promotionCategoryResponse = promotionCategoryResponse;
    }
}
