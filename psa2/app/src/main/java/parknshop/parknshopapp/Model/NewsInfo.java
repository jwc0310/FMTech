package parknshop.parknshopapp.Model;

import java.util.List;

/**
 * Created by kwongyuenpan on 16/3/16.
 */
public class NewsInfo extends ModelInfo {
    public int store_id;
    private FeatureImage feature_image;
    public String summary;
    public String content;
    public String share_text;
    public String share_url;
    public boolean sticky;
    public List<CategoryInfo> category_info;
    public List<MetaInfo> meta;
    public boolean redirect_enable;
    public String redirect_url;
    public boolean link_button_enable;
    public String link_button_title;
    public String link_button_url;
    public boolean member_only;

    public String getImageUrl() {
        if (hasImageUrl()) {
            return feature_image.url;
        }
        return "";
    }

    public boolean hasImageUrl() {
        return feature_image != null && feature_image.url != null && !feature_image.url.isEmpty();
    }

    public String getImageUrl(String host) {
        if (hasImageUrl()) {
            return host + feature_image.url;
        }
        return "";
    }

    public String getOfflineTime() {
        return Utility.formatBackendDate(offline_datetime);
    }
}
