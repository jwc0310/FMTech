package com.fmtech.rxjavaretrofit.modules.token_advanced;

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
import com.fmtech.rxjavaretrofit.network.api.FakeApi;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.internal.schedulers.SchedulerLifecycle;
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

public class TokenAdvancedFragment extends BaseFragment {

    private FakeToken mCachedFakeToken = new FakeToken(true);
    private boolean mTokenUpdated;

    @Bind(R.id.swipeRefreshLayout)
    SwipeRefreshLayout mSwipeRefreshLayout;

    @Bind(R.id.tokenTv)
    TextView mTokenTV;

    @OnClick(R.id.requestBt)
    void loadData(){
        mSwipeRefreshLayout.setRefreshing(true);
        unsubscribe();
        final FakeApi fakeApi = new FakeApi();
        mSubscription = Observable.just(null)
                .flatMap(new Func1<Object, Observable<FakeThing>>() {
                    @Override
                    public Observable<FakeThing> call(Object o) {
                        return null == mCachedFakeToken.token? Observable.<FakeThing>error(new NullPointerException("Token is null!"))
                                : fakeApi.getData(mCachedFakeToken);
                    }
                })
                .retryWhen(new Func1<Observable<? extends Throwable>, Observable<?>>() {
                    @Override
                    public Observable<?> call(Observable<? extends Throwable> observable) {
                        return observable.flatMap(new Func1<Throwable, Observable<?>>() {
                            @Override
                            public Observable<?> call(Throwable throwable) {
                                if(throwable instanceof IllegalArgumentException || throwable instanceof NullPointerException){
                                    return fakeApi.getFakeToken("FAKE_AUTH_CODE")
                                            .doOnNext(new Action1<FakeToken>() {
                                                @Override
                                                public void call(FakeToken fakeToken) {
                                                    mTokenUpdated = true;
                                                    mCachedFakeToken.token = fakeToken.token;
                                                    mCachedFakeToken.expired = fakeToken.expired;
                                                }
                                            });
                                }
                                return Observable.error(throwable);
                            }
                        });
                    }
                })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<FakeThing>(){
                    @Override
                    public void call(FakeThing fakeData) {
                        mSwipeRefreshLayout.setRefreshing(false);
                        String token = mCachedFakeToken.token;
                        if (mTokenUpdated) {
                            token += "(" + getString(R.string.updated) + ")";
                        }
                        mTokenTV.setText(getString(R.string.got_token_and_data, token, fakeData.id, fakeData.name));
                    }
                }, new Action1<Throwable>(){
                    @Override
                    public void call(Throwable error) {
                        mSwipeRefreshLayout.setRefreshing(false);
                        Toast.makeText(getActivity(), R.string.loading_failed, Toast.LENGTH_SHORT).show();
                    }
                });
    }

    @OnClick(R.id.invalidateTokenBt)
    void destroyToken(){
        mCachedFakeToken.expired = true;
        Toast.makeText(getActivity(), R.string.token_destroyed, Toast.LENGTH_SHORT).show();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_token_advanced, container, false);
        ButterKnife.bind(this, view);
        mSwipeRefreshLayout.setColorSchemeColors(Color.RED, Color.BLUE, Color.YELLOW, Color.GREEN);
        mSwipeRefreshLayout.setEnabled(false);
        return view;
    }

    @Override
    protected int getDialogTitleRes() {
        return R.string.title_token_advanced;
    }

    @Override
    protected int getDialogViewRes() {
        return R.layout.dialog_token_advanced;
    }
}
