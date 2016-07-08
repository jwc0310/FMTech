package parknshop.parknshopapp.Rest.event;

/**
 * Created by chrisyu on 5/4/16.
 */
public class CheckoutButtonGroupEvent extends BaseEvent {
    String value;
    int successCode;
    int childSuccessCode;
    int position;
    public boolean callApi = true;

    public void setText(String value) {
        this.value = value;
    }

    public String getText() {
        return value;
    }

    public void setSuccessCode (int successCode) {
        this.successCode = successCode;
    }

    public int getSuccessCode () {
        return successCode;
    }

    public void setChildSuccessCode (int successCode) {
        this.childSuccessCode = successCode;
    }

    public int getChildSuccessCode() {
        return childSuccessCode;
    }
    public void setPosition(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }
}
