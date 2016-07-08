package parknshop.parknshopapp.Model;

/**
 * Created by chrisyu on 8/4/16.
 */
public class Timeslot {
    String name;
    String startTime;
    int orderQouta;
    boolean deliveryAvailable;
    String code;
    String pickingCenterName;
    int quota;
    int index;
    boolean dayFlag;
    String wareHouseCode;
    String quotaDate;
    String fulFillmentType;
    boolean sameDayExtraction;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public int getOrderQouta() {
        return orderQouta;
    }

    public void setOrderQouta(int orderQouta) {
        this.orderQouta = orderQouta;
    }

    public boolean isDeliveryAvailable() {
        return deliveryAvailable;
    }

    public void setDeliveryAvailable(boolean deliveryAvailable) {
        this.deliveryAvailable = deliveryAvailable;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPickingCenterName() {
        return pickingCenterName;
    }

    public void setPickingCenterName(String pickingCenterName) {
        this.pickingCenterName = pickingCenterName;
    }

    public int getQuota() {
        return quota;
    }

    public void setQuota(int quota) {
        this.quota = quota;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public boolean isDayFlag() {
        return dayFlag;
    }

    public void setDayFlag(boolean dayFlag) {
        this.dayFlag = dayFlag;
    }

    public String getWareHouseCode() {
        return wareHouseCode;
    }

    public void setWareHouseCode(String wareHouseCode) {
        this.wareHouseCode = wareHouseCode;
    }

    public String getQuotaDate() {
        return quotaDate;
    }

    public void setQuotaDate(String quotaDate) {
        this.quotaDate = quotaDate;
    }

    public String getFulFillmentType() {
        return fulFillmentType;
    }

    public void setFulFillmentType(String fulFillmentType) {
        this.fulFillmentType = fulFillmentType;
    }

    public boolean isSameDayExtraction() {
        return sameDayExtraction;
    }

    public void setSameDayExtraction(boolean sameDayExtraction) {
        this.sameDayExtraction = sameDayExtraction;
    }
}
/*    [
    {
        "name": "12:00PM - 05:00PM",
            "startTime": "12:00PM",
            "endTime": "05:00PM",
            "orderQouta": 98,
            "deliveryAvailable": false,
            "code": "DS9605",
            "pickingCenterName": "RA",
            "quota": 0,
            "index": 2,
            "dayFlag": false,
            "wareHouseCode": "951",
            "quotaDate": "2016-04-08 16:00:00.0 UTC",
            "fulFillmentType": "HOMEDELIVERY",
            "sameDayExtraction": false
    }]*/

