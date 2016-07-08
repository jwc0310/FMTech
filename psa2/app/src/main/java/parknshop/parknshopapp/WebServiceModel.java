package parknshop.parknshopapp;

/**
 * Created by chrisyu on 17/3/16.
 */

import android.content.Context;
import android.text.TextUtils;

import com.bumptech.glide.Glide;
import com.bumptech.glide.integration.okhttp3.OkHttpUrlLoader;
import com.bumptech.glide.load.model.GlideUrl;
import com.google.gson.JsonElement;
import com.orhanobut.hawk.Hawk;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import parknshop.parknshopapp.Base.HttpController.PersistentCookieJar;
import parknshop.parknshopapp.Base.HttpController.SetCookieCache;
import parknshop.parknshopapp.Base.HttpController.SharedPrefsCookiePersistor;
import parknshop.parknshopapp.Fragment.Checkout.CheckoutYourDetailFragment;
import parknshop.parknshopapp.Fragment.Product.ProductDetail.ProductDetailCallback;
import parknshop.parknshopapp.Model.ActivateCardRequest;
import parknshop.parknshopapp.Model.AddProfilePicForm;
import parknshop.parknshopapp.Model.AddProfilePicResponse;
import parknshop.parknshopapp.Model.AddWishListResponse;
import parknshop.parknshopapp.Model.AddressData;
import parknshop.parknshopapp.Model.AddressesResponse;
import parknshop.parknshopapp.Model.Advertisement;
import parknshop.parknshopapp.Model.BarcodeScanResponse;
import parknshop.parknshopapp.Model.BaseStatus;
import parknshop.parknshopapp.Model.BrandListResponse;
import parknshop.parknshopapp.Model.CartResponse;
import parknshop.parknshopapp.Model.Category.CategoryDrawerItem;
import parknshop.parknshopapp.Model.ChangePwdResponse;
import parknshop.parknshopapp.Model.Config;
import parknshop.parknshopapp.Model.ContactResponse;
import parknshop.parknshopapp.Model.CouponResponse;
import parknshop.parknshopapp.Model.CustomizeProductResponse;
import parknshop.parknshopapp.Model.DeleteCartPostBody;
import parknshop.parknshopapp.Model.DishTypeResponse;
import parknshop.parknshopapp.Model.DistrictsResponse;
import parknshop.parknshopapp.Model.ECouponResponse;
import parknshop.parknshopapp.Model.EmptyJson;
import parknshop.parknshopapp.Model.FAQResponse;
import parknshop.parknshopapp.Model.ForceUpdateResponse;
import parknshop.parknshopapp.Model.GetUserProfilePicResponse;
import parknshop.parknshopapp.Model.GroceryList;
import parknshop.parknshopapp.Model.InboxResponse;
import parknshop.parknshopapp.Model.LoginResponse;
import parknshop.parknshopapp.Model.MemberProfile;
import parknshop.parknshopapp.Model.NewPromotionResponse;
import parknshop.parknshopapp.Model.NewsInfoListResponse;
import parknshop.parknshopapp.Model.OnlineRecordDetail;
import parknshop.parknshopapp.Model.OnlineRecords;
import parknshop.parknshopapp.Model.PaymentCreditCardInfo;
import parknshop.parknshopapp.Model.PaymentResponse;
import parknshop.parknshopapp.Model.Product;
import parknshop.parknshopapp.Model.ProductRatingRequest;
import parknshop.parknshopapp.Model.PromotionCategoryResponse;
import parknshop.parknshopapp.Model.PromotionItemResponse;
import parknshop.parknshopapp.Model.PromotionResponse;
import parknshop.parknshopapp.Model.RecipeDetailItemResponse;
import parknshop.parknshopapp.Model.RecipeDetailResponse;
import parknshop.parknshopapp.Model.RecipeListResponse;
import parknshop.parknshopapp.Model.RedemptionItemResponse;
import parknshop.parknshopapp.Model.RedemptionResponse;
import parknshop.parknshopapp.Model.RegionDistrictResponse;
import parknshop.parknshopapp.Model.RegionsResponse;
import parknshop.parknshopapp.Model.RegisterData;
import parknshop.parknshopapp.Model.RelatedProductsResponse;
import parknshop.parknshopapp.Model.SearchData;
import parknshop.parknshopapp.Model.SpecialRemark;
import parknshop.parknshopapp.Model.StoreListResponse;
import parknshop.parknshopapp.Model.StoreLocatorResponse;
import parknshop.parknshopapp.Model.TNCResponse;
import parknshop.parknshopapp.Model.TextSearchResponse;
import parknshop.parknshopapp.Model.Timeslot;
import parknshop.parknshopapp.Model.UpdateProfile;
import parknshop.parknshopapp.Model.UpdateWishListResponse;
import parknshop.parknshopapp.Model.UploadImageResponse;
import parknshop.parknshopapp.Model.WishListResponse;
import parknshop.parknshopapp.Rest.BackendAPIService;
import parknshop.parknshopapp.Rest.NotifyAPIService;
import parknshop.parknshopapp.Rest.PNSAPIService;
import parknshop.parknshopapp.Rest.PNSMediaAPIService;
import parknshop.parknshopapp.Rest.WatsonsAPIService;
import parknshop.parknshopapp.Rest.callback.ActivateCardCallBack;
import parknshop.parknshopapp.Rest.callback.AddNewWishListResponseCallBack;
import parknshop.parknshopapp.Rest.callback.AddProductToWishListResponseCallBack;
import parknshop.parknshopapp.Rest.callback.AddProfilePicResponseCallBack;
import parknshop.parknshopapp.Rest.callback.AddShoppingCartCallBack;
import parknshop.parknshopapp.Rest.callback.AddWishListResponseCallBack;
import parknshop.parknshopapp.Rest.callback.AddressesCallBack;
import parknshop.parknshopapp.Rest.callback.BackendConfigCallback;
import parknshop.parknshopapp.Rest.callback.BarcodeScanResponseCallback;
import parknshop.parknshopapp.Rest.callback.BrandListResponseCallBack;
import parknshop.parknshopapp.Rest.callback.CartCallBack;
import parknshop.parknshopapp.Rest.callback.CategoryTreeCallback;
import parknshop.parknshopapp.Rest.callback.ChangePwdCallBack;
import parknshop.parknshopapp.Rest.callback.ConfigCallBack;
import parknshop.parknshopapp.Rest.callback.ContactResponseCallBack;
import parknshop.parknshopapp.Rest.callback.CouponListCallBack;
import parknshop.parknshopapp.Rest.callback.CustomizeProductCallBack;
import parknshop.parknshopapp.Rest.callback.DeleteMsgCallBack;
import parknshop.parknshopapp.Rest.callback.DistrictListsCallBack;
import parknshop.parknshopapp.Rest.callback.ECouponCallBack;
import parknshop.parknshopapp.Rest.callback.EmptyJsonCallBack;
import parknshop.parknshopapp.Rest.callback.FAQResponseCallBack;
import parknshop.parknshopapp.Rest.callback.ForceUpdateResponseCallBack;
import parknshop.parknshopapp.Rest.callback.ForgetPasswordCallBack;
import parknshop.parknshopapp.Rest.callback.GetAdvertisementListCallBack;
import parknshop.parknshopapp.Rest.callback.GetCustomerAddressesResponseCallBack;
import parknshop.parknshopapp.Rest.callback.GetGroceryListCallBack;
import parknshop.parknshopapp.Rest.callback.GetMoneyBackCardProfileCallBack;
import parknshop.parknshopapp.Rest.callback.GetProductsByCatResponseCallBack;
import parknshop.parknshopapp.Rest.callback.GetProductsByTextSearchResponseCallBack;
import parknshop.parknshopapp.Rest.callback.GetProfileCallBack;
import parknshop.parknshopapp.Rest.callback.GetUserProfilePicResponseCallBack;
import parknshop.parknshopapp.Rest.callback.HotSearchCallBack;
import parknshop.parknshopapp.Rest.callback.InboxResponseCallBack;
import parknshop.parknshopapp.Rest.callback.LoginCallBack;
import parknshop.parknshopapp.Rest.callback.MultipleProductsCallBack;
import parknshop.parknshopapp.Rest.callback.NewPromotionCallback;
import parknshop.parknshopapp.Rest.callback.NewsSearchCallBack;
import parknshop.parknshopapp.Rest.callback.PromotionCallBack;
import parknshop.parknshopapp.Rest.callback.PromotionItemCallBack;
import parknshop.parknshopapp.Rest.callback.PromotionListCallBack;
import parknshop.parknshopapp.Rest.callback.ReadMsgCallBack;
import parknshop.parknshopapp.Rest.callback.RecipeAppShareUrlCallBack;
import parknshop.parknshopapp.Rest.callback.RecipeDetailItemCallBack;
import parknshop.parknshopapp.Rest.callback.RecipeDetailListCallBack;
import parknshop.parknshopapp.Rest.callback.RecipeListResponseCallBack;
import parknshop.parknshopapp.Rest.callback.RecipeListSortTypeCallBack;
import parknshop.parknshopapp.Rest.callback.RecipeSuggestionCallBack;
import parknshop.parknshopapp.Rest.callback.RedemptionItemCallBack;
import parknshop.parknshopapp.Rest.callback.RedemptionListCallBack;
import parknshop.parknshopapp.Rest.callback.RegionDistrictCallBack;
import parknshop.parknshopapp.Rest.callback.RegionListsCallBack;
import parknshop.parknshopapp.Rest.callback.RegisterCallBack;
import parknshop.parknshopapp.Rest.callback.RelatedProductsCallBack;
import parknshop.parknshopapp.Rest.callback.RemoveProductFromWishListResponseCallBack;
import parknshop.parknshopapp.Rest.callback.RemoveWishListResponseCallBack;
import parknshop.parknshopapp.Rest.callback.RequestAddAdressCallBack;
import parknshop.parknshopapp.Rest.callback.RequestOnlineRecordDetailCallBack;
import parknshop.parknshopapp.Rest.callback.RequestOnlineRecordsCallBack;
import parknshop.parknshopapp.Rest.callback.SetPaymentGatewayCallBack;
import parknshop.parknshopapp.Rest.callback.SetShoppingCartTypeCallBack;
import parknshop.parknshopapp.Rest.callback.StoreListCallBack;
import parknshop.parknshopapp.Rest.callback.StoreLocatorResponseCallback;
import parknshop.parknshopapp.Rest.callback.TNCResponseCallBack;
import parknshop.parknshopapp.Rest.callback.TimeslotCallBack;
import parknshop.parknshopapp.Rest.callback.UpdateAddressCallBack;
import parknshop.parknshopapp.Rest.callback.UpdateProfileCallBack;
import parknshop.parknshopapp.Rest.callback.UpdateWishListResponseCallBack;
import parknshop.parknshopapp.Rest.callback.UploadImageCallBack;
import parknshop.parknshopapp.Rest.callback.WishListResponseCallBack;
import parknshop.parknshopapp.Utils.OKHttpClientBuilderHelper;
import parknshop.parknshopapp.common.MemberHelper;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by kwongyuenpan on 14/3/16.
 */

public class WebServiceModel {

    private static WebServiceModel sWebServiceModel;
    private static OkHttpClient okHttpClient;

    //    RequestInterceptor requestInterceptor;//
    private BackendAPIService mAPIServiceBackend;
    private WatsonsAPIService mAPIServiceWastons;
    private PNSAPIService mAPIServicePNS;
    private PNSMediaAPIService mAPIMediaServicePNS;
    private NotifyAPIService mAPINotifyAPIService;
    private Retrofit retrofit;

    private Context mContext;

    public static WebServiceModel getInstance(Context context) {
            if (sWebServiceModel == null) {
                synchronized (WebServiceModel.class) {
                    if (sWebServiceModel == null) {
                        sWebServiceModel = new WebServiceModel(context.getApplicationContext());
                    }
                }
            }
        return sWebServiceModel;
    }

    public static OkHttpClient getHttpClient() {
        return okHttpClient;
    }

    public static void destroyServiceModel() {
        sWebServiceModel = null;
    }

    public WebServiceModel(Context context) {
        mContext = context;
        OkHttpClient.Builder okHttpClientBuilder = OKHttpClientBuilderHelper.getBuilder();

        okHttpClientBuilder.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Interceptor.Chain chain) throws IOException {
                Request original = chain.request();

                Request.Builder originalBuilder = original.newBuilder();
                originalBuilder.header("User-Agent", "Android");
                originalBuilder.header("Content-Type", "application/json");
                originalBuilder.header("Accept-Language", GlobalConstant.language);
                originalBuilder.method(original.method(), original.body());

                String jSessionId = Hawk.get("JSESSIONID", "");
                if(!TextUtils.isEmpty(jSessionId)){
                    originalBuilder.header("JSESSIONID", jSessionId);
                }

                Request request = originalBuilder.build();
//                Request request = original.newBuilder()
//                        .header("User-Agent", "Android")
//                        .header("Content-Type", "application/json")
////                        .header("Accept-Language", Locale.getDefault().getLanguage().equals("zh") ? "zt" : "en")
//                        .header("Accept-Language", GlobalConstant.language)
//                        .method(original.method(), original.body())
//                        .build();

                return chain.proceed(request);
            }
        });

        okHttpClient = okHttpClientBuilder.cookieJar(new PersistentCookieJar(new SetCookieCache(), new SharedPrefsCookiePersistor(context))).build();

