package parknshop.parknshopapp.EventUpdate;

/**
 * Created by kwongyuenpan on 18/5/16.
 */
public class MembereCouponeVoucherViewPagerFragmentRecyclerViewAdapterOnItemClickEvent extends BaseAdapterEvent {
    String title;
    String desc;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
