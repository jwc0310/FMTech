package parknshop.parknshopapp.Rest;

import java.util.Map;

import okhttp3.RequestBody;
import parknshop.parknshopapp.Model.Advertisement;
import parknshop.parknshopapp.Model.UploadImageResponse;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PartMap;
import retrofit2.http.Path;

/**
 * Created by kwongyuenpan on 14/3/16.
 */
public interface PNSMediaAPIService {
//    String header = "Content-Type: application/json";
//    String userAgent = "User-Agent: Android";
//    String acceptLanguage = "Accept-Language: zt";
//
//    @Headers({
//            header,
//            userAgent,
//            acceptLanguage
//    })

    @Multipart
    @POST("upload/ParknShop2016/appUser")
    Call<UploadImageResponse> uploadImage(@PartMap Map<String, RequestBody> map);

    @DELETE("delete/{id}")
    Call<Advertisement> deleteImage(@Path("id") String id);

    @GET("resource/{id}")
    Call<Advertisement> getResource(@Path("id") String id);

}
