package parknshop.parknshopapp.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by chrisyu on 16/3/12.
 */
public class Product extends ErrorCode implements Serializable {
    /*
    {
      "productCode": "128999",
      "productName": "MINI CHOCOLATE WAFER",
      "brandName": "GARDEN",
      "maxOrderQuantity": 0,
      "promotionDescription": "Buy 10pcs #308485 redeem #128999at $3",
      "productUrl": "/Product-GARDEN/MINI-CHOCOLATE-WAFER/p/128999",
      "maxAllowedBuyQty": 6,
      "stockLevelStatus": {
        "code": "inStock",
        "codeLowerCase": "instock"
      },
      "price": {
        "currencyIso": "HKD",
        "value": "3.5",
        "priceType": "BUY",
        "formattedValue": "HK$3.50"
      },
      "stockLevel": 20660
    },*/
    private String productCode;
    public String code;
    private String name;
    private String productName;
    public String url;
    public Price price;
    private List<ImageData> images;
    public String brandName;
    public String igcBrandName;
    public boolean bestSeller;
    public BrandData brandData;
    private Price igcMarkDownMemPrice;
    private Price igcOldPrice, pnsRRP, appPromotionPrice, appOriginalPrice, appMemberPrice;
    private List<String> igcPromotionTag = new ArrayList<String>();
    private StatusCode igcExclusiveBrand;
    private StatusCode stockLevelStatus;
    private int stockLevel;
    public List<PromotionData> iwaPromotionsData;
    private int numberOfReviews;
    private float averageRating;
    private String description;
    private String descriptionHtml;
    private String igcInformativeText3;
    private String pnsCountryOfOrigin;
    private String igcInformativeText2;
    private String igcInformativeText1;
    private String igcContentSizeUnit;
    private String igcUses;
    private String igcWarnings;
    private String igcIngredients;
    private String igcPhamacy;
    private String igcRecyclingInfo;
    private List<Review> reviews;
    private boolean iwaStorePickupAllowed;
    private List<String> categoriesName;
    private String promotionsFirstTag;
    private boolean igcNewProduct;
    private boolean availableInOutlyingIsland;
    public int maxOrderQuantity;
    public String variantType;
    private String promotionDescription;
    private String productUrl;
    private List<Product> pnsRedemptionProductDatas = new ArrayList<Product>();
    private List<Promotion> appliedIwaPromotions;
    private String pnsContentSizeUnit;
    private boolean canRateProductFlag;
    private String consignmentStatus;

    public String getConsignmentStatus() {
        return consignmentStatus;
    }

    public boolean getCanRateProductFlag() {
        return canRateProductFlag;
    }

    public String getPnsContentSizeUnit() {
        return pnsContentSizeUnit;
    }

    public String getIgcContentSizeUnit() {
        return igcContentSizeUnit;
    }

    public String getVariantType() {
        return variantType;
    }

    public void setMaxAllowedBuyQty(int maxAllowedBuyQty) {
        this.maxAllowedBuyQty = maxAllowedBuyQty;
    }

    private int maxAllowedBuyQty;
    private int maxOrderQuality;

    private long lastModifiedDate;

    public List<Product> redemptionProductDatas;
    public List<Product> getPnsRedemptionProductDatas() {
        return this.redemptionProductDatas;
    }

