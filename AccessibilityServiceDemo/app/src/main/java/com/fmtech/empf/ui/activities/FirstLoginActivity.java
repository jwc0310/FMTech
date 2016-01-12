package com.fmtech.empf.ui.activities;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;

import com.fmtech.accessibilityservicedemo.R;
import com.fmtech.empf.ui.fragments.FirstLoginStep1Fragment;

/**
 * ==================================================================
 * Copyright (C) 2016 FMTech All Rights Reserved.
 *
 * @author Drew.Chiang
 * @version v1.0.0
 * @email chiangchuna@gmail.com
 * @create_date 2016/1/12 12:18
 * @description ${todo}
 * <p/>
 * Modification History:
 * Date            Author            Version         Description
 * -----------------------------------------------------------------
 * 2016/1/12 12:18  Drew.Chiang       v1.0.0          create
 * <p/>
 * ==================================================================
 */

public class FirstLoginActivity extends BaseActivity{

    private FragmentManager mFragmentManager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_login);

        mFragmentManager = getSupportFragmentManager();

        setupContentFragment();
    }

    private void setupContentFragment(){
        mFragmentManager.beginTransaction().replace(R.id.first_login_content_frame, FirstLoginStep1Fragment.newInstance()).commit();
    }

}
