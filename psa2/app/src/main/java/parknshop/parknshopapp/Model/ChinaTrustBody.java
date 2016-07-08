package parknshop.parknshopapp.Model;

/**
 * Created by panther945 on 2015/6/29.
 */
public class ChinaTrustBody {
    private PaymentInfo paymentInfoData;

    public ChinaTrustBody() {

    }

    public ChinaTrustBody(String number, String month, String year, String issueNumber) {
        paymentInfoData = new PaymentInfo(number, month, year, issueNumber);
    }

    public class PaymentInfo {
        private String cardNumber;
        private String expiryMonth;
        private String expiryYear;
        private String issueNumber;

        public PaymentInfo(String number, String month, String year, String issueNumber) {
            this.cardNumber = number;
            this.expiryMonth = month;
            this.expiryYear = year;
            this.issueNumber = issueNumber;
        }
    }
}
