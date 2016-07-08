package parknshop.parknshopapp.Model;

import java.util.List;

import parknshop.parknshopapp.common.GlobalConstant;

/**
 * Created by panther945 on 2015/7/16.
 */
public class LastMinuteResponse extends BackendResponse {
    private String current_datetime;
    private Results results;

    public LastMinuteItem getItem(int index) {
        if (results != null && results.lastminute_item_info != null) {
            try {
                return results.lastminute_item_info.get(index);
            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    public int getItemCount() {
        return results.lastminute_item_info != null ? results.lastminute_item_info.size() : 0;
    }

    public int getRemainingDay(int index) {
        LastMinuteItem item = getItem(index);

        if (item != null && item.getEventEndTime() != null && current_datetime != null) {
            Long remainingTime = Utility.formatDate(item.getEventEndTime(), Utility.SHOW_TIME_FORMAT).getTime()
                    - Utility.formatDate(current_datetime, Utility.SHOW_TIME_FORMAT).getTime();

            return (int)(remainingTime / GlobalConstant.DAY);
        }

        return 0;
    }

    public long getTimeLeft(int index) {
        LastMinuteItem item = getItem(index);
        if (item != null && item.getEventEndTime() != null && current_datetime != null) {
            return Utility.formatDate(item.getEventEndTime(), Utility.SHOW_TIME_FORMAT).getTime()
                    - Utility.formatDate(current_datetime, Utility.SHOW_TIME_FORMAT).getTime();
        }

        return 0;
    }

    public class Results {
        private List<LastMinuteItem> lastminute_item_info;
    }
}
