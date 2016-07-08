package parknshop.parknshopapp.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by panther945 on 2015/8/3.
 */
public class ECouponResponse {
    private List<ECoupon> evoucherEcouponList;
    private LoyaltyPoint loyaltyPoint;
    private final String Coupon = "COUPON";
    private final String Voucher = "VOUCHER";

    public List<String> getCouponList(String selectStr) {
        List<String> list = new ArrayList<String>();
        list.add(selectStr);
        if (evoucherEcouponList != null) {
            for (ECoupon eCoupon : evoucherEcouponList) {
                if (eCoupon.type.equals(Coupon)) {
                    list.add(eCoupon.description);
                }
            }
        }
        return list;
    }

    /*
    public List<String> getCouponList() {
        List<String> list = new ArrayList<String>();
        //list.add(selectStr);
        if (evoucherEcouponList != null) {
            for (ECoupon eCoupon : evoucherEcouponList) {
                if (eCoupon.type.equals(Coupon)) {
                    list.add(eCoupon.description);
                }
            }
        }
        return list;
    }*/

    public ArrayList<ECoupon> getCouponList() {
        ArrayList<ECoupon> list = new ArrayList<ECoupon>();
        //list.add(selectStr);
        if (evoucherEcouponList != null) {
            for (ECoupon eCoupon : evoucherEcouponList) {
                if (eCoupon.type.equals(Coupon)) {
                    list.add(eCoupon);
                }
            }
        }
        return list;
    }


    public ArrayList<ECoupon> getEVoucherList() {
        ArrayList<ECoupon> list = new ArrayList<ECoupon>();
        if (evoucherEcouponList != null) {
            for (ECoupon eCoupon : evoucherEcouponList) {
                if (eCoupon.type.equals(Voucher)) {
                    list.add(eCoupon);
                }
            }
        }
        return list;
    }

    /*
    public List<String> getEVoucherList() {
        List<String> list = new ArrayList<String>();
        if (evoucherEcouponList != null) {
            for (ECoupon eCoupon : evoucherEcouponList) {
                if (eCoupon.type.equals(Voucher)) {
                    list.add(eCoupon.description);
                }
            }
        }
        return list;
    }*/


    public List<String> getEVoucherCodeList() {
        List<String> list = new ArrayList<String>();
        if (evoucherEcouponList != null) {
            for (ECoupon eCoupon : evoucherEcouponList) {
                if (eCoupon.type.equals(Voucher)) {
                    list.add(eCoupon.code);
                }
            }
        }
        return list;
    }


    public String getCouponCodeByDesc(String desc) {
        if (evoucherEcouponList != null) {
            for (ECoupon eCoupon : evoucherEcouponList) {
                if (eCoupon.type.equals(Coupon) && eCoupon.description.equals(desc)) {
                    return eCoupon.code;
                }
            }
        }

        return " ";
    }

    public String getVoucherCodeByDesc(String desc) {
        if (evoucherEcouponList != null) {
            for (ECoupon eCoupon : evoucherEcouponList) {
                if (eCoupon.type.equals(Voucher) && eCoupon.description.equals(desc)) {
                    return eCoupon.code;
                }
            }
        }

        return "";
    }

    public String getCouponDescByCode(String code) {
        if (evoucherEcouponList != null) {
            for (ECoupon eCoupon : evoucherEcouponList) {
                if (eCoupon.type.equals(Coupon) && eCoupon.code.equals(code)) {
                    return eCoupon.description;
                }
            }
        }

        return null;
    }

    public String getVoucherDescByCode(String code) {
        if (evoucherEcouponList != null) {
            for (ECoupon eCoupon : evoucherEcouponList) {
                if (eCoupon.type.equals(Voucher) && eCoupon.code.equals(code)) {
                    return eCoupon.description;
                }
            }
        }

        return null;
    }


    public int getPoint() {
        return (int) loyaltyPoint.pointsToMoney;
    }

    public List<ECoupon> getEvoucherEcouponList() {
        return evoucherEcouponList != null ? evoucherEcouponList : new ArrayList<ECoupon>();
    }

    public static class ECoupon {
        private String code;
        private String description;
        private String type;
        private float igcValue;
        private String igcClpeCode;
        private String startDate;
        private String endDate;
        private String formateStartDate;
        private String formateEndDate;
        private String terms;
        private boolean selected;

        public void setselected(boolean boo) {
            selected = boo;
        }

        public boolean getselected() {
            return selected;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setTerms(String terms) {
            this.terms = terms;
        }

        public String getTerms() {
            if(terms == null)
                return "";
            return terms;
        }

        public String getCode() {
            return code != null ? code : "";
        }

        public String getDescription() {
            return description != null ? description : "";
        }

        public String getEndDate() {
            return endDate != null ? endDate : "";
        }

        public String getFormateEndDate() {
            return formateEndDate != null ? formateEndDate : "";
        }

        public String getFormateStartDate() {
            return formateStartDate != null ? formateStartDate : "";
        }

        public String getIgcClpeCode() {
            return igcClpeCode != null ? igcClpeCode : "";
        }

        public float getIgcValue() {
            return igcValue;
        }

        public String getStartDate() {
            return startDate != null ? startDate : "";
        }

        public String getType() {
            return type != null ? type : "";
        }
    }

    public LoyaltyPoint getLoyaltyPoint() {
        return loyaltyPoint;
    }

    public class LoyaltyPoint {
        private float pointsToMoney;

        public float getPointsToMoney() {
            return pointsToMoney;
        }
    }
}
