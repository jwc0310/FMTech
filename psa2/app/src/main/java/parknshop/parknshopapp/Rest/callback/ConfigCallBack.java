package parknshop.parknshopapp.Rest.callback;


import parknshop.parknshopapp.Model.Config;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.ConfigEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by chrisyu on 9/5/16.
 */
public class ConfigCallBack implements Callback<Config> {
    ConfigEvent event = new ConfigEvent();

    @Override
    public void onResponse(Call<Config> call, Response<Config> response) {

        if(response != null && response.isSuccess()){
            //CategoryTree categoryTree = new Gson().fromJson(response.body(), CategoryTree.class);
            Config config = response.body();
            if (config != null) {
                event.setConfig(config);
                event.setSuccess(true);
            }
        }else{
            event.setMessage(response.message());
        }
        MyApplication.getInstance().mBus.post(event);
    }

    @Override
    public void onFailure(Call<Config> call, Throwable t) {
        event.setMessage(t.getMessage());
        MyApplication.getInstance().mBus.post(event);
    }
}
