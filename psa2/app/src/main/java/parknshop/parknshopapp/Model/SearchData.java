package parknshop.parknshopapp.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kwongyuenpan on 16/3/16.
 */
public class SearchData {
    public String online_datetime;
    public String offline_datetime;
    public List<String> category_ids;
    public String keyword;
    public boolean full_content;
    public Integer offset;

    private static final int FIRST_PAGE = 0;

    public SearchData(String cateId) {
        setCateId(cateId);
        offset = FIRST_PAGE;
        full_content = true;
    }

    public void setCateId(String cateId) {
        List<String> cateIds = new ArrayList<String>();
        cateIds.add(cateId);
        category_ids = cateIds;
    }

    public boolean isFirstPage() {
        return offset != null && offset == FIRST_PAGE;
    }

    public void setFirstPage() {
        offset = FIRST_PAGE;
    }
}
