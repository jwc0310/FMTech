package com.fmtech.empf.ui.fragments.login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.fmtech.accessibilityservicedemo.R;
import com.fmtech.empf.ui.component.MPFADialog;
import com.fmtech.empf.ui.fragments.base.CommonBaseFragment;

/**
 * ==================================================================
 * Copyright (C) 2016 FMTech All Rights Reserved.
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

public class ForgotPasswordConfirmFragment extends CommonBaseFragment implements View.OnClickListener{

    private EditText mQuestion;
    private EditText mAnswer;
    private Button mSubmitBtn;
    private MPFADialog mDialog;

    private boolean isSucceed = false;

    public static ForgotPasswordConfirmFragment newInstance(){
        ForgotPasswordConfirmFragment forgotPasswordConfirmFragment = new ForgotPasswordConfirmFragment();
        return forgotPasswordConfirmFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view  = super.onCreateView(inflater, container, savedInstanceState);
        mQuestion = (EditText)view.findViewById(R.id.et_forgot_pwd_confirm_question);
        mAnswer = (EditText)view.findViewById(R.id.et_forgot_pwd_confirm_answer);
        mSubmitBtn = (Button)view.findViewById(R.id.btn_forgot_pwd_confirm_submit);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mSubmitBtn.setOnClickListener(this);
    }

    @Override
    public int getLayoutRes() {
        return R.layout.fragment_forgot_password_confirmation;
    }

    @Override
    public void rebindViews() {

    }

    @Override
    public void requestData() {

    }

    @Override
    public void onClick(View v) {
        doSubmit();
    }

    private void doSubmit(){
        //API Logic

        //If success
        if(isSucceed){
            String msg1 = "Password reset completed. The\n" +
                    "new password (partial) has sent\n" +
                    "to your registered email box.";
            mDialog = new MPFADialog(mContext, "SUCCESS", msg1, "Login Again", new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    mDialog.dismiss();
                    getActivity().finish();
                }
            });
            isSucceed = !isSucceed;
            mDialog.show();
        }else{
            String msg2 = "The answer do not match.\n" +
                    "Please try again or contact\n" +
                    "MPFA.";
            mDialog = new MPFADialog(mContext, "FAILED", msg2, true, "Contact MPFA", new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    mDialog.dismiss();
                }
            }, "Try Again", new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    mDialog.dismiss();
                }
            });
            isSucceed = !isSucceed;
            mDialog.show();
        }

    }

}
