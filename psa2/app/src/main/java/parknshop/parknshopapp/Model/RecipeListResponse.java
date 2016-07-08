package parknshop.parknshopapp.Model;

import java.util.ArrayList;

import parknshop.parknshopapp.GlobalConstant;

/**
 * Created by chrisyu on 3/5/16.
 */
public class RecipeListResponse extends BaseStatus {
    public ArrayList<RecipeListItem> data = new ArrayList<>();

    public class RecipeListItem {
        int id;
        String updatedAt;
        String category_tc;
        String category_en;
        String url_tc;
        String url_en;
        String image_tc;
        String image_en;
        String sequence;
        ArrayList<RecipeCatVOListItem> recipeCatVOList = new ArrayList<>();
        ArrayList<RecipeCatVOListItem> recipeVOList = new ArrayList<>();

        public int getId() {
            return id;
        }

        public String getUrl() {
            if(GlobalConstant.language.equals(GlobalConstant.LANG_ZH))
                return url_tc;
            return url_en;
        }

        public String getImage() {
            if(GlobalConstant.language.equals(GlobalConstant.LANG_ZH))
                return image_tc;
            return image_en;
        }

        public String getCategory() {
            if(GlobalConstant.language.equals(GlobalConstant.LANG_ZH))
                return category_tc;
            return category_en;
        }

        public String getCategory_en() {
            return category_en;
        }

        public String getCategory_tc() {
            return category_tc;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public String getSequence() {
            return sequence;
        }

        public ArrayList<RecipeCatVOListItem> getRecipeCatVOList() {
            return recipeCatVOList;
        }

        public ArrayList<RecipeDetailResponse.RecipeDetailItem> getAll() {
            ArrayList<RecipeDetailResponse.RecipeDetailItem> all = new ArrayList<>();

            if(recipeCatVOList != null) {
                for (int i = 0; i < recipeCatVOList.size(); i++) {
                    all.addAll(getRecipeCatVOList().get(i).getRecipeVOList());
                }
            }

            return all;
        }
    }

    public class RecipeCatVOListItem {
        int id;
        String updatedAt;
        String category_tc;
        String category_en;
        String url_tc;
        String url_en;
        String image_tc;
        String image_en;
        String sequence;
        ArrayList<RecipeCatVOListItem> recipeCatVOList = new ArrayList<>();
        ArrayList<RecipeDetailResponse.RecipeDetailItem> recipeVOList = new ArrayList<>();

        public int getId() {
            return id;
        }

        public ArrayList<RecipeCatVOListItem> getRecipeCatVOList() {
            return recipeCatVOList;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public String getCategory() {
            if(GlobalConstant.language.equals(GlobalConstant.LANG_ZH))
                return category_tc;
            return category_en;
        }

        public String getUrl() {
            if(GlobalConstant.language.equals(GlobalConstant.LANG_ZH))
                return url_tc;
            return url_en;
        }

        public String getImage() {
            if(GlobalConstant.language.equals(GlobalConstant.LANG_ZH))
                return image_tc;
            return image_en;
        }

        public String getSequence() {
            return sequence;
        }

        public ArrayList<RecipeDetailResponse.RecipeDetailItem> getRecipeVOList() {
            return recipeVOList;
        }
    }
}

/*{
status: {
    code: 200,
    message: "Success",
    systime: 1462242982
},
data: [
    {
        id: 1,
        updatedAt: "2016-04-01 09:41:58",
        category_tc: "Asian",
        category_en: "Asian",
        url_tc: "fdsdfds",
        url_en: "sfdsffds",
        image_tc: "gffdfg",
        image_en: "fggffg",
        sequence: "1",
        recipeCatVOList: [
        {
            id: 3,
            updatedAt: "2016-04-01 09:46:38",
            category_tc: "Beef",
            category_en: "Beef",
            url_tc: "3rtretrt",
            url_en: "wtetwetew",
            image_tc: "etetwewrt3",
            image_en: "wtet45tw4",
            sequence: "1",
            recipeCatVOList: [ ],
            recipeVOList: [ ]
        },
        {
            id: 4,
            updatedAt: "2016-04-01 09:47:38",
            category_tc: "Pork",
            category_en: "Pork",
            url_tc: "rsgfdfgdf",
            url_en: "sgaf",
            image_tc: "asfsa3",
            image_en: "afs3",
            sequence: "2",
            recipeCatVOList: [ ],
            recipeVOList: [ ]
        }
        ],
        recipeVOList: [ ]
        },
        {
            id: 2,
            updatedAt: "2016-04-01 09:45:43",
            category_tc: "Western",
            category_en: "Western",
            url_tc: "133113",
            url_en: "435346",
            image_tc: "rtstee",
            image_en: "setesfg",
            sequence: "2",
            recipeCatVOList: [ ],
            recipeVOList: [ ]
        }
    ]
}*/