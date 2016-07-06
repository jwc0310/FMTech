package com.fmtech.rxjavaretrofit.network.api;

import com.fmtech.rxjavaretrofit.model.FakeThing;
import com.fmtech.rxjavaretrofit.model.FakeToken;

import java.util.Random;

import rx.Observable;
import rx.functions.Func1;

/**
 * ==================================================================
 * Copyright (C) 2016 FMTech All Rights Reserved.
 *
 * @author Drew.Chiang
 * @version v1.0.0
 * @email chiangchuna@gmail.com
 * @create_date 2016/7/3 21:14
 * @description ${todo}
 * <p/>
 * ==================================================================
 */

public class FakeApi {
    Random mRandom = new Random();

    public Observable<FakeToken> getFakeToken(String fakeAuth){
        return Observable.just(fakeAuth)
                .map(new Func1<String, FakeToken>() {
                    @Override
                    public FakeToken call(String fakeAuth) {
                        int fakeNetworkTimeCost = mRandom.nextInt(500) + 500;
                        try {
                            Thread.sleep(fakeNetworkTimeCost);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        FakeToken fakeToken = new FakeToken();
                        fakeToken.token = createToken(fakeAuth);
                        return fakeToken;
                    }
                });
    }

    public Observable<FakeThing> getData(FakeToken fakeToken){
        return Observable.just(fakeToken)
                .map(new Func1<FakeToken, FakeThing>() {
                    @Override
                    public FakeThing call(FakeToken fakeToken) {
                        int fakeNetworkTimeCost = mRandom.nextInt(500) + 500;
                        try {
                            Thread.sleep(fakeNetworkTimeCost);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        if (fakeToken.expired) {
                            throw new IllegalArgumentException("Token expired!");
                        }

                        FakeThing data = new FakeThing();
                        data.id = (int)(System.currentTimeMillis()%10000);
                        data.name = "FAKE_USER" + data.id;
                        return data;
                    }
                });
    }
    private static String createToken(String fakeAuth){
        return fakeAuth + System.currentTimeMillis()%10000;
    }
}
