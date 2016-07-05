package com.fmtech.rxjavaretrofit.modules.zip;

import android.content.ClipData;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.fmtech.rxjavaretrofit.BaseFragment;
import com.fmtech.rxjavaretrofit.R;
import com.fmtech.rxjavaretrofit.adapter.RecyclerListAdapter;
import com.fmtech.rxjavaretrofit.model.Image;
import com.fmtech.rxjavaretrofit.network.NetWorkService;
import com.fmtech.rxjavaretrofit.util.GankBeautyResultToItemsMapper;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func2;
import rx.observers.Observers;
import rx.schedulers.Schedulers;

/**
 * ==================================================================
 * Copyright (C) 2016 FMTech All Rights Reserved.
 *
 * @author Drew.Chiang
 * @version v1.0.0
 * @email chiangchuna@gmail.com
 * @create_date 2016/7/3 16:37
 * @description ${todo}
 * <p/>
 * ==================================================================
 */

public class ZipFragment extends BaseFragment {

    private RecyclerListAdapter mAdapter = new RecyclerListAdapter();

    @Bind(R.id.swipeRefreshLayout)
    SwipeRefreshLayout mSwipeRefreshLayout;

    @Bind(R.id.gridRv)
    RecyclerView mRecyclerGridList;

    @OnClick(R.id.zipLoadBt)
    void loadData(){
        mSwipeRefreshLayout.setRefreshing(true);
        unsubscribe();
        mSubscription = Observable.zip(NetWorkService.getGankApi().getBeauties(200, 1).map(GankBeautyResultToItemsMapper.getInstance()),
                NetWorkService.getZbApi().search("装逼"), new Func2<List<Image>, List<Image>, List<Image>>() {
                    @Override
                    public List<Image> call(List<Image> images1, List<Image> images2) {
                        List<Image> images = new ArrayList<Image>();
                        for(int i = 0; i < images1.size()/2 && i < images2.size(); i++){
                            images.add(images1.get(i * 2));
                            images.add(images1.get(i * 2 + 1));
                            images.add(images2.get(i));
                        }
                        return images;
                    }
                })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(mObserver);
    }

    private Observer<List<Image>> mObserver = new Observer<List<Image>>(){
        @Override
        public void onCompleted() {

        }

        @Override
        public void onError(Throwable e) {
            mSwipeRefreshLayout.setRefreshing(false);
            Toast.makeText(getActivity(), R.string.loading_failed, Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onNext(List<Image> images) {
            mSwipeRefreshLayout.setRefreshing(false);
            mAdapter.setImages(images);
        }
    };

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_zip, container, false);
        ButterKnife.bind(this, view);
        mRecyclerGridList.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        mRecyclerGridList.setAdapter(mAdapter);
        mSwipeRefreshLayout.setColorSchemeColors(Color.BLUE, Color.RED, Color.GREEN, Color.YELLOW);
        mSwipeRefreshLayout.setEnabled(false);
        return view;
    }

    @Override
    protected int getDialogTitleRes() {
        return 0;
    }

    @Override
    protected int getDialogViewRes() {
        return 0;
    }
}

