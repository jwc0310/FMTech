package com.fmtech.empf.ui.fragments.signup;

import com.fmtech.accessibilityservicedemo.R;
import com.fmtech.empf.ui.fragments.base.CommonBaseFragment;

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

public class SingupStep1Fragment extends CommonBaseFragment {


    public static SingupStep1Fragment newInstance(){
        SingupStep1Fragment singupStep1Fragment = new SingupStep1Fragment();
        return singupStep1Fragment;
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
