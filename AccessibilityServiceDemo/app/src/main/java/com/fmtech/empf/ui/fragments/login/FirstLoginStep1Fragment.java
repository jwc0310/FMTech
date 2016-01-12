package com.fmtech.empf.ui.fragments.login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.fmtech.accessibilityservicedemo.R;
import com.fmtech.empf.ui.activities.FirstLoginActivity;
import com.fmtech.empf.ui.fragments.FragmentConfig;
import com.fmtech.empf.ui.fragments.base.CommonBaseFragment;
import com.fmtech.empf.ui.fragments.base.PageFragment;

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

public class FirstLoginStep1Fragment extends CommonBaseFragment implements View.OnClickListener{

    private EditText mAccountName;
    private Button mSkipBtn;
    private Button mNextBtn;

    public static FirstLoginStep1Fragment newInstance(){
        FirstLoginStep1Fragment firstLoginStep1Fragment = new FirstLoginStep1Fragment();
        return firstLoginStep1Fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);
        mAccountName = (EditText)view.findViewById(R.id.et_first_login_step1_account_name);
        mSkipBtn = (Button)view.findViewById(R.id.btn_fisrt_login_step1_skip);
        mNextBtn = (Button)view.findViewById(R.id.btn_fisrt_login_step1_next);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mSkipBtn.setOnClickListener(this);
        mNextBtn.setOnClickListener(this);
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

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_fisrt_login_step1_skip:
                skipToNextStep();
                break;
            case R.id.btn_fisrt_login_step1_next:
                gotoNextStep();
                break;
        }
    }

    private void skipToNextStep(){
        ((FirstLoginActivity)mContext).switchContentFragment(FragmentConfig.FRAGMENT_FIRST_LOGIN_STEP2);
    }

    private void gotoNextStep(){
        String accontName = mAccountName.getText().toString().trim();
        if(!TextUtils.isEmpty(accontName)){
            //TODO
            //Many things to do.

            ((FirstLoginActivity)mContext).switchContentFragment(FragmentConfig.FRAGMENT_FIRST_LOGIN_STEP2);
        }else{
            Toast.makeText(mContext, "Please input account name!", Toast.LENGTH_SHORT).show();
        }
    }
}
