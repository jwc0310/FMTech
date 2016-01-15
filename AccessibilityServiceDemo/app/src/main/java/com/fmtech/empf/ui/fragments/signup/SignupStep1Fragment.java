package com.fmtech.empf.ui.fragments.signup;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

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

public class SignupStep1Fragment extends CommonBaseFragment implements View.OnClickListener{

    private Button mAgreeBtn;
    private Button mCancelBtn;
    private CheckBox mAgreeCB;

    public static SignupStep1Fragment newInstance(){
        SignupStep1Fragment singupStep1Fragment = new SignupStep1Fragment();
        return singupStep1Fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);
        mAgreeBtn = (Button)view.findViewById(R.id.btn_signup_step1_agree);
        mCancelBtn = (Button)view.findViewById(R.id.btn_signup_step1_cancel);
        mAgreeCB = (CheckBox)view.findViewById(R.id.cb_agreement);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mAgreeBtn.setOnClickListener(this);
        mCancelBtn.setOnClickListener(this);
    }

    @Override
    public int getLayoutRes() {
        return R.layout.fragment_signup_step1;
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
            case R.id.btn_signup_step1_agree:
                doAgree();
                break;
            case R.id.btn_signup_step1_cancel:
                doCancel();
                break;
        }
    }

    private void doAgree(){
        if(mAgreeCB.isChecked()){
            ((SignupActivity)getActivity()).switchContentFragment(FragmentConfig.FRAGMENT_SIGNUP_STEP2, true);
        }else{
            Toast.makeText(getActivity(), "You must agreed to\n" +
                    "the above registration procedures,\n" +
                    "Terms of Use Condition, Personal Information Collection Statement and\n" +
                    "the Privacy Policy Statement.", Toast.LENGTH_SHORT).show();
        }
    }

    private void doCancel(){
        getActivity().finish();
    }
}
