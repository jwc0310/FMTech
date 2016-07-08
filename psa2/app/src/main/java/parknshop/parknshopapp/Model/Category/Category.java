package parknshop.parknshopapp.Model.Category;

/**
 * Created by chrisyu on 7/3/16.
 */
public class Category {
    private String title;
    private String desc;
    private int count;
    private String imageUrl;
    private int imageId;
    public int sp_icon;

    public Category(String title, String desc, int count, String imageUrl) {
        this.title = title;
        this.desc = desc;
        this.count = count;
        this.imageUrl = imageUrl;
    }

    public Category(String title, String desc, int count, int imageId, int sp_icon) {
        this.title = title;
        this.desc = desc;
        this.count = count;
        this.imageId = imageId;
        this.sp_icon = sp_icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
