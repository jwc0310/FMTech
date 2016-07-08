package parknshop.parknshopapp.Rest.event;

import parknshop.parknshopapp.Model.CustomizeProductResponse;

/**
 * Created by kwongyuenpan on 15/3/16.
 */
public class CustomizeProductEvent extends BaseEvent {
    CustomizeProductResponse customizeProductResponse;
    int successCode;
    int page;

    public void setPage(int page) {
        this.page = page;
    }

    public int getPage() {
        return page;
    }

    public void setSuccessCode(int successCode) {
        this.successCode = successCode;
    }

    public int getSuccessCode() {
        return successCode;
    }

    public void setCustomizeProductResponse(CustomizeProductResponse customizeProductResponse) {
        this.customizeProductResponse = customizeProductResponse;
    }

    public CustomizeProductResponse getCustomizeProductResponse() {
        return customizeProductResponse;
    }
}
