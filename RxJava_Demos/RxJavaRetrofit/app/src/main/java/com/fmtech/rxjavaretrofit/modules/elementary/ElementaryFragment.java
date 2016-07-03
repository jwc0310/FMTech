package com.fmtech.rxjavaretrofit.modules.elementary;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.AppCompatRadioButton;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fmtech.rxjavaretrofit.BaseFragment;
import com.fmtech.rxjavaretrofit.R;

import butterknife.Bind;
import butterknife.ButterKnife;

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

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_elementary, container, false);
        ButterKnife.bind(this, view);
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
