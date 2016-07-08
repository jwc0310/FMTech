package parknshop.parknshopapp.Model;

import java.io.Serializable;

/**
 * Created by chrisyu on 16/3/12.
 */
public class Price implements Serializable {
    public String value;
    public String formattedValue;

    public float getValue() {
        if (value == null || value.isEmpty()) {
            return 0f;
        }
        return Float.parseFloat(value);
    }

    public String getFormattedPrice() {
        if(formattedValue == null)
            return "";
        return formattedValue;
    }
}
