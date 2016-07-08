package parknshop.parknshopapp.Model;

import android.content.Context;
import android.text.TextUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import parknshop.parknshopapp.R;

/**
 * Created by panther945 on 2015/6/17.
 */
public class CartResponse extends ErrorCode {
    private String code;
    private List<Entry> entries;
    //reminderCartEntries
    private List<Entry> reminderCartEntries;
    private Price subTotal, subTotalCart;
    private Price orderDiscounts;
    private Price deliveryCost;
    private Price totalPrice;
    private Price installmentPaidPrice;
    private Price totalPriceWithoutShippingFee;
    private boolean freeShippingFlag;
    private int totalItems;
    private List<RedemptionProduct> mobileIwaCartEntryRedemptionProducts;
    private List<String> appliedBankDayPromotionFlag;
    private List<GiftProduct> igcPrintMessages;
    private int totalUnitCount;
    private String[][] appliedCouponCodes;
    private List<VoucherInfo> iwaCouponInfos;
    private List<VoucherInfo> voucherInfos;
    private Price redeemPointsAsMoney;
    private Price cashOrCreditPaidPrice;
    private Boolean isStorePickupAllowed;
    private Boolean isMixedHamper;
    private AddressData.AddressForm deliveryAddress;
    private AddressData.AddressForm billingAddress;
    private DeliveryMode deliveryMode;
    private List<ReceivedPromotion> receivedPromotions;
    private boolean needCartMerge;
    private TotalTax totalTax;

    public TotalTax getTotalTax() {
        return totalTax;
    }

    public class TotalTax {
        private String currencyIso;
        private String value;
        private String priceType;
        private String formattedValue;

        public String getCurrencyIso() {
            return currencyIso;
        }

        public String getValue() {
            return value;
        }

        public String getPriceType() {
            return priceType;
        }

        public String getFormattedValue() {
            return formattedValue;
        }
    }

    public boolean isNeedCartMerge() {
        return needCartMerge;
    }

    public String getCode() {
        return code;
    }

    public List<VoucherInfo> getVoucherInfos() {
        if(voucherInfos == null)
            return new ArrayList<VoucherInfo>();

        return voucherInfos;
    }

    public List<VoucherInfo> getIwaCouponInfos() {
        if(iwaCouponInfos == null)
            return new ArrayList<VoucherInfo>();

        return iwaCouponInfos;
    }

    public AddressData.AddressForm getBillingAddress() {
        return this.billingAddress;
    }

