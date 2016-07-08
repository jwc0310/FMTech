package parknshop.parknshopapp.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by panther945 on 2015/7/23.
 */
public class BankDayResponse {
    private List<String> availableBankDayPromotion;

    public List<String> getBankDayList() {
        return availableBankDayPromotion != null ? availableBankDayPromotion : new ArrayList<String>();
    }
}
