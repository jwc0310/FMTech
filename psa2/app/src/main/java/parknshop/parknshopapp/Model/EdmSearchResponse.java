package parknshop.parknshopapp.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Howard Chang on 2015/11/3
 */
public class EdmSearchResponse extends BackendResponse {

    private Results results;

    public List<EdmInfo> getData() {
        return results != null ? results.edm_info : new ArrayList<EdmInfo>();
    }

    class Results {
        private List<EdmInfo> edm_info;
    }
}
