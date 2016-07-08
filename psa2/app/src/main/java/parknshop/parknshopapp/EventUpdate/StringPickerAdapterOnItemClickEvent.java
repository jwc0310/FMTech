package parknshop.parknshopapp.EventUpdate;

/**
 * Created by kwongyuenpan on 30/3/16.
 */
public class StringPickerAdapterOnItemClickEvent extends BaseAdapterEvent {
    String text;
    int reqCode;
    int successCode;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setReqCode(int reqCode) {
        this.reqCode = reqCode;
    }

    public void setSuccessCode(int successCode) {
        this.successCode = successCode;
    }

    public int getSuccessCode() {
        return successCode;
    }

    public int getReqCode() {
        return reqCode;
    }
}
