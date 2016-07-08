package parknshop.parknshopapp.Rest;

import parknshop.parknshopapp.Model.BaseStatus;
import parknshop.parknshopapp.Model.EmptyJson;
import parknshop.parknshopapp.Model.InboxResponse;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by kwongyuenpan on 14/3/16.
 */
public interface NotifyAPIService {

    String header = "Content-Type: application/json";
    String userAgent = "platform: aos";

//    @Headers({
//            header,
//            userAgent,
//    })
    @FormUrlEncoded
    @POST("register/ParknShop2016/{regId}")
    Call<EmptyJson> registerPush(@Path("regId") String regId, @Field("platform") String platform, @Field("languageCode") String lang);

//    @POST("register/ParknShop2016/{regId}")
//    Call<EmptyJson> registerPush(@Header("languageCode") String lang, @Path("regId") String regId);

    @POST("bind/ParknShop2016/{uid}")
    Call<EmptyJson> bindUser(@Path("uid") String uid, @Query("refId") String refId);

    @GET("message/ParknShop2016/{id}")
    Call<InboxResponse> getInboxMsg(@Header("platform") String platform, @Path("id") String id, @Query("refId") String refId);

    @DELETE("message/delete")
    Call<BaseStatus> deleteMsg(@Header("platform") String platform, @Query("token") String id, @Query("messageId") String messageId);

    @POST("message/read")
    Call<BaseStatus> readMsg(@Header("platform") String platform, @Query("token") String id, @Query("messageId") String messageId);

}
