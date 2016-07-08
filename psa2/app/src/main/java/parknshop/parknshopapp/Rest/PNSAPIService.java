package parknshop.parknshopapp.Rest;

import com.google.gson.JsonElement;

import parknshop.parknshopapp.Model.AddProfilePicForm;
import parknshop.parknshopapp.Model.AddProfilePicResponse;
import parknshop.parknshopapp.Model.Advertisement;
import parknshop.parknshopapp.Model.Config;
import parknshop.parknshopapp.Model.ContactResponse;
import parknshop.parknshopapp.Model.CouponResponse;
import parknshop.parknshopapp.Model.CustomizeProductResponse;
import parknshop.parknshopapp.Model.DishTypeResponse;
import parknshop.parknshopapp.Model.FAQResponse;
import parknshop.parknshopapp.Model.ForceUpdateResponse;
import parknshop.parknshopapp.Model.GetUserProfilePicResponse;
import parknshop.parknshopapp.Model.GroceryList;
import parknshop.parknshopapp.Model.PromotionCategoryResponse;
import parknshop.parknshopapp.Model.PromotionItemResponse;
import parknshop.parknshopapp.Model.PromotionResponse;
import parknshop.parknshopapp.Model.RecipeDetailItemResponse;
import parknshop.parknshopapp.Model.RecipeDetailResponse;
import parknshop.parknshopapp.Model.RecipeListResponse;
import parknshop.parknshopapp.Model.RedemptionItemResponse;
import parknshop.parknshopapp.Model.RedemptionResponse;
import parknshop.parknshopapp.Model.StoreListResponse;
import parknshop.parknshopapp.Model.StoreLocatorResponse;
import parknshop.parknshopapp.Model.TNCResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by kwongyuenpan on 14/3/16.
 */
public interface PNSAPIService {
//    String header = "Content-Type: application/json";
//    String userAgent = "User-Agent: Android";
//    String acceptLanguage = "Accept-Language: zt";
//
//    @Headers({
//            header,
//            userAgent,
//            acceptLanguage
//    })

    @GET("config")
    Call<Config> getConfig();

    @GET("category/catTree")
    Call<JsonElement> getCategoryTree();

    @GET("advertisement/list")
    Call<Advertisement> getAdvertisementList();

    @GET("advertisement/list/home")
    Call<Advertisement> getAdvertisementListHome();

    @GET("grocery/list")
    Call<GroceryList> getGroceryList();

    @GET("menu/list")
    Call<PromotionCategoryResponse> getPromotionList();

    @GET("promotion/{id}")
    Call<PromotionResponse> getPromotion(@Path("id") String id, @Query("type") String type);

    @GET("promotion/promotion/{id}")
    Call<PromotionItemResponse> getPromotionItem(@Path("id") String id, @Query("type") String type);

    @GET("redemption/list")
    Call<RedemptionResponse> getRedemptionList();

    @GET("coupon/list")
    Call<CouponResponse> getCouponList();

    @GET("redemption/{id}")
    Call<RedemptionItemResponse> getRedemption(@Path("id") String id);

    @GET("product/group/{id}")
    Call<CustomizeProductResponse> getCustomizeProducts(@Path("id") String id);

    @POST("appuser/add")
    Call<AddProfilePicResponse> addProfilePic(@Body() AddProfilePicForm addProfilePicForm);

    @POST("appuser/find")
    Call<GetUserProfilePicResponse> getUserProfilePic(@Query("id") String id);

    @GET("store/list")
    Call<StoreListResponse> getStoreList();

    @GET("contact/list")
    Call<ContactResponse> getContact();

    @GET("faq/General/list")
    Call<FAQResponse> getGeneralFAQ();

    @GET("faq/SecurityAndTechnical/list")
    Call<FAQResponse> getSATFAQ();

    @GET("notice/list")
    Call<TNCResponse> getTNC();

    @GET("recipe/cat")
    Call<RecipeListResponse> getRecipeCatList();

    @GET("recipe/cat/{id}")
    Call<RecipeDetailResponse> getRecipeListByCat(@Path("id") String id);

    @GET("recipe/{id}")
    Call<RecipeDetailItemResponse> getRecipeItemDetail(@Path("id") String id);

    @GET("recipe/dishType")
    Call<DishTypeResponse> getRecipeListSortType();

    @GET("recipe/suggest/{id}")
    Call<RecipeDetailResponse> getRecipeDetailSuggestedType(@Path("id") String id);

    @GET("version")
    Call<ForceUpdateResponse> getForceUpdate(@Query("os") String os);

    @GET("appShare")
    Call<String> getRecipeAppShareUrl(@Query("recipeId") String recipeId);

    @GET("stock/find")
    Call<StoreLocatorResponse> getStockByProductId(@Query("pid") String pid);
}
