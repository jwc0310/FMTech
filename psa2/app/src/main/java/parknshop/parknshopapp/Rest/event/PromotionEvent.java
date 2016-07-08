package parknshop.parknshopapp.Rest.event;

import parknshop.parknshopapp.Model.Category.CategoryDrawerItem;
import parknshop.parknshopapp.Model.PromotionResponse;

/**
 * Created by kwongyuenpan on 15/3/16.
 */
public class PromotionEvent extends BaseEvent {
    PromotionResponse promotionResponse;
    String requestedId;

    public CategoryDrawerItem getCategoryDrawerItem() {
        return categoryDrawerItem;
    }

    public void setCategoryDrawerItem(CategoryDrawerItem categoryDrawerItem) {
        this.categoryDrawerItem = categoryDrawerItem;
    }

    CategoryDrawerItem categoryDrawerItem;



    public void setRequestedId(String requestedId) {
        this.requestedId = requestedId;
    }

    public String getRequestedId() {
        return requestedId;
    }


    public PromotionResponse getPromotionResponse() {
        return promotionResponse;
    }

    public void setPromotionResponse(PromotionResponse promotionResponse) {
        this.promotionResponse = promotionResponse;
    }
}
