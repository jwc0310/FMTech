package parknshop.parknshopapp.Rest.event;

import java.util.ArrayList;

import parknshop.parknshopapp.Model.NewPromotionResponse;

/**
 * Created by chrisyu on 13/5/16.
 */
public class NewPromotionEvent extends BaseEvent {
    ArrayList<NewPromotionResponse.PromotionResponseItem> newPromotionResponse;

    public void setNewPromotionResponse(ArrayList<NewPromotionResponse.PromotionResponseItem> newPromotionResponse) {
        this.newPromotionResponse = newPromotionResponse;
    }

    public ArrayList<NewPromotionResponse.PromotionResponseItem> getNewPromotionResponse() {
        return newPromotionResponse;
    }
}
