package parknshop.parknshopapp.Model;

import java.util.ArrayList;

import parknshop.parknshopapp.GlobalConstant;

/**
 * Created by chrisyu on 3/5/16.
 */
public class RecipeDetailResponse {
    //data
    private ArrayList<RecipeDetailItem> data = new ArrayList<>();

    public ArrayList<RecipeDetailItem> getData() {
        return data;
    }

    public class RecipeDetailItem {
        int id;
        String updatedAt;
        String title_tc;
        String title_en;
        String serves_tc;
        String serves_en;
        String preparation_tc;
        String preparation_en;
        String cooking_tc;
        String cooking_en;
        String seasonings_tc;
        String seasonings_en;
        String process_tc;
        String process_en;
        String tips_tc;
        String tips_en;

        ArrayList<RecipeSuggestItemsVOListItem> recipeSuggestItemsVOList = new ArrayList<>();
        ArrayList<RecipeIngredientsVOListItem> recipeIngredientsVOList = new ArrayList();
        ArrayList<RecipeImageVOListItem> recipeImageVOList = new ArrayList<>();

        public ArrayList<RecipeSuggestItemsVOListItem> getRecipeSuggestItemsVOList() {
            return recipeSuggestItemsVOList;
        }

        public int getId() {
            return id;
        }

        public String getTips() {
            if(GlobalConstant.language.equals(GlobalConstant.LANG_EN))
                return tips_en;
            return tips_tc;
        }

        public String getProcess() {
            if(GlobalConstant.language.equals(GlobalConstant.LANG_EN))
                return process_en;
            return process_tc;
        }

        public String getSeasoning() {
            if(GlobalConstant.language.equals(GlobalConstant.LANG_EN))
                return seasonings_en;
            return seasonings_tc;
        }

        public String getTitle() {
            if(GlobalConstant.language.equals(GlobalConstant.LANG_EN))
                return title_en;
            return title_tc;
        }

        public String getTitle_en() {
            return title_en;
        }

        public String getServes() {
            if(GlobalConstant.language.equals(GlobalConstant.LANG_EN))
                return serves_en;
            return serves_tc;
        }

        public String getPreparation() {
            if(GlobalConstant.language.equals(GlobalConstant.LANG_EN))
                return preparation_en;
            return preparation_tc;
        }

        public String getCooking() {
            if(GlobalConstant.language.equals(GlobalConstant.LANG_EN))
                return cooking_en;
            return cooking_tc;
        }

        public ArrayList<RecipeIngredientsVOListItem> getRecipeIngredientsVOList() {
            return recipeIngredientsVOList;
        }

        public ArrayList<RecipeImageVOListItem> getRecipeImageVOList() {
            return recipeImageVOList;
        }
    }

    public class RecipeSuggestItemsVOListItem {
        int id;
        String updatedAt;
        int recipeId;
        String productId;
        int sequence;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        public int getRecipeId() {
            return recipeId;
        }

        public void setRecipeId(int recipeId) {
            this.recipeId = recipeId;
        }

        public String getProductId() {
            return productId;
        }

        public void setProductId(String productId) {
            this.productId = productId;
        }

        public int getSequence() {
            return sequence;
        }

        public void setSequence(int sequence) {
            this.sequence = sequence;
        }
    }

    public class RecipeIngredientsVOListItem {
        int id;
        String updatedAt;
        String name_tc;
        String name_en;
        String  sequence;
        String quantity_tc;
        String quantity_en;

        public String getUpdatedAt() {
            return updatedAt;
        }

        public String getQuantity() {
            if(GlobalConstant.language.equals(GlobalConstant.LANG_EN))
                return quantity_en;
            return quantity_tc;
        }

        public String getName() {
            if(GlobalConstant.language.equals(GlobalConstant.LANG_EN))
                return name_en;
            return name_tc;
        }

        public int getSequence() {
            try {
                return Integer.valueOf(sequence);
            } catch (Exception e) {

            }
            return 0;
        }
    }

    /*
        id: 1,
        updatedAt: "2016-04-01 10:14:14",
        image_tc: "355245rt",
        image_en: "rts46tr",
        sequence: "1"*/

