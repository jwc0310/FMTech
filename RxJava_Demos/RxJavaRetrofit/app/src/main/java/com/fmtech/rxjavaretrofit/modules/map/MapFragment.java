package com.fmtech.rxjavaretrofit.modules.map;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.fmtech.rxjavaretrofit.BaseFragment;
import com.fmtech.rxjavaretrofit.R;
import com.fmtech.rxjavaretrofit.adapter.RecyclerListAdapter;
import com.fmtech.rxjavaretrofit.model.GankBeautyResult;
import com.fmtech.rxjavaretrofit.model.Image;
import com.fmtech.rxjavaretrofit.network.NetWorkService;
import com.fmtech.rxjavaretrofit.util.GankBeautyResultToItemsMapper;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * ==================================================================
 * Copyright (C) 2016 FMTech All Rights Reserved.
 *
 * @author Drew.Chiang
 * @version v1.0.0
 * @email chiangchuna@gmail.com
 * @create_date 2016/7/3 16:35
 * @description ${todo}
 * <p/>
 * ==================================================================
 */

public class MapFragment extends BaseFragment {

    private int mCurrPage = 0;
    private RecyclerListAdapter mAdapter = new RecyclerListAdapter();


    @Bind(R.id.pageTv)
    TextView mCurrentPage;

    @Bind(R.id.previousPageBt)
    Button mPreviousBtn;

    @OnClick(R.id.previousPageBt)
    void previousPage() {
        loadData(--mCurrPage);
        if (mCurrPage == 1) {
            mPreviousBtn.setEnabled(false);
        }
    }

    @OnClick(R.id.nextPageBt)
    void nextPage() {
        loadData(++mCurrPage);
        if (mCurrPage == 2) {
            mPreviousBtn.setEnabled(true);
        }
    }

    @Bind(R.id.swipeRefreshLayout)
    SwipeRefreshLayout mSwipeRefreshLayout;

    @Bind(R.id.gridRv)
    RecyclerView mRecyclerGridList;

    Observer<List<Image>> mObserver = new Observer<List<Image>>() {
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
            mCurrentPage.setText(getString(R.string.page_with_number, mCurrPage));
            mAdapter.setImages(images);
        }
    };

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_map, container, false);
        ButterKnife.bind(this, view);
        mRecyclerGridList.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        mRecyclerGridList.setAdapter(mAdapter);
        mSwipeRefreshLayout.setColorSchemeColors(Color.BLUE, Color.GREEN, Color.RED, Color.YELLOW, Color.CYAN);
        mSwipeRefreshLayout.setEnabled(false);
        return view;
    }

    private void loadData(int page) {
        unsubscribe();
        mSwipeRefreshLayout.setRefreshing(true);
        mSubscription = NetWorkService.getGankApi()
                .getBeauties(10, page)
                .map(GankBeautyResultToItemsMapper.getInstance())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(mObserver);
    }

    @Override
    protected int getDialogTitleRes() {
        return R.string.title_map;
    }

    @Override
    protected int getDialogViewRes() {
        return R.layout.dialog_map;
    }
}

