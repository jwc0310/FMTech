package com.mpfa.empf.ui.fragments.login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.mpfa.empf.ui.activities.FirstLoginActivity;
import com.mpfa.empf.ui.fragments.FragmentConfig;
import com.mpfa.empf.ui.fragments.base.CommonBaseFragment;

/**
 * ==================================================================
 * Copyright (C) 2016 Mtelnet All Rights Reserved.
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

public class FirstLoginStep3Fragment extends CommonBaseFragment implements View.OnClickListener{

    private EditText mQuestion1;
    private EditText mQuestion2;
    private EditText mQuestion3;
    private EditText mAnswer1;
    private EditText mAnswer2;
    private EditText mAnswer3;
    private ImageView mIV;
    private Button mSkipBtn;
    private Button mNextBtn;

    public static FirstLoginStep3Fragment newInstance(){
        FirstLoginStep3Fragment firstLoginStep3Fragment = new FirstLoginStep3Fragment();
        return firstLoginStep3Fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);
        mQuestion1 = (EditText)view.findViewById(com.mpfa.empf.R.id.et_first_login_step3_security_question1);
        mQuestion1 = (EditText)view.findViewById(com.mpfa.empf.R.id.et_first_login_step3_security_question2);
        mQuestion1 = (EditText)view.findViewById(com.mpfa.empf.R.id.et_first_login_step3_security_question3);
        mQuestion1 = (EditText)view.findViewById(com.mpfa.empf.R.id.et_first_login_step3_security_answer1);
        mQuestion1 = (EditText)view.findViewById(com.mpfa.empf.R.id.et_first_login_step3_security_answer2);
        mQuestion1 = (EditText)view.findViewById(com.mpfa.empf.R.id.et_first_login_step3_security_answer3);
        mNextBtn = (Button)view.findViewById(com.mpfa.empf.R.id.btn_fisrt_login_step3_skip);
        mSkipBtn = (Button)view.findViewById(com.mpfa.empf.R.id.btn_fisrt_login_step3_next);
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
        return com.mpfa.empf.R.layout.fragment_first_login_step3;
    }

    @Override
    public void rebindViews() {

    }

    @Override
    public void requestData() {

    }

    @Override
    public void onClick(View v) {
        skipToNextStep();
    }

    private void skipToNextStep(){
        ((FirstLoginActivity)mContext).switchContentFragment(FragmentConfig.FRAGMENT_FIRST_LOGIN_STEP4);
    }
}
