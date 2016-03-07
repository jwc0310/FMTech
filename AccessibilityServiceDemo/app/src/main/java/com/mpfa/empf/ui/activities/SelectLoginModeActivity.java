package com.mpfa.empf.ui.activities;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.mpfa.empf.ui.component.CommonTitleBar;
import com.mpfa.empf.ui.fragments.FragmentConfig;
import com.mpfa.empf.ui.fragments.base.CommonBaseFragment;
import com.mpfa.empf.ui.fragments.login.OneTimePasswordFragment;
import com.mpfa.empf.ui.fragments.login.SedondPasswordFragment;
import com.mpfa.empf.ui.fragments.login.SelectLoginModeFragment;

/**
 * ==================================================================
 * Copyright (C) 2016 Mtelnet All Rights Reserved.
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

public class SelectLoginModeActivity extends BaseActivity{

    private FragmentManager mFragmentManager;
    private CommonTitleBar mTitleBar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.mpfa.empf.R.layout.activity_second_level_password);

        mFragmentManager = getSupportFragmentManager();

        initContentFragment();
        initViews();
    }

    private void initViews(){
        mTitleBar = (CommonTitleBar)findViewById(com.mpfa.empf.R.id.titlebar);
    }

    private void initContentFragment(){
        FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
        fragmentTransaction.replace(com.mpfa.empf.R.id.login_mode_content_frame, SelectLoginModeFragment.newInstance());
        fragmentTransaction.commit();
    }

    public void switchContentFragment(int type){
        CommonBaseFragment fragment = null;
        switch (type){
            case FragmentConfig.FRAGMENT_SELECT_LOGIN_MODE:
                fragment = SelectLoginModeFragment.newInstance();
                break;
            case FragmentConfig.FRAGMENT_ONE_TIME_PASSWORD:
                fragment = OneTimePasswordFragment.newInstance();
                break;
            case FragmentConfig.FRAGMENT_SECOND_PASSWORD:
                fragment = SedondPasswordFragment.newInstance();
                break;
        }

        if(null != fragment){
            FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
            fragmentTransaction.replace(com.mpfa.empf.R.id.login_mode_content_frame, fragment);
            fragmentTransaction.addToBackStack(type+"");
            fragmentTransaction.commit();
        }
    }

    public void showTitleBar(boolean show){
        if(show){
            mTitleBar.setVisibility(View.VISIBLE);
        }else{
            mTitleBar.setVisibility(View.GONE);
        }
    }
}
