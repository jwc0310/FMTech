package com.mpfa.empf.ui.fragments.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.mpfa.empf.MainActivity;
import com.mpfa.empf.ui.fragments.base.CommonBaseFragment;

import com.mpfa.empf.R;

import com.mpfa.empf.ui.component.MPFASimpleDialog;
import com.mpfa.empf.ui.fragments.FragmentConfig;

/**
 * ==================================================================
 * Copyright (C) 2016 Mtelnet All Rights Reserved.
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

public class OneTimePasswordFragment extends CommonBaseFragment implements View.OnClickListener{

    private Button mLoginBtn;
    private EditText mPassword;
    private MPFASimpleDialog mSimpleDialog;
    private boolean isPasswordInvalid = true;

    public static OneTimePasswordFragment newInstance(){
        OneTimePasswordFragment selectLoginModeFragment = new OneTimePasswordFragment();
        return selectLoginModeFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);
        mLoginBtn = (Button)view.findViewById(R.id.btn_one_time_pwd_login);
        mPassword = (EditText)view.findViewById(R.id.et_one_time_password);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mLoginBtn.setOnClickListener(this);
    }

    @Override
    public int getLayoutRes() {
        return R.layout.fragment_one_time_pwd;
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
            case R.id.btn_one_time_pwd_login:
                if(isPasswordInvalid){
                    showInvalidPasswordDialog();
                }else{
                    doLogin();
                }
                isPasswordInvalid = !isPasswordInvalid;
                break;
        }
    }

    private void doLogin(){
        //// TODO: 2016/1/13  to login

        //If login successfully, direct to Personal Account
        Intent intent = new Intent(mContext, MainActivity.class);
        intent.putExtra("switch_fragment_type", FragmentConfig.FRAGMENT_HOME);
        mContext.startActivity(intent);
        getActivity().finish();
    }

    private void showInvalidPasswordDialog(){
        if(null == mSimpleDialog){
            String message = "Your one time password is\n" +
                    "invalid.\n" +
                    "Please enter again.\n" +
                    "Thank you.";
            mSimpleDialog = new MPFASimpleDialog(getActivity(), "ONE TIME PASSWORD", message, "OK", new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mSimpleDialog.dismiss();
                }
            });
        }
        mSimpleDialog.show();
    }
}
