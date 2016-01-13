package com.fmtech.empf.ui.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.fmtech.accessibilityservicedemo.R;
import com.fmtech.empf.utils.PreferenceUtils;

/**
 * ==================================================================
 * Copyright (C) 2015 FMTech All Rights Reserved.
 *
 * @author Drew.Chiang
 * @version v1.0.0
 * @email chiangchuna@gmail.com
 * @create_date 2015/12/18 12:20
 * @description ${todo}
 * <p/>
 * Modification History:
 * Date            Author            Version         Description
 * -----------------------------------------------------------------
 * 2015/12/18 12:20  Drew.Chiang       v1.0.0          create
 * <p/>
 * ==================================================================
 */

public class LoginActivity extends BaseActivity implements View.OnClickListener{

    private TextView mForgotPassword;
    private Button mLoginBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initViews();
        initActionBar();
    }

    private void initViews() {
        mForgotPassword = (TextView)findViewById(R.id.tv_forgot_password);
        mLoginBtn = (Button)findViewById(R.id.btn_login);
        mForgotPassword.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG); //下划线
        mForgotPassword.getPaint().setAntiAlias(true);//抗锯齿

        mForgotPassword.setOnClickListener(this);
        mLoginBtn.setOnClickListener(this);
    }

    private void initActionBar() {
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("Login");
        setSupportActionBar(toolbar);
        final ActionBar ab = getSupportActionBar();
        ab.setHomeAsUpIndicator(R.drawable.ic_back);
        ab.setDisplayHomeAsUpEnabled(true);
    }

    public void doRealLogin(){
        //TODO API login to server, check login infomation, authorisation

        //login success check if is the first time login
        boolean isFirstLogin = PreferenceUtils.shareInstance().getBoolean("isFirstLogin", true);
        if(isFirstLogin){//To first login page
            Intent intent = new Intent(LoginActivity.this, FirstLoginActivity.class);
            startActivity(intent);
            finish();
        }else{//To second level password page
            Intent intent = new Intent(LoginActivity.this, SelectLoginModeActivity.class);
            startActivity(intent);
            finish();
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_login:
                doRealLogin();
                break;
            case R.id.tv_forgot_password:
                gotoForgotPassword();
                break;
        }
    }

    private void gotoForgotPassword(){
        Intent intent = new Intent(LoginActivity.this, ForgotPasswordActivity.class);
        startActivity(intent);
    }
}
