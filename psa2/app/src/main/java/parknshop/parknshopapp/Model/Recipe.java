package parknshop.parknshopapp.Model;

import java.util.ArrayList;

/**
 * Created by kwongyuenpan on 12/4/16.
 */
public class Recipe extends BaseStatus {
    public ArrayList<Data> data;

    public ArrayList<Data> getData() {
        return data;
    }
    public class Data{
        public int id;
        public long updatedAt;
        public String category_tc;
        public String category_en;
        public String url_tc;
        public String url_en;
        public String image_tc;
        public String image_en;
        public int sequence;
        public ArrayList<RecipeCatVOList> recipeCatVOList;

        public long getUpdatedAt() {
            return updatedAt;
        }

        public int getId() {
            return id;
        }

        public String getCategory_tc() {
            return category_tc;
        }

        public String getCategory_en() {
            return category_en;
        }

        public String getUrl_tc() {
            return url_tc;
        }

        public String getUrl_en() {
            return url_en;
        }

        public String getImage_tc() {
            return image_tc;
        }

        public String getImage_en() {
            return image_en;
        }

        public int getSequence() {
            return sequence;
        }

        public ArrayList<RecipeCatVOList> getRecipeCatVOList() {
            return recipeCatVOList;
        }
    }

    public class RecipeCatVOList{
        public int id;
        public long updatedAt;
        public String category_tc;
        public String category_en;
        public String url_tc;
        public String url_en;
        public String image_tc;
        public String image_en;
        public int sequence;
        public ArrayList<RecipeCatVOList> recipeCatVOList;
        public ArrayList<RecipeVOList> recipeVOList;

        public ArrayList<RecipeVOList> getRecipeVOList() {
            return recipeVOList;
        }

        public long getUpdatedAt() {
            return updatedAt;
        }

        public String getCategory_tc() {
            return category_tc;
        }

        public String getCategory_en() {
            return category_en;
        }

        public String getUrl_tc() {
            return url_tc;
        }

        public String getUrl_en() {
            return url_en;
        }

        public String getImage_tc() {
            return image_tc;
        }

        public String getImage_en() {
            return image_en;
        }

        public int getSequence() {
            return sequence;
        }

        public ArrayList<RecipeCatVOList> getRecipeCatVOList() {
            return recipeCatVOList;
        }

        public int getId() {
            return id;
        }
    }

    public class RecipeVOList{

    }
}
