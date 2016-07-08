package parknshop.parknshopapp.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Howard Chang on 2015/9/22
 */
public class Banks {

    private String code;
    private String name;
    private List<Branches> branches;


    public String getCode() {
        return code != null ? code : "";
    }

    public String getName() {
        return name != null ? name : "";
    }

    public List<Branches> getBranches() {
        return branches != null ? branches : new ArrayList<Branches>();
    }
}
