package parknshop.parknshopapp.Model;

import java.io.Serializable;

/**
 * Created by Howard Chang on 2015/11/4
 */
public class Item  implements Serializable {
    private String code;
    private String description;

    public String getCode() {
        return code != null ? code : "";
    }

    public String getDescription() {
        return description != null ? description : "";
    }
}
