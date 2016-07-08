package parknshop.parknshopapp.Rest.event;

/**
 * Created by chrisyu on 18/3/16.
 */
public class ForgetPasswordEvent extends BaseEvent {

    public int successCode;

    public String type;

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        if(type == null)
            type = "";
        return type;
    }
}
