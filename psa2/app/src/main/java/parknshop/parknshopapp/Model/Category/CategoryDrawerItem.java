package parknshop.parknshopapp.Model.Category;

import java.util.List;

import parknshop.parknshopapp.GlobalConstant;
import parknshop.parknshopapp.Model.RecipeListResponse;

/**
 * Created by chrisyu on 10/3/16.
 */
public class CategoryDrawerItem {
    public String headerId;
    public String id;
    public String text;
    public SubCategory SubCategory;
    public String contentEn;
    public String contentTc;
    public String imgUrl;
    public String tagGA;
    public int parentPosition;

    public String contentType;
    public RecipeListResponse.RecipeListItem recipeListItem;

    public List<CategoryDrawerItem> groupData;

    public CategoryDrawerItem(String id, String text, String tagGA) {
        this.id = id;
        this.text = text;
        this.tagGA = tagGA;
    }

//    public CategoryDrawerItem(String id, String text, String url) {
//        this.id = id;
//        this.text = text;
//        setContent(url);
//    }

    public int getParentPosition() {
        return parentPosition;
    }

    public void setHeaderId(String headerId) {
        this.headerId = headerId;
    }

    public String getHeaderId() {
        return headerId;
    }

    public void setSubCategory(SubCategory subCategory) {
        SubCategory = subCategory;
    }

    public SubCategory getSubCategory() {
        if(SubCategory == null)
            return new SubCategory();
        return SubCategory;
    }

    public String getName() {
        return text;
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

    public void setRecipleListItem(RecipeListResponse.RecipeListItem recipeListItem) {
        this.recipeListItem = recipeListItem;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public RecipeListResponse.RecipeListItem getRecipeListItem() {
        return this.recipeListItem;
    }
}
