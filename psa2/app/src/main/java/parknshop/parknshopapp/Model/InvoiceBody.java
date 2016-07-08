package parknshop.parknshopapp.Model;

/**
 * Created by panther945 on 2015/6/25.
 */
public class InvoiceBody {
    private InvoiceData invoiceData;

    public class InvoiceData {
        private String carrierType;
        private String charityCode;
        private String regionCode;
        private String districtCode;
        private String address;
        private String businessNumber;

        public InvoiceData() {
            this.carrierType = "MEMBER";
        }

        public InvoiceData(String charityCode) {
            this.carrierType = "CHARITY";
            this.charityCode = charityCode;
        }

        public InvoiceData(String regionCode, String districtCode, String address,
                           String businessNumber) {
            this.carrierType = "PAPER";
            this.regionCode = regionCode;
            this.districtCode = districtCode;
            this.address = address;
            this.businessNumber = businessNumber;
        }
    }

    public InvoiceBody() {
        invoiceData = new InvoiceData();
    }

    public InvoiceBody(String charityCode) {
        invoiceData = new InvoiceData(charityCode);
    }

    public InvoiceBody(String regionCode, String districtCode, String address,
                       String businessNumber) {
        invoiceData = new InvoiceData(regionCode, districtCode, address, businessNumber);
    }
}
