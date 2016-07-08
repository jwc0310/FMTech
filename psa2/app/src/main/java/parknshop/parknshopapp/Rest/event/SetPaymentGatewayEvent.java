package parknshop.parknshopapp.Rest.event;

import parknshop.parknshopapp.Model.PaymentResponse;

/**
 * Created by chrisyu on 18/3/16.
 */
public class SetPaymentGatewayEvent extends BaseEvent {
    PaymentResponse paymentResponse;

    public PaymentResponse getPaymentResponse() {
        return paymentResponse;
    }

    public void setPaymentResponse(PaymentResponse paymentResponse) {
        this.paymentResponse = paymentResponse;
    }
}
