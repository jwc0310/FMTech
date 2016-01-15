package com.fmtech.empf.ui.activities;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.fmtech.accessibilityservicedemo.R;
import com.fmtech.empf.ui.fragments.FragmentConfig;
import com.fmtech.empf.ui.fragments.base.CommonBaseFragment;
import com.fmtech.empf.ui.fragments.signup.SignupStep1Fragment;
import com.fmtech.empf.ui.fragments.signup.SignupStep2Fragment;
import com.fmtech.empf.ui.fragments.signup.SignupStep3Fragment;
import com.fmtech.empf.ui.fragments.signup.SignupStep4Fragment;

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

public class SignupActivity extends BaseActivity{

    private FragmentManager mFragmentManager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        mFragmentManager = getSupportFragmentManager();

        initContentFragment();
    }

    private void initContentFragment(){
        FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.sinup_content_frame, SignupStep1Fragment.newInstance(), "SignupStep1Fragment");
        System.out.println("-------SignupStep1Fragment.class.getSimpleName(): " + SignupStep1Fragment.class.getSimpleName());
        fragmentTransaction.commit();
    }

    public void switchContentFragment(int type, boolean addToBackStack){
        CommonBaseFragment fragment = null;
        switch (type){
            case FragmentConfig.FRAGMENT_SIGNUP_STEP1:
                fragment = SignupStep1Fragment.newInstance();
                break;
            case FragmentConfig.FRAGMENT_SIGNUP_STEP2:
                fragment = SignupStep2Fragment.newInstance();
                break;
            case FragmentConfig.FRAGMENT_SIGNUP_STEP3:
                fragment = SignupStep3Fragment.newInstance();
                break;
            case FragmentConfig.FRAGMENT_SIGNUP_STEP4:
                fragment = SignupStep4Fragment.newInstance();
                break;
        }

        if(null != fragment){
            FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.sinup_content_frame, fragment);
            if(addToBackStack){
                fragmentTransaction.addToBackStack(type+"");
            }
            fragmentTransaction.commit();
        }
    }

    public void clearBackStack(){
        while(mFragmentManager.getBackStackEntryCount() > 0){
            mFragmentManager.popBackStackImmediate();
        }
    }
}
