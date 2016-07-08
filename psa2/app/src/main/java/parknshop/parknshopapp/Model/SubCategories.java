package parknshop.parknshopapp.Model;

/**
 * Created by Howard Chang on 2015/9/24
 */
public class SubCategories {
    private String name;
    private String id;
    private String totalNumber;

    public String getCountName() {
        return name != null ? name + " ( " + getTotalNumber() + " )" : null;
    }

    private String getTotalNumber() {
        return totalNumber != null ? totalNumber : "";
    }

    public String getName() {
        return name != null ? name : "";
    }

    public String getId() {
        return id;
    }
}
