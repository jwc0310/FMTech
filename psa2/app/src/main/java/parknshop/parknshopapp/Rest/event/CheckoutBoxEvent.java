package parknshop.parknshopapp.Rest.event;

/**
 * Created by chrisyu on 8/4/16.
 */
public class CheckoutBoxEvent extends BaseEvent{
    private boolean selected;
    private int hashCode;
    private String dataId;

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public boolean getSelected() {
        return selected;
    }

    public void setHashCode(int hashCode) {
        this.hashCode = hashCode;
    }

    public int getHashCode(){
        return hashCode;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    public String getDataId() {
        return this.dataId;
    }
}
