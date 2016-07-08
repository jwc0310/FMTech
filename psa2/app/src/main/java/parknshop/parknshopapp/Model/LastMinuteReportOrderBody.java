package parknshop.parknshopapp.Model;

import java.util.List;

/**
 * Created by Howard Chang on 2015/9/15
 */
public class LastMinuteReportOrderBody {

    private List<ReportOrderInfo> lastminute_report_order_info;

    public LastMinuteReportOrderBody(List<ReportOrderInfo> lastminute_report_order_info) {
        this.lastminute_report_order_info = lastminute_report_order_info;
    }

}
