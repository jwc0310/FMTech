package com.fmtech.softinput;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ScrollView;

import java.util.ArrayList;
import java.util.logging.Handler;

public class MainActivity extends AppCompatActivity implements FMLinearLayout.OnSizeChangedListener {

    private FMLinearLayout mFMLinearLayout;
    private ScrollView mScrollView;
    private FrameLayout mTitleBar;
    private ViewTreeObserver.OnGlobalLayoutListener mOnGlobalLayoutChangeListener;
    private View mPaddingView;
    private boolean mIsSoftKeyboardShowing = false;

    private android.os.Handler mHandler = new android.os.Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
        }
    };
//    private int inputViewOffset = 0;
//    private int keyboardHeight = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_signup_step2);
//        AndroidBug5497Workaround.assistActivity(this);
        mFMLinearLayout = (FMLinearLayout) findViewById(R.id.container);
        mScrollView = (ScrollView) findViewById(R.id.scrollview);
        mTitleBar = (FrameLayout) findViewById(R.id.singup_navigator_step2);
        mPaddingView = findViewById(R.id.paddingView);

        mFMLinearLayout.setOnSizeChangedListener(this);
        mOnGlobalLayoutChangeListener = new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                Rect r = new Rect();
                mFMLinearLayout.getWindowVisibleDisplayFrame(r);
//                mScrollView.getWindowVisibleDisplayFrame(r);
                //getRootView ---Finds the topmost view in the current view hierarchy
                int containerHeight = mFMLinearLayout.getHeight();
                int titleBarHeight = mTitleBar.getHeight();
                int screenHeight = mScrollView.getRootView().getHeight();

                int containerVisibleFrameHeight = (r.bottom - r.top);
                final int heightDiff = containerHeight - containerVisibleFrameHeight;

                System.out.println("-------r.top: " + r.top);
                System.out.println("-------mFMLinearLayout Height: " + mFMLinearLayout.getHeight());
                System.out.println("-------mTitleBar Height: " + mTitleBar.getHeight());
                System.out.println("-------heightDiff: " + heightDiff);
                System.out.println("-------mScrollViewHeight: " + mScrollView.getHeight());
//                System.out.println("-------mScrollView Content Height: " + mScrollView.getChildAt(0).getHeight());

                boolean isKeyboardShowing = heightDiff > screenHeight / 3;
                if((mIsSoftKeyboardShowing && !isKeyboardShowing) || (!mIsSoftKeyboardShowing && isKeyboardShowing)){
                    mIsSoftKeyboardShowing = isKeyboardShowing;
                    mFMLinearLayout.getViewTreeObserver().removeOnGlobalLayoutListener(mOnGlobalLayoutChangeListener);
                    if(mIsSoftKeyboardShowing) {
                        mScrollView.getLayoutParams().height= mFMLinearLayout.getHeight() - titleBarHeight - heightDiff;
                        mScrollView.requestLayout();//very important
//                        mPaddingView.getLayoutParams().height= heightDiff;
//                        mPaddingView.requestLayout();//very important
                    }else{
                        mScrollView.getLayoutParams().height = mFMLinearLayout.getHeight() - titleBarHeight;
                        mScrollView.requestLayout();//very important
//                        mPaddingView.getLayoutParams().height = 0;
//                        mPaddingView.requestLayout();//very important
                    }
                    mFMLinearLayout.getViewTreeObserver().addOnGlobalLayoutListener(mOnGlobalLayoutChangeListener);
                }

                System.out.println("-------mFMLinearLayout Height2: " + mFMLinearLayout.getHeight());
                System.out.println("-------mTitleBar Height: " + mTitleBar.getHeight());
                System.out.println("-------heightDiff2: " + heightDiff);
                System.out.println("-------mScrollViewHeight2: " + mScrollView.getHeight());
//                System.out.println("-------mScrollView Content Height2: " + mScrollView.getChildAt(0).getHeight());

            }
        };
        mFMLinearLayout.getViewTreeObserver().addOnGlobalLayoutListener(mOnGlobalLayoutChangeListener);
    }

    @Override
    public void sizeChanged(int widthDiff, int heightDiff) {

    }

    public interface OnSoftKeyboardStateChangedListener {
        public void OnSoftKeyboardStateChanged(boolean isKeyBoardShow, int keyboardHeight);
    }


    @SuppressWarnings("deprecation")
    @SuppressLint("NewApi")
    @Override
    protected void onDestroy() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(mOnGlobalLayoutChangeListener);
        } else {
            getWindow().getDecorView().getViewTreeObserver().removeGlobalOnLayoutListener(mOnGlobalLayoutChangeListener);
        }
        super.onDestroy();
    }

    ;
}
