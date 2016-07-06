package com.fmtech.rxjavaretrofit.modules.token;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.fmtech.rxjavaretrofit.BaseFragment;
import com.fmtech.rxjavaretrofit.R;
import com.fmtech.rxjavaretrofit.model.FakeThing;
import com.fmtech.rxjavaretrofit.model.FakeToken;
import com.fmtech.rxjavaretrofit.network.NetWorkService;
import com.fmtech.rxjavaretrofit.network.api.FakeApi;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

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

public class TokenFragment extends BaseFragment {

    @Bind(R.id.swipeRefreshLayout)
    SwipeRefreshLayout mSwipeRefreshLayout;

    @Bind(R.id.tokenTv)
    TextView mTokenTV;

    @OnClick(R.id.requestBt)
    void getData(){
        unsubscribe();
        mSwipeRefreshLayout.setRefreshing(true);
        final FakeApi fakeApi = NetWorkService.getFakeApi();
        mSubscription = fakeApi.getFakeToken("FAKE_AUTH_TOKEN")
                .flatMap(new Func1<FakeToken, Observable<FakeThing>>() {
                    @Override
                    public Observable<FakeThing> call(FakeToken fakeToken) {
                        return fakeApi.getData(fakeToken);
                    }
                })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<FakeThing>() {
                    @Override
                    public void call(FakeThing fakeData) {
                        mSwipeRefreshLayout.setRefreshing(false);
                        mTokenTV.setText(getString(R.string.got_data, fakeData.id, fakeData.name));
                    }

                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        mSwipeRefreshLayout.setRefreshing(false);
                        Toast.makeText(getActivity(), R.string.loading_failed, Toast.LENGTH_SHORT).show();
                    }
                });
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_token, container, false);
        ButterKnife.bind(this, view);
        mSwipeRefreshLayout.setColorSchemeColors(Color.BLUE, Color.RED, Color.GREEN, Color.YELLOW);
        mSwipeRefreshLayout.setEnabled(false);
        return view;
    }

    @Override
    protected int getDialogTitleRes() {
        return R.string.title_token;
    }

    @Override
    protected int getDialogViewRes() {
        return R.layout.dialog_token;
    }
}

