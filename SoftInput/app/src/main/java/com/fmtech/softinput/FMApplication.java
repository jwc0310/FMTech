package com.fmtech.softinput;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * ==================================================================
 * Copyright (C) 2016 MTel Limited All Rights Reserved.
 *
 * @author Drew.Chiang
 * @version v1.0.0
 * @create_date 16/7/31 11:39
 * @description ${todo}
 * <p>
 * Modification History:
 * Date            Author            Version         Description
 * -----------------------------------------------------------------
 * 16/7/31 11:39  Drew.Chiang       v1.0.0          create
 * <p>
 * ==================================================================
 */
public class FMApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

//        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
//                .setDefaultFontPath("fonts/fontello.ttf")
//                .setFontAttrId(R.attr.fontPath)
//                .build());
    }
}