//        Log.i("language", "language" + Locale.getDefault().getLanguage() );
        /*
        String header = "Content-Type: application/json";
        String userAgent = "User-Agent: Android";
        String acceptLanguage = "Accept-Language: 'zt'";*/

        Glide.get(context).register(GlideUrl.class, InputStream.class, new OkHttpUrlLoader.Factory(okHttpClient));

        Retrofit.Builder builder =
                new Retrofit.Builder()
                        .baseUrl(API.BACKEND_API_URL)
                        .client(okHttpClient)
                        .addConverterFactory(GsonConverterFactory.create());
        Retrofit retrofit = builder.build();
        mAPIServiceBackend = retrofit.create(BackendAPIService.class);

        Retrofit.Builder builder2 =
                new Retrofit.Builder()
                        .baseUrl(API.WASTSONS_API)
                        .client(okHttpClient)
                        .addConverterFactory(GsonConverterFactory.create());
        Retrofit retrofit2 = builder2.build();
        mAPIServiceWastons = retrofit2.create(WatsonsAPIService.class);

        Retrofit.Builder builder3 =
                new Retrofit.Builder()
                        .baseUrl(API.PNS_API_URL)
                        .client(okHttpClient)
                        .addConverterFactory(GsonConverterFactory.create());
        Retrofit retrofit3 = builder3.build();
        mAPIServicePNS = retrofit3.create(PNSAPIService.class);

        Retrofit.Builder builder4 =
                new Retrofit.Builder()
                        .baseUrl(API.PNS_MEDIA_API_URL)
                        .client(okHttpClient)
                        .addConverterFactory(GsonConverterFactory.create());
        Retrofit retrofit4 = builder4.build();
        mAPIMediaServicePNS = retrofit4.create(PNSMediaAPIService.class);

        Retrofit.Builder builder5 =
                new Retrofit.Builder()
                        .baseUrl(API.NOTIFY_API_URL)
                        .client(okHttpClient)
                        .addConverterFactory(GsonConverterFactory.create());
        Retrofit retrofit5 = builder5.build();
        mAPINotifyAPIService = retrofit5.create(NotifyAPIService.class);

    }

    public void requestConfig() {
        Call<Config> call = mAPIServicePNS.getConfig();
        call.enqueue(new ConfigCallBack());
    }

    public void requestGetBackendConfigContributors() {
        Call<JsonElement> call = mAPIServiceBackend.getBackendConfig();
        call.enqueue(new BackendConfigCallback());
        //call.enqueue(new BackendConfigCallBack());
    }

    public void requestHotSearch() {
        Call<List<String>> call = mAPIServiceWastons.getHotSearchList();
        call.enqueue(new HotSearchCallBack());
    }

    public void requestGetNewSearchContributors(SearchData searchData,String type) {
        Call<NewsInfoListResponse> call = mAPIServiceBackend.getNewsSearch(searchData);
        call.enqueue(new NewsSearchCallBack(type));
    }

    public void requestGetCategoryTreeContributors() {
//        Call<JsonElement> call = mAPIServiceWastons.getCategoryTree();
        Call<JsonElement> call = mAPIServicePNS.getCategoryTree();
        call.enqueue(new CategoryTreeCallback());
    }

    public void requestLoginUser(String userName, String password) {
        Call<LoginResponse> call = mAPIServiceWastons.getLogin(userName, password);
        call.enqueue(new LoginCallBack());
    }

    public void requestRegister(Context context, RegisterData registerData) {
        Call<MemberProfile> call = mAPIServiceWastons.getRegister(registerData);
        call.enqueue(new RegisterCallBack());
    }

    public void requestGetForgotPwd(String email) {
        Call<EmptyJson> call = mAPIServiceWastons.getForgotPwd(email);
        call.enqueue(new ForgetPasswordCallBack());
    }

    public void requestGetProfile(Context context) {
        String token;
        if(!TextUtils.isEmpty(MemberHelper.getUserToken(context))){
            token = MemberHelper.getUserToken(context);
        }else{
            token = GlobalConstant.moneybackCardToken;
        }
        Call<MemberProfile> call = mAPIServiceWastons.getProfile(token);
        call.enqueue(new GetProfileCallBack());
    }

    public void requestGetProduct(String id, int hashCode) {
        Call<Product> call = mAPIServiceWastons.getProductDetail(id);
        call.enqueue(new ProductDetailCallback(hashCode));
    }

    public void requestGetCart(Context context) {
        Call<CartResponse> call = mAPIServiceWastons.getCart(MemberHelper.getUserToken(context));
        call.enqueue(new CartCallBack(context, "cart"));
    }

    public void requestGetCart(Context context, boolean separate) {
        Call<CartResponse> call = mAPIServiceWastons.getCart(MemberHelper.getUserToken(context), separate);
        call.enqueue(new CartCallBack(context, "cart"));
    }

    public void requestGetCart(Context context, String type) {
        Call<CartResponse> call = mAPIServiceWastons.getCart(MemberHelper.getUserToken(context));
        call.enqueue(new CartCallBack(context, type));
    }

    public void requestGetMiniCart(Context context, String type, int successCode) {
        Call<CartResponse> call = mAPIServiceWastons.getMiniCart(MemberHelper.getUserToken(context), true);
        call.enqueue(new CartCallBack(context, type, successCode));
    }

    public void requestGetCart(Context context, String type, int successCode) {
        Call<CartResponse> call = mAPIServiceWastons.getCart(MemberHelper.getUserToken(context));
        call.enqueue(new CartCallBack(context, type,  successCode));
    }

    public void requestGetDummy() {
        Call<Object> call = mAPIServiceWastons.getBasic();
        //call.enqueue(new CartCallBack(context, type,  successCode));
    }

    public void addShoppingCart(String code, int quantity, Context context) {
        Call<EmptyJson> call = mAPIServiceWastons.addCart(MemberHelper.getUserToken(context), code, quantity);
        //new GetCartItemNumber(context, getSpiceManager(), progressDialog);
        call.enqueue(new AddShoppingCartCallBack(context, "add"));
    }


    public void addShoppingCart(String code, int quantity, int successCode, Context context) {
        Call<EmptyJson> call = mAPIServiceWastons.addCart(MemberHelper.getUserToken(context), code, quantity);
        //new GetCartItemNumber(context, getSpiceManager(), progressDialog);
        call.enqueue(new AddShoppingCartCallBack(context, "add", successCode));
    }

    public void addShoppingCart(String code, int quantity, int successCode, String type, Context context) {
        Call<EmptyJson> call = mAPIServiceWastons.addCart(MemberHelper.getUserToken(context), code, quantity);
        //new GetCartItemNumber(context, getSpiceManager(), progressDialog);
        call.enqueue(new AddShoppingCartCallBack(context, type, successCode));
    }

    public void addShoppingCart(String code, int quantity, int successCode, String type, Context context, boolean miniCart) {
        Call<EmptyJson> call = mAPIServiceWastons.addCart(MemberHelper.getUserToken(context), code, quantity);
        //new GetCartItemNumber(context, getSpiceManager(), progressDialog);
        call.enqueue(new AddShoppingCartCallBack(context, quantity, type, successCode, true));
    }


    public void editShoppingCart(String entryId, int quantity, String type, Context context) {
        Call<EmptyJson> call = mAPIServiceWastons.editCart(MemberHelper.getUserToken(context), entryId, quantity);
        //new GetCartItemNumber(context, getSpiceManager(), progressDialog);
        call.enqueue(new AddShoppingCartCallBack(context, type));
    }

    public void editShoppingCart(String entryId, int quantity, Context context, boolean callCallApi) {
        Call<EmptyJson> call = mAPIServiceWastons.editCart(MemberHelper.getUserToken(context), entryId, quantity);
        //new GetCartItemNumber(context, getSpiceManager(), progressDialog);
        call.enqueue(new AddShoppingCartCallBack(context, callCallApi, "edit"));
    }

    public void editShoppingCart(String entryId, int quantity, String type, Context context, boolean miniCart) {
        Call<EmptyJson> call = mAPIServiceWastons.editCart(MemberHelper.getUserToken(context), entryId, quantity);
        //new GetCartItemNumber(context, getSpiceManager(), progressDialog);
        call.enqueue(new AddShoppingCartCallBack(context, quantity, type, true));
    }



    public void editShoppingCart(String entryId, int quantity, String type, Context context, boolean miniCart, int count) {
        Call<EmptyJson> call = mAPIServiceWastons.editCart(MemberHelper.getUserToken(context), entryId, quantity);
        //new GetCartItemNumber(context, getSpiceManager(), progressDialog);
        call.enqueue(new AddShoppingCartCallBack(context, count, type, true));
    }

    public void editShoppingCart(String entryId, int quantity, Context context) {
        Call<EmptyJson> call = mAPIServiceWastons.editCart(MemberHelper.getUserToken(context), entryId, quantity);
        //new GetCartItemNumber(context, getSpiceManager(), progressDialog);
        call.enqueue(new AddShoppingCartCallBack(context, "edit"));
    }

    public void editShoppingCart(String entryId, int quantity, int successCode, Context context) {
        Call<EmptyJson> call = mAPIServiceWastons.editCart(MemberHelper.getUserToken(context), entryId, quantity);
        //new GetCartItemNumber(context, getSpiceManager(), progressDialog);
        call.enqueue(new AddShoppingCartCallBack(context, "edit", successCode));
    }

    public void deleteShoppingCartEntry(String entryId, Context context) {
        Call<EmptyJson> call = mAPIServiceWastons.deleteCart(MemberHelper.getUserToken(context), entryId);
        //new GetCartItemNumber(context, getSpiceManager(), progressDialog);
        call.enqueue(new AddShoppingCartCallBack(context, "delete"));
    }

    public void deleteShoppingCartEntry(String entryId, Context context, boolean callCallApi) {
        Call<EmptyJson> call = mAPIServiceWastons.deleteCart(MemberHelper.getUserToken(context), entryId);
        //new GetCartItemNumber(context, getSpiceManager(), progressDialog);
        call.enqueue(new AddShoppingCartCallBack(context, callCallApi, "delete"));
    }

    public void updateShoppingCart(DeleteCartPostBody body, Context context) {
        Call<EmptyJson> call = mAPIServiceWastons.entryUpdateBatch(MemberHelper.getUserToken(context), body);
        call.enqueue(new AddShoppingCartCallBack(context, "edit"));
    }

    public void requestSetShoppingCartType(Context context, String paymentType) {
        Call<CartResponse> call = mAPIServiceWastons.setShoppingCartType(MemberHelper.getUserToken(context), paymentType);
        call.enqueue(new SetShoppingCartTypeCallBack());
    }

    public void requestSetPaymentGateway(Context context, String paymentGateway, String kindReminder, String invoice, String wineCheck, PaymentCreditCardInfo paymentCreditCardInfo) {
        Call<PaymentResponse> call;
        if(paymentCreditCardInfo != null){
            call = mAPIServiceWastons.setPaymentGateway(MemberHelper.getUserToken(context), paymentGateway, kindReminder, invoice, wineCheck, paymentCreditCardInfo);
        }else{
            call = mAPIServiceWastons.setPaymentGateway(MemberHelper.getUserToken(context), paymentGateway, kindReminder, invoice, wineCheck);
        }
        call.enqueue(new SetPaymentGatewayCallBack());
    }

    // 3.2
    public void requestGetProductsByTextSearch(Context context, String query, String currentPage, String sort, int successId) {
        Call<TextSearchResponse> call = mAPIServiceWastons.getProductsByTextSearch(query, currentPage, sort);
        call.enqueue(new GetProductsByTextSearchResponseCallBack(successId, null));
    }

    // 3.5
    public void requestGetWishList(Context context, String type, Product product) {
        WishListResponseCallBack wishListResponseCallBack = new WishListResponseCallBack(true);
        wishListResponseCallBack.setProduct(product);
        wishListResponseCallBack.type = type;
        Call<WishListResponse[]> call = mAPIServiceWastons.getWishList(MemberHelper.getUserToken(context));
        call.enqueue(wishListResponseCallBack);
    }

    // 3.5
    public void requestGetWishList(Context context, Product product, String type, boolean showDialog) {
        WishListResponseCallBack wishListResponseCallBack = new WishListResponseCallBack(showDialog);
        wishListResponseCallBack.setProduct(product);
        wishListResponseCallBack.type = type;
        Call<WishListResponse[]> call = mAPIServiceWastons.getWishList(MemberHelper.getUserToken(context));
        call.enqueue(wishListResponseCallBack);
    }

    public void requestAddNewWishList(Context context, String name, Product product) {
        Call<AddWishListResponse> call = mAPIServiceWastons.addNewWishList(MemberHelper.getUserToken(context), name);
        AddNewWishListResponseCallBack addNewWishListResponseCallBack = new AddNewWishListResponseCallBack();
        addNewWishListResponseCallBack.setProduct(product);
        call.enqueue(addNewWishListResponseCallBack);
    }

    // 3.6
    public void requestAddProductWithNewWishList(Context context, Product product, String name) {
        AddWishListResponseCallBack addWishListResponseCallBack = new AddWishListResponseCallBack();
        addWishListResponseCallBack.setProduct(product);
        Call<AddWishListResponse> call = mAPIServiceWastons.addProductWithNewWishList(MemberHelper.getUserToken(context), product.getCode(), name);
        call.enqueue(addWishListResponseCallBack);
    }


    public void requestAddProductToWishList(Context context, int quantity, Product product, String pk) {
        Call<AddWishListResponse> call = mAPIServiceWastons.addProductToWishList(MemberHelper.getUserToken(context), quantity, product.getCode(), pk);
        call.enqueue(new AddProductToWishListResponseCallBack());
    }

    // 3.7
    public void requestRemoveProductFromWishList(Context context, String pk, int quantity,  String code) {
        Call<UpdateWishListResponse> call = mAPIServiceWastons.removeProductFromWishList(MemberHelper.getUserToken(context), pk, quantity, code);
        call.enqueue(new RemoveProductFromWishListResponseCallBack());
    }

    // 3.8
    public void requestUpdateWishList(Context context, String id, int quantity, String code) {
        Call<UpdateWishListResponse> call = mAPIServiceWastons.updateWishList(MemberHelper.getUserToken(context), id, quantity, code);
        call.enqueue(new UpdateWishListResponseCallBack());
    }

    // 3.9
    public void requestRemoveWishList(Context context, String id) {
        Call<UpdateWishListResponse> call = mAPIServiceWastons.removeWishList(MemberHelper.getUserToken(context), id);
        call.enqueue(new RemoveWishListResponseCallBack());
    }

    public void requestGetBarcodeScan(Context context, String code) {
        Call<BarcodeScanResponse> call = mAPIServiceWastons.getBarcodeScan(code);
        call.enqueue(new BarcodeScanResponseCallback());
    }

    //Checkout region
    public void requestRegions() {
        Call<RegionsResponse> call = mAPIServiceWastons.getRegionsResponse();
        call.enqueue(new RegionListsCallBack());
    }

    public void requestGetProductsByCat(Context context, String type, String query, int page, int successCode) {
        Call<TextSearchResponse> call = mAPIServiceWastons.getProductsByCat(type, query, page);
        call.enqueue(new GetProductsByCatResponseCallBack(successCode));
    }


    public void requestProductList(String serverQuery,  String currentPage, int sucessCode, String typeOfOnSale, String sortingQuery) {
        //Call<TextSearchResponse> call = mAPIServiceWastons.getProducts(serverQuery);
        //call.enqueue(new GetProductsByTextSearchResponseCallBack(sucessCode, typeOfOnSale));
        // /rest/v1/hybris/products/010200?type=cat"
        if(serverQuery == null) return;
        String serverQuery_ = serverQuery.replace("/products/" , "");
        int index = serverQuery_.indexOf("?");
        String categoryId = index >= 0 ? serverQuery_.substring(0, serverQuery_.indexOf("?")) : serverQuery_;

        String query = serverQuery.substring(serverQuery.indexOf("?") + 1);

        //Log.i("query " , "query " + query);

        String[] array = query.split("&");

        Map<String,String> map = new HashMap<>();
        for(int i = 0; i < array.length; i++) {
            String[] keyParam = array[i].split("=");
            
            if(keyParam.length <= 1)
                continue;

            map.put(keyParam[0], keyParam[1]);
        }

        if(!TextUtils.isEmpty(sortingQuery))
            map.put("query", sortingQuery);

        map.put("currentPage", currentPage);

        if(map.get("type") == null)
            map.put("type", "Cat");

        Call<TextSearchResponse> call = mAPIServiceWastons.getProducts(categoryId, map);
        call.enqueue(new GetProductsByTextSearchResponseCallBack(sucessCode, typeOfOnSale));
    }

    public void requestProductListByTag(String productTag, String query, int page, int hashCode, String typeOfOnSale) {
        Call<TextSearchResponse> call = mAPIServiceWastons.getProductsByTag(productTag, query, page);
        call.enqueue(new GetProductsByTextSearchResponseCallBack(hashCode, typeOfOnSale));
    }

    public void requestProductList(String categoryId, String currentPage, String query, String type, int sucessCode, String typeOfOnSale) {

        Map<String,String> map = new HashMap<>();
        if(!TextUtils.isEmpty(currentPage))
            map.put("currentPage", currentPage);
        if(!TextUtils.isEmpty(query))
            map.put("query", query);
        if(!TextUtils.isEmpty(type))
            map.put("type", type);

        Call<TextSearchResponse> call = mAPIServiceWastons.getProducts(categoryId, map);
        call.enqueue(new GetProductsByTextSearchResponseCallBack(sucessCode, typeOfOnSale));
    }

    public void requestGetBrandList(Context context) {
        Call<BrandListResponse> call = mAPIServiceWastons.getBrandList();
        call.enqueue(new BrandListResponseCallBack());
    }

    public void requestRegionsDistrictslist() {
        Call<RegionDistrictResponse> call = mAPIServiceWastons.getRegionsDistrictsResponse();
        call.enqueue(new RegionDistrictCallBack());
    }

    public void requestDistricts() {
        Call<DistrictsResponse> call = mAPIServiceWastons.getDistrictsResponse();
        call.enqueue(new DistrictListsCallBack());
    }

    public void requestTimeslot() {
        Call<List<Timeslot>> call = mAPIServiceWastons.getTimeslot();
        call.enqueue(new TimeslotCallBack());
    }

    public void requestGetCustomerAddresses(Context context) {
        Call<MemberProfile> call = mAPIServiceWastons.getCustomerAddresses(MemberHelper.getUserToken(context));
        call.enqueue(new GetCustomerAddressesResponseCallBack());
    }

    public void requestGetAdvertisementList(Context context) {
        Call<Advertisement> call = mAPIServicePNS.getAdvertisementList();
        call.enqueue(new GetAdvertisementListCallBack("ad"));
    }

    public void requestGetAdvertisementListHome(Context context) {
        Call<Advertisement> call = mAPIServicePNS.getAdvertisementListHome();
        call.enqueue(new GetAdvertisementListCallBack("home"));
    }

    public void requestGetGroceryList(Context context) {
        Call<GroceryList> call = mAPIServicePNS.getGroceryList();
        call.enqueue(new GetGroceryListCallBack());
    }

    public void getAddressBook(Context context) {
        Call<AddressesResponse> call = mAPIServiceWastons.getAddressBook(MemberHelper.getUserToken(context));
        call.enqueue(new AddressesCallBack());
    }

    public void requestAddAddress(AddressData data, Context context) {
        Call<AddressData.AddressForm> call = mAPIServiceWastons.addCustomerAddresses(MemberHelper.getUserToken(context), data);
        call.enqueue(new RequestAddAdressCallBack());
    }

    public void saveDeliveryAddress(AddressData data, Context context, int hashCode) {
        Call<CartResponse> call = mAPIServiceWastons.saveDeliveryAddress(MemberHelper.getUserToken(context), data);
        call.enqueue(new CartCallBack(context, "saveDeliveryAddressViaAddressData", hashCode));
    }


    public void saveDeliveryAddress(String id, Context context) {
        Call<CartResponse> call = mAPIServiceWastons.saveDeliveryAddress(MemberHelper.getUserToken(context), id);
        call.enqueue(new CartCallBack(context, "saveDeliveryAddress"));
    }


    public void saveDeliveryAddress(String id, Context context, int hashCode) {
        Call<CartResponse> call = mAPIServiceWastons.saveDeliveryAddress(MemberHelper.getUserToken(context), id);
        call.enqueue(new CartCallBack(context, "saveDeliveryAddress", hashCode));
    }

    /*
    @POST("cart/address/delivery/{id}")
    Call<CartResponse> saveDeliveryAddress(@Header("X-token") String xToken, @Path("id") String id);
*/
//    public void saveDeliveryAddress(Context context, AddressData data) {
//        Call<EmptyJson> call = mAPIServiceWastons.saveDeliveryAddress(MemberHelper.getUserToken(context), data);
//        call.enqueue(new EmptyJsonCallBack("saveDeliveryAddress"));
//    }

    public void setUpdateAddress(Context context, String id, AddressData data) {
        Call<AddressData> call = mAPIServiceWastons.updateAddress(MemberHelper.getUserToken(context), id, data);
        call.enqueue(new UpdateAddressCallBack());
    }

    public void setDefaultDeliveryAddress(Context context, String id) {
        Call<EmptyJson> call = mAPIServiceWastons.setDefaultDeliveryAddress(MemberHelper.getUserToken(context), id);
        call.enqueue(new EmptyJsonCallBack("setDefaultDeliveryAddress"));
    }

    public void setDefaultDeliveryAddress(Context context, String id, int hashCode) {
        Call<EmptyJson> call = mAPIServiceWastons.setDefaultDeliveryAddress(MemberHelper.getUserToken(context), id);
        call.enqueue(new EmptyJsonCallBack("setDefaultDeliveryAddress", hashCode));
    }

    public void setDeleteAddress(Context context, String id) {
        Call<EmptyJson> call = mAPIServiceWastons.deleteAddress(MemberHelper.getUserToken(context), id);
        call.enqueue(new EmptyJsonCallBack("setDeleteAddress"));
    }


    public void saveDeliveryMode(String deliveryMode) {
        Call<EmptyJson> call = mAPIServiceWastons.saveDeliveryMode(deliveryMode);
        call.enqueue(new EmptyJsonCallBack("saveDeliveryMode"));
    }

    public static String SAVE_DELIVERY_SCHEDULE_ID = "saveDeliveryScheduleId";
    public void saveDeliveryScheduleId(String deliveryId) {
        Call<EmptyJson> call = mAPIServiceWastons.saveDeliveryScheduleId(deliveryId);
        call.enqueue(new EmptyJsonCallBack(SAVE_DELIVERY_SCHEDULE_ID));
    }

    public void saveDeliveryScheduleId(String deliveryId, int hashCode) {
        Call<EmptyJson> call = mAPIServiceWastons.saveDeliveryScheduleId(deliveryId);
        call.enqueue(new EmptyJsonCallBack(SAVE_DELIVERY_SCHEDULE_ID, hashCode));
    }

    public void setSelfPickUpStore(String selfPickUpStore, Context context) {
        Call<CartResponse> call = mAPIServiceWastons.setSelfPickUpStore(MemberHelper.getUserToken(context), selfPickUpStore);
        call.enqueue(new CartCallBack(context, "cart"));
    }

    public void getEcouponAndEVouchers(Context context) {
        Call<ECouponResponse> call = mAPIServiceWastons.getEcouponAndEVouchers((MemberHelper.getUserToken(context)));
        call.enqueue(new ECouponCallBack());
    }


    public void setECoupon(Context context, String couponCode) {
        Call<EmptyJson> call = mAPIServiceWastons.setECoupon((MemberHelper.getUserToken(context)), couponCode);
        call.enqueue(new EmptyJsonCallBack("setEcoupon", couponCode));
    }

    //Multiple callings will lead to cancel ecoupon/ evoucher
    public void setEVoucher(Context context, String voucherCode) {
        Call<EmptyJson> call = mAPIServiceWastons.setVoucher((MemberHelper.getUserToken(context)), voucherCode);
        call.enqueue(new EmptyJsonCallBack("setEvoucher", voucherCode));
    }

    public void postUpdateProfile(Context context, CheckoutYourDetailFragment.UpdateForm updateForm) {
        Call<EmptyJson> call = mAPIServiceWastons.getUpdateProfile(MemberHelper.getUserToken(context), updateForm);
        call.enqueue(new EmptyJsonCallBack("updateProfile"));
    }

    public void requestUpdateProfile(Context context, UpdateProfile updateProfile) {
        Call<MemberProfile> call = mAPIServiceWastons.getUpdateProfile(MemberHelper.getUserToken(context), updateProfile);
        call.enqueue(new UpdateProfileCallBack());
    }

    public void requestChangePwd(Context context, String oldPwd, String newPwd) {
        Call<ChangePwdResponse> call = mAPIServiceWastons.changePwd(MemberHelper.getUserToken(context), oldPwd, newPwd);
        call.enqueue(new ChangePwdCallBack());
    }

    public void requestOnlineRecords(Context context) {
        Call<OnlineRecords> call = mAPIServiceWastons.getOnlineRecords(MemberHelper.getUserToken(context), "300");
        call.enqueue(new RequestOnlineRecordsCallBack());
    }

    public void requestGetOnlineRecordsDetail(Context context, String id) {
        Call<OnlineRecordDetail> call = mAPIServiceWastons.getOnlineRecordsDetail(MemberHelper.getUserToken(context), id);
        call.enqueue(new RequestOnlineRecordDetailCallBack());
    }

    public void requestActivateCard(ActivateCardRequest activateCardRequest) {
        Call<MemberProfile> call = mAPIServiceWastons.activateCard(activateCardRequest);
        call.enqueue(new ActivateCardCallBack());
    }

    public void requestGetMoneyBackProfile(Context context) {
        String token;
        if(!TextUtils.isEmpty(MemberHelper.getUserToken(context))){
            token = MemberHelper.getUserToken(context);
        }else{
            token = GlobalConstant.moneybackCardToken;
        }
        Call<MemberProfile> call = mAPIServiceWastons.getMoneyBackProfile(token);
        call.enqueue(new GetMoneyBackCardProfileCallBack());
    }

    public void requestGetPromotionList(Context context) {
        Call<PromotionCategoryResponse> call = mAPIServicePNS.getPromotionList();
        call.enqueue(new PromotionListCallBack());
    }

    public void requestGetPromotionListItem(Context context, String id, String type) {
        //getPromotionItem
        Call<PromotionItemResponse> call = mAPIServicePNS.getPromotionItem(id, type);
        call.enqueue(new PromotionItemCallBack());
    }

    public void requestGetPromotion(Context context, String id, String type, int successCode) {
        Call<PromotionResponse> call = mAPIServicePNS.getPromotion(id, type);
        PromotionCallBack promotionCallBack = new PromotionCallBack();
        promotionCallBack.successCode = successCode;
        call.enqueue(promotionCallBack);
    }

    public void requestGetPromotion(Context context, String id, String type, String requestedId, CategoryDrawerItem categoryDrawerItem, int successCode) {
        Call<PromotionResponse> call = mAPIServicePNS.getPromotion(id, type);
        call.enqueue(new PromotionCallBack(requestedId, categoryDrawerItem, successCode));
    }

    public void requestGetRedemptionList(Context context) {
        Call<RedemptionResponse> call = mAPIServicePNS.getRedemptionList();
        call.enqueue(new RedemptionListCallBack());
    }

    public void requestGetCouponList(Context context) {
        Call<CouponResponse> call = mAPIServicePNS.getCouponList();
        call.enqueue(new CouponListCallBack());
    }

    public void requestGetRedemptionItem(Context context, String id) {
        Call<RedemptionItemResponse> call = mAPIServicePNS.getRedemption(id);
        call.enqueue(new RedemptionItemCallBack());
    }

    public void requestGetCustomizeProducts(String id, int page, int successCode) {
        Call<CustomizeProductResponse> call = mAPIServicePNS.getCustomizeProducts(id);
        call.enqueue(new CustomizeProductCallBack(successCode, page));
    }

    public void requestGetStoreList() {
        Call<StoreListResponse> call = mAPIServiceWastons.getStoreList();
        call.enqueue(new StoreListCallBack());
    }

    public void requestUploadImage(Map<String, RequestBody> map) {
        Call<UploadImageResponse> call = mAPIMediaServicePNS.uploadImage(map);
        call.enqueue(new UploadImageCallBack());
    }

    public void requestAddProfilePic(AddProfilePicForm addProfilePicForm) {
        Call<AddProfilePicResponse> call = mAPIServicePNS.addProfilePic(addProfilePicForm);
        call.enqueue(new AddProfilePicResponseCallBack());
    }

    public void requestGetUserProfilePic(String id) {
        Call<GetUserProfilePicResponse> call = mAPIServicePNS.getUserProfilePic(id);
        call.enqueue(new GetUserProfilePicResponseCallBack());
    }

    public void requestGetContact() {
        Call<ContactResponse> call = mAPIServicePNS.getContact();
        call.enqueue(new ContactResponseCallBack());
    }

    public void requestGetGeneralFAQ() {
        Call<FAQResponse> call = mAPIServicePNS.getGeneralFAQ();
        call.enqueue(new FAQResponseCallBack(0));
    }

    public void requestGetSATFAQ() {
        Call<FAQResponse> call = mAPIServicePNS.getSATFAQ();
        call.enqueue(new FAQResponseCallBack(1));
    }

    public void requestGetTNC() {
        Call<TNCResponse> call = mAPIServicePNS.getTNC();
        call.enqueue(new TNCResponseCallBack());
    }

    //recipe/cat
    public void requestRecipeCatList() {
        Call<RecipeListResponse> call = mAPIServicePNS.getRecipeCatList();
        call.enqueue(new RecipeListResponseCallBack());
    }

    //recipe/cat/{id}
    public void requestRecipeListByCat(String id) {
        Call<RecipeDetailResponse> call = mAPIServicePNS.getRecipeListByCat(id);
        call.enqueue(new RecipeDetailListCallBack(id));
    }

    //recipe/1
    public void requestRecipeItemDetail(String id) {
        Call<RecipeDetailItemResponse> call = mAPIServicePNS.getRecipeItemDetail(id);
        call.enqueue(new RecipeDetailItemCallBack());
    }

    public void requestGetRecipeShareHtmlContent(String id) {
        Call<String> call = mAPIServicePNS.getRecipeAppShareUrl(id);
        call.enqueue(new RecipeAppShareUrlCallBack());
    }

    //recipe/dishType
    public void requestRecipeListSortType() {
        Call<DishTypeResponse> call = mAPIServicePNS.getRecipeListSortType();
        call.enqueue(new RecipeListSortTypeCallBack());
    }

    //recipe/suggest/
    public void requestRecipeDetailSuggestion(String id) {
        Call<RecipeDetailResponse> call = mAPIServicePNS.getRecipeDetailSuggestedType(id);
        call.enqueue(new RecipeSuggestionCallBack());
    }

    public void requestRelatedProductsById(String id, int hashCode) {
        Call<RelatedProductsResponse> call = mAPIServiceWastons.getRelatedProducts(id);
        call.enqueue(new RelatedProductsCallBack(hashCode));
    }

    public void requestRegisterPush(String registrationId) {
        Call<EmptyJson> call = mAPINotifyAPIService.registerPush(registrationId, "aos", GlobalConstant.language);
        call.enqueue(new EmptyJsonCallBack("registerPush"));
    }

    public void requestBindUser(String uid, String registrationId) {
        Call<EmptyJson> call = mAPINotifyAPIService.bindUser(uid, registrationId);
        call.enqueue(new EmptyJsonCallBack("bindUser"));
    }

    public void requestGetInboxMsg(String refId) {
        Call<InboxResponse> call = mAPINotifyAPIService.getInboxMsg(TokenHelper.getTokenHeader(), TokenHelper.getToken(), refId);
        call.enqueue(new InboxResponseCallBack());
    }

    public void requestDeleteMsg(String msgId) {
        Call<BaseStatus> call = mAPINotifyAPIService.deleteMsg(TokenHelper.getTokenHeader(), TokenHelper.getToken(), msgId);
        call.enqueue(new DeleteMsgCallBack());
    }

    public void requestReadMsgMsg(String msgId) {
        Call<BaseStatus> call = mAPINotifyAPIService.readMsg(TokenHelper.getTokenHeader(), TokenHelper.getToken(), msgId);
        call.enqueue(new ReadMsgCallBack());
    }

    public void requestGetForceUpdate() {
        Call<ForceUpdateResponse> call = mAPIServicePNS.getForceUpdate("android");
        call.enqueue(new ForceUpdateResponseCallBack());
    }

    public void requestPostSpecialRemark(Context context, SpecialRemark specialRemark ) {
        Call<CartResponse> call = mAPIServiceWastons.setSpecialRemark(MemberHelper.getUserToken(context), specialRemark);
        call.enqueue(new CartCallBack(context, "special_remark"));
    }

