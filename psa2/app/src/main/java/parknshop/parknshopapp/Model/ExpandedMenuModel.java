package parknshop.parknshopapp.Model;

import com.bignerdranch.expandablerecyclerview.Model.ParentListItem;

import java.util.List;

import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.GlobalConstant;
import parknshop.parknshopapp.MyApplication;

/**
 * Created by chrisyu on 16/3/12.
 */
public class ExpandedMenuModel implements ParentListItem {
    public String iconName = "";
    public int iconImg = -1; // menu icon resource id
    public parknshop.parknshopapp.Model.Category.CategoryTree.Data.SubCategory subCategory;
    public boolean isLocal;
    public boolean isDivider;
    public boolean isDimmed;
    public String urlIcon;

    public String contentType;
    public String contentTc;
    public String contentEn;
    public String id;
    public String tagGA;

    public RecipeListResponse.RecipeListItem recipleItem;

    public ExpandedMenuModel(String name, int icon, boolean isLocal, boolean isDimmed, String tagGA) {
        this.iconName = name;
        this.iconImg = icon;
        this.isLocal = isLocal;
        this.isDimmed = isDimmed;
        this.tagGA = tagGA;
        if(this.subCategory != null && this.subCategory.getId() != null) {
            this.tagGA = this.subCategory.getCateStringEN() + "/c/" + this.subCategory.getId();
            GATrackerHelper.getInstance(MyApplication.getInstance()).setProduct();
            GATrackerHelper.getInstance(MyApplication.getInstance()).setCategory(this.tagGA);
        }
        //Log.i("", "gaaaaa1:"+new Gson().toJson(this.subCategory));
    }

    public ExpandedMenuModel(String name, String urlIcon, boolean isLocal, boolean isDimmed, String tagGA) {
        this.iconName = name;
        this.urlIcon = urlIcon;
        this.isLocal = isLocal;
        this.isDimmed = isDimmed;
        this.tagGA = tagGA;
        if(this.subCategory != null && this.subCategory.getId() != null) {
            this.tagGA = this.subCategory.getCateStringEN() + "/c/" + this.subCategory.getId();
            GATrackerHelper.getInstance(MyApplication.getInstance()).setProduct();
            GATrackerHelper.getInstance(MyApplication.getInstance()).setCategory(this.tagGA);
        }
        //Log.i("", "gaaaaa2:"+this.tagGA);
    }

    public ExpandedMenuModel(boolean isDivider) {
        this.isDivider = isDivider;
    }


    public String header;
    public ExpandedMenuModel(String header) {
        this.header = header;
    }

    public ExpandedMenuModel(Object data, String urlIcon, boolean b) {
        this.subCategory = (parknshop.parknshopapp.Model.Category.CategoryTree.Data.SubCategory) data;
        this.iconName = subCategory.getCateString();
        this.urlIcon = urlIcon;
        this.isLocal = b;
        if(this.subCategory != null && this.subCategory.getId() != null) {
            this.tagGA = this.subCategory.getCateStringEN() + "/c/" + this.subCategory.getId();
            GATrackerHelper.getInstance(MyApplication.getInstance()).setProduct();
            GATrackerHelper.getInstance(MyApplication.getInstance()).setCategory(this.tagGA);
        }
        //Log.i("", "gaaaaa3:"+this.tagGA);
    }

    public String getIconName() {
        return iconName;
    }
    public void setIconName(String iconName) {
        this.iconName = iconName;
    }
    public int getIconImg() {
        return iconImg;
    }

    public String getUrlIcon() {
        return urlIcon;
    }

    public void setIconImg(int iconImg) {
        this.iconImg = iconImg;
    }

    public String getTagGA() {
        return tagGA;
    }

    public void setContent(String content) {
        if (GlobalConstant.language.equals(GlobalConstant.LANG_ZH)) {
            contentTc = content;
        } else {
            contentEn = content;
        }
    }

    public String getContent() {
        if (GlobalConstant.language.equals(GlobalConstant.LANG_ZH)) {
            return contentTc;// = content;
        } else {
            return contentEn;// = content;
        }
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getContentType() {
        return contentType;
    }

    public List<parknshop.parknshopapp.Model.Category.CategoryDrawerItem> categoryDrawerItems;

    public List<parknshop.parknshopapp.Model.Category.CategoryDrawerItem> getCategoryDrawerItems() {
        return categoryDrawerItems;
    }

    public void setCategoryDrawerItems(List<parknshop.parknshopapp.Model.Category.CategoryDrawerItem> categoryDrawerItems) {
        this.categoryDrawerItems = categoryDrawerItems;
    }

    @Override
    public List<?> getChildItemList() {
        return categoryDrawerItems;
    }

    @Override
    public boolean isInitiallyExpanded() {
        return false;
    }
}