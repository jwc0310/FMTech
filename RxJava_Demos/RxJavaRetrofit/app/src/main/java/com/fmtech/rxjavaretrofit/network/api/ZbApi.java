package com.fmtech.rxjavaretrofit.network.api;

import com.fmtech.rxjavaretrofit.model.Image;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * ==================================================================
 * Copyright (C) 2016 FMTech All Rights Reserved.
 *
 * @author Drew.Chiang
 * @version v1.0.0
 * @email chiangchuna@gmail.com
 * @create_date 2016/7/3 21:05
 * @description ${todo}
 * <p/>
 * ==================================================================
 */

public interface ZbApi {
    @GET("search")
    Observable<List<Image>> search(@Query("q") String key);
}
