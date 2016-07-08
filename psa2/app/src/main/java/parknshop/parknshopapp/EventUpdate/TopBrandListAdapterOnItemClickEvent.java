package parknshop.parknshopapp.EventUpdate;

/**
 * Created by kwongyuenpan on 29/3/16.
 */
public class TopBrandListAdapterOnItemClickEvent extends BaseAdapterEvent{
    String brandName;
    String brandNameEn;
    String brandCode;

    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode;
    }

    public String getBrandCode() {
        return brandCode;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandNameEn() {
        return brandNameEn;
    }

    public void setBrandNameEn(String brandNameEn) {
        this.brandNameEn = brandNameEn;
    }

}
