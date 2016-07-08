package parknshop.parknshopapp.Rest.event;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chrisyu on 4/5/16.
 */
public class HotSearchEvent extends BaseEvent{
    List<String> data = new ArrayList<String>();
    public void setData(List<String> data) {
        this.data = data;
    }

    public List<String> getData() {
        return data;
    }

    /*[
        "Baby Diapers",
        "Chinese New Year Special",
        "Red Wine",
        "Price Watch Products"
    ]*/
}
