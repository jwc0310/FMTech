package parknshop.parknshopapp.Model;

/**
 * Created by Howard Chang on 2015/12/9
 */
public class PushHistoryInfo {

    private int id;
    private String alert;
    private String uri;
    private String push_datetime;

    public int getId() {
        return id;
    }

    public String getAlert() {
        return alert != null ? alert : "";
    }

    public String getUri() {
        return uri != null ? uri : "";
    }

    public String getPushDatetime() {
        return push_datetime != null ? push_datetime : "";
    }
}
