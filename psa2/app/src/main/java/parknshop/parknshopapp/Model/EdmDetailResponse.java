package parknshop.parknshopapp.Model;

/**
 * Created by Howard Chang on 2015/11/3
 */
public class EdmDetailResponse extends BackendResponse {

    private Results results;

    public EdmDetailInfo getData() {
        return results != null ? results.edm_info : new EdmDetailInfo();
    }

    class Results {
        private EdmDetailInfo edm_info;
    }
}
