package com.fmtech.rxjavaretrofit.modules.map;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fmtech.rxjavaretrofit.BaseFragment;
import com.fmtech.rxjavaretrofit.R;

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

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_map, container, false);
        return view;
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

