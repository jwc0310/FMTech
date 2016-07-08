package parknshop.parknshopapp.Rest;

import com.google.gson.JsonElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import parknshop.parknshopapp.Fragment.Checkout.CheckoutYourDetailFragment;
import parknshop.parknshopapp.Model.ActivateCardRequest;
import parknshop.parknshopapp.Model.AddWishListResponse;
import parknshop.parknshopapp.Model.AddressData;
import parknshop.parknshopapp.Model.AddressesResponse;
import parknshop.parknshopapp.Model.BankListResponse;
import parknshop.parknshopapp.Model.BarcodeScanResponse;
import parknshop.parknshopapp.Model.BrandListResponse;
import parknshop.parknshopapp.Model.CancelOrderBody;
import parknshop.parknshopapp.Model.CartResponse;
import parknshop.parknshopapp.Model.ChangePwdResponse;
import parknshop.parknshopapp.Model.DeleteCartPostBody;
import parknshop.parknshopapp.Model.DistrictsResponse;
import parknshop.parknshopapp.Model.ECouponResponse;
import parknshop.parknshopapp.Model.EmptyJson;
import parknshop.parknshopapp.Model.LoginResponse;
import parknshop.parknshopapp.Model.MemberProfile;
import parknshop.parknshopapp.Model.NewPromotionResponse;
import parknshop.parknshopapp.Model.OnlineRecordDetail;
import parknshop.parknshopapp.Model.OnlineRecords;
import parknshop.parknshopapp.Model.PaymentCreditCardInfo;
import parknshop.parknshopapp.Model.PaymentResponse;
import parknshop.parknshopapp.Model.Product;
import parknshop.parknshopapp.Model.ProductRatingRequest;
import parknshop.parknshopapp.Model.RegionDistrictResponse;
import parknshop.parknshopapp.Model.RegionsResponse;
import parknshop.parknshopapp.Model.RegisterData;
import parknshop.parknshopapp.Model.RelatedProductsResponse;
import parknshop.parknshopapp.Model.ReturnOrderBody;
import parknshop.parknshopapp.Model.ReturnOrderResponse;
import parknshop.parknshopapp.Model.SpecialRemark;
import parknshop.parknshopapp.Model.StoreListResponse;
import parknshop.parknshopapp.Model.TextSearchResponse;
import parknshop.parknshopapp.Model.Timeslot;
import parknshop.parknshopapp.Model.UpdateProfile;
import parknshop.parknshopapp.Model.UpdateWishListResponse;
import parknshop.parknshopapp.Model.WishListResponse;
import parknshop.parknshopapp.Utils.AppUtils;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/**
 * Created by kwongyuenpan on 14/3/16.
 */
public interface WatsonsAPIService {
    String header = "Content-Type: application/json";
    String userAgent = "User-Agent: Android";
    String acceptLanguage = "Accept-Language: 'zt'";

//    @Headers({
//            header,
//            userAgent,
//            acceptLanguage
//    })
    @GET(AppUtils.WASTONS_GET_CATEGORY_TREE)
    Call<JsonElement> getCategoryTree();


    @POST("customers/current/login")
    Call<LoginResponse> getLogin(@Query("userName") String email, @Query("password") String password);

    @POST("customers/register")
    Call<MemberProfile> getRegister(@Body RegisterData registerData);
    //Call<EmptyJson> getRegister(@Body RegisterData registerData);

    @GET("customers/current")
    Call<MemberProfile> getProfile(@Header("X-token") String xToken);

    @POST("customers/current/password")
    Call<ChangePwdResponse> changePwd(@Header("X-token") String xToken, @Query("old") String oldPwd, @Query("new") String newPwd);

    @POST("customers/current/profileid")
    Call<EmptyJson> getUpdateProfile(@Header("X-token") String xToken, @Body CheckoutYourDetailFragment.UpdateForm updateProfile);

    // For MyAccount
    @POST("customers/current/profileid")
    Call<MemberProfile> getUpdateProfile(@Header("X-token") String xToken, @Body UpdateProfile UpdateProfile);

    @POST("customers/current/forgotpwd")
    Call<EmptyJson> getForgotPwd(@Query("email") String email);

    @GET("orders")
    Call<OnlineRecords> getOnlineRecords(@Header("X-token") String xToken, @Query("Day") String days);

    @GET("orders/{code}")
    Call<OnlineRecordDetail> getOnlineRecordsDetail(@Header("X-token") String xToken, @Path("code") String code);

    @GET("customers/current")
    Call<MemberProfile> getCustomerAddresses(@Header("X-token") String xToken);

    @GET("customers/current/addresses")
    Call<AddressesResponse> getAddressBook(@Header("X-token") String xToken);

    //3.52
    @POST("cart/address/delivery")
    Call<CartResponse> saveDeliveryAddress(@Header("X-token") String xToken, @Body AddressData data);


    @POST("cart/address/delivery/{id}")
    Call<CartResponse> saveDeliveryAddress(@Header("X-token") String xToken, @Path("id") String id);

    @POST("customers/current/addresses/{id}")
    Call<AddressData> updateAddress(@Header("X-token") String xToken, @Path("id") String id, @Body AddressData data);

