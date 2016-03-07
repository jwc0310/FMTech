package com.mpfa.empf.ui.fragments.login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.mpfa.empf.ui.component.MPFADialog;
import com.mpfa.empf.ui.fragments.base.CommonBaseFragment;

import com.mpfa.empf.R;
import com.mpfa.empf.ui.activities.ForgotPasswordActivity;
import com.mpfa.empf.ui.fragments.FragmentConfig;

/**
 * ==================================================================
 * Copyright (C) 2016 Mtelnet All Rights Reserved.
 *
 * @author Drew.Chiang
 * @version v1.0.0
 * @email chiangchuna@gmail.com
 * @create_date 2016/1/13 12:55
 * @description ${todo}
 * <p/>
 * Modification History:
 * Date            Author            Version         Description
 * -----------------------------------------------------------------
 * 2016/1/13 12:55  Drew.Chiang       v1.0.0          create
 * <p/>
 * ==================================================================
 */

public class ForgotPasswordFragment extends CommonBaseFragment implements View.OnClickListener{

    private EditText mAccountName;
    private EditText mPassword;
    private Button mNextBtn;
    private boolean isSucceed = false;
    private MPFADialog mDialog;

    public static ForgotPasswordFragment newInstance(){
        ForgotPasswordFragment  forgotPasswordFragment = new ForgotPasswordFragment();
        return forgotPasswordFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view  = super.onCreateView(inflater, container, savedInstanceState);
        mAccountName = (EditText)view.findViewById(R.id.et_forgot_pwd_account_name);
        mPassword = (EditText)view.findViewById(R.id.et_forgot_pwd_pin);
        mNextBtn = (Button)view.findViewById(R.id.btn_forgot_pwd_next);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mNextBtn.setOnClickListener(this);
    }

    @Override
    public int getLayoutRes() {
        return R.layout.fragment_forgot_password;
    }

    @Override
    public void rebindViews() {

    }

    @Override
    public void requestData() {

    }

    @Override
    public void onClick(View v) {
        gotoNext();
    }

    private void gotoNext(){
        if(isSucceed){
            ((ForgotPasswordActivity) getActivity()).switchContentFragment(FragmentConfig.FRAGMENT_FORGOT_PASSWORD_CONFIRMATION);
        }else{
            if(null == mDialog){
                String msg1 = "You haven’t set any security\n" +
                        "question, please connect MPFA.";
                mDialog = new MPFADialog(mContext, "FAILED", msg1, true, "Try Again", new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        mDialog.dismiss();
                    }
                }, "Contact MPFA", new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        mDialog.dismiss();
                        ((ForgotPasswordActivity)getActivity()).goBack();
                    }
                });
            }
            isSucceed = !isSucceed;
            mDialog.show();
        }
    }

}
