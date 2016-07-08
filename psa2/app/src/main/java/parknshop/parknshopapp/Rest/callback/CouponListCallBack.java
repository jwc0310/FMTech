package parknshop.parknshopapp.Rest.callback;

import parknshop.parknshopapp.Model.CouponResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.CouponListEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by hp on 22/4/2016.
 */
public class CouponListCallBack implements Callback<CouponResponse> {
    CouponListEvent couponListEvent = new CouponListEvent();

    @Override
    public void onResponse(Call<CouponResponse> call, Response<CouponResponse> response) {
        CouponResponse couponResponse = response.body();
        if (response.body() != null){
            if(couponResponse.getStatus().getCode() == 200){
                couponListEvent.setSuccess(true);
                couponListEvent.setCouponResponse(couponResponse);
            }else{
                couponListEvent.setMessage(couponResponse.getStatus().getMessage());
            }
        }
        MyApplication.getInstance().mBus.post(couponListEvent);
    }

    @Override
    public void onFailure(Call<CouponResponse> call, Throwable t) {
        couponListEvent.setMessage(t.toString());
        MyApplication.getInstance().mBus.post(couponListEvent);
    }
}