    //3.27
    @POST("customers/current/addresses/default/{id}")
    Call<EmptyJson> setDefaultDeliveryAddress(@Header("X-token") String xToken, @Path("id") String id);

    //3.40
    @POST("cart/deliverymodes/{deliveryMode}")
    Call<EmptyJson> saveDeliveryMode(@Path("deliveryMode") String deliveryMode);

    //3.90
    @POST("cart/timeslot")
    Call<EmptyJson> saveDeliveryScheduleId(@Query("deliveryScheduleId") String deliveryScheduleId);

    //3.24
    @POST("customers/current/addresses")
    Call<AddressData.AddressForm> addCustomerAddresses(@Header("X-token") String xToken, @Body AddressData data);

    //3.26
    @DELETE("customers/current/addresses/{id}")
    Call<EmptyJson> deleteAddress(@Header("X-token") String xToken, @Path("id") String id);

    //3.28
    @GET("customers/current/ecouponsEvouchers")
    Call<ECouponResponse> getEcouponAndEVouchers(@Header("X-token") String xToken);

    //3.xx
    ///rest/v1/hybris/cart/address/store/cheungchau
    @GET("cart/address/store/{selfPickUpLocation}")
    Call<CartResponse> setSelfPickUpStore(@Header("X-token") String xToken, @Path("selfPickUpLocation") String selfPickUpLocation);

    @POST("cart/setEcoupon")
    Call<EmptyJson> setECoupon(@Header("X-token") String xToken, @Query("voucherCode") String code);

    @POST("cart/setVoucher")
    Call<EmptyJson> setVoucher(@Header("X-token") String xToken, @Query("voucherCode") String code);

    @POST("cart/applyCouponVoucher")
    Call<EmptyJson> setVoucherCode(@Header("X-token") String xToken, @Query("voucherCode") String code);

    @POST("cart/addRedeemPoints")
    Call<EmptyJson> setRedeemPoint(@Header("X-token") String xToken, @Query("redeemMoney") int point);

    @GET("banksbrancheslist")
    Call<BankListResponse> getBankList();

    @POST("orders/returnOrder/{orderCode}")
    Call<ReturnOrderResponse> getReturnOrder(@Path("orderCode") String orderCode, @Body ReturnOrderBody data);

    @POST("orders/cancelOrder/{orderCode}")
    Call<EmptyJson> getCancelOrderRequest(@Path("orderCode") String orderCode,@Body CancelOrderBody cancelOrderBody);

    @POST("customers/updateDeviceToken")
    Call<EmptyJson> getPushTokenRequest(@Query("deviceToken") String deviceToken);

    @GET("products/wishlist")
    Call<WishListResponse[]> getWishList(@Header("X-token") String xToken);

    // Create a new wish list
    @POST("customers/addWishList")
    Call<AddWishListResponse> addNewWishList(@Header("X-token") String xToken, @Query("wishlistName") String name);

    // Add Product and create a new wish list
    @POST("customers/addWishList")
    Call<AddWishListResponse> addProductWithNewWishList(@Header("X-token") String xToken,
                                                        @Query("codeVariant") String code, @Query("wishlistName") String name);

    // Add Product to wish list
    @POST("customers/addWishList")
    Call<AddWishListResponse> addProductToWishList(@Header("X-token") String xToken, @Query("quantity") int quantity,
                                                   @Query("codeVariant") String code, @Query("pk") String pk);

    @DELETE("customers/shoppingListDelete")
    Call<UpdateWishListResponse> removeWishList(@Header("X-token") String xToken, @Query("pk") String pk);


    @POST("customers/shoppingListUpdateProduct")
    Call<UpdateWishListResponse> updateWishList(@Header("X-token") String xToken, @Query("pk") String pk, @Query("quantity") int quantity,
                                                @Query("codeVariant") String code);

    @POST("customers/shoppingListRemoveProduct")
    Call<UpdateWishListResponse> removeProductFromWishList(@Header("X-token") String xToken, @Query("pk") String pk, @Query("quantity") int quantity,
                                                           @Query("codeVariant") String code);

    @GET("products/dlProduct/{product_id}")
    Call<Product> getProductDetail(@Path("product_id") String id);

    @POST ("cart/setSpecialRemark")
    Call<CartResponse> setSpecialRemark(@Header("X-token") String xToken, @Body SpecialRemark specialRemark);

    @POST("cart/entry")
    Call<EmptyJson> addCart(@Header("X-token") String xToken, @Query("code") String code, @Query("qty") int quantity);

    @POST("cart/entry/{id}")
    Call<EmptyJson> editCart(@Header("X-token") String xToken, @Path("id") String id, @Query("qty") int quantity);

    @POST("cart/entryBatchUpdate")
    Call<EmptyJson> entryUpdateBatch(@Header("X-token") String xToken, @Body DeleteCartPostBody body);

    @DELETE("cart/entry/{id}")
    Call<EmptyJson> deleteCart(@Header("X-token") String xToken, @Path("id") String id);

    @GET("cart")
    Call<CartResponse> getCart(@Header("X-token") String xToken);

