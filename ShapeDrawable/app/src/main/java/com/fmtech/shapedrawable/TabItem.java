package com.fmtech.shapedrawable;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

/**
 * ==================================================================
 * Copyright (C) 2016 MTel Limited All Rights Reserved.
 *
 * @author Drew.Chiang
 * @version v1.0.0
 * @create_date 16/8/5 11:39
 * @description ${todo}
 * <p>
 * Modification History:
 * Date            Author            Version         Description
 * -----------------------------------------------------------------
 * 16/8/5 11:39  Drew.Chiang       v1.0.0          create
 * <p>
 * ==================================================================
 */
public class TabItem extends TextView{

    private OnTabSelectedListener mOnTabSelectedListener;
    private String mText;

    GradientDrawable mSelectedDrawable;
    GradientDrawable mUnSelectedDrawable;

    StateListDrawable mBackgroundDrawable;

    int mSelectedColor = Color.parseColor("#FF4081");
    int mUnSelectedColor = Color.parseColor("#00FFFFFF");

    public TabItem(Context context) {
        super(context);
        init();
    }

    public TabItem(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TabItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public TabItem(Context context, int color, String text){
        super(context);
        mSelectedColor = color;
        mText = text;
        init();
    }

    private void init(){
        setWidth(dip2px(getContext(),72));
        setHeight(dip2px(getContext(),30));
        setGravity(Gravity.CENTER);

        mBackgroundDrawable = new StateListDrawable();

        mSelectedDrawable = new GradientDrawable();
        mUnSelectedDrawable = new GradientDrawable();

        int roundRadius = dip2px(getContext(), 15);
        mSelectedDrawable.setCornerRadius(roundRadius);
        mSelectedDrawable.setColor(mSelectedColor);

        mUnSelectedDrawable.setColor(mUnSelectedColor);

        int[] selectedStates = {android.R.attr.state_selected};
        int[] unselectedStates = {-android.R.attr.state_selected};

        mBackgroundDrawable.addState(selectedStates, mSelectedDrawable);
        mBackgroundDrawable.addState(unselectedStates, mUnSelectedDrawable);

        mBackgroundDrawable.setCallback(this);

        setBackground(mBackgroundDrawable);

        setText(mText);

        setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                setSelected(true);
                if(null != mOnTabSelectedListener){
                    mOnTabSelectedListener.onTabSelected();
                }
            }
        });
    }

    public void setSelectedColor(int color){
        mSelectedColor = color;
        mSelectedDrawable.setColor(mSelectedColor);
    }


    public interface OnTabSelectedListener{
        public void onTabSelected();
    }

    public void setOnTabSelectedListener(OnTabSelectedListener listener){
        mOnTabSelectedListener = listener;
    }

    public int dip2px(Context context, float dipValue){
        float scale = context.getResources().getDisplayMetrics().density;
        return (int)(dipValue * scale +0.5);
    }
}
