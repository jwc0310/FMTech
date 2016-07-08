package com.fmtech.softinput;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity implements FMLinearLayout.OnSizeChangedListener {

    private FMLinearLayout mContainer;
    private ScrollView mScrollView;
    private FrameLayout mTitleBar;
    private ViewTreeObserver.OnGlobalLayoutListener mOnGlobalLayoutChangeListener;
    private ViewTreeObserver.OnPreDrawListener mOnPreDrawListener;
    private ViewTreeObserver.OnDrawListener mOnDrawListener;

    private View mPaddingView;
    //    private boolean mIsSoftKeyboardShowing = false;
    private int mPreContainerVisibleHeight = 0;
    private int mPreScreenY = 0;

    Handler mHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN);

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

//                mContainer.getViewTreeObserver().addOnPreDrawListener(mOnPreDrawListener);

                if (mPreContainerVisibleHeight != containerVisibleFrameHeight) {
                    final int heightDiff = containerHeight - containerVisibleFrameHeight;

                    System.out.println("-------mContainer Height: " + mContainer.getHeight());
                    System.out.println("-------mTitleBar Height: " + mTitleBar.getHeight());
                    System.out.println("-------heightDiff: " + heightDiff);
                    System.out.println("-------mScrollViewHeight: " + mScrollView.getHeight());
                    System.out.println("-------containerVisibleHeight: " + getContainerVisibleHeight());
                    System.out.println("--------------------");
//                    mContainer.getViewTreeObserver().removeOnGlobalLayoutListener(mOnGlobalLayoutChangeListener);
//                    mContainer.requestLayout();
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
//                    mContainer.getViewTreeObserver().addOnGlobalLayoutListener(mOnGlobalLayoutChangeListener);

                    mPreContainerVisibleHeight = containerVisibleFrameHeight;
//                    mContainer.getRootView().requestLayout();
                    printInfo2();

//                    mHandler.post(new Runnable() {
//                        @Override
//                        public void run() {
//                            int[] location1 = new int[2];
//                            mContainer.getLocationOnScreen(location1);
//                            System.out.println("-------mHandler--->mContainer screenX:"+location1[0] +" screenY:"+location1[1]);
//                        }
//                    });
                }

//                printInfo2();
            }
        };


        mOnPreDrawListener = new ViewTreeObserver.OnPreDrawListener() {
            @Override
            public boolean onPreDraw() {
                int[] location1 = new int[2];
                mContainer.getLocationOnScreen(location1);
                System.out.println("-------onPreDraw---mContainer screenX:" + location1[0] + " screenY:" + location1[1]);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) mTitleBar.getLayoutParams();
                if (location1[1] < 0) {
//                    if(mPreScreenY != location1[1]){
//                        mPreScreenY = Math.min(mPreScreenY, location1[1]);
//                    }else{
//                        mScrollView.getLayoutParams().height = mScrollView.getLayoutParams().height + Math.abs(mPreScreenY);
//                        mScrollView.requestLayout();
//                    }
//                    mScrollView.getLayoutParams().height = mScrollView.getLayoutParams().height + Math.abs(location1[1]);
//                    mScrollView.requestLayout();

                    /*if(mPreScreenY != location1[1]){
                        mPreScreenY = Math.min(mPreScreenY, location1[1]);
                    }else {
                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) mTitleBar.getLayoutParams();
                        layoutParams.setMargins(0, Math.abs(location1[1]), 0, 0);
                        mTitleBar.setLayoutParams(layoutParams);
//                        mContainer.getViewTreeObserver().removeOnPreDrawListener(mOnPreDrawListener);
                        mPreScreenY = 0;
                    }*/

                    layoutParams.topMargin = Math.abs(location1[1]);
                    mTitleBar.setLayoutParams(layoutParams);
//                        mContainer.getViewTreeObserver().removeOnPreDrawListener(mOnPreDrawListener);
                } else if(layoutParams.topMargin != 0){
                    layoutParams.topMargin = 0;
                    mTitleBar.setLayoutParams(layoutParams);
                }

//                mContainer.getViewTreeObserver().removeOnPreDrawListener(mOnPreDrawListener);
                return true;
            }
        };

        mOnDrawListener = new ViewTreeObserver.OnDrawListener() {
            @Override
            public void onDraw() {
                int[] location1 = new int[2];
                mContainer.getLocationOnScreen(location1);
                System.out.println("-------onDraw---mContainer screenX:" + location1[0] + " screenY:" + location1[1]);
//                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) mTitleBar.getLayoutParams();
//                if (location1[1] < 0) {
//
//                    layoutParams.topMargin = Math.abs(location1[1]);
//                    mTitleBar.setLayoutParams(layoutParams);
////                        mContainer.getViewTreeObserver().removeOnPreDrawListener(mOnPreDrawListener);
//                } else if(layoutParams.topMargin != 0){
//                    layoutParams.topMargin = 0;
//                    mTitleBar.setLayoutParams(layoutParams);
//                }

            }
        };

        mContainer.getViewTreeObserver().addOnGlobalLayoutListener(mOnGlobalLayoutChangeListener);
        mContainer.getViewTreeObserver().addOnPreDrawListener(mOnPreDrawListener);
//        mContainer.getViewTreeObserver().addOnDrawListener(mOnDrawListener);
        MediaStore.
    }

    private void printInfo2() {
        int[] location1 = new int[2];
        mContainer.getLocationOnScreen(location1);
        System.out.println("-------mContainer screenX:" + location1[0] + " screenY:" + location1[1]);
        mContainer.getLocationInWindow(location1);
        System.out.println("-------mContainer windowX:" + location1[0] + " windowY:" + location1[1]);
        mScrollView.getLocationOnScreen(location1);
        System.out.println("-------mScrollView screenX:" + location1[0] + " screenY:" + location1[1]);
        mScrollView.getLocationInWindow(location1);
        System.out.println("-------mScrollView windowX:" + location1[0] + " windowY:" + location1[1]);
//                System.out.println("-------mContainer getTranslationY:"+mContainer.getTranslationY());
//                System.out.println("-------mScrollView getTranslationY:"+mScrollView.getTranslationY());
//                System.out.println("-------mContainer scrollY:"+mContainer.getScrollY());
//                System.out.println("-------mScrollView scrollY:"+mScrollView.getScrollY());

        System.out.println("-------mContainer Height2: " + mContainer.getHeight());
        System.out.println("-------mTitleBar Height2: " + mTitleBar.getHeight());
        System.out.println("-------mScrollViewHeight2: " + mScrollView.getHeight());
        System.out.println("-------containerVisibleHeight2: " + getContainerVisibleHeight());
        System.out.println("-------scrollViewVisibleHeight2: " + getScrollViewVisibleHeight());
//                System.out.println("-------mScrollView Content Height2: " + mScrollView.getChildAt(0).getHeight());
        System.out.println("--------------------------------------------------");
    }

    private int getContainerVisibleHeight() {
        Rect r = new Rect();
        mContainer.getWindowVisibleDisplayFrame(r);
        return (r.bottom - r.top);
    }

    private int getScrollViewVisibleHeight() {
        Rect r = new Rect();
        mScrollView.getWindowVisibleDisplayFrame(r);
        return (r.bottom - r.top);
    }

    @Override
    public void sizeChanged(int widthDiff, int heightDiff) {
        System.out.println("-------sizeChanged---heightDiff:" + heightDiff);
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

    public void submit(View view) {
        int[] location1 = new int[2];
        mContainer.getLocationOnScreen(location1);
        System.out.println("-------mContainer screenX:" + location1[0] + " screenY:" + location1[1]);
    }
}
