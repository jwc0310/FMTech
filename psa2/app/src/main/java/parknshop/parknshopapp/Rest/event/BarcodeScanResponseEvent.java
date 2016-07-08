package parknshop.parknshopapp.Rest.event;

import parknshop.parknshopapp.Model.BarcodeScanResponse;

/**
 * Created by kwongyuenpan on 6/4/16.
 */
public class BarcodeScanResponseEvent extends BaseEvent {
    BarcodeScanResponse barcodeScanResponse;

    public BarcodeScanResponse getBarcodeScanResponse() {
        return barcodeScanResponse;
    }

    public void setBarcodeScanResponse(BarcodeScanResponse barcodeScanResponse) {
        this.barcodeScanResponse = barcodeScanResponse;
    }
}
