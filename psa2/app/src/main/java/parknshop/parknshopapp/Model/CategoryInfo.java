package parknshop.parknshopapp.Model;

/**
 * Created by kwongyuenpan on 16/3/16.
 */
public class CategoryInfo extends ModelInfo {
    private FeatureImage feature_image;
    public String summary;
    public String content;
    public int store_id;
    public int sorting_rank;

    public String getImageUrl() {
        if (hasImageUrl()) {
            return feature_image.url;
        }
        return "";
    }

    public boolean hasImageUrl() {
        return feature_image != null && feature_image.url != null && !feature_image.url.isEmpty();
    }
}