    public class RecipeImageVOListItem {
        int id;
        String updatedAt;
        String image_tc;
        String image_en;
        int sequence;

        public int getId() {
            return id;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public String getImage() {
            if(GlobalConstant.language.equals(GlobalConstant.LANG_EN))
                return image_en;
            return image_tc;
        }

        public int getSequence() {
            return sequence;
        }
    }
}

/*{
status: {
    code: 200,
    message: "Success",
    systime: 1462242982
},
data: {
    id: 1,
    updatedAt: "2016-04-01 10:10:41",
    title_tc: "Spainish Chicken With Salad",
    title_en: "Spainish Chicken With Salad",
    serves_tc: "4 ppl",
    serves_en: "4 ppl",
    preparation_tc: "15min.",
    preparation_en: "15min.",
    cooking_tc: "1hr 15min. ",
    cooking_en: "1hr 15min. ",
    seasonings_tc: "KNORR Café de Paris Sauce Pepper Salt",
    seasonings_en: "KNORR Café de Paris Sauce Pepper Salt",
    process_tc: "1. Put 60 g KNORR CAFE DE PARIS SAUCE MIX with 300 ml hot water , stir vigorously and cook for 2 mins. 2. Mix the cooked chicken with KNORR CAFE DE PARIS SAUCE. Cover and refrigerate until required for use 3. Evenly distribute the chicken in the first fold of the tortilla. 4. Roll the wrap over once, add some lettuce and cucumber and continue to roll. Ensure it is rolled tight, so as not to loose any filling. printing and typesetting industry.",
    process_en: "1. Put 60 g KNORR CAFE DE PARIS SAUCE MIX with 300 ml hot water , stir vigorously and cook for 2 mins. 2. Mix the cooked chicken with KNORR CAFE DE PARIS SAUCE. Cover and refrigerate until required for use 3. Evenly distribute the chicken in the first fold of the tortilla. 4. Roll the wrap over once, add some lettuce and cucumber and continue to roll. Ensure it is rolled tight, so as not to loose any filling. printing and typesetting industry.",
    tips_tc: "Roll the wrap over once, add some lettuce and cucumber and continue to roll. Ensure it is rolled tight, so as not to loose any filling. printing and typesetting industry",
    tips_en: "Roll the wrap over once, add some lettuce and cucumber and continue to roll. Ensure it is rolled tight, so as not to loose any filling. printing and typesetting industry",
    recipeSuggestItemsVOList: [
    {
        id: 4,
        updatedAt: "2016-04-01 10:18:46",
        recipeId: 1,
        productId: "116155",
        sequence: 1
    },
    {
        id: 5,
        updatedAt: "2016-04-01 10:18:46",
        recipeId: 1,
        productId: "118122",
        sequence: 1
    },
    {
        id: 6,
        updatedAt: "2016-04-01 10:18:46",
        recipeId: 1,
        productId: "116094",
        sequence: 1
    }
    ],
    recipeIngredientsVOList: [
    {
        id: 1,
        updatedAt: "2016-04-01 10:15:16",
        name_tc: "Chicken",
        name_en: "Chicken",
        quantity_tc: "300 g",
        quantity_en: "300 g",
        sequence: "1"
    },
    {
        id: 2,
        updatedAt: "2016-04-01 10:16:11",
        name_tc: "Lettuce mixed leaves shredded",
        name_en: "Lettuce mixed leaves shredded",
        quantity_tc: "100 g",
        quantity_en: "100 g",
        sequence: "2"
    },
    {
        id: 3,
        updatedAt: "2016-04-01 10:16:53",
        name_tc: "Cucumber sliced",
        name_en: "Cucumber sliced",
        quantity_tc: "100 g",
        quantity_en: "100 g",
        sequence: "3"
    }
    ],
    recipeImageVOList: [
    {
        id: 1,
        updatedAt: "2016-04-01 10:14:14",
        image_tc: "355245rt",
        image_en: "rts46tr",
        sequence: "1"
    },
    {
        id: 2,
        updatedAt: "2016-04-01 10:14:14",
        image_tc: "355245rt",
        image_en: "rts46tr",
        sequence: "2"
    }
    ]
    }
}*/