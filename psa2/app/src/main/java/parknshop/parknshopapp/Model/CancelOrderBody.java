package parknshop.parknshopapp.Model;

/**
 * Created by Howard Chang on 2015/9/21
 */
public class CancelOrderBody {

    public OrderCancellationForm orderCancellationForm;

    public CancelOrderBody() {

    }

    public CancelOrderBody(String buyerName, String bankCode,
                           String branchCode, String bankAccountNo, String bankAccountName) {

        orderCancellationForm =
                new OrderCancellationForm(buyerName, bankCode, branchCode, bankAccountNo, bankAccountName);
    }

}

class OrderCancellationForm {
    public String buyerName;
    public String bankCode;
    public String branchCode;
    public String bankAccountNo;
    public String bankAccountName;

    public OrderCancellationForm(String buyerName, String bankCode,
                                 String branchCode, String bankAccountNo, String bankAccountName) {
        this.buyerName = buyerName;
        this.bankCode = bankCode;
        this.branchCode = branchCode;
        this.bankAccountNo = bankAccountNo;
        this.bankAccountName = bankAccountName;
    }
}