package parknshop.parknshopapp.Model;

import java.io.Serializable;

/**
 * Created by chrisyu on 16/3/12.
 */
public class ImageData implements Serializable {
    public String format;
    public String url;
    public String imageType;
    public int galleryIndex;

    public String getImageType() {
        if (imageType == null)
            return "";
        return imageType;
    }

    public String getFormat() {
        if(format == null)
            return "";
        return format;
    }

    public int getGalleryIndex() {
        return galleryIndex;
    }

    public String getUrl() {
        if (url.startsWith("http")) {
            return url;
        } else {
            return url;
        }
    }

    public boolean isProductImage() {
        return format != null && format.equals("product") && imageType != null && imageType.equals("PRIMARY");
    }

    public boolean  isAdProductImage() {
        return format != null && format.equals("product") && imageType != null && imageType.equals("GALLERY");
    }
}