    public long getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(long lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public int getStockLevel() {
        return stockLevel;
    }

    public List<PromotionData> appliedIwaPromotionsgetIwaPromotionsData() {
        return iwaPromotionsData;
    }

    public List<PromotionData> getIwaPromotionsData() {
        return iwaPromotionsData;
    }

    public List<String> getIgcPromotionTag() {
        if(igcPromotionTag == null) {

        }
        return igcPromotionTag;
    }

    public Price getIgcMarkDownMemPrice() {
        return igcMarkDownMemPrice;
    }

    public Price getIgcOldPrice() {
        return igcOldPrice;
    }

    public StatusCode getIgcExclusiveBrand() {
        return igcExclusiveBrand;
    }

    public StatusCode getStockLevelStatus() {
        if(stockLevelStatus == null)
            stockLevelStatus = new StatusCode();
        return stockLevelStatus;
    }

    public String getIgcBrandName() {
        return igcBrandName;
    }

    public String getIgcInformativeText1() {
        return igcInformativeText1;
    }

    public String getIgcInformativeText2() {
        return igcInformativeText2;
    }

    public String getIgcInformativeText3() {
        return pnsCountryOfOrigin;
    }

    public String getIgcUses() {
        if(igcUses== null)
            return "";
        return igcUses;
    }

    public String storageInformation;
    public String getStorageInformation() {
        if(storageInformation == null) {
            return "";
        }
        return storageInformation;
    }

    public String getIgcIngredients() {
        return igcIngredients;
    }

    public String getIgcPhamacy() {
        if(igcPhamacy == null)
            return "";
        return igcPhamacy;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public String getIgcWarnings() {
        if(igcWarnings == null)
            return "";
        return igcWarnings;
    }

    public String getUrl() {
        return url;
    }

    public String getIgcRecyclingInfo() {
        return igcRecyclingInfo;
    }

    public List<String> getCategoriesName() {
        return categoriesName;
    }

    public void setCategoriesName(List<String> categoriesName) {
        this.categoriesName = categoriesName;
    }


    public String getPromotionsFirstTag() {
        return promotionsFirstTag;
    }

    public void setPromotionsFirstTag(String promotionsFirstTag) {
        this.promotionsFirstTag = promotionsFirstTag;
    }


    public Product() {

    }

    public Product(String imgUrl, String title, String subTitle, String price,
                   String discount, String memberPrice, String bonus) {

        ImageData mImageData = new ImageData();

        Price mPrice = new Price();
        Price mDiscountPrice = new Price();
        Price mMemberPrice = new Price();


        mImageData.url = imgUrl != null ?
                imgUrl : "";
        mImageData.imageType = "";
        mImageData.format = "";
        this.images = new ArrayList<ImageData>();
        images.add(mImageData);

        igcBrandName = title != null ?
                title : "";
        this.name = subTitle;

        mDiscountPrice.formattedValue = discount != null ?
                discount : "";
        mDiscountPrice.value = "";
        this.price = mDiscountPrice;
    }

    public List<ImageData> getImages() {
        return images != null ? images : new ArrayList<ImageData>();
    }

    public String getCodeNumber() {
        if (code != null) {
            return code.replaceAll("[\\D]", "");
        } else {
            return "";
        }
    }

    public String getCode() {
        if(productCode != null)
            return productCode;
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getImageUrl() {
        if (images != null && images.size() > 0) {
            return images.get(0).getUrl();
        } else {
            return "";
        }
    }

    public String getThumbnail() {
        if(images != null && images.size() > 0 ) {
            for (int i = 0; i < images.size(); i++) {
                if (images.get(i).getImageType().equals("PRIMARY") && images.get(i).getFormat().equals("thumbnail")) {
                    return images.get(0).getUrl();
                }
            }
        }
        return "";
    }

    public String getProductImageUrl() {
        if (images != null) {
            for (ImageData imageData : images) {
                if (imageData.isProductImage()) {
                    return imageData.getUrl();
                }
            }
        }

        return "";
    }

    public String getName() {
        if(productName != null)
            return productName;
        if(name != null)
            return name;
        return "";

    }

    public String getBrandName() {
        if(brandName != null)
            return brandName;
        return igcBrandName;
    }

    public String getPrice() {
        return price != null ? price.getFormattedPrice() : null;
    }

    public Price getPriceObject() {
        if(price == null)
            price = new Price();
        return price;
    }

    public int getPriceValue() {
        return price != null ? (int) price.getValue() : 0;
    }

    public String getMemberPrice() {
        return igcMarkDownMemPrice != null ? igcMarkDownMemPrice.getFormattedPrice() : null;
    }

    public boolean hasMemberPrice() {
        return getMemberPrice() != null;
    }

    public String getOldPrice() {
        return igcOldPrice != null ? igcOldPrice.getFormattedPrice() : null;
    }

    public String getRrpPrice() {
        return pnsRRP != null ? pnsRRP.getFormattedPrice() : null;
    }

    public String getMemberPricePns() {
        return appMemberPrice != null ? appMemberPrice.getFormattedPrice() : null;
    }

    public float getRrpPriceFloat() {
        return pnsRRP.getValue();
    }

    public boolean getRrpPriceTagFlag() {
        return rrpPriceTagFlag;
    }

    public String getAppPromotionPrice() {
        return appPromotionPrice != null ? appPromotionPrice.getFormattedPrice() : null;
    }

    public String getOriginalPrice() {
        return appOriginalPrice != null ? appOriginalPrice.getFormattedPrice() : null;
    }

    boolean rrpPriceTagFlag;
    boolean crossOriginalPriceFlag;
    public boolean showCrossLine() {
        return crossOriginalPriceFlag;
    }

    public boolean hasOldPrice() {
        return getOldPrice() != null;
    }

    public List<String> getPromotionTags() {
        return igcPromotionTag;
    }

    public String getPromotionTag(int index) {
        try {
            return igcPromotionTag != null && index == 0 ? igcPromotionTag.get(index) : null;
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }

    public boolean hasPromotionTag() {
        return getPromotionTags() != null;
    }

    public boolean isWatsonsOnly() {
        return igcExclusiveBrand != null && igcExclusiveBrand.codeLowerCase.equals("exclusive");
    }

    public boolean isWatsionsBrand() {
        return igcExclusiveBrand != null && igcExclusiveBrand.codeLowerCase.equals("privatelabel_ownedbrand");
    }

    public int getMaxAllowedBuyQty() {

        //return Math.min(API.WASTSONS_API.contains(".com.tw") ? maxOrderQuality : maxAllowedBuyQty, stockLevel);
//        return maxOrderQuality;
        return Math.min(maxAllowedBuyQty, stockLevel);
    }

    public boolean hasStock() {
        if(price == null)
            return false;

        int orderLimit = Math.min( maxAllowedBuyQty, stockLevel);
        //int orderLimit = Math.min(maxAllowedBuyQty, stockLevel);
        if (orderLimit <= 0) {
            return false;
        } else {
            return true;
        }

//        return stockLevelStatus != null && stockLevelStatus.codeLowerCase != null
//                && stockLevelStatus.codeLowerCase.equals("instock");
    }

    public String parentName;
    public String parentCode;
    public String getPromotionDescription(Product product) {
        //Log.i("parentCode" , "parentCode" + product.code + " " + product.name);

        if(product.code == null || product.name == null || promotionDescription == null)
            return null;

        String tempString = promotionDescription;
        tempString = tempString.replace("#", "").replace("BP", "").replace("_", "");
        tempString = tempString.replace(product.code, product.name);
        tempString = tempString.replace(productCode, productName);
        return tempString;
    }

    public List<String> getPromotionDescriptions() {
        List<String> list = new ArrayList<String>();
        if (iwaPromotionsData != null) {
            for (PromotionData data : iwaPromotionsData) {
                list.add(data.longDescription);
            }
        }

        return list;
    }

    public String getPromotionDescriptions(String code) {
        String tempString = "";
        if (iwaPromotionsData != null) {
            for (PromotionData data : iwaPromotionsData) {
                if(code.equals(data.promoCode))
                    tempString = data.longDescription;
            }
        }

        return tempString;
    }
    public int getNumberOfReviews() {
        return numberOfReviews;
    }

    public int getAverageRating() {
        return Math.round(averageRating);
    }

    public String getDescription() {
        return description;
    }

    public String getDescriptionHtml(){
        return descriptionHtml!=null?descriptionHtml:"";
    }

    public String getDescOrigin() {
        return igcInformativeText3;
    }

    public String getDescSpec() {
        return igcInformativeText2;
    }

    public String getDescService() {
        return igcInformativeText1;
    }

    public String getDescUses() {
        return igcUses;
    }

    public String getDescWarnings() {
        return igcWarnings;
    }

    public String getDescIngredients() {
        return igcIngredients;
    }

    public String getDescPhamacy() {
        return igcPhamacy;
    }

    public String getDescRecycle() {
        return igcRecyclingInfo;
    }

    public boolean getStorePickupAllowed() {
        return !availableInOutlyingIsland;
    }

    public List<String> getDescriptionsText() {
        List<String> list = new ArrayList<String>();
        list.add(getDescOrigin());
        list.add(getDescSpec());
        list.add(getDescService());
        list.add(getDescUses());
        list.add(getDescWarnings());
        list.add(getDescIngredients());
        list.add(getDescPhamacy());
        list.add(getDescRecycle());

        return list;
    }

    public ArrayList<String> getAliasList() {
        ArrayList<String> list = new ArrayList<String>();
        for (Review review : reviews) {
            list.add(review.alias);
        }

        return list;
    }

    public ArrayList<String> getDateList() {
        ArrayList<String> list = new ArrayList<String>();
        for (Review review : reviews) {
            list.add(Utility.formatDate(Utility.WATSON_TIME_FORMAT, Utility.DEFAULT_DATE_FORMAT, review.date));
        }

        return list;
    }

    public ArrayList<String> getCommentList() {
        ArrayList<String> list = new ArrayList<String>();
        for (Review review : reviews) {
            list.add(review.comment);
        }

        return list;
    }

    public ArrayList<Integer> getRatingList() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (Review review : reviews) {
            list.add(Math.round(review.rating));
        }

        return list;
    }

    boolean pnsNewLabel;
    public boolean getPnsNewLabel() {
        return pnsNewLabel;
    }

    public boolean isIgcNewProduct() {
        return igcNewProduct;
    }

    public void setIgcNewProduct(boolean igcNewProduct) {
        this.igcNewProduct = igcNewProduct;
    }

    public class StatusCode implements Serializable {
        public String code;
        public String codeLowerCase;

        public String getCode() {
            if(code == null)
                code = "";
            return code;
        }

        public String getCodeLowerCase() {
            if (codeLowerCase == null)
                codeLowerCase = "";
            return codeLowerCase;
        }
    }

    public class BrandData implements Serializable {
        public String name;
        public String getName() {
            if(name == null) name= "";
            return name;
        }
    }

    public class PromotionData implements Serializable {
        public String link;
        public String longDescription;
        public int promoCode;
    }

    public class Review implements Serializable {
        public String alias;
        public String date;
        public String comment;
        public float rating;
    }

    public BrandData getBrandData() {
        if(brandData == null)
            brandData = new BrandData();
        return brandData;
    }

    public void setBrandData(BrandData brandData) {
        this.brandData = brandData;
    }

    public List<Promotion> getPromotionList() {
        return appliedIwaPromotions;
    }

    public void getPromotionList(List<Promotion> promotionList) {
        this.appliedIwaPromotions = promotionList;
    }

    public class Promotion implements Serializable {
        String promotionDescription;
        int promotionNumber;
        String rewardAmount;
        int rewardType;
        //RewardAmount rewardAmount;

        public String getMessage() {
            if(promotionDescription != null)
                return this.promotionDescription;
            return this.promotionDescription;
        }
    }

    public class RewardAmount {
        String currencyIso;
        String value;
        String priceType;
        String formattedValue;
    }


    /*"iwaPromotionsData": [
          {
            "link": "/Special-Offer/Promotions/BUY-2-FREE-1A-B-C-D-E%28LD%29/c/pro203",
            "description": "BUY 2 FREE 1A/B/C/D/E(LD)",
            "priority": 0,
            "bucketsData": [
              {
                "igcPromoItem": [],
                "code": 2
              },
              {
                "igcPromoItem": [],
                "code": 1
              },
              {
                "igcPromoItem": [],
                "code": 3
              }
            ],
            "promoCode": 203,
            "missedOffer": false,
            "longDescription": "買2送1A/B/C/D/E"
          },*/
    /*"promotions": [
    {
        "message": "送 金御膳龍口粉絲",
            "promoNumber": 197,
            "rewardAmount": {
                "currencyIso": "HKD",
                    "value": "18",
                    "priceType": "BUY",
                    "formattedValue": "HK$18.00"
               }
    }],*/

    /*
      "product": {
        "code": "101758",
        "name": "高露潔冰爽勁白牙膏 160克",
        "url": "/Product-COLGATE/MAXWHITE-TOOTHPASTE/p/101758",
        "description": "",
        "purchasable": true,
        "stockLevelStatus": {
          "code": "inStock",
          "codeLowerCase": "instock"
        },
        "stockLevel": 1997,
        "numberOfReviews": 0,
        "summary": "",
        "variantType": "GenericVariant",
        "price": {
          "currencyIso": "HKD",
          "value": "18.0",
          "priceType": "BUY",
          "formattedValue": "HK$18.00"
        },
        "images": [
          {
            "imageType": "PRIMARY",
            "format": "zoom",
            "url": "/medias/sys_master/front/zoom/8806137430046.jpg",
            "altText": "MAXWHITE TOOTHPASTE-BP_101758.jpg"
          },
          {
            "imageType": "PRIMARY",
            "format": "product",
            "url": "/medias/sys_master/front/prd/8806137135134.jpg",
            "altText": "MAXWHITE TOOTHPASTE-BP_101758.jpg"
          },
          {
            "imageType": "PRIMARY",
            "format": "thumbnail",
            "url": "/medias/sys_master/front/prdthumb/8806137200670.jpg",
            "altText": "MAXWHITE TOOTHPASTE-BP_101758.jpg"
          },
          {
            "imageType": "PRIMARY",
            "format": "prodref",
            "url": "/medias/sys_master/front/src/8806137397278.jpg",
            "altText": "MAXWHITE TOOTHPASTE-BP_101758.jpg"
          },
          {
            "imageType": "PRIMARY",
            "format": "prodcat",
            "url": "/medias/sys_master/front/cat/8806137266206.jpg",
            "altText": "MAXWHITE TOOTHPASTE-BP_101758.jpg"
          },
          {
            "imageType": "GALLERY",
            "format": "zoom",
            "url": "/medias/sys_master/front/zoom/8806138871838.jpg",
            "altText": "MAXWHITE TOOTHPASTE-101758.jpg",
            "galleryIndex": 0
          },
          {
            "imageType": "GALLERY",
            "format": "product",
            "url": "/medias/sys_master/front/prd/8806138576926.jpg",
            "altText": "MAXWHITE TOOTHPASTE-101758.jpg",
            "galleryIndex": 0
          },
          {
            "imageType": "GALLERY",
            "format": "thumbnail",
            "url": "/medias/sys_master/front/prdthumb/8806138642462.jpg",
            "altText": "MAXWHITE TOOTHPASTE-101758.jpg",
            "galleryIndex": 0
          }
        ],
        "categories": [],
        "reviews": [],
        "variantOptions": [
          {
            "stockLevelStatus": {
              "code": "inStock",
              "codeLowerCase": "instock"
            },
            "stockLevel": 2171,
            "url": "/Product-COLGATE/MAXWHITE-TOOTHPASTE/p/101758",
            "priceData": {
              "currencyIso": "HKD",
              "value": "18.5",
              "priceType": "BUY",
              "formattedValue": "HK$18.50"
            },
            "variantOptionQualifiers": [
              {
                "qualifier": "colorCode",
                "value": ""
              },
              {
                "qualifier": "bigSwatch",
                "value": ""
              },
              {
                "qualifier": "colorHexCode",
                "value": ""
              },
              {
                "qualifier": "variantSize",
                "value": "160G"
              },
              {
                "qualifier": "smallSwatch",
                "value": ""
              },
              {
                "qualifier": "colorDescription",
                "value": "AQUA"
              },
              {
                "qualifier": "colorGroup",
                "value": ""
              }
            ],
            "colorDescription": "AQUA",
            "variantType": "GenericVariant",
            "code": "101758",
            "igcContentSizeUnit": "160G",
            "igcMarkDownPrice": {
              "currencyIso": "HKD",
              "value": "18.0",
              "priceType": "BUY",
              "formattedValue": "HK$18.00"
            },
            "igcMarkDownMemPrice": {
              "currencyIso": "HKD",
              "value": "16",
              "priceType": "BUY",
              "formattedValue": "HK$16.00"
            },
            "igcVariantOptionQualifiers": [
              [
                "bigSwatch",
                ""
              ],
              [
                "colorHexCode",
                ""
              ],
              [
                "colorGroup",
                ""
              ],
              [
                "colorDescription",
                "AQUA"
              ],
              [
                "variantSize",
                "160G"
              ],
              [
                "smallSwatch",
                ""
              ],
              [
                "colorCode",
                ""
              ]
            ]
          }
        ],
        "baseOptions": [
          {
            "variantType": "IgcVariantProduct",
            "options": [
              {
                "stockLevelStatus": {
                  "code": "inStock",
                  "codeLowerCase": "instock"
                },
                "stockLevel": 2171,
                "url": "/Product-COLGATE/MAXWHITE-TOOTHPASTE/p/101758",
                "priceData": {
                  "currencyIso": "HKD",
                  "value": "18.5",
                  "priceType": "BUY",
                  "formattedValue": "HK$18.50"
                },
                "variantOptionQualifiers": [
                  {
                    "qualifier": "colorCode",
                    "value": ""
                  },
                  {
                    "qualifier": "bigSwatch",
                    "value": ""
                  },
                  {
                    "qualifier": "colorHexCode",
                    "value": ""
                  },
                  {
                    "qualifier": "variantSize",
                    "value": "160G"
                  },
                  {
                    "qualifier": "smallSwatch",
                    "value": ""
                  },
                  {
                    "qualifier": "colorDescription",
                    "value": "AQUA"
                  },
                  {
                    "qualifier": "colorGroup",
                    "value": ""
                  }
                ],
                "colorDescription": "AQUA",
                "variantType": "GenericVariant",
                "code": "101758",
                "igcContentSizeUnit": "160G",
                "igcMarkDownPrice": {
                  "currencyIso": "HKD",
                  "value": "18.0",
                  "priceType": "BUY",
                  "formattedValue": "HK$18.00"
                },
                "igcMarkDownMemPrice": {
                  "currencyIso": "HKD",
                  "value": "16",
                  "priceType": "BUY",
                  "formattedValue": "HK$16.00"
                },
                "igcVariantOptionQualifiers": [
                  [
                    "bigSwatch",
                    ""
                  ],
                  [
                    "colorHexCode",
                    ""
                  ],
                  [
                    "colorGroup",
                    ""
                  ],
                  [
                    "colorDescription",
                    "AQUA"
                  ],
                  [
                    "variantSize",
                    "160G"
                  ],
                  [
                    "smallSwatch",
                    ""
                  ],
                  [
                    "colorCode",
                    ""
                  ]
                ]
              }
            ],
            "selected": {
              "stockLevelStatus": {
                "code": "inStock",
                "codeLowerCase": "instock"
              },
              "stockLevel": 2171,
              "url": "/Product-COLGATE/MAXWHITE-TOOTHPASTE/p/101758",
              "priceData": {
                "currencyIso": "HKD",
                "value": "18.5",
                "priceType": "BUY",
                "formattedValue": "HK$18.50"
              },
              "variantOptionQualifiers": [
                {
                  "qualifier": "colorCode",
                  "value": ""
                },
                {
                  "qualifier": "bigSwatch",
                  "value": ""
                },
                {
                  "qualifier": "colorHexCode",
                  "value": ""
                },
                {
                  "qualifier": "variantSize",
                  "value": "160G"
                },
                {
                  "qualifier": "smallSwatch",
                  "value": ""
                },
                {
                  "qualifier": "colorDescription",
                  "value": "AQUA"
                },
                {
                  "qualifier": "colorGroup",
                  "value": ""
                }
              ],
              "colorDescription": "AQUA",
              "variantType": "GenericVariant",
              "code": "101758",
              "igcContentSizeUnit": "160G",
              "igcMarkDownPrice": {
                "currencyIso": "HKD",
                "value": "18.0",
                "priceType": "BUY",
                "formattedValue": "HK$18.00"
              },
              "igcMarkDownMemPrice": {
                "currencyIso": "HKD",
                "value": "16",
                "priceType": "BUY",
                "formattedValue": "HK$16.00"
              },
              "igcVariantOptionQualifiers": [
                [
                  "bigSwatch",
                  ""
                ],
                [
                  "colorHexCode",
                  ""
                ],
                [
                  "colorGroup",
                  ""
                ],
                [
                  "colorDescription",
                  "AQUA"
                ],
                [
                  "variantSize",
                  "160G"
                ],
                [
                  "smallSwatch",
                  ""
                ],
                [
                  "colorCode",
                  ""
                ]
              ]
            }
          }
        ],
        "igcMarkDownMemPrice": {
          "currencyIso": "HKD",
          "value": "16",
          "priceType": "BUY",
          "formattedValue": "HK$16.00"
        },
        "igcLoyaltyPoints": 0,
        "igcNewProduct": false,
        "igcGeneralPromotion": false,
        "igcBrandName": "高露潔",
        "igcVariantType": "GenericVariant",
        "newProduct": false,
        "igcPromoBundleData": [],
        "igcPromotionTag": [
          "優惠價",
          "加 $1 多1件",
          "多買多慳",
          "照價再減",
          "買2送1",
          "送贈品"
        ],
        "bestSeller": false,
        "variantsNumber": 0,
        "marionnaudPromotionColor": [],
        "zoomDisabled": false,
        "igcExclusiveBrand": {
          "code": "A (A Brand)",
          "codeLowerCase": "a (a brand)"
        },
        "iwaStorePickupAllowed": false,
        "igcShortDescription": "冰爽勁白牙膏",
        "tprPriceFlag": true,
        "igcOldPrice": {
          "currencyIso": "HKD",
          "value": "18.5",
          "priceType": "BUY",
          "formattedValue": "HK$18.50"
        },
        "iwaPromotionsData": [
          {
            "link": "/Special-Offer/Promotions/BUY-2-FREE-1A-B-C-D-E%28LD%29/c/pro203",
            "description": "BUY 2 FREE 1A/B/C/D/E(LD)",
            "priority": 0,
            "bucketsData": [
              {
                "igcPromoItem": [],
                "code": 2
              },
              {
                "igcPromoItem": [],
                "code": 1
              },
              {
                "igcPromoItem": [],
                "code": 3
              }
            ],
            "promoCode": 203,
            "missedOffer": false,
            "longDescription": "買2送1A/B/C/D/E"
          },
          {
            "link": "/Special-Offer/Promotions/Buy-any-Beverage-items-over-%2460-free-1pc-IB-GREEN-BEAN-VERMICELL-200g-/c/pro197",
            "description": "Buy any Beverage items over $60 free  1pc IB GREEN BEAN VERMICELL 200g.",
            "priority": 0,
            "bucketsData": [
              {
                "igcPromoItem": [],
                "code": 2
              },
              {
                "igcPromoItem": [],
                "code": 1
              }
            ],
            "promoCode": 197,
            "missedOffer": false,
            "longDescription": "買任何飲料產品滿$60, 送 金御膳龍口粉絲200克1包<BR>"
          },
          {
            "link": "/Special-Offer/Promotions/Free-Shipping%28Home-Delivery-LD%29/c/pro131",
            "description": "Free Shipping(HD/SP-LD)",
            "priority": 0,
            "bucketsData": [
              {
                "igcPromoItem": [],
                "code": 1
              },
              {
                "igcPromoItem": [],
                "code": 2
              }
            ],
            "promoCode": 131,
            "missedOffer": false,
            "longDescription": "運費"
          },
          {
            "link": "/Special-Offer/Promotions/EXTRA-SAVINGS/c/pro185",
            "description": "EXTRA SAVINGS",
            "priority": 1,
            "bucketsData": [
              {
                "igcPromoItem": [],
                "code": 1
              }
            ],
            "promoCode": 185,
            "missedOffer": false,
            "longDescription": "EXTRA SAVINGS ZT"
          },
          {
            "link": "/Special-Offer/Promotions/Buy-3-pcs-of-%23101758-3-pcs-of-%23138568-at-%24190/c/pro141",
            "description": "Buy 3 pcs of #101758  3 pcs of #138568 at $190",
            "priority": 1,
            "bucketsData": [
              {
                "igcPromoItem": [],
                "code": 1
              },
              {
                "igcPromoItem": [],
                "code": 2
              }
            ],
            "promoCode": 141,
            "missedOffer": false,
            "longDescription": "買3件#101758 & 3件#138568 $190"
          },
          {
            "link": "/Special-Offer/Promotions/%23101758-MB-PRICE%2416%28LD%29/c/pro129",
            "description": "#101758 MB PRICE$16(LD)",
            "priority": 1,
            "bucketsData": [
              {
                "igcPromoItem": [],
                "code": 1
              }
            ],
            "promoCode": 129,
            "missedOffer": false,
            "longDescription": "#101758會員價$16"
          },
          {
            "link": "/Special-Offer/Promotions/With-Coupon%2C-buy-any-organic-products-over-%24100%2C-save-%2410-/c/pro215",
            "description": "With Coupon, buy any organic products over $100, save $10.",
            "priority": 1,
            "bucketsData": [
              {
                "igcPromoItem": [],
                "code": 1
              }
            ],
            "promoCode": 215,
            "missedOffer": false,
            "longDescription": "With Coupon, buy any organic products over $100, save $10."
          }
        ],
        "redemptionProductDatas": [],
        "storageInformation": "請存放於陰涼乾燥處",
        "iwaIMemeberPromotionTag": [],
        "iwaNonIMemberPromotiontag": [
          "優惠價",
          "加 $1 多1件",
          "多買多慳",
          "照價再減",
          "買2送1",
          "送贈品"
        ],
        "maxOrderQuantity": 6,
        "categoriesName": [
          "牙膏",
          "早餐及麵包糕點"
        ],
        "pnsPickingLocation": "FRESH_PICKING_STORE_RA",
        "pnsProdMinDeliveryLeadTime": 0,
        "pnsProdMaxDeliveryLeadTime": 7,
        "pnsProdSourceWarehouse": 4001,
        "pnsEnergy": "NA",
        "pnsProtein": "NA",
        "pnsTotalFat": "NA",
        "pnsTransFat": "NA",
        "pnsCarbohydrates": "NA",
        "pnsTotalCarbohydrates": "NA",
        "pnsSugars": "NA",
        "pnsOrganic": false,
        "pnsRelabelItem": false,
        "pnsRRP": {
          "currencyIso": "HKD",
          "value": "20",
          "priceType": "BUY",
          "formattedValue": "HK$20.00"
        },
        "availableInOutlyingIsland": false,
        "pnsNewLabel": false,
        "pnsContentSizeUnit": "160G",
        "maxAllowedBuyQty": 6,
        "pnsShippableToPRC": false,
        "pnsRedemptionProductDatas": [],
        "pnsNonIMemberPromotiontag": [
          "優惠價,tag9",
          "加 $1 多1件,tag95",
          "多買多慳,tag74",
          "照價再減,tag1",
          "買2送1,tag28",
          "送贈品,tag41"
        ]
      },
      "updateable": true,
      "finalEntryPrice": {
        "currencyIso": "HKD",
        "value": "18.0",
        "priceType": "BUY",
        "formattedValue": "HK$18.00"
      },
      "missedPromotions": [],
      "appliedIwaPromotions": [
        {
          "promotionNumber": 197,
          "promotionDescription": "送 金御膳龍口粉絲",
          "rewardAmount": "1800",
          "rewardType": 15
        }
      ],
      "redemptionProducts": [],
      "minDeliveryTime": 0,
      "maxDeliveryTime": 0,
      "discountedPrice": {
        "currencyIso": "HKD",
        "value": "0.00",
        "priceType": "BUY",
        "formattedValue": "HK$0.00"
      }
    }
  ],*/
}
