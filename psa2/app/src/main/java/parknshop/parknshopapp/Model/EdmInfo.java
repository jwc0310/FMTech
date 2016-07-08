package parknshop.parknshopapp.Model;

/**
 * Created by Howard Chang on 2015/11/3
 */
public class EdmInfo {

    private int id;
    private String title;
    private FeatureImage feature_image;
    private String publish_status;
    private int store_id;
    private int sorting_rank;
    private String edit_datetime;
    private String online_datetime;
    private String offline_datetime;



    public String getEditDatetime() {
        return edit_datetime != null ? edit_datetime : "";
    }

    public String getFeatureImage() {
        return feature_image != null ? feature_image.url : "";
    }

    public int getId() {
        return id;
    }

    public String getOfflineDatetime() {
        return offline_datetime != null ? offline_datetime : "";
    }

    public String getOnlineDatetime() {
        return online_datetime != null ? online_datetime : "";
    }

    public String getPublishStatus() {
        return publish_status != null ? publish_status : "";
    }

    public int getSortingRank() {
        return sorting_rank;
    }

    public int getStoreId() {
        return store_id;
    }

    public String getTitle() {
        return title != null ? title : "";
    }


}
