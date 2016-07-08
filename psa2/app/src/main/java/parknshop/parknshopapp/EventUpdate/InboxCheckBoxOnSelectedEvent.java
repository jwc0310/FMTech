package parknshop.parknshopapp.EventUpdate;

import java.util.ArrayList;

/**
 * Created by kwongyuenpan on 4/5/16.
 */
public class InboxCheckBoxOnSelectedEvent {
    ArrayList<Boolean> isSelected = new ArrayList<>();

    public void setIsSelected(ArrayList<Boolean> isSelected) {
        this.isSelected = isSelected;
    }

    public ArrayList<Boolean> getIsSelected() {
        return isSelected;
    }
}
