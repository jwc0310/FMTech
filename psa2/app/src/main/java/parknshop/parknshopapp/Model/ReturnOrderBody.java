package parknshop.parknshopapp.Model;

/**
 * Created by Howard Chang on 2015/9/22
 */
public class ReturnOrderBody {

    private OrderReturnForm orderReturnForm;

    public ReturnOrderBody(String orderCode, String fullName, String mobile, String phone2, String landLine,
                           String townCode, String districtCode, String streetName, String returnReasons,
                           String returnReasonComment, String buyerName, String bankCode, String branchCode,
                           String bankAccountNo, String bankAccountName) {

        orderReturnForm = new OrderReturnForm(orderCode, fullName, mobile, phone2, landLine,
                townCode, districtCode, streetName, returnReasons,
                returnReasonComment, buyerName, bankCode, branchCode,
                bankAccountNo, bankAccountName);
    }

    public ReturnOrderBody(String orderCode, String fullName, String mobile, String phone2, String landLine,
                           String townCode, String districtCode, String streetName, String returnReasons,
                           String returnReasonComment) {

        orderReturnForm = new OrderReturnForm(orderCode, fullName, mobile, phone2, landLine,
                townCode, districtCode, streetName, returnReasons,
                returnReasonComment);
    }

}

class OrderReturnForm {
    private String orderCode;
    private String fullName;
    private String mobile;
    private String phone2;
    private String landLine;
    private String townCode;
    private String districtCode;
    private String streetName;
    private String returnReasons;
    private String returnReasonComment;
    private String buyerName;
    private String bankCode;
    private String branchCode;
    private String bankAccountNo;
    private String bankAccountName;

    public OrderReturnForm(String orderCode, String fullName, String mobile, String phone2, String landLine,
                           String townCode, String districtCode, String streetName, String returnReasons,
                           String returnReasonComment, String buyerName, String bankCode, String branchCode,
                           String bankAccountNo, String bankAccountName) {
        this.orderCode = orderCode;
        this.fullName = fullName;
        this.mobile = mobile;
        this.phone2 = phone2;
        this.landLine = landLine;
        this.townCode = townCode;
        this.districtCode = districtCode;
        this.streetName = streetName;
        this.returnReasons = returnReasons;
        this.returnReasonComment = returnReasonComment;
        this.buyerName = buyerName;
        this.bankCode = bankCode;
        this.branchCode = branchCode;
        this.bankAccountNo = bankAccountNo;
        this.bankAccountName = bankAccountName;
    }

    public OrderReturnForm(String orderCode, String fullName, String mobile, String phone2, String landLine,
                           String townCode, String districtCode, String streetName, String returnReasons,
                           String returnReasonComment) {
        this.orderCode = orderCode;
        this.fullName = fullName;
        this.mobile = mobile;
        this.phone2 = phone2;
        this.landLine = landLine;
        this.townCode = townCode;
        this.districtCode = districtCode;
        this.streetName = streetName;
        this.returnReasons = returnReasons;
        this.returnReasonComment = returnReasonComment;

    }
}

