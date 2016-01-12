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

public class FirstLoginStep3Fragment extends PageFragment{


    public static FirstLoginStep3Fragment newInstance(){
        FirstLoginStep3Fragment firstLoginStep3Fragment = new FirstLoginStep3Fragment();
        return firstLoginStep3Fragment;
    }

    @Override
    public int getLayoutRes() {
        return R.layout.fragment_first_login_step3;
    }

    @Override
    public void rebindViews() {

    }

    @Override
    public void requestData() {

    }
}
