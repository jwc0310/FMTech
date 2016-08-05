package com.fmtech.shapedrawable;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mDietTV;
    private TextView mAutomobileTV;
    private TextView mEntertainmentTV;
    private TextView mSportsTV;
    private LinearLayout mRootContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*mDietTV = (TextView)findViewById(R.id.diet);
        mAutomobileTV = (TextView)findViewById(R.id.automobile);
        mEntertainmentTV = (TextView)findViewById(R.id.entertainment);
        mSportsTV = (TextView)findViewById(R.id.sports);

        //圆角半径必须是高度的一半,才会有半圆效果
        int roundRadius = dip2px(MainActivity.this, 15); // 8dp
//        int strokeColor = Color.parseColor("#2E3135");
        int fillColor = Color.parseColor("#FF4081");
        GradientDrawable gd = new GradientDrawable();
        gd.setCornerRadius(roundRadius);
        gd.setColor(fillColor);

        mDietTV.setBackground(gd);

        GradientDrawable gd1 = new GradientDrawable();
        gd1.setCornerRadius(roundRadius);
        fillColor = Color.parseColor("#903F9F");
        gd1.setColor(fillColor);
        mAutomobileTV.setBackground(gd1);

        GradientDrawable gd2 = new GradientDrawable();
        gd2.setCornerRadius(roundRadius);
        fillColor = Color.parseColor("#66c09F");
        gd2.setColor(fillColor);
        mEntertainmentTV.setBackground(gd2);

        GradientDrawable gd3 = new GradientDrawable();
        gd3.setCornerRadius(roundRadius);
        fillColor = Color.parseColor("#FF4081");
        gd3.setColor(fillColor);
        mSportsTV.setBackground(gd3);*/

        mRootContainer = (LinearLayout)findViewById(R.id.root_container);

        mRootContainer.addView(new TabItem(MainActivity.this, Color.parseColor("#FF4081"), "饮食"));
        mRootContainer.addView(new TabItem(MainActivity.this, Color.parseColor("#903F9F"), "汽车"));
        mRootContainer.addView(new TabItem(MainActivity.this, Color.parseColor("#66c09F"), "娱乐"));
        mRootContainer.addView(new TabItem(MainActivity.this, Color.parseColor("#FF4081"), "体育"));
    }

    public int dip2px(Context context, float dipValue){
        float scale = context.getResources().getDisplayMetrics().density;
        return (int)(dipValue * scale +0.5);
    }
}