    public void setDeliveryAddress(AddressData.AddressForm deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public DeliveryMode getDeliveryMode() {
        return this.deliveryMode;
    }

    public void setDeliveryMode(DeliveryMode deliveryMode) {
        this.deliveryMode = deliveryMode;
    }

    public List<Entry> getReminderCartEntries() {
        if(reminderCartEntries == null)
            reminderCartEntries = new ArrayList<Entry>();
        return reminderCartEntries;
    }

    private PaymentMode paymentMode;

    public class PaymentMode {
        private String code;
        private String name;
        private String description;

        public String getCode() {
            return code;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }
    }
    /*
    "deliveryMode": {
        "code": "HomeDelivery",
                "name": "Home Delivery",
                "deliveryCost": {
            "currencyIso": "HKD",
                    "value": "30.0",
                    "priceType": "BUY",
                    "formattedValue": "HK$30.00"
        }
    },*/
    public class DeliveryMode {
        String code;
        String name;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public void setReminderCartEntries(List<Entry> reminderCartEntries) {
        this.reminderCartEntries = reminderCartEntries;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public AddressData.AddressForm getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setIsMaxHamper(boolean isMixedHamper) {
        this.isMixedHamper = isMixedHamper;
    }

    public Boolean getIsMixedHamper() {
        return isMixedHamper;
    }

    public Boolean getHamper() {
        if(isHamper == null)
            return false;
        return isHamper;
    }

    public void setHamper(Boolean hamper) {
        isHamper = hamper;
    }

    private Boolean isHamper;

    public Boolean getAgeRestriction() {
        if(ageRestriction == null)
            return false;
        return ageRestriction;
    }

    public void setAgeRestriction(Boolean ageRestriction) {
        this.ageRestriction = ageRestriction;
    }

    private Boolean ageRestriction;

    public CartResponse() {
    }

    public boolean getIsStorePickupAllowed() {
        return isStorePickupAllowed != null ? isStorePickupAllowed : true;
    }

    public String getGiftProductCode(int rowIndex, int index) {
        try {
            return igcPrintMessages.get(rowIndex).igcPrintEntities.get(index).product.getCodeNumber();
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        return "";
    }

    public int getGiftRowCount() {
        return igcPrintMessages != null ? igcPrintMessages.size() : 0;
    }

    public int getGiftItemCount(int rowIndex) {
        try {
            if (igcPrintMessages != null && igcPrintMessages.get(rowIndex).igcPrintEntities != null) {
                return igcPrintMessages.get(rowIndex).igcPrintEntities.size();
            }
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        return 0;
    }

    public String getGiftImageUrl(int rowIndex, int index) {
        try {
            return igcPrintMessages.get(rowIndex).igcPrintEntities.get(index).product.getProductImageUrl();
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        return "";
    }

    public String getGiftBrandName(int rowIndex, int index) {
        try {
            return igcPrintMessages.get(rowIndex).igcPrintEntities.get(index).product.getBrandName();
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        return "";
    }

    public String getGiftName(int rowIndex, int index) {
        try {
            return igcPrintMessages.get(rowIndex).igcPrintEntities.get(index).product.getName();
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        return "";
    }

    public List<String> getBankDayFlagList() {
        return appliedBankDayPromotionFlag != null ? appliedBankDayPromotionFlag : new ArrayList<String>();
    }

    public int getTotalItems() {
        return totalItems;
    }

    public int getTotalUnitCount() {
        return totalUnitCount;
    }

    public String getEntryNumber(int index) {
        try {
            return entries != null ? entries.get(index).entryNumber : "-1";
        } catch (IndexOutOfBoundsException e) {
            return "-1";
        }
    }

    public Entry getEntry(int index) {
        try {
            return entries != null ? entries.get(index) : new Entry();
        } catch (IndexOutOfBoundsException e) {
            return new Entry();
        }
    }

    public Entry getEntryById(String code) {
        if(entries == null) return  new Entry();
        for(int i = 0; i < entries.size(); i++) {
            if(entries.get(i).product.getCode().equals(code))
                return entries.get(i);
        }
        return new Entry();
    }

    public List<Entry> getAllEntry() {

        return entries != null ? entries : new ArrayList<Entry>();

    }

    public String getSubTotal() {
        return subTotal != null ? subTotal.getFormattedPrice() : null;
    }

    public String getSubTotalCart() {
        return subTotalCart != null ? subTotalCart.getFormattedPrice() : null;
    }

    public String getOrderDisCount() {
        return orderDiscounts != null ? orderDiscounts.getFormattedPrice() : null;
    }

    public String getDeliveryCost(Context context) {
        if(isFreeShipping())
            return context.getResources().getString(R.string.free);

        return deliveryCost != null ? deliveryCost.getFormattedPrice() : null;
    }

    public String getTotalPrice() {
        return cashOrCreditPaidPrice != null ? cashOrCreditPaidPrice.getFormattedPrice() : null;
    }

    public String getInstallmentPaidPrice() {
        return installmentPaidPrice != null ? installmentPaidPrice.getFormattedPrice() : "";
    }

    public String getTotalPriceWithoutDelivery() {
        return totalPriceWithoutShippingFee != null ? totalPriceWithoutShippingFee.getFormattedPrice() : null;
    }

    public boolean isFreeShipping() {
        return freeShippingFlag;
    }

    public List<String> getRewardPoint() {
        List<String> list = new ArrayList<String>();
        if (receivedPromotions != null) {
            for (ReceivedPromotion promotion : receivedPromotions) {
                if (promotion.rewardPoints != null) {
                    list.add(promotion.rewardPoints + "點");
                }
            }
        }

        return list;
    }

    public List<String> getRewardPointMsg() {
        List<String> list = new ArrayList<String>();
        if (receivedPromotions != null) {
            for (ReceivedPromotion promotion : receivedPromotions) {
                if (promotion.rewardPoints != null) {
                    list.add(promotion.message);
                }
            }
        }

        return list;
    }

    public List<String> getDiscountMsg() {
        List<String> list = new ArrayList<String>();
        if (receivedPromotions != null) {
            for (ReceivedPromotion promotion : receivedPromotions) {
                if (promotion.rewardPoints == null) {
                    list.add(promotion.message);
                }
            }
        }

        return list;
    }

    public List<String> getDiscount() {
        List<String> list = new ArrayList<String>();
        if (receivedPromotions != null) {
            for (ReceivedPromotion promotion : receivedPromotions) {
                if (promotion.rewardPoints == null && promotion.rewardAmount != null) {
                    list.add("-" + promotion.rewardAmount.getFormattedPrice());
                }
            }
        }

        return list;
    }

    public int getQuantity(int index) {
        try {
            return entries != null ? entries.get(index).quantity : 0;
        } catch (IndexOutOfBoundsException e) {
            return 0;
        }
    }

    public int getProductsCount() {
        return entries != null ? entries.size() : 0;
    }

    public boolean isGift(int index) {
        try {
            if (entries != null && entries.get(index).totalPrice != null) {
//                return getProduct(index) != null && getProduct(index).getPriceValue() <= 0;
                return entries.get(index).totalPrice.getValue() == 0f;
            }
        } catch (IndexOutOfBoundsException e) {
            return false;
        }

        return false;
    }

    public Product getProduct(int index) {
        try {
            if (entries != null) {
                return entries.get(index).product;
            }
        } catch (IndexOutOfBoundsException e) {
            return null;
        }

        return null;
    }

    public String getBasePrice(int index) {
        try {
            if (entries != null) {
                return entries.get(index).basePrice.getFormattedPrice();
            }
        } catch (IndexOutOfBoundsException e) {
            return null;
        }

        return null;
    }

    public String getPromotionString(int index) {
        if (entries != null && entries.get(index).appliedIwaPromotions != null) {
            try {
                StringBuilder builder = new StringBuilder();
                for (int i = 0; i < entries.get(index).appliedIwaPromotions.size(); i++) {
                    if (i != 0) {
                        builder.append(" / ");
                    }
                    Entry.Promotion promotion = entries.get(index).appliedIwaPromotions.get(i);
                    builder.append(promotion.promotionDescription);
                }

                return builder.toString();
            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    public String getNoPromotionString(int index) {
        if (entries != null && entries.get(index).missedPromotions != null) {
            try {
                StringBuilder builder = new StringBuilder();
                for (int i = 0; i < entries.get(index).missedPromotions.size(); i++) {
                    if (i != 0) {
                        builder.append(" / ");
                    }
                    Entry.Promotion promotion = entries.get(index).missedPromotions.get(i);
                    builder.append(promotion.description);
                }

                return builder.toString();
            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    public int getRedemptionProductCount() {
        return mobileIwaCartEntryRedemptionProducts != null ? mobileIwaCartEntryRedemptionProducts.size() : 0;
    }

    public String getRedemptionProductDesc(int index) {
        if (mobileIwaCartEntryRedemptionProducts != null) {
            try {
                return mobileIwaCartEntryRedemptionProducts.get(index).promotionDescription;
            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    public String getRedemptionProductName(int index) {
        if (mobileIwaCartEntryRedemptionProducts != null) {
            try {
                return mobileIwaCartEntryRedemptionProducts.get(index).productName;
            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    public String getRedemptionProductImageUrl(int index) {
        if (mobileIwaCartEntryRedemptionProducts != null) {
            try {
                return mobileIwaCartEntryRedemptionProducts.get(index).getProductImageUrl();
            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
            }
        }

        return "";
    }

    public String getRedemptionProductCode(int index) {
        if (mobileIwaCartEntryRedemptionProducts != null) {
            try {
                return mobileIwaCartEntryRedemptionProducts.get(index).productCode;
            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    public String[] getAppliedCouponCode() {
        return appliedCouponCodes != null && appliedCouponCodes.length > 0 && appliedCouponCodes[0].length > 0
                ? appliedCouponCodes[0] : null;
    }


    public ArrayList<String> getVoucherCode() {
        ArrayList<String> voucherCode = new ArrayList<String>();
        if (voucherInfos != null && voucherInfos.size() > 0) {
            for (VoucherInfo voucherList : voucherInfos) {
                voucherCode.add(voucherList.voucherCode);
            }
        }
        return voucherCode;

    }

    public Price getRedeemPointsAsMoney() {
        return redeemPointsAsMoney;
    }
//
//    public boolean hasCoupon() {
//        return !TextUtils.isEmpty(getAppliedCouponCode()) || !TextUtils.isEmpty(getVoucherCode().toString())
//                || getRedeemPointsAsMoney() > 0;
//    }

    public boolean hasCoupon() {
        return !TextUtils.isEmpty(getAppliedCouponCode()[0]) || !getVoucherCode().isEmpty()
                || Integer.valueOf(getRedeemPointsAsMoney().value) > 0;
    }

    public static class Entry implements Serializable {
        public String entryNumber;
        public Product product;
        public int quantity;
        public List<Promotion> appliedIwaPromotions;
        private List<Promotion> missedPromotions;
        private Price basePrice;
        public Price totalPrice;
        public FinalEntryPrice finalEntryPrice;

        public Entry() {
        }

        public Entry (Entry entry) {

            this.entryNumber = entry.entryNumber;
            this.product = entry.product;
            this.quantity = entry.quantity;
            this.appliedIwaPromotions = entry.appliedIwaPromotions;
            this.missedPromotions = entry.missedPromotions;
            this.basePrice = entry.basePrice;
            this.totalPrice = entry.totalPrice;
            this.finalEntryPrice = entry.finalEntryPrice;
        }

        public String getEntryNumber() {
            return entryNumber;
        }

        public class Promotion implements Serializable {
            private String description;
            public String promotionDescription;
            public int promotionNumber;
            public String rewardAmount;
            int rewardType;
        }

        public class FinalEntryPrice implements Serializable {
            public String currencyIso;
            public String value;
            public String priceType;
            public String formattedValue;

        }
    }

    public class ReceivedPromotion {
        private String rewardPoints;
        private String message;
        private Price rewardAmount;

        public String getMessage() {
            return this.message;
        }

        public float getRewardValue() {
            return rewardAmount.getValue();
        }
    }

    public class RedemptionProduct {
        private String promotionDescription;
        private String productName;
        private String productCode;
        private List<ImageData> images;

        public String getProductImageUrl() {
            if (images != null) {
                for (ImageData imageData : images) {
                    if (imageData.isProductImage()) {
                        return imageData.getUrl();
                    }
                }
            }

            return "";
        }
    }

    public class GiftProduct {
        private List<PrintEntry> igcPrintEntities;

        public class PrintEntry {
            private Product product;
        }
    }

    public class VoucherInfo {
        public String voucherNumber;
        public double amount;
        public String currency;
        public String voucherCode;
        public String description;
    }

    public List<ReceivedPromotion> getRecievedPromotion () {
        if(receivedPromotions == null)
            receivedPromotions = new ArrayList<ReceivedPromotion>();
        return receivedPromotions;
    }

    /*  "deliveryAddress": {
    "id": "8810718593047",
    "firstName": "Essing SITu12345",
    "lastName": "CC",
    "line1": "97A-99 Praya Road, Cheung Chau, New Territories",
    "region": "Outlying Islands",
    "postalCode": "2981 0316",
    "country": {
      "isocode": "HK",
      "name": "Hong Kong"
    },
    "shippingAddress": true,
    "contactAddress": false,
    "floor": "0",
    "district": "cheungchau",
    "districtCode": "cheungchau",
    "districtText": "Cheung Chau",
    "city": "Hong Kong",
    "room": "97A-99 Praya Road, Cheung Chau, New Territories",
    "isSpecialAddress": false
  },*/
    public class DeliveryAddress {
        public String id;
        public String firstName;
        public String lastName;
        public String line1;
        public String region;
        public String postalCode;

        public String getId() {
            return id;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getLine1() {
            return line1;
        }

        public String getRegion() {
            return region;
        }

        public String getPostalCode() {
            return postalCode;
        }

        public String getShippingAddress() {
            return shippingAddress;
        }

        public String getContactAddress() {
            return contactAddress;
        }

        public String getFloor() {
            return floor;
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

        public String getCity() {
            return city;
        }

        public String getRoom() {
            return room;
        }

        public boolean isSpecialAddress() {
            return isSpecialAddress;
        }

        public String shippingAddress;
        public String contactAddress;
        public String floor;
        public String district;
        public String districtCode;
        public String districtText;
        public String city;
        public String room;
        public boolean isSpecialAddress;

    }

    TotalVoucher totalVoucher;
    TotalVoucher voucherOverflowValue;

    class TotalVoucher {
        String currencyIso;
        String value;
        String priceType;
        String formattedValue;
    }
    /*{
    "currencyIso": "HKD",
    "value": "93.4",
    "priceType": "BUY",
    "formattedValue": "HK$93.40"
  },
*/
    /*05-11 11:03:18.412 31876-2764/parknshop.parknshopapp D/OkHttp:   "voucherInfos": [
05-11 11:03:18.412 31876-2764/parknshop.parknshopapp D/OkHttp:     {
05-11 11:03:18.412 31876-2764/parknshop.parknshopapp D/OkHttp:       "voucherNumber": "16300662688",
05-11 11:03:18.412 31876-2764/parknshop.parknshopapp D/OkHttp:       "amount": 30.0,
05-11 11:03:18.413 31876-2764/parknshop.parknshopapp D/OkHttp:       "currency": "HKD",
05-11 11:03:18.413 31876-2764/parknshop.parknshopapp D/OkHttp:       "voucherCode": "8Yv",
05-11 11:03:18.413 31876-2764/parknshop.parknshopapp D/OkHttp:       "description": "電子禮卷"
05-11 11:03:18.413 31876-2764/parknshop.parknshopapp D/OkHttp:     }
05-11 11:03:18.413 31876-2764/parknshop.parknshopapp D/OkHttp:   ],*/
}
