package parknshop.parknshopapp.Rest.event;

/**
 * Created by chrisyu on 6/4/16.
 */
public class CheckoutDeliveryTimeSlotOnClickEvent extends BaseEvent {
    int successCode;
    int row;
    int col;
    boolean selected;

    public void setSuccessCode (int successCode) {
        this.successCode = successCode;
    }

    public int getSucessCode() {
        return successCode;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public boolean getSelected() {
        return selected;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getRow() {
        return this.row;
    }

    public int getCol() {
        return  this.col;
    }
}
