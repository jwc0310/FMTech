package com.fmtech.rxjavaretrofit;

import android.app.AlertDialog;
import android.app.Fragment;
import android.view.LayoutInflater;

import butterknife.OnClick;
import rx.Subscription;

/**
 * ==================================================================
 * Copyright (C) 2016 FMTech All Rights Reserved.
 *
 * @author Drew.Chiang
 * @version v1.0.0
 * @email chiangchuna@gmail.com
 * @create_date 2016/7/3 15:48
 * @description
 * #1.Unsubscribe.
 * #2.Show tips dialog.
 * <p/>
 * ==================================================================
 */

public abstract class BaseFragment extends Fragment {

    protected Subscription mSubscription;

    @OnClick(R.id.btn_tips)
    void showTips(){
        new AlertDialog.Builder(getActivity())
                .setTitle(getDialogTitleRes())
                .setView(LayoutInflater.from(getActivity()).inflate(getDialogViewRes(), null))
                .show();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

    }

    private void unsubscribe(){
        if(null != mSubscription && mSubscription.isUnsubscribed()){
            mSubscription.unsubscribe();
        }
    }

    protected abstract int getDialogTitleRes();

    protected abstract int getDialogViewRes();
}
