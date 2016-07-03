package com.fmtech.rxjavaretrofit;

import android.app.Application;

/**
 * ==================================================================
 * Copyright (C) 2016 FMTech All Rights Reserved.
 *
 * @author Drew.Chiang
 * @version v1.0.0
 * @email chiangchuna@gmail.com
 * @create_date 2016/7/3 15:38
 * @description ${todo}
 * <p/>
 * ==================================================================
 */

public class FMApplication extends Application {

    private static FMApplication INSTANCE;

    public static FMApplication instance(){
        return INSTANCE;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        INSTANCE = this;
    }
}
