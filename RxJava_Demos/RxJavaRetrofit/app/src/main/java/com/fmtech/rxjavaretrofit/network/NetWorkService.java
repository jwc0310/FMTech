package com.fmtech.rxjavaretrofit.network;

import com.fmtech.rxjavaretrofit.network.api.FakeApi;
import com.fmtech.rxjavaretrofit.network.api.GankApi;
import com.fmtech.rxjavaretrofit.network.api.ZbApi;

import okhttp3.OkHttpClient;
import retrofit2.CallAdapter;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * ==================================================================
 * Copyright (C) 2016 FMTech All Rights Reserved.
 *
 * @author Drew.Chiang
 * @version v1.0.0
 * @email chiangchuna@gmail.com
 * @create_date 2016/7/3 21:01
 * @description ${todo}
 * <p/>
 * ==================================================================
 */

public class NetWorkService {

    private static final String BASE_URL_ZBAPI = "http://zhuangbi.info/";
    private static final String BASE_URL_GANKAPI = "http://gank.io/api/";
    private static GankApi mGankApi;
    private static ZbApi mZbApi;
    private static FakeApi mFakeApi;

    private static OkHttpClient mOkHttpClient = new OkHttpClient();
    private static Converter.Factory mGsonConerterFactory = GsonConverterFactory.create();
    private static CallAdapter.Factory mRxJavaCallAdapterFactory = RxJavaCallAdapterFactory.create();

    public static ZbApi getZbApi(){
        if(null == mZbApi) {
            Retrofit retrofit = new Retrofit.Builder()
                    .client(mOkHttpClient)
                    .baseUrl(BASE_URL_ZBAPI)
                    .addConverterFactory(mGsonConerterFactory)
                    .addCallAdapterFactory(mRxJavaCallAdapterFactory)
                    .build();

            mZbApi = retrofit.create(ZbApi.class);
        }
        return mZbApi;
    }

    public static GankApi getGankApi(){
        if(null == mGankApi){
            Retrofit retrofit = new Retrofit.Builder()
                    .client(mOkHttpClient)
                    .baseUrl(BASE_URL_GANKAPI)
                    .addConverterFactory(mGsonConerterFactory)
                    .addCallAdapterFactory(mRxJavaCallAdapterFactory)
                    .build();

            mGankApi = retrofit.create(GankApi.class);
        }

        return mGankApi;
    }

    public static FakeApi getFakeApi(){
        if(null == mFakeApi){
            mFakeApi = new FakeApi();
        }
        return mFakeApi;
    }

}
