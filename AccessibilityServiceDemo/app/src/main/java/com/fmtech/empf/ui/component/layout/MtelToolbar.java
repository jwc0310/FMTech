package com.fmtech.empf.ui.component.layout;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;

import com.fmtech.accessibilityservicedemo.R;

/**
 * ==================================================================
 * Copyright (C) 2016 Mtelnet All Rights Reserved.
 *
 * @author Drew.Chiang
 * @version v1.0.0
 * @email chiangchuna@gmail.com
 * @create_date 2016/1/18 18:02
 * @description ${todo}
 * <p/>
 * ==================================================================
 */

public class MtelToolbar extends FrameLayout{

    private TextView mCustomTitle;
    private ImageButton mCustomActionBtn;
    private ToolbarActionListener mToolbarActionListener;

    public MtelToolbar(Context context) {
        this(context, null, 0);
    }

    public MtelToolbar(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MtelToolbar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        mCustomTitle = (TextView)findViewById(R.id.toolbar_custom_title);
        mCustomActionBtn = (ImageButton)findViewById(R.id.toolbar_custom_imagebtn);
        mCustomActionBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(null != mToolbarActionListener){
                    mToolbarActionListener.onToolbarCustomActionClick();
                }
            }
        });
    }

    public void setCustomTitle(CharSequence title){
        if(!TextUtils.isEmpty(title)) {
            mCustomTitle.setText(title);
        }
    }

    public void setCustomTitle(int resId){
        setCustomTitle(getContext().getText(resId));
    }

    public void setToolbarActionListener(ToolbarActionListener listener){
        mToolbarActionListener = listener;
    }

    public interface ToolbarActionListener{
        public abstract void onToolbarCustomActionClick();
    }
}
