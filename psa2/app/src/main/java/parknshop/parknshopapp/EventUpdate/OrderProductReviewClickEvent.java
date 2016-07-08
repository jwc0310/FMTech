package parknshop.parknshopapp.EventUpdate;

import parknshop.parknshopapp.Model.OnlineRecordDetail;
import parknshop.parknshopapp.Rest.event.BaseEvent;

/**
 * Created by Gigi Wong on 2016年04月22日.
 */
public class OrderProductReviewClickEvent extends BaseEvent {
    OnlineRecordDetail.Order order;

    public void setOrder(OnlineRecordDetail.Order order) {
        this.order = order;
    }

    public OnlineRecordDetail.Order getOrder() {
        return order;
    }
}
