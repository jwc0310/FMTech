package com.mpfa.empf.ui.activities;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.mpfa.empf.ui.component.CommonTitleBar;
import com.mpfa.empf.ui.fragments.base.CommonBaseFragment;
import com.mpfa.empf.ui.fragments.login.ForgotPasswordConfirmFragment;
import com.mpfa.empf.ui.fragments.login.ForgotPasswordFragment;
import com.mpfa.empf.utils.CommonResourceUtils;
import com.mpfa.empf.ui.fragments.FragmentConfig;

/**
 * ==================================================================
 * Copyright (C) 2016 Mtelnet All Rights Reserved.
 *
 * @author Drew.Chiang
 * @version v1.0.0
 * @email chiangchuna@gmail.com
 * @create_date 2016/1/13 12:38
 * @description ${todo}
 * <p/>
 * Modification History:
 * Date            Author            Version         Description
 * -----------------------------------------------------------------
 * 2016/1/13 12:38  Drew.Chiang       v1.0.0          create
 * <p/>
 * ==================================================================
 */

public class ForgotPasswordActivity extends BaseActivity{

    private FragmentManager mFragmentManager;
    private CommonTitleBar mTitleBar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.mpfa.empf.R.layout.activity_forgot_password);

        mFragmentManager = getSupportFragmentManager();

        initContentFragment();
        initViews();

    }

    private void initViews(){
        mTitleBar = (CommonTitleBar)findViewById(com.mpfa.empf.R.id.titlebar);
        mTitleBar.setToolbarTitle(CommonResourceUtils.getString(com.mpfa.empf.R.string.forgot_password));
    }

    private void initContentFragment(){
        FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
        fragmentTransaction.replace(com.mpfa.empf.R.id.forgot_password_content_frame, ForgotPasswordFragment.newInstance());
        fragmentTransaction.commit();
    }

    public void switchContentFragment(int type){
        CommonBaseFragment fragment = null;
        switch (type){
            case FragmentConfig.FRAGMENT_FORGOT_PASSWORD:
                fragment = ForgotPasswordFragment.newInstance();
                break;
            case FragmentConfig.FRAGMENT_FORGOT_PASSWORD_CONFIRMATION:
                fragment = ForgotPasswordConfirmFragment.newInstance();
                break;
        }

        if(null != fragment){
            FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
            fragmentTransaction.replace(com.mpfa.empf.R.id.forgot_password_content_frame, fragment);
            fragmentTransaction.addToBackStack(type+"");
            fragmentTransaction.commit();
        }
    }

    public void goBack(){
        if(mFragmentManager.getBackStackEntryCount() > 0){
            mFragmentManager.popBackStack();
        }
    }
}
