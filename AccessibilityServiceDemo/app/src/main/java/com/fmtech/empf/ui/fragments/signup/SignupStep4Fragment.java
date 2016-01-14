package com.fmtech.empf.ui.fragments.signup;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

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

public class SignupStep4Fragment extends CommonBaseFragment implements View.OnClickListener{

    private TextView mReferenceNum;
    private Button mPrintScreenBtn;
    private Button mRegisterAccountBtn;

    public static SignupStep4Fragment newInstance(){
        SignupStep4Fragment singupStep4Fragment = new SignupStep4Fragment();
        return singupStep4Fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);
        mReferenceNum = (TextView)view.findViewById(R.id.tv_registration_reference_num);
        mPrintScreenBtn = (Button)view.findViewById(R.id.btn_print_screen);
        mRegisterAccountBtn = (Button)view.findViewById(R.id.btn_register_anoter_account);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mPrintScreenBtn.setOnClickListener(this);
        mRegisterAccountBtn.setOnClickListener(this);
    }

    @Override
    public int getLayoutRes() {
        return R.layout.fragment_signup_step4;
    }

    @Override
    public void rebindViews() {

    }

    @Override
    public void requestData() {

    }

    @Override
    public void onClick(View v) {

    }
}