    @GET("cart")
    Call<CartResponse> getCart(@Header("X-token") String xToken , @Query("separateCart") boolean separateCart);

    @GET("cart")
    Call<CartResponse> getMiniCart(@Header("X-token") String xToken, @Query("isMini") boolean isMini);

    @POST("cart/merge")
    Call<EmptyJson> mergeCart(@Header("X-token") String xToken);

    @GET("products/newPromotion")
    Call<ArrayList<NewPromotionResponse.PromotionResponseItem>> getNewPromotion();

    @POST("/rest/v1/hybris/cart/setpaymenttype")
    Call<CartResponse> setShoppingCartType(@Header("X-token") String xToken, @Query("paymentType") String paymentType);

    @POST("/rest/v1/hybris/cart/checkout/{paymentGateway}")
    Call<PaymentResponse> setPaymentGateway(@Header("X-token") String xToken, @Path("paymentGateway") String paymentGateway, @Query("kindReminder") String kindReminder,
                                            @Query("invoice") String invoice, @Query("wineCheck") String wineCheck, @Body PaymentCreditCardInfo paymentCreditCardInfo);

    // TNS
    @POST("/rest/v1/hybris/cart/checkout/{paymentGateway}")
    Call<PaymentResponse> setPaymentGateway(@Header("X-token") String xToken, @Path("paymentGateway") String paymentGateway, @Query("kindReminder") String kindReminder,
                                            @Query("invoice") String invoice, @Query("wineCheck") String wineCheck);


    @GET("/rest/v1/hybris/products")
    Call<TextSearchResponse> getProductsByTextSearch(@Query("query") String query, @Query("currentPage") String currentPage, @Query("sort") String sort);

    @GET("/rest/v1/hybris/products/dlProduct/{barcode}?type=ean")
    Call<BarcodeScanResponse> getBarcodeScan(@Path("barcode") String barcode);

//    @GET("products/dlProductList/{pathList}")
//    Call<List<Product>> getProductsByMultipleId( @Path("pathList") String pathList);
    @GET("/rest/v1/hybris/products/Product_Categories")
    Call<TextSearchResponse> getProductsByMultipleId(@Query("type") String type, @Query("query") String query, @Query("currentPage") int page);

    @GET("regions")
    Call<RegionsResponse> getRegionsResponse();

    @GET("districts")
    Call<DistrictsResponse> getDistrictsResponse();

    @GET("regionsdistrictslist")
    Call<RegionDistrictResponse> getRegionsDistrictsResponse();

    @GET("cart/timeslot")
    Call<List<Timeslot>> getTimeslot();
    //https://infpnshkuat.aswatson.net/rest/v1/hybris/rest/v1/hybris/cart/timeslot

    @GET("/rest/v1/hybris/products/Product_Categories")
    Call<TextSearchResponse> getProductsByCat(@Query("type") String type, @Query("query") String query, @Query("currentPage") int page);

    @GET("/rest/v1/hybris/products/tag/{type}")
    Call<TextSearchResponse> getProductsByTag(@Path(value = "type", encoded = true) String type, @Query("query") String query, @Query("currentPage") int page);

    //"products/{category_id}?type=Cat&currentPage={page}&pageSize=60&query={query}";
    // https://infpnshkuat.aswatson.net/rest/v1/hybris/products/010100?type=Cat&currentPage=0&pageSize=60&query=:iwaBestSellerQty
    @GET("/rest/v1/hybris/products/{category_id}")
    Call<TextSearchResponse> getProducts(@Path(value = "category_id", encoded = true) String category_id, @QueryMap Map<String,String> map);

    @GET("/rest/v1/hybris/products/{server_query}")
    Call<TextSearchResponse> getProducts(@Path(value = "server_query", encoded = true) String server_query);

    @GET("/rest/v1/hybris/brand/brandlist")
    Call<BrandListResponse> getBrandList();

    @POST("/rest/v1/hybris/cart/setpaymenttype")///rest/v1/hybris/cart/setpaymenttype?paymentType={paymentMode}
    Call<CartResponse> setPaymentMode(@Header("X-token") String xToken, @Query("paymentType") String paymentMode);

    @GET("/rest/v1/hybris/stores")
    Call<StoreListResponse> getStoreList();

    @GET("/rest/v1/hybris/products/hotSearch")
    Call<List<String>> getHotSearchList();

    @GET("/rest/v1/hybris/products/{id}?type=LIKE&subType=bestSeller")
    Call<RelatedProductsResponse> getRelatedProducts(@Path("id") String id);

    @POST("/rest/v1/hybris/customers/activateCard")
    Call<MemberProfile> activateCard(@Body() ActivateCardRequest activateCardRequest);

    @GET("/rest/v1/hybris/customers/moneyBackProfile")
    Call<MemberProfile> getMoneyBackProfile(@Header("X-token") String xToken);

    @POST("/rest/v1/hybris/orders/productRating/{orderCode}")
    Call<EmptyJson> getProductRating(@Header("X-token") String xToken, @Path("orderCode") String orderCode, @Body ProductRatingRequest productRatingRequest);

    @GET("/")
    Call<Object> getBasic();
}
