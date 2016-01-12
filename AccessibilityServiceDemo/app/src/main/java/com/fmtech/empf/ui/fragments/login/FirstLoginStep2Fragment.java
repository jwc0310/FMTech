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

public class FirstLoginStep2Fragment extends CommonBaseFragment implements View.OnClickListener{

    private EditText mNewFirstPassword;
    private EditText mReNewFirstPassword;
    private EditText mNewSecondPassword;
    private EditText mReNewSecondPassword;
    private Button mNextBtn;

    public static FirstLoginStep2Fragment newInstance(){
        FirstLoginStep2Fragment firstLoginStep2Fragment = new FirstLoginStep2Fragment();
        return firstLoginStep2Fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);
        mNewFirstPassword = (EditText)view.findViewById(R.id.et_new_first_password);
        mReNewFirstPassword = (EditText)view.findViewById(R.id.et_re_new_first_password);
        mNewSecondPassword = (EditText)view.findViewById(R.id.et_new_second_password);
        mReNewSecondPassword = (EditText)view.findViewById(R.id.et_re_new_second_password);
        mNextBtn = (Button)view.findViewById(R.id.btn_fisrt_login_step2_next);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mNextBtn.setOnClickListener(this);
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

    @Override
    public void onClick(View v) {
        if(R.id.btn_fisrt_login_step2_next == v.getId()){
            gotoNextStep();
        }
    }

    private void gotoNextStep(){
        String accontName = mNewFirstPassword.getText().toString().trim();
        if(!TextUtils.isEmpty(accontName)){
            //TODO
            //Many things to do.

            ((FirstLoginActivity)mContext).switchContentFragment(FragmentConfig.FRAGMENT_FIRST_LOGIN_STEP3);
        }else{
            Toast.makeText(mContext, "Please input password!", Toast.LENGTH_SHORT).show();
        }
    }
}
