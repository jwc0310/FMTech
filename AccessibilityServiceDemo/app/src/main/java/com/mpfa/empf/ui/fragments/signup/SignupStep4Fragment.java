package com.mpfa.empf.ui.fragments.signup;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.mpfa.empf.ui.activities.SignupActivity;
import com.mpfa.empf.ui.fragments.FragmentConfig;
import com.mpfa.empf.ui.fragments.base.CommonBaseFragment;
import com.mpfa.empf.utils.Utils;

import java.io.File;

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
        mReferenceNum = (TextView)view.findViewById(com.mpfa.empf.R.id.tv_registration_reference_num);
        mPrintScreenBtn = (Button)view.findViewById(com.mpfa.empf.R.id.btn_print_screen);
        mRegisterAccountBtn = (Button)view.findViewById(com.mpfa.empf.R.id.btn_register_anoter_account);
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
        return com.mpfa.empf.R.layout.fragment_signup_step4;
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
            case com.mpfa.empf.R.id.btn_print_screen:
                printScreen();
                break;
            case com.mpfa.empf.R.id.btn_register_anoter_account:
                registerAnotherAccount();
                break;
        }
    }

    private void printScreen(){
        File file = Utils.takeScreenShot(getActivity());
        if(null != file){
            Intent intent = new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE);
            Uri uri = Uri.fromFile(file);
            intent.setData(uri);
            mContext.sendBroadcast(intent);
            Toast.makeText(getActivity(), "Print Screen successfully!", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(getActivity(), "Print Screen failed!", Toast.LENGTH_SHORT).show();
        }
    }

    private void registerAnotherAccount(){
        SignupActivity signupActivity = (SignupActivity)getActivity();
        signupActivity.clearBackStack();
        signupActivity.switchContentFragment(FragmentConfig.FRAGMENT_SIGNUP_STEP1, false);
    }
}
