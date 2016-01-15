package com.fmtech.empf.ui.fragments.signup;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.fmtech.accessibilityservicedemo.R;
import com.fmtech.empf.ui.activities.SignupActivity;
import com.fmtech.empf.ui.fragments.FragmentConfig;
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

public class SignupStep3Fragment extends CommonBaseFragment implements View.OnClickListener{

    private Button mSubmitBtn;

    public static SignupStep3Fragment newInstance(){
        SignupStep3Fragment singupStep3Fragment = new SignupStep3Fragment();
        return singupStep3Fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);
        mSubmitBtn = (Button)view.findViewById(R.id.btn_signup_step3_submit);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mSubmitBtn.setOnClickListener(this);
    }

    @Override
    public int getLayoutRes() {
        return R.layout.fragment_signup_step3;
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
            case R.id.btn_signup_step3_submit:
                doSubmit();
                break;
        }
    }

    private void doSubmit(){
        //TODO Submit to Server.

        //if submit successfully
        gotoLastSigupStep();
    }

    private void gotoLastSigupStep(){
        ((SignupActivity)getActivity()).switchContentFragment(FragmentConfig.FRAGMENT_SIGNUP_STEP4, true);
    }
}
