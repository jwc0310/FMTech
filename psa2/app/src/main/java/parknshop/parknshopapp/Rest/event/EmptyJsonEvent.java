package parknshop.parknshopapp.Rest.event;

/**
 * Created by chrisyu on 11/4/16.
 */
public class EmptyJsonEvent extends BaseEvent{
    private String type;
    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
