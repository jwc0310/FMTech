package parknshop.parknshopapp.Model.Category;

/**
 * Created by chrisyu on 9/3/16.
 */
public class SubCategories {
    private String name;
    private String id;
    private String totalNumber;
    public boolean selected;

    public String getCountName() {
        return name != null ? name + " ( " + getTotalNumber() + " )" : null;
    }

    public String getTotalNumber() {
        return totalNumber != null ? totalNumber : "";
    }

    public String getName() {
        return name != null ? name : "";
    }

    public String getId() {
        return id;
    }
}
