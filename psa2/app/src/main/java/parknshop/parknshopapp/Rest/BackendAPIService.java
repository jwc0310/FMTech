package parknshop.parknshopapp.Rest;

import com.google.gson.JsonElement;

import java.util.List;
import java.util.Map;

import parknshop.parknshopapp.Model.BackendResponse;
import parknshop.parknshopapp.Model.BrandInfoListResponse;
import parknshop.parknshopapp.Model.CouponDetailBody;
import parknshop.parknshopapp.Model.CouponDetailResponse;
import parknshop.parknshopapp.Model.CouponObtainBody;
import parknshop.parknshopapp.Model.CouponObtainResponse;
import parknshop.parknshopapp.Model.CouponSearchBody;
import parknshop.parknshopapp.Model.CouponSearchResponse;
import parknshop.parknshopapp.Model.DeviceAuthorizeInfoResponse;
import parknshop.parknshopapp.Model.EdmDetailBody;
import parknshop.parknshopapp.Model.EdmDetailResponse;
import parknshop.parknshopapp.Model.EdmSearchBody;
import parknshop.parknshopapp.Model.EdmSearchResponse;
import parknshop.parknshopapp.Model.EmptyJson;
import parknshop.parknshopapp.Model.GroupBuyResponse;
import parknshop.parknshopapp.Model.GroupbuyReportOrderBody;
import parknshop.parknshopapp.Model.LastMinuteReportOrderBody;
import parknshop.parknshopapp.Model.LastMinuteResponse;
import parknshop.parknshopapp.Model.LuckyDrawInfo;
import parknshop.parknshopapp.Model.LuckyDrawInfoResponse;
import parknshop.parknshopapp.Model.NewsInfoListResponse;
import parknshop.parknshopapp.Model.PushHistoryResponse;
import parknshop.parknshopapp.Model.PushMemberHistoryBody;
import parknshop.parknshopapp.Model.PushPublicHistoryBody;
import parknshop.parknshopapp.Model.ReportOrderResponse;
import parknshop.parknshopapp.Model.SearchData;
import parknshop.parknshopapp.Model.SearchGroupBuyBody;
import parknshop.parknshopapp.Model.SearchLastMinuteBody;
import parknshop.parknshopapp.Model.SideMenuCoupon;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by kwongyuenpan on 14/3/16.
 */
public interface BackendAPIService {
    String Header = "Content-Type: application/json";

//    String path = "watsons/api_1/";
    String path = "";

    @Headers(Header)
    @POST(path + "config")
    Call<JsonElement> getBackendConfig();

    @Headers(Header)
    @POST(path + "news/search")
    Call<NewsInfoListResponse> getNewsSearch(@Body SearchData searchData);

    @Headers(Header)
    @POST(path + "news/detail")
    Call<NewsInfoListResponse> getNewsDetail(@Body Map<String, Integer> id);

    @Headers(Header)
    @POST(path + "news/report")
    Call<BackendResponse> getNewsReport(@Body Map<String, List<Integer>> ids);

    @Headers(Header)
    @POST(path + "event/lucky_draw/detail")
    Call<LuckyDrawInfoResponse> getEventLuckyDrawDetail(@Body Map<String, Integer> id);

    @Headers(Header)
    @POST(path + "event/lucky_draw/send")
    Call<BackendResponse> getEventLuckyDrawSend(@Body Map<String, LuckyDrawInfo> luckyDrawInfo);

    @Headers(Header)
    @POST(path + "event/lucky_draw/report")
    Call<BackendResponse> getEventLuckyDrawReport(@Body Map<String, List<Integer>> ids);

    @Headers(Header)
    @POST(path + "brand/search")
    Call<BrandInfoListResponse> getBrandSearch(@Body Map<String, Integer> category_id);

    @Headers(Header)
    @POST(path + "device/authorize/add")
    Call<DeviceAuthorizeInfoResponse> getAuthorizeAdd(@Body Map<String, String> map);

    @Headers(Header)
    @POST(path + "device/authorize/delete")
    Call<DeviceAuthorizeInfoResponse> getAuthorizeDelete(@Body Map<String, Object> map);

    @Headers(Header)
    @POST(path + "device/authorize/query")
    Call<DeviceAuthorizeInfoResponse> getAuthorizeQuery(@Body Map<String, String> map);

    @Headers(Header)
    @POST(path + "store")
    Call<SideMenuCoupon> getSideMenuCoupon(@Body EmptyJson emptyJson);

    @Headers(Header)
    @POST(path + "event/groupbuy/search")
    Call<GroupBuyResponse> getSearchGroupBuy(@Body SearchGroupBuyBody body);

    @Headers(Header)
    @POST(path + "event/lastminute/search")
    Call<LastMinuteResponse> getSearchLastMinute(@Body SearchLastMinuteBody body);

    @Headers(Header)
    @POST(path + "event/groupbuy/report_order")
    Call<ReportOrderResponse> getGroupbuyReportOrder(@Body GroupbuyReportOrderBody body);

    @Headers(Header)
    @POST(path + "event/lastminute/report_order")
    Call<ReportOrderResponse> getLastMinuteReportOrder(@Body LastMinuteReportOrderBody body);

    @Headers(Header)
    @POST(path + "coupon/search")
    Call<CouponSearchResponse> getCouponSearchResponse(@Body CouponSearchBody body);

    @Headers(Header)
    @POST(path + "coupon/obtain")
    Call<CouponObtainResponse> getCouponObtainResponse(@Body CouponObtainBody body);

    @Headers(Header)
    @POST(path + "coupon/detail")
    Call<CouponDetailResponse> getCouponDetailResponse(@Body CouponDetailBody body);

    @Headers(Header)
    @POST(path + "edm/search")
    Call<EdmSearchResponse> getEdmSearchResponse(@Body EdmSearchBody body);

    @Headers(Header)
    @POST(path + "edm/detail")
    Call<EdmDetailResponse> getEdmDetailResponse(@Body EdmDetailBody body);

    @Headers(Header)
    @POST(path + "push/history")
    Call<PushHistoryResponse> pushMemberHistoryResponse(@Body PushMemberHistoryBody body);

    @Headers(Header)
    @POST(path + "push/public_history")
    Call<PushHistoryResponse> getPushPublicHistoryResponse(@Body PushPublicHistoryBody body);

}
