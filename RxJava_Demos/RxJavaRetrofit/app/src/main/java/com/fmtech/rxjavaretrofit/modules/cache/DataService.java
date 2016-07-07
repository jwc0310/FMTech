package com.fmtech.rxjavaretrofit.modules.cache;

import android.support.annotation.IntDef;
import android.support.annotation.NonNull;

import com.fmtech.rxjavaretrofit.FMApplication;
import com.fmtech.rxjavaretrofit.R;
import com.fmtech.rxjavaretrofit.model.Image;
import com.fmtech.rxjavaretrofit.network.NetWorkService;
import com.fmtech.rxjavaretrofit.util.GankBeautyResultToItemsMapper;

import java.util.List;

import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;
import rx.subjects.BehaviorSubject;

/**
 * ==================================================================
 * Copyright (C) 2016 FMTech All Rights Reserved.
 *
 * @author Drew.Chiang
 * @version v1.0.0
 * @email chiangchuna@gmail.com
 * @create_date 2016/7/7 21:37
 * @description ${todo}
 * <p/>
 * ==================================================================
 */

public class DataService {

    private static DataService sInstance;
    private static final int DATA_SOURCE_MEMORY = 0;
    private static final int DATA_SOURCE_DISK = 1;
    private static final int DATA_SOURCE_NETWORK = 2;
    @IntDef({DATA_SOURCE_MEMORY, DATA_SOURCE_DISK, DATA_SOURCE_NETWORK}) @interface DataSource{}
    BehaviorSubject<List<Image>> mCache;

    private int mDataSource;

    private DataService(){

    }

    public static DataService instance(){
        if(null == sInstance){
            sInstance = new DataService();
        }
        return sInstance;
    }

    private void setDataSource(@DataSource int dataSource){
        mDataSource = dataSource;
    }

    public String getDataSourceText(){
        int resId;
        switch (mDataSource){
            case DATA_SOURCE_MEMORY:
                resId = R.string.data_source_memory;
                break;
            case DATA_SOURCE_DISK:
                resId = R.string.data_source_disk;
                break;
            case DATA_SOURCE_NETWORK:
                resId = R.string.data_source_network;
                break;
            default: resId = R.string.data_source_network;
        }

        return FMApplication.instance().getString(resId);
    }

    public void loadDataFromNetwork(){
        NetWorkService.getGankApi()
                .getBeauties(100, 1)
                .subscribeOn(Schedulers.io())
                .map(GankBeautyResultToItemsMapper.getInstance())
                //Modifies the source Observable so that it invokes
                //an action when it calls {@code onNext}.
                .doOnNext(new Action1<List<Image>>() {
                    @Override
                    public void call(List<Image> images) {
                        DataBase.instance().writeImagesInfos(images);
                    }
                })
                .subscribe(new Action1<List<Image>>() {
                    @Override
                    public void call(List<Image> images) {
                        mCache.onNext(images);
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        throwable.printStackTrace();
                    }
                });
    }

    public Subscription subscribeData(@NonNull Observer<List<Image>> observer){
        if(null == mCache){
            mCache = BehaviorSubject.create();
            Observable.create(new Observable.OnSubscribe<List<Image>>(){
                @Override
                public void call(Subscriber<? super List<Image>> subscriber) {
                    List<Image> images = DataBase.instance().readImagesInfos();
                    if(null == images){
                        setDataSource(DATA_SOURCE_NETWORK);
                        loadDataFromNetwork();
                    }else{
                        setDataSource(DATA_SOURCE_DISK);
                        subscriber.onNext(images);
                    }
                }
            })
            .subscribeOn(Schedulers.io())
            .subscribe(mCache);
        }else{
            setDataSource(DATA_SOURCE_MEMORY);
        }

        return mCache.observeOn(AndroidSchedulers.mainThread()).subscribe(observer);
    }

    public void clearMemoryCache(){
        mCache = null;
    }

    public void clearMemoryDiskCache(){
        clearMemoryCache();
        DataBase.instance().deleteDataBase();
    }
}
