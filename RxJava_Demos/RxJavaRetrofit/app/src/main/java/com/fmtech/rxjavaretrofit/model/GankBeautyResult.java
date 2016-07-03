package com.fmtech.rxjavaretrofit.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * ==================================================================
 * Copyright (C) 2016 FMTech All Rights Reserved.
 *
 * @author Drew.Chiang
 * @version v1.0.0
 * @email chiangchuna@gmail.com
 * @create_date 2016/7/3 21:09
 * @description ${todo}
 * <p/>
 * ==================================================================
 */

public class GankBeautyResult {
    public boolean error;
    public @SerializedName("results")
    List<GankBeauty> beauties;
}
