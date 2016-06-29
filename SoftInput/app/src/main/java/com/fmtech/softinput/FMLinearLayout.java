package com.fmtech.softinput;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/**
 * ==================================================================
 * Copyright (C) 2016 Mtelnet All Rights Reserved.
 *
 * @author Drew.Chiang
 * @version v1.0.0
 * @email chiangchuna@gmail.com
 * @create_date 2016/6/28 22:22
 * @description ${todo}
 * <p/>
 * ==================================================================
 */

public class FMLinearLayout extends RelativeLayout{
    private OnSizeChangedListener mSizeChangedListener;

    public FMLinearLayout(Context context) {
        super(context);
    }

    public FMLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FMLinearLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);

        if(null != mSizeChangedListener){
            mSizeChangedListener.sizeChanged(oldw - w, oldh - h);
        }
    }

    public void setOnSizeChangedListener(OnSizeChangedListener listener){
        mSizeChangedListener = listener;
    }

    public interface OnSizeChangedListener{
        public void sizeChanged(int widthDiff, int heightDiff);
    }
}
