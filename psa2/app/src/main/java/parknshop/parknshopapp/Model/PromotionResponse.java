package parknshop.parknshopapp.Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import parknshop.parknshopapp.GlobalConstant;

/**
 * Created by kwongyuenpan on 15/4/16.
 */
public class PromotionResponse extends BaseStatus {

    public ArrayList<Data> data;

    public ArrayList<Data> getData() {
        return data;
    }

    public class Data {
        public int id;
        public String updateAt;
        public String promotionType;
        public String contentType;
        public String title_tc;
        public String promotionHeader_tc;
        public String description_tc;
        public String image_tc;
        public String banner_tc;
        public String content_tc;
        public String title_en;
        public String promotionHeader_en;
        public String description_en;
        public String image_en;
        public String banner_en;
        public String content_en;
        public String startTime;
        public String endTime;
        public String colorCode;
        public boolean showCountDown;
        public boolean showValidUntil;
        public Integer beforeEndDay;

        public boolean getShowValidUtils() {
            return showValidUntil;
        }

        public Integer getBeforeEndDay() {
            return beforeEndDay;
        }

        public ArrayList<PromotionItemSet> promotionItemSet;
        public ArrayList<PromotionImageSet> promotionImageSet;

        public String getColorCode() {
            return colorCode;
        }

        public boolean getShowCountDown() {
            return showCountDown;
        }

        public int getId() {
            return id;
        }

        public String getUpdateAt() {
            return updateAt;
        }

        public String getPromotionType() {
            if(promotionType == null)
                return "a";
            return promotionType;
        }

        public String getContentType() {
            return contentType;
        }

        public String getTitle() {
            if(GlobalConstant.language.equals(GlobalConstant.LANG_ZH)){
                return title_tc;
            }
            return title_en;
        }

        public String getTitle_en() {
            return title_en;
        }

        public String getPromotionHeader() {
            if(GlobalConstant.language.equals(GlobalConstant.LANG_ZH)){
                return promotionHeader_tc;
            }
            return promotionHeader_en;
        }

        public String getDescription() {
            if(GlobalConstant.language.equals(GlobalConstant.LANG_ZH)){
                return description_tc;
            }
            return description_en;
        }

        public String getImage() {
            if(GlobalConstant.language.equals(GlobalConstant.LANG_ZH)){
                return image_tc;
            }
            return image_en;
        }

        public String getBanner() {
            if(GlobalConstant.language.equals(GlobalConstant.LANG_ZH)){
                return banner_tc;
            }
            return banner_en;
        }

        public String getContent() {
            if(GlobalConstant.language.equals(GlobalConstant.LANG_ZH)){
                return content_tc;
            }
            return content_en;
        }

        public String getStartTime() {
            return startTime;
        }

        public String getEndTime() {
            return endTime;
        }

        public ArrayList<PromotionItemSet> getPromotionItemSet() {
            return promotionItemSet;
        }

        public ArrayList<PromotionImageSet> getPromotionImageSet() {
            if(promotionImageSet != null)
                Collections.sort(promotionImageSet, new PromotionComparater());

            return promotionImageSet;
        }

        public class PromotionComparater implements Comparator<PromotionImageSet>{

            @Override
            public int compare(PromotionImageSet lhs, PromotionImageSet rhs) {
                if (lhs.getSequence() > rhs.getSequence())
                    return 1;
                if (lhs.getSequence() < rhs.getSequence())
                    return -1;
                return 0;
            }
        }
        public class PromotionItemSet {
            public int id;
            public String updateAt;
            public int isHybris;
            public String value;
            public Object object;

            public int getId() {
                return id;
            }

            public String getUpdateAt() {
                return updateAt;
            }

            public int getIsHybris() {
                return isHybris;
            }

            public String getValue() {
                return value;
            }

            public Object getDataHolder() {
                if(object == null)
                    return new Object();
                return object;
            }

            public class Object {
                public String productId;
                public String brandTc;
                public String brandEn;
                public String nameTc;
                public String nameEn;

                public String id;
                public String name_tc;
                public String name_en;

                public String image;
                public String price;

                public String description_tc;
                public String description_en;
                public String itemSize;
                public boolean priceStrike;
                public String priceType;
                //public boolean mbPrice;
                //public boolean mbBonus;
                //public float discountPrice;
                public boolean rrp;
                public String value;

                public String getValue() {

                    if(value == null)
                        return "0";

                    return value;
                }

                public String getDescription() {
                    if(GlobalConstant.language.equals(GlobalConstant.LANG_ZH)){
                        return description_tc;
                    }
                    return description_en;
                }

                public String getItemSize() {
                    return itemSize;
                }

                public boolean getPriceStrike() {
                    return priceStrike;
                }

                public String getPriceType() {
                    //if(mbPrice)
                    //    return "MB Price";

                    //if(mbBonus)
                    //    return "MB Bonus";

                    //if(discountPrice > 0)
                    //    return "Discount Price";

                    if(priceType == null)
                        return "off";
                    return priceType;
                }

                public boolean getRrp() {
                    return rrp;
                }

                public String getCategoryId() {
                    return id;
                }

                public String getCategoryName() {
                    if(GlobalConstant.language.equals(GlobalConstant.LANG_ZH)){
                        return name_tc;
                    }
                    return name_en;
                }

                public String getProductId() {
                    return productId;
                }

                public String getBrand() {
                    if(GlobalConstant.language.equals(GlobalConstant.LANG_ZH)){
                        return brandTc;
                    }
                    return brandEn;
                }

                public String getName() {
                    if(GlobalConstant.language.equals(GlobalConstant.LANG_ZH)){
                        return nameTc;
                    }
                    return nameEn;
                }

                public String getImage() {
                    return image;
                }

                public String getPrice() {
                    return price;
                }
            }

        }

        public class PromotionImageSet {
            public int id;
            public String updateAt;
            public String type;
            public String image_tc;
            public String image_en;
            public int sequence;

            public int getId() {
                return id;
            }

            public String getUpdateAt() {
                return updateAt;
            }

            public String getType() {
                return type;
            }

            public String getImage() {
                if(GlobalConstant.language.equals(GlobalConstant.LANG_ZH)){
                    return image_tc;
                }
                return image_en;
            }

            public int getSequence() {
                return sequence;
            }

        }
    }
}
