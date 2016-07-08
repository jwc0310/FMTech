package parknshop.parknshopapp.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Howard Chang on 2015/9/22
 */
public class BankListResponse {

    private List<Banks> banks;

    public List<Banks> getBanks() {
        return banks != null ? banks : new ArrayList<Banks>();
    }
}
