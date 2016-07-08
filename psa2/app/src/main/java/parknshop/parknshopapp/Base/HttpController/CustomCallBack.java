package parknshop.parknshopapp.Base.HttpController;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.View;

import java.io.IOException;
import java.lang.reflect.Type;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import parknshop.parknshopapp.Base.BaseActivity;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.Base.Json.Parser;


/**
 * Created by chrisyu on 15/12/10.
 */
public class CustomCallBack<T> implements Callback {
    public static boolean httpRequestOnGoing;
    private Context context;
    private CustomRunnable runnable;
    Class<T> typeParameterClass;
    Type arraylistType;
    Parser parser;

    public BaseActivity baseActivity;
    public BaseFragment baseFragment;
    public T data;

    public CustomCallBack(Class<T> typeParameterClass, BaseFragment baseFragment) {
        this.context = baseFragment.getActivity();
        this.typeParameterClass = typeParameterClass;
        parser = new Parser<T>(typeParameterClass);
        baseActivity = (BaseActivity)context;
        this.baseFragment = baseFragment;
    }

    public CustomCallBack(Class<T> typeParameterClass, BaseFragment baseFragment, boolean showloadingView) {
        this.context = baseFragment.getActivity();
        this.typeParameterClass = typeParameterClass;
        parser = new Parser<T>(typeParameterClass);
        baseActivity = (BaseActivity)context;
        this.baseFragment = baseFragment;
        showLoadingView();
    }

    public CustomCallBack(Class<T> typeParameterClass, CustomRunnable runnable, Context context) {
        this.context = context;
        this.runnable = runnable;
        this.typeParameterClass = typeParameterClass;
        parser = new Parser<T>(typeParameterClass);

        baseActivity = (BaseActivity)context;
    }

    public CustomCallBack(Type arraylistType, CustomRunnable runnable, Context context) {
        this.context = context;
        this.runnable = runnable;
        this.arraylistType = arraylistType;
        parser = new Parser<T>(arraylistType);
        baseActivity = (BaseActivity)context;

        baseActivity = (BaseActivity)context;
    }

    public CustomCallBack(Class<T> typeParameterClass, CustomRunnable runnable, Context context, boolean showloadingView) {
        this.context = context;
        this.runnable = runnable;
        this.typeParameterClass = typeParameterClass;
        parser = new Parser<T>(typeParameterClass);

        baseActivity = (BaseActivity)context;
        showLoadingView();
    }

    public CustomCallBack(Type arraylistType, CustomRunnable runnable, Context context, boolean showloadingView) {
        this.context = context;
        this.runnable = runnable;
        this.arraylistType = arraylistType;
        parser = new Parser<T>(arraylistType);
        baseActivity = (BaseActivity)context;

        baseActivity = (BaseActivity)context;
        showLoadingView();
    }


    public CustomCallBack(Class<T> typeParameterClass, CustomRunnable runnable, CustomRunnable failrunnable, Context context, boolean showloadingView) {
        //TODO
    }

    public void showLoadingView() {
        ((Activity)context).runOnUiThread(new Runnable() {
            @Override
            public void run() {
                baseActivity.loadingView.setVisibility(View.VISIBLE);
            }
        });
    }

    public void hideLoadingView() {
        ((Activity)context).runOnUiThread(new Runnable() {
            @Override
            public void run() {
                baseActivity.loadingView.setVisibility(View.GONE);
            }
        });
    }
    public void runOnUiThread() {
        ((Activity)context).runOnUiThread(runnable);
    }

    @Override
    public void onFailure(Call call, IOException e) {
        Log.i("CustomCallBack fail", "CustomCallBack fail" + e.getMessage() + " ");
        CustomCallBack.httpRequestOnGoing = false;
        hideLoadingView();
    }

    @Override
    public void onResponse(Call call, Response response) throws IOException {
        String dataString = response.body().string();
        Log.i("CustomCallBack success", " CustomCallBack success" + response.request().url().url().toString());

        Log.i("CustomCallBack success", " CustomCallBack success" + dataString);
        runnable.dataString = dataString;
        runnable.url = response.request().url().toString();
        runnable.data = parser.getObject(dataString);

        runOnUiThread();

        CustomCallBack.httpRequestOnGoing = false;
        hideLoadingView();
    }
}
