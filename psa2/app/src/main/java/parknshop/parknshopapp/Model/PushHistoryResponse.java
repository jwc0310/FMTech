package parknshop.parknshopapp.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Howard Chang on 2015/12/9
 */
public class PushHistoryResponse extends BackendResponse {

    public int next;
    private Results results;

    public List<PushHistoryInfo> getData() {
        if (results == null) {
            return null;
        }
        return results.push_history_info != null ? results.push_history_info : new ArrayList<PushHistoryInfo>();
    }

    public class Results {
        private List<PushHistoryInfo> push_history_info;
    }
}

