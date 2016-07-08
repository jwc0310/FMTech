package parknshop.parknshopapp.Model;

import java.util.List;

/**
 * Created by Howard Chang on 2015/9/15
 */
public class GroupbuyReportOrderBody {

    private List<ReportOrderInfo> groupbuy_report_order_info;

    public GroupbuyReportOrderBody(List<ReportOrderInfo> groupbuy_report_order_info) {
        this.groupbuy_report_order_info = groupbuy_report_order_info;
    }

}
