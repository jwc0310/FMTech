package com.fmtech.empf.ui.fragments.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.fmtech.accessibilityservicedemo.R;
import com.fmtech.empf.MainActivity;
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

public class FirstLoginStep4Fragment extends CommonBaseFragment implements View.OnClickListener{

    private Button mSubmitBtn;

    public static FirstLoginStep4Fragment newInstance(){
        FirstLoginStep4Fragment firstLoginStep4Fragment = new FirstLoginStep4Fragment();
        return firstLoginStep4Fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);
        mSubmitBtn = (Button)view.findViewById(R.id.btn_fisrt_login_step4_submit);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mSubmitBtn.setOnClickListener(this);
    }

    @Override
    public int getLayoutRes() {
        return R.layout.fragment_first_login_step4;
    }

    @Override
    public void rebindViews() {

    }

    @Override
    public void requestData() {

    }

    @Override
    public void onClick(View v) {
        gotoPersonalAccount();
    }

    private void gotoPersonalAccount(){
        Intent intent = new Intent(mContext, MainActivity.class);
        intent.putExtra("switch_fragment_type", FragmentConfig.FRAGMENT_HOME);
        mContext.startActivity(intent);
        getActivity().finish();
    }
}