//    public void requestGetMultipleProducts(String multipleIds) {
//        Call<List<Product>> call = mAPIServiceWastons.getProductsByMultipleId(multipleIds);
//        call.enqueue(new MultipleProductsCallBack());
//    }
    public void requestGetMultipleProducts(Context context, String type, String query, int page) {
        Call<TextSearchResponse> call = mAPIServiceWastons.getProductsByMultipleId(type, query, page);
        call.enqueue(new MultipleProductsCallBack());
    }

    //@GET("products/newPromotion")
    //Call<NewPromotionResponse> getNewPromotion();
    public void requestGetNewPromotion() {
        Call<ArrayList<NewPromotionResponse.PromotionResponseItem>> call = mAPIServiceWastons.getNewPromotion();
        call.enqueue(new NewPromotionCallback());
    }
    
    public void requestGetProductRating(Context context, String orderCode, ProductRatingRequest productRatingRequest) {
        Call<EmptyJson> call = mAPIServiceWastons.getProductRating(MemberHelper.getUserToken(context), orderCode, productRatingRequest);
        call.enqueue(new EmptyJsonCallBack("productRating"));
    }

    public void requestGetmergeCart(Context context) {
        Call<EmptyJson> call = mAPIServiceWastons.mergeCart(MemberHelper.getUserToken(context));
        call.enqueue(new EmptyJsonCallBack("mergeCart"));
    }

    public void requestGetStockByProductId(String productId, int successCode) {
        Call<StoreLocatorResponse> call = mAPIServicePNS.getStockByProductId(productId);
        call.enqueue(new StoreLocatorResponseCallback(successCode, productId));
    }
}
