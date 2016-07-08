package parknshop.parknshopapp.Model;

import java.util.ArrayList;

/**
 * Created by Kate on 2015/3/30
 */
public class OnlineRecordDetail extends ErrorCode {
    public Price deliveryCost;
    public ArrayList<Order> entries;
    public DeliveryMode deliveryMode;
    public DeliveryAddress deliveryAddress;
    public SubTotal subTotal;
    public Country country;
    public Price orderDiscounts;
    public PaymentMode paymentMode;
    public InvoiceData invoiceData;
    public boolean freeShippingFlag;
    public Price cashOrCreditPaidPrice;
    public Price baseTotalPrice;
    public Price voucherOverflowValue;
    private String statusDisplay;
    private AddressResponse.Address paymentAddress;
    private String code;
    private String created;
    private Price totalPrice;
    private Status status;
    public boolean cancelableFlag;
    public boolean showInvoiceFlag;
    public boolean canReturnFlag;
    public boolean canRefundFlag;
    public String properStatus;
    public String consignmentStatus;
    public DeliveryType deliveryType;
    public String cashOrCreditCardPaidPrice;
    public boolean canRateProductFlag;
    public boolean isRefundRequireBankFlag;
    public String transactionDate;
    public String deliveryDate;
    public String deliveryTimeSlot;

    public String getTransactionDate() {
        return transactionDate;
    }

    public AddressResponse.Address getPaymentAddress() {
        return paymentAddress;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public String getDeliveryTimeSlot() {
        return deliveryTimeSlot;
    }

    public String getConsignmentStatus() {
        return consignmentStatus;
    }

    public DeliveryType getDeliveryType() {
        return deliveryType;
    }

    public String getCashOrCreditCardPaidPrice() {
        return cashOrCreditCardPaidPrice;
    }

    public String getProperStatus() {
        return properStatus;
    }

    public class DeliveryType {
        public String code;
        public String codeLowerCase;

        public String getCode() {
            return code;
        }

        public String getCodeLowerCase() {
            return codeLowerCase;
        }
    }

    public SubTotal getSubTotal() {
        return subTotal;
    }

    public class SubTotal {
        public String currencyIso;
        public String value;
        public String priceType;
        public String formattedValue;

        public String getCurrencyIso() {
            return currencyIso;
        }

        public String getFormattedValue() {
            return formattedValue;
        }

        public String getPriceType() {
            return priceType;
        }

        public String getValue() {
            return value;
        }
    }

    public ArrayList<Order> getEntries() {
        return entries;
    }

    public Status getStatus() {
        return status;
    }

    public String getCode() {
        return code;
    }

    public String getStatusDisplay() {
        return statusDisplay;
    }

    public String getCreated() {
        return Utility.formatShowDate(created);
    }

    public String getTotalPrice() {
        if (totalPrice != null) {
            return totalPrice.getFormattedPrice();
        }

        return null;
    }

    public boolean hasShowPayCode() {
        return status != null && status.codeLowerCase != null
                && status.codeLowerCase.equals("pending_kiosk_payment");
    }

    public String getDeliveryCost() {
        if (deliveryCost != null && deliveryCost.getValue() != 0) {
            return deliveryCost.formattedValue;
        }
        return "";
    }

    public String getInvoiceData() {
        if (invoiceData != null) {
            return invoiceData.carrierTypeName;
        }
        return "";
    }

    public String getCashOrCreditPaidPrice() {
        if (cashOrCreditPaidPrice != null) {
            return cashOrCreditPaidPrice.formattedValue;
        }
        return "";
    }

    public String getBaseTotalPrice() {
        if (baseTotalPrice != null && baseTotalPrice.getValue() != 0) {
            return baseTotalPrice.formattedValue;
        }
        return "";
    }

    public String getVoucherOverflowValue() {
        if (voucherOverflowValue != null && voucherOverflowValue.getValue() != 0) {
            return voucherOverflowValue.value;
        }
        return "";
    }

    public String getOrderDiscounts() {
        if (orderDiscounts != null && orderDiscounts.getValue() != 0) {
            return orderDiscounts.formattedValue;
        }
        return "";
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public String getDeliveryMode() {
        if (deliveryMode != null) {
            return deliveryMode.name;
        }
        return "";
    }

    private class DeliveryMode {
        public String name;
    }

    public DeliveryAddress getDeliveryAddress() {
        return deliveryAddress;
    }
//    public String getDeliveryAddress() {
//        if (deliveryAddress != null) {
//            return deliveryAddress.line1;
//        }
//        return "";
//    }

    public String getDeliveryName() {
        if (deliveryAddress != null) {
            return deliveryAddress.firstName;
        }
        return "";
    }

    public class DeliveryAddress {
        public String firstName;
        public String id;
        public String title;
        public String titleCode;
        public String lastName;
        public String line1;
        public String phone;
        public String email;
        public boolean shippingAddress;
        public boolean defaultAddress;
        public boolean contactAddress;
        public String streetName;
        public String streetNumber;
        public String floor;
        public String district;
        public String districtCode;
        public String districtText;
        public String alley;
        public String lane;
        public String room;
        public boolean isSpecialAddress;
        public String line3;
        public String block;
        public String region;
        public String postalCode;

        public String getId() {
            return id;
        }

        public String getAlley() {
            return alley;
        }

        public String getBlock() {
            return block;
        }

        public String getDistrict() {
            return district;
        }

        public String getDistrictCode() {
            return districtCode;
        }

        public String getDistrictText() {
            return districtText;
        }

        public String getEmail() {
            return email;
        }

        public String getFloor() {
            return floor;
        }

        public String getLane() {
            return lane;
        }

        public String getLastName() {
            return lastName;
        }

        public String getLine3() {
            return line3;
        }

        public String getPhone() {
            return phone;
        }

        public String getRoom() {
            return room;
        }

        public String getStreetName() {
            return streetName;
        }

        public String getStreetNumber() {
            return streetNumber;
        }

        public String getTitle() {
            return title;
        }

        public String getTitleCode() {
            return titleCode;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLine1() {
            return line1;
        }

        public String getPostalCode() {
            return postalCode;
        }

        public String getRegion() {
            return region;
        }
    }

    public String getCountry() {
        if (country != null) {
            return country.name;
        }
        return "";
    }

    private class Country {
        public String name;
    }

    public class PaymentMode {
        public String code;
        public String name;
        public String description;

        public String getCode() {
            return code;
        }

        public String getDescription() {
            return description;
        }

        public String getName() {
            return name;
        }
    }

    private class InvoiceData {
        public String carrierTypeName;
    }

    public class Order {
        public int quantity;
        public Price basePrice;
        public Price totalPrice;
        public Product product;

        public String getBasePrice() {
            if (basePrice != null) {
                return basePrice.formattedValue;
            }
            return "";
        }

        public String getTotalPrice() {
            if (totalPrice != null) {
                return totalPrice.formattedValue;
            }
            return "";
        }

        public int getQuantity() {
            return quantity;
        }

        public Product getProduct() {
            return product;
        }
    }

    public class Status {
        private String code;
        private String codeLowerCase;

        public String getCode() {
            return code;
        }

        public String getCodeLowerCase() {
            return codeLowerCase;
        }
    }

    public boolean isFreeShipping() {
        return freeShippingFlag;
    }
}
