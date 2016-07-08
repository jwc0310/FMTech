package parknshop.parknshopapp.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kate on 2015/3/27
 */
public class OnlineRecords extends ErrorCode{
    public List<OnlineRecord> orders;

    public List<OnlineRecord> getOrders() {
        if(orders == null)
            orders = new ArrayList<>();
        return orders;
    }

    public void setOrders(List<OnlineRecord> orders) {
        this.orders = orders;
    }

    public static class OnlineRecord implements Serializable {
        public String code;
        public String statusDisplay;
        public String placed;
        private float totalPrice;
        private Status status;
        private DeliveryAddress deliveryAddress;
        private boolean cancellable;
        private boolean showInvoiceFlag;
        private boolean canReturnFlag;
        private boolean canRefundFlag;
        public String properStatus;
        public String consignmentStaus;
        public DeliveryType deliveryType;
        public double cashOrCreditCardPaidPrice;
        public boolean canRateProductFlag;
        public String consignmentStatusCode;

        public void setStatusDisplay(String statusDisplay) {
            this.statusDisplay = statusDisplay;
        }

        public String getConsignmentStatusCode() {
            return consignmentStatusCode;
        }

        public boolean isShowInvoiceFlag() {
            return showInvoiceFlag;
        }

        public DeliveryAddress getDeliveryAddress() {
            return deliveryAddress;
        }

        public boolean isCancellable() {
            return cancellable;
        }

        public boolean isCanReturnFlag() {
            return canReturnFlag;
        }

        public boolean isCanRefundFlag() {
            return canRefundFlag;
        }

        public String getProperStatus() {
            return properStatus;
        }

        public String getConsignmentStaus() {
            return consignmentStaus;
        }

        public DeliveryType getDeliveryType() {
            return deliveryType;
        }

        public double getCashOrCreditCardPaidPrice() {
            return cashOrCreditCardPaidPrice;
        }

        public boolean getCanRateProductFlag() {
            return canRateProductFlag;
        }

        public class DeliveryAddress {
            private String id;
            private String firstName;
            private String lastName;
            private String line1;
            private String region;
            private String postalCode;
            private Country country;
            private String district;
            private String districtCode;
            private String districtText;
            private String room;
            private boolean isSpecialAddress;
            private boolean shippingAddress;
            private boolean defaultAddress;
            private boolean contactAddress;

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

            public String getDistrict() {
                return district;
            }

            public String getDistrictCode() {
                return districtCode;
            }

            public String getDistrictText() {
                return districtText;
            }

            public String getRoom() {
                return room;
            }

            public boolean isSpecialAddress() {
                return isSpecialAddress;
            }

            public boolean isShippingAddress() {
                return shippingAddress;
            }

            public boolean isDefaultAddress() {
                return defaultAddress;
            }

            public boolean isContactAddress() {
                return contactAddress;
            }

            public Country getCountry() {
                if(country == null)
                    country = new Country();
                return country;
            }

            public class Country {
                private String isocode;
                private String name;

                public String getIsocode() {
                    return isocode;
                }

                public String getName() {
                    if(name == null)
                        name = "";
                    return name;
                }
            }

        }

        public class DeliveryType {
            private String code;
            private String codeLowerCase;

            public String getCode() {
                return code;
            }

            public String getCodeLowerCase() {
                return codeLowerCase;
            }

        }

        public String getCode() {
            return code;
        }

        public Status getStatus() {
            return status;
        }

        public String getStatusDisplay() {
            return statusDisplay;
        }

        public String getPlaced() {
            return Utility.formatShowDate(placed);
        }

        public int getTotalPrice() {
            return (int) totalPrice;
        }

        public boolean hasShowPayCode() {
            return status != null && status.codeLowerCase != null
                    && status.codeLowerCase.equals("pending_kiosk_payment");
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
}
