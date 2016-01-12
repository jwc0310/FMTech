package com.fmtech.empf.ui.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.fmtech.accessibilityservicedemo.R;
import com.fmtech.empf.ui.activities.LoginActivity;
import com.fmtech.empf.ui.activities.SignupActivity;
import com.fmtech.empf.ui.component.MPFADialog;

/**
 * ==================================================================
 * Copyright (C) 2015 FMTech All Rights Reserved.
 *
 * @author Drew.Chiang
 * @version v1.0.0
 * @email chiangchuna@gmail.com
 * @create_date 2015/12/24 10:18
 * @description ${todo}
 * <p/>
 * Modification History:
 * Date            Author            Version         Description
 * -----------------------------------------------------------------
 * 2015/12/24 10:18  Drew.Chiang       v1.0.0          create
 * <p/>
 * ==================================================================
 */

public class LoginSignupFragment extends PageFragment implements View.OnClickListener{

    private String mBreadcrumb;
    private int mClickCount = 0;
    private MPFADialog mDialog;
    private Button mLoginBtn;
    private Button mSignupBtn;

    public static LoginSignupFragment newInstance(){
        LoginSignupFragment loginSignupFragment = new LoginSignupFragment();
        return loginSignupFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);
        mLoginBtn = (Button)view.findViewById(R.id.login);
        mSignupBtn = (Button)view.findViewById(R.id.signup);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mBreadcrumb = mContext.getString(R.string.app_name);
        initViews();
        rebindActionBar();
    }

    private void initViews(){
        mLoginBtn.setOnClickListener(this);
        mSignupBtn.setOnClickListener(this);
    }

    @Override
    public void rebindActionBar() {
        mPageFragmentHost.updateActionBarTitle(mBreadcrumb);
        mPageFragmentHost.updateCurrentBackendId(0, true);
        mPageFragmentHost.switchToRegularActionBar();
    }

    @Override
    public int getLayoutRes() {
        return R.layout.fragment_login_signup;
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
            case R.id.login:
                toLogin();
                break;
            case R.id.signup:
                toSignup();
                break;
        }
    }
    private void toLogin() {
        switch (mClickCount) {
            case 0:
                showMaintanceMessage();
                mClickCount++;
                break;
            case 1:
                toLoginActivity();
                break;
        }
    }

    private void showMaintanceMessage() {
        mDialog = new MPFADialog(getActivity(), "Maintenance", "The system is under maintenance/down, please try again later,thanks.", "OK", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDialog.dismiss();
            }
        });
        mDialog.show();
    }

    private void toLoginActivity() {
        Intent intent = new Intent(getActivity(), LoginActivity.class);
        startActivity(intent);
//        finish();
    }

    private void toSignup() {
        Intent intent = new Intent(getActivity(), SignupActivity.class);
        startActivity(intent);
    }
}
