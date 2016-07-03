package com.fmtech.rxjavaretrofit.modules.elementary;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.AppCompatRadioButton;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;

import com.fmtech.rxjavaretrofit.BaseFragment;
import com.fmtech.rxjavaretrofit.R;
import com.fmtech.rxjavaretrofit.adapter.RecyclerListAdapter;
import com.fmtech.rxjavaretrofit.model.Image;
import com.fmtech.rxjavaretrofit.network.NetWorkService;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;
import rx.Observable;
import rx.Observer;
import rx.Scheduler;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * ==================================================================
 * Copyright (C) 2016 FMTech All Rights Reserved.
 *
 * @author Drew.Chiang
 * @version v1.0.0
 * @email chiangchuna@gmail.com
 * @create_date 2016/7/3 16:34
 * @description ${todo}
 * <p/>
 * ==================================================================
 */

public class ElementaryFragment extends BaseFragment{

   @Bind(R.id.swipeRefreshLayout)
    SwipeRefreshLayout mSwipeRefreshLayout;

    @Bind(R.id.gridRv)
    RecyclerView mGridRecyclerList;

    private RecyclerListAdapter mAdapter = new RecyclerListAdapter();

    Observer<List<Image>> mObserver = new Observer<List<Image>>() {
        @Override
        public void onCompleted() {

        }

        @Override
        public void onError(Throwable e) {
            mSwipeRefreshLayout.setRefreshing(false);
        }

        @Override
        public void onNext(List<Image> images) {
            mSwipeRefreshLayout.setRefreshing(false);
            mAdapter.setImages(images);
        }
    };

    @OnCheckedChanged({R.id.searchRb1, R.id.searchRb2, R.id.searchRb3, R.id.searchRb4})
    void onTagChecked(RadioButton radioButton, boolean checked){
        if(checked){
            unsubscribe();
            mAdapter.setImages(null);
            mSwipeRefreshLayout.setRefreshing(true);
            requestData(radioButton.getText().toString());
        }
    }

    private void requestData(String queryKey){
        NetWorkService.getZbApi().search(queryKey)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(mObserver);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_elementary, container, false);
        ButterKnife.bind(this, view);
        mGridRecyclerList.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        mGridRecyclerList.setAdapter(mAdapter);
        mSwipeRefreshLayout.setRefreshing(false);
        mSwipeRefreshLayout.setColorSchemeColors(Color.BLUE, Color.GREEN, Color.RED, Color.YELLOW);
        mSwipeRefreshLayout.setEnabled(false);
        return view;
    }

    @Override
    protected int getDialogTitleRes() {
        return R.string.title_elementary;
    }

    @Override
    protected int getDialogViewRes() {
        return R.layout.dialog_elementary;
    }
}
