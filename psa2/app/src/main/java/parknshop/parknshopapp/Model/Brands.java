package parknshop.parknshopapp.Model;

/**
 * Created by Howard Chang on 2015/12/3
 */
public class Brands {
    private String code;
    private String name;
    private String url;
    private String prefix;

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getCode() {
        return code != null ? code : "";
    }

    public String getName() {
        return name != null ? name : "";
    }

    public String getUrl() {
        return url != null ? url : "";
    }
}
