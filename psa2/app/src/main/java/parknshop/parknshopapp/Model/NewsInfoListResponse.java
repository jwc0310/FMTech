package parknshop.parknshopapp.Model;

import java.util.List;

/**
 * Created by kwongyuenpan on 16/3/16.
 */
public class NewsInfoListResponse extends BackendResponse {
    public Results results;
    public Integer next;

    public class Results {
        public List<NewsInfo> news_info;
    }

    public NewsInfo getNewsInfo(int index) {
        if (!isEmpty()) {
            try {
                return results.news_info.get(index);
            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    public String getNewsImageUrl(int index) {
        if (!isEmpty()) {
            try {
                return results.news_info.get(index).getImageUrl();
            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
            }
        }

        return "";
    }

    public String getNewsTitle(int index) {
        if (!isEmpty()) {
            try {
                return results.news_info.get(index).title;
            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    public int getNewsCount() {
        return !isEmpty() ? results.news_info.size() : 0;
    }

    public boolean isEmpty() {
        return results == null || results.news_info == null || results.news_info.isEmpty();
    }
}