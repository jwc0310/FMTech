package parknshop.parknshopapp.Rest.callback;

/**
 * Created by kwongyuenpan on 14/3/16.
 */

import parknshop.parknshopapp.Model.BrandListResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.BrandListResponseEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BrandListResponseCallBack implements Callback<BrandListResponse> {

    BrandListResponseEvent brandListResponseEvent = new BrandListResponseEvent();

    @Override
    public void onResponse(Call<BrandListResponse> call, Response<BrandListResponse> response) {
        if(response != null && response.isSuccess()){
            BrandListResponse brandListResponse = response.body();
            if (brandListResponse != null) {
                for(int i = 0; i < brandListResponse.getBrandList().size(); i++){
                    for(int j = 0; j <  brandListResponse.getBrandList().get(i).getBrands().size(); j++){
                        brandListResponse.getBrandList().get(i).getBrands().get(j).setPrefix(brandListResponse.getBrandList().get(i).getPrefix());
                    }
                }
                brandListResponseEvent.setBrandListResponse(brandListResponse);
                brandListResponseEvent.setSuccess(true);
            }
        }else{
            brandListResponseEvent.setMessage(response.message());
        }
        MyApplication.getInstance().mBus.post(brandListResponseEvent);

    }

    @Override
    public void onFailure(Call<BrandListResponse> call, Throwable t) {
        brandListResponseEvent.setMessage(t.getMessage());
        MyApplication.getInstance().mBus.post(brandListResponseEvent);
    }
}
