package parknshop.parknshopapp.Fragment.Category;

import android.util.Log;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Response;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.Base.HttpController.CustomCallBack;

/**
 * Created by chrisyu on 17/3/16.
 */
public class HttpShopingCartCallBack extends CustomCallBack {
    public HttpShopingCartCallBack(Class typeParameterClass, BaseFragment baseFragment) {
        super(typeParameterClass, baseFragment);
    }


    @Override
    public void onFailure(Call call, IOException e) {
        super.onFailure(call, e);
        //Log.i("CustomCallBack fail", "CustomCallBack fail" + e.getMessage() + " ");
        CustomCallBack.httpRequestOnGoing = false;
        hideLoadingView();
    }

    @Override
    public void onResponse(Call call, Response response) throws IOException {
        super.onResponse(call, response);
    }
}
