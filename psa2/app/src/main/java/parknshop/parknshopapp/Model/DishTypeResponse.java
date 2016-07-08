package parknshop.parknshopapp.Model;

import java.util.ArrayList;

import parknshop.parknshopapp.GlobalConstant;

/**
 * Created by chrisyu on 3/5/16.
 */
public class DishTypeResponse extends BaseStatus {
    public ArrayList<DishTypeItem> data = new ArrayList<>();

    public class DishTypeItem {
        int id;
        String updatedAt;
        String type_tc;
        String type_en;
        String sequence;
        boolean isSelected;

        public int getId() {
            return id;
        }

        public void setSelected(boolean selected) {
            this.isSelected = selected;
        }

        public boolean getSelected() {
            return isSelected;
        }

        public String getType() {
            if(GlobalConstant.language.equals(GlobalConstant.LANG_EN))
                return type_en;
            return type_tc;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public String getSequence() {
            return sequence;
        }
    }
}

/* {
status: {
    code: 200,
    message: "Success",
    systime: 1462242982
},
data: [
{
    id: 1,
    updatedAt: "2016-04-01 09:48:41",
    type_tc: "前菜",
    type_en: "Appetizer",
    sequence: "1",
    recipeList: [ ]
},
{
    id: 2,
    updatedAt: "2016-04-01 09:49:15",
    type_tc: "主菜",
    type_en: "Main Dish",
    sequence: "2",
    recipeList: [ ]
},
{
    id: 3,
    updatedAt: "2016-04-01 09:49:15",
    type_tc: "湯",
    type_en: "Soups & Stews",
    sequence: "3",
    recipeList: [ ]
},
{
    id: 4,
    updatedAt: "2016-04-01 09:49:15",
    type_tc: "麵",
    type_en: "Noodles",
    sequence: "4",
    recipeList: [ ]
},
{
id: 5,
    updatedAt: "2016-04-01 09:49:15",
    type_tc: "甜品",
    type_en: "Dessert",
    sequence: "5",
    recipeList: [ ]
},
{
    id: 6,
    updatedAt: "2016-04-01 09:49:15",
    type_tc: "小食",
    type_en: "Snacks",
    sequence: "6",
    recipeList: [ ]
}
]
}*/
