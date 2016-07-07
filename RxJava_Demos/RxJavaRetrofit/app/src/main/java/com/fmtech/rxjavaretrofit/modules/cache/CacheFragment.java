package com.fmtech.rxjavaretrofit.modules.cache;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.fmtech.rxjavaretrofit.BaseFragment;
import com.fmtech.rxjavaretrofit.R;
import com.fmtech.rxjavaretrofit.adapter.RecyclerListAdapter;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * ==================================================================
 * Copyright (C) 2016 FMTech All Rights Reserved.
 *
 * @author Drew.Chiang
 * @version v1.0.0
 * @email chiangchuna@gmail.com
 * @create_date 2016/7/3 16:36
 * @description ${todo}
 * <p/>
 * ==================================================================
 */

public class CacheFragment extends BaseFragment {

    @Bind(R.id.loadingTimeTv)
    TextView mLoadingTimeTV;

    @Bind(R.id.swipeRefreshLayout)
    SwipeRefreshLayout mSwipeRefreshLayout;

    @Bind(R.id.cacheRv)
    RecyclerView mGridRecyclerList;

    RecyclerListAdapter mAdapter = new RecyclerListAdapter();
    private long mStartingTime;

    @OnClick(R.id.clearMemoryCacheBt)
    void clearMemoryCache(){
        DataService.instance().clearMemoryCache();
        mAdapter.setImages(null);
        Toast.makeText(getActivity(), R.string.memory_cache_cleared, Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.clearMemoryAndDiskCacheBt)
    void clearMemoryAndDiskCache(){
        DataService.instance().clearMemoryDiskCache();
        mAdapter.setImages(null);
        Toast.makeText(getActivity(), R.string.memory_and_disk_cache_cleared, Toast.LENGTH_SHORT).show();
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cache, container, false);
        ButterKnife.bind(this, view);
        mGridRecyclerList.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        mGridRecyclerList.setAdapter(mAdapter);
        mSwipeRefreshLayout.setColorSchemeColors(Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW);
        mSwipeRefreshLayout.setEnabled(false);
        return view;
    }

    @Override
    protected int getDialogTitleRes() {
        return R.string.title_cache;
    }

    @Override
    protected int getDialogViewRes() {
        return R.layout.dialog_cache;
    }
}
