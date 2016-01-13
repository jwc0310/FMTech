package com.fmtech.empf.ui.fragments.login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.fmtech.accessibilityservicedemo.R;
import com.fmtech.empf.ui.activities.SelectLoginModeActivity;
import com.fmtech.empf.ui.fragments.FragmentConfig;
import com.fmtech.empf.ui.fragments.base.CommonBaseFragment;

/**
 * ==================================================================
 * Copyright (C) 2016 FMTech All Rights Reserved.
 *
 * @author Drew.Chiang
 * @version v1.0.0
 * @email chiangchuna@gmail.com
 * @create_date 2016/1/13 10:19
 * @description ${todo}
 * <p/>
 * Modification History:
 * Date            Author            Version         Description
 * -----------------------------------------------------------------
 * 2016/1/13 10:19  Drew.Chiang       v1.0.0          create
 * <p/>
 * ==================================================================
 */

public class SelectLoginModeFragment extends CommonBaseFragment implements View.OnClickListener{

    private Button mOneTimePasswordBtn;
    private Button mSecondPasswordBtn;

    public static SelectLoginModeFragment newInstance(){
        SelectLoginModeFragment selectLoginModeFragment = new SelectLoginModeFragment();
        return selectLoginModeFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);
        mOneTimePasswordBtn = (Button)view.findViewById(R.id.btn_one_time_password);
        mSecondPasswordBtn = (Button)view.findViewById(R.id.btn_second_password);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mOneTimePasswordBtn.setOnClickListener(this);
        mSecondPasswordBtn.setOnClickListener(this);
    }

    @Override
    public int getLayoutRes() {
        return R.layout.fragment_login_mode;
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
            case R.id.btn_one_time_password:
                gotoOnTimePassword();
                break;
            case R.id.btn_second_password:
                gotoSecondPassword();
                break;
        }
    }

    private void gotoOnTimePassword(){
        ((SelectLoginModeActivity)getActivity()).switchContentFragment(FragmentConfig.FRAGMENT_ONE_TIME_PASSWORD);
    }

    private void gotoSecondPassword(){
        ((SelectLoginModeActivity)getActivity()).switchContentFragment(FragmentConfig.FRAGMENT_SECOND_PASSWORD);
    }
}
