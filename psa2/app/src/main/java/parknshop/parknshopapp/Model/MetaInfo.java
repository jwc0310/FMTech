package parknshop.parknshopapp.Model;

import android.content.Context;

import parknshop.parknshopapp.R;

/**
 * Created by kwongyuenpan on 16/3/16.
 */
public class MetaInfo {
    public int id;
    public String title;
    public String key;
    public String type;
    public String value;
    private FeatureImage image;
    public int sorting_rank;
    public String edit_datetime; //yyyy/MM/dd HH:mm:ss

    public String getImageUrl() {
        if (hasImageUrl()) {
            return image.url;
        }
        return "";
    }

    public boolean hasImageUrl() {
        return image != null && image.url != null && !image.url.isEmpty();
    }

    public String getText(Context context) {
        return key + context.getString(R.string.colon) + value;
    }
}
