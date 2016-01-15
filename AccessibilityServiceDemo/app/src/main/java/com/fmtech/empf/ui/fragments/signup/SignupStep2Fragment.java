package com.fmtech.empf.ui.fragments.signup;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

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

public class SignupStep2Fragment extends CommonBaseFragment implements View.OnClickListener{

    private EditText mSurnameEn;
    private EditText mOtherNameEn;
    private EditText mSurnameCN;
    private EditText mOtherNameCN;
    private EditText mHKIDCardNum;
    private EditText mEmailAddress;
    private EditText mReEmailAddress;
    private EditText mContactNum;

    private Button mResetBtn;
    private Button mSubmitBtn;

    public static SignupStep2Fragment newInstance(){
        SignupStep2Fragment singupStep2Fragment = new SignupStep2Fragment();
        return singupStep2Fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);
        initViews(view);
        return view;
    }

    private void initViews(View view){
        mSurnameEn = (EditText)view.findViewById(R.id.et_signup_step2_surname_en);
        mOtherNameEn = (EditText)view.findViewById(R.id.et_signup_step2_otaher_name_en);
        mSurnameCN = (EditText)view.findViewById(R.id.et_signup_step2_surname_cn);
        mOtherNameCN = (EditText)view.findViewById(R.id.et_signup_step2_other_name_cn);
        mHKIDCardNum = (EditText)view.findViewById(R.id.et_signup_step2_other_hkid_card_num);
        mEmailAddress = (EditText)view.findViewById(R.id.et_signup_step2_email_address);
        mReEmailAddress = (EditText)view.findViewById(R.id.et_signup_step2_re_email_address);
        mContactNum = (EditText)view.findViewById(R.id.et_signup_step2_contact_num);
        mResetBtn = (Button)view.findViewById(R.id.btn_signup_step2_reset);
        mSubmitBtn = (Button)view.findViewById(R.id.btn_signup_step2_submit);

        mResetBtn.setOnClickListener(this);
        mSubmitBtn.setOnClickListener(this);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    @Override
    public int getLayoutRes() {
        return R.layout.fragment_signup_step2;
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
            case R.id.btn_signup_step2_reset:
                doReset();
                break;
            case R.id.btn_signup_step2_submit:
                goToSubmitionOverview();
                break;
        }
    }

    private void doReset(){
        mSurnameEn.setText("");
        mOtherNameEn.setText("");
        mSurnameCN.setText("");
        mOtherNameCN.setText("");
        mHKIDCardNum.setText("");
        mEmailAddress.setText("");
        mReEmailAddress.setText("");
        mContactNum.setText("");
    }

    private void goToSubmitionOverview(){
        ((SignupActivity)getActivity()).switchContentFragment(FragmentConfig.FRAGMENT_SIGNUP_STEP3, true);
    }
}
