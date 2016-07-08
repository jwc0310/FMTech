package parknshop.parknshopapp.Model;

/**
 * Created by Howard Chang on 2015/9/22
 */
public class ReturnOrderResponse {

    private Debit debit;

    public String getReturnDate() {
        return debit.getOrderReturnDate().returnDate();
    }

    public String getReturnRequestCode() {
        return debit.getReturnRequestCode();
    }

}

class Debit {
    private OrderReturnDate orderReturnDate;
    private String returnRequestCode;

    public OrderReturnDate getOrderReturnDate() {
        return orderReturnDate != null ? orderReturnDate : new OrderReturnDate();
    }

    public String getReturnRequestCode() {
        return returnRequestCode != null ? returnRequestCode : "";
    }
}

class OrderReturnDate {
    private String year;
    private String month;
    private String day;

    public String returnDate() {

        return year + "-" + month + "-" + day;

    }
}