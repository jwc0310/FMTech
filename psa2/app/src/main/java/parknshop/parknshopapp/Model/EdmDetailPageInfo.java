package parknshop.parknshopapp.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Howard Chang on 2015/11/4
 */
public class EdmDetailPageInfo  implements Serializable {

    private int page;
    private FeatureImage feature_image;
    private List<Item> item;

    public int getPage() {
        return page;
    }

    public String getFeatureImage() {
        return feature_image != null ? feature_image.url : "";
    }

    public List<Item> getItem() {
        return item != null ? item : new ArrayList<Item>();
    }

}
