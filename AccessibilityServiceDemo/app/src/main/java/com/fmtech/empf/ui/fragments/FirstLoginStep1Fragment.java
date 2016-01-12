package com.fmtech.empf.ui.fragments;

import com.fmtech.accessibilityservicedemo.R;
import com.fmtech.empf.ui.fragments.PageFragment;

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

public class FirstLoginStep1Fragment extends PageFragment{


    public static FirstLoginStep1Fragment newInstance(){
        FirstLoginStep1Fragment firstLoginStep1Fragment = new FirstLoginStep1Fragment();
        return firstLoginStep1Fragment;
    }

    @Override
    public int getLayoutRes() {
        return R.layout.fragment_first_login_step1;
    }

    @Override
    public void rebindViews() {

    }

    @Override
    public void requestData() {

    }
}
