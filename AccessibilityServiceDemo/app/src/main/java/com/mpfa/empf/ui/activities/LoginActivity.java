package com.mpfa.empf.ui.activities;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.mpfa.empf.utils.CommonResourceUtils;
import com.mpfa.empf.utils.PreferenceUtils;
import com.mpfa.empf.ui.component.layout.MtelToolbar;

/**
 * ==================================================================
 * Copyright (C) 2015 Mtelnet All Rights Reserved.
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
        setContentView(com.mpfa.empf.R.layout.activity_login);

        initViews();
        initActionBar();
    }

    private void initViews() {
        mForgotPassword = (TextView)findViewById(com.mpfa.empf.R.id.tv_forgot_password);
        mLoginBtn = (Button)findViewById(com.mpfa.empf.R.id.btn_login);
        mForgotPassword.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG); //下划线
        mForgotPassword.getPaint().setAntiAlias(true);//抗锯齿

        mForgotPassword.setOnClickListener(this);
        mLoginBtn.setOnClickListener(this);
    }

    private void initActionBar() {
        MtelToolbar mtelToolbar = (MtelToolbar)findViewById(com.mpfa.empf.R.id.mtel_toolbar);
        Toolbar toolbar = (Toolbar)findViewById(com.mpfa.empf.R.id.toolbar);
        mtelToolbar.setCustomTitle(CommonResourceUtils.getString(com.mpfa.empf.R.string.activity_title_login));
        toolbar.setTitle("");
        setSupportActionBar(toolbar);
        final ActionBar ab = getSupportActionBar();
        ab.setHomeAsUpIndicator(com.mpfa.empf.R.drawable.ic_back);
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
            case com.mpfa.empf.R.id.btn_login:
                doRealLogin();
                break;
            case com.mpfa.empf.R.id.tv_forgot_password:
                gotoForgotPassword();
                break;
        }
    }

    private void gotoForgotPassword(){
        Intent intent = new Intent(LoginActivity.this, ForgotPasswordActivity.class);
        startActivity(intent);
    }
}
