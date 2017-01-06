package com.fmtech.sessiontimeout;

import android.widget.Toast;

/**
 * ==================================================================
 * Copyright (C) 2016 MTel Limited All Rights Reserved.
 *
 * @author Drew.Chiang
 * @version v1.0.0
 * @create_date 16/10/19 12:23
 * @description ${todo}
 * <p>
 * Modification History:
 * Date            Author            Version         Description
 * -----------------------------------------------------------------
 * 16/10/19 12:23  Drew.Chiang       v1.0.0          create
 * <p>
 * ==================================================================
 */
public class SessionTimeOutManager {

    public static long SESSION_TIMEOUT = 30*1000;
    public static long LAST_ACTION_TIME = 0;

    private MainActivity mContext;
    private static SessionTimeOutManager sInstance;

    private SessionTimeOutManager(){

    }

    public static SessionTimeOutManager getInstance(){
        if(null == sInstance){
            sInstance = new SessionTimeOutManager();
        }
        return sInstance;
    }

    public void init(MainActivity activity){
        mContext = activity;
    }

    public void destroy(){
        mContext = null;
    }

    public void checkTimeout(){
        long currentTime = System.currentTimeMillis();
        if(LAST_ACTION_TIME == 0){
            LAST_ACTION_TIME = currentTime;
            return;
        }

        if(currentTime - LAST_ACTION_TIME > SESSION_TIMEOUT){
            // timeout
            Toast.makeText(mContext, "Time out!", Toast.LENGTH_SHORT).show();
        }else{
            LAST_ACTION_TIME = currentTime;
        }
    }
}
