package parknshop.parknshopapp.Model.Category;

import java.util.ArrayList;
import java.util.List;

import parknshop.parknshopapp.GlobalConstant;
import parknshop.parknshopapp.Model.BaseStatus;

/**
 * Created by chrisyu on 10/3/16.
 */
public class CategoryTree extends BaseStatus {
    private Data data;

    public Data getData() {
        if(data == null)
            data = new Data();
        return data;
    }

    public class Data {
        public String id;
        public String updatedAt;
        public String name_tc;
        public String name_en;
        public String image;
        private List<SubCategory> subcategories;

        public List<SubCategory> getSubcategories() {
            if(subcategories == null)
                return  new ArrayList<>();
            return subcategories;
        }

        public List<String> getLv1CategoryList() {
            List<String> list = new ArrayList<String>();
            if (subcategories != null) {
                for (SubCategory category : subcategories) {
                    list.add(category.getCateString() /*+ " (" + category.totalNumber + ")"*/);
                }
            }

            return list;
        }

        public String getName_en() {
            return name_en;
        }

        public String getName_tc() {
            return name_tc;
        }

        public List<String> getContentTypeList() {
            List<String> list = new ArrayList<String>();
            if (subcategories != null) {
                for (SubCategory category : subcategories) {
                    list.add(category.getContentType());
                }
            }

            return list;
        }

        public List<String> getContentList() {
            List<String> list = new ArrayList<String>();
            if (subcategories != null) {
                for (SubCategory category : subcategories) {
                    list.add(category.getContentType());
                }
            }
            return list;
        }

        public String getImage() {
            return image;
        }

        public SubCategory getSubCategoryByIndex(int i) {
            if (subcategories != null)
                return subcategories.get(i);
            return null;
        }

        public List<CategoryDrawerItem> getLv2CategoryList(int index) {
            List<CategoryDrawerItem> list = new ArrayList<CategoryDrawerItem>();
            if (subcategories != null) {
                //list.add(
                 //       new CategoryDrawerItem(subcategories.get(index).id,
                 //               "所有商品 (" + subcategories.get(index).subcategories.size() + ")"));
                try {
                    for (SubCategory category : subcategories.get(index).subcategories) {
                        CategoryDrawerItem categoryDrawerItem = (new CategoryDrawerItem(category.id, category.getCateString(), category.getCateStringEN()));
                        categoryDrawerItem.headerId = subcategories.get(index).id;
                        list.add(categoryDrawerItem);
                    }
                } catch (IndexOutOfBoundsException e) {
                    e.printStackTrace();
                }
            }

            return list;
        }

        public class SubCategory {
            public boolean selected;
            public String id;
            public String name_tc;
            public String name_en;
            public String contentType;
            public String contentTc;
            public String contentEn;
            public String image;
//            public String name;
            public int totalNumber;
            public List<SubCategory> subcategories;

            public String getId() {
                return id;
            }

            public List<SubCategory> getSubcategories() {
                if(subcategories == null)
                    subcategories = new ArrayList<>();
                return subcategories;
            }

            public String getImage() {
                return image;
            }

            public String getCateString() {
                try {
                    if (GlobalConstant.language.equals(GlobalConstant.LANG_ZH))
                        return name_tc;
                    return name_en /*+ " (" + totalNumber + ")"*/;
                } catch (NullPointerException e) {
                    return "";
                }
            }
            public String getCateStringEN() {
                try {
                    return name_en /*+ " (" + totalNumber + ")"*/;
                } catch (NullPointerException e) {
                    return "";
                }
            }

            public String getContentType() {
                return contentType;
            }

            public String getName() {
                if (GlobalConstant.language.equals(GlobalConstant.LANG_ZH))
                    return name_tc;
                return name_en;
            }
            public String getContent() {
                if (GlobalConstant.language.equals(GlobalConstant.LANG_ZH))
                    return contentTc;
                return contentEn;
            }
        }
    }
}






