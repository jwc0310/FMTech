package com.fmtech.softinput;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity implements FMLinearLayout.OnSizeChangedListener {

    private FMLinearLayout mContainer;
    private ScrollView mScrollView;
    private FrameLayout mTitleBar;
    private ViewTreeObserver.OnGlobalLayoutListener mOnGlobalLayoutChangeListener;
    private View mPaddingView;
    //    private boolean mIsSoftKeyboardShowing = false;
    private int mPreContainerVisibleHeight = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_signup_step2);
//        AndroidBug5497Workaround.assistActivity(this);
        mContainer = (FMLinearLayout) findViewById(R.id.container);
        mScrollView = (ScrollView) findViewById(R.id.scrollview);
        mTitleBar = (FrameLayout) findViewById(R.id.singup_navigator_step2);
        mPaddingView = findViewById(R.id.paddingView);

        mContainer.setOnSizeChangedListener(this);
        mOnGlobalLayoutChangeListener = new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                int containerVisibleFrameHeight = getContainerVisibleHeight();

                //getRootView ---Finds the topmost view in the current view hierarchy
                int containerHeight = mContainer.getHeight();
                int titleBarHeight = mTitleBar.getHeight();
                int screenHeight = mScrollView.getRootView().getHeight();

                if (mPreContainerVisibleHeight != containerVisibleFrameHeight) {
                    final int heightDiff = containerHeight - containerVisibleFrameHeight;

                    System.out.println("-------mContainer Height: " + mContainer.getHeight());
                    System.out.println("-------mTitleBar Height: " + mTitleBar.getHeight());
                    System.out.println("-------heightDiff: " + heightDiff);
                    System.out.println("-------mScrollViewHeight: " + mScrollView.getHeight());

                    mContainer.getViewTreeObserver().removeOnGlobalLayoutListener(mOnGlobalLayoutChangeListener);
                    if (heightDiff > screenHeight / 3) {
                        mScrollView.getLayoutParams().height = mContainer.getHeight() - titleBarHeight - heightDiff;
                        mScrollView.requestLayout();//very important
//                        mPaddingView.getLayoutParams().height= heightDiff;
//                        mPaddingView.requestLayout();//very important
                    } else {
                        mScrollView.getLayoutParams().height = mContainer.getHeight() - titleBarHeight;
                        mScrollView.requestLayout();//very important
//                        mPaddingView.getLayoutParams().height = 0;
//                        mPaddingView.requestLayout();//very important
                    }
                    mContainer.getViewTreeObserver().addOnGlobalLayoutListener(mOnGlobalLayoutChangeListener);

                    mPreContainerVisibleHeight = containerVisibleFrameHeight;
                }

                System.out.println("-------mContainer Height2: " + mContainer.getHeight());
                System.out.println("-------mTitleBar Height: " + mTitleBar.getHeight());
                System.out.println("-------mScrollViewHeight2: " + mScrollView.getHeight());
//                System.out.println("-------mScrollView Content Height2: " + mScrollView.getChildAt(0).getHeight());
            }
        };
        mContainer.getViewTreeObserver().addOnGlobalLayoutListener(mOnGlobalLayoutChangeListener);
    }

    private int getContainerVisibleHeight() {
        Rect r = new Rect();
        mContainer.getWindowVisibleDisplayFrame(r);
        return (r.bottom - r.top);
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
            mContainer.getViewTreeObserver().removeOnGlobalLayoutListener(mOnGlobalLayoutChangeListener);
        } else {
            mContainer.getViewTreeObserver().removeGlobalOnLayoutListener(mOnGlobalLayoutChangeListener);
        }
        super.onDestroy();
    }

    ;
}
