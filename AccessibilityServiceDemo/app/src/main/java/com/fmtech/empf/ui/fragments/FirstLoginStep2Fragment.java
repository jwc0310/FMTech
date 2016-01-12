package com.fmtech.empf.ui.fragments;

import com.fmtech.accessibilityservicedemo.R;

/**
 * ==================================================================
 * Copyright (C) 2016 FMTech All Rights Reserved.
 *
 * @author Drew.Chiang
 * @version v1.0.0
 * @email chiangchuna@gmail.com
 * @create_date 2016/1/12 15:11
 * @description ${todo}
 * <p/>
 * Modification History:
 * Date            Author            Version         Description
 * -----------------------------------------------------------------
 * 2016/1/12 15:11  Drew.Chiang       v1.0.0          create
 * <p/>
 * ==================================================================
 */

public class FirstLoginStep2Fragment extends PageFragment{


    public static FirstLoginStep2Fragment newInstance(){
        FirstLoginStep2Fragment firstLoginStep2Fragment = new FirstLoginStep2Fragment();
        return firstLoginStep2Fragment;
    }

    @Override
    public int getLayoutRes() {
        return R.layout.fragment_first_login_step2;
    }

    @Override
    public void rebindViews() {

    }
    
    @Override
    public void requestData() {

    }
}
