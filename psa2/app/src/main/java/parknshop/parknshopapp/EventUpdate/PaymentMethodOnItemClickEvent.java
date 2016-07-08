package parknshop.parknshopapp.EventUpdate;

import parknshop.parknshopapp.Rest.event.BaseEvent;

/**
 * Created by chrisyu on 7/4/16.
 */
public class PaymentMethodOnItemClickEvent extends BaseEvent{
    int successCode;
    private String PaymentType;

    public void setSuccessCode(int successCode) {
        this.successCode = successCode;
    }

    public int getSuccessCode() {
        return successCode;
    }

    public String getPaymentType() {
        return PaymentType;
    }

    public void setPaymentType(String paymentType) {
        PaymentType = paymentType;
    }
}
