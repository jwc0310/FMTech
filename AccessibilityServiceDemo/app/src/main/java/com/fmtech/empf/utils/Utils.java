package com.fmtech.empf.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Environment;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;

import java.io.File;
import java.io.FileOutputStream;

/**
 * ==================================================================
 * Copyright (C) 2015 FMTech All Rights Reserved.
 *
 * @author Drew.Chiang
 * @version v1.0.0
 * @email chiangchuna@gmail.com
 * @create_date 2015/12/28 09:45
 * @description ${todo}
 * <p/>
 * Modification History:
 * Date            Author            Version         Description
 * -----------------------------------------------------------------
 * 2015/12/28 09:45  Drew.Chiang       v1.0.0          create
 * <p/>
 * ==================================================================
 */

public class Utils {

    public static void ensureOnMainThread() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("This method must be called from the UI thread.");
    }

    public static File takeScreenShot(Activity activity){
        File file = null;
        String imagePath = Environment.getExternalStorageDirectory()+ File. separator+"Screenshot.png" ;
//        if(imagePath.equals("" )){
//            imagePath = Environment.getExternalStorageDirectory()+ File. separator+"Screenshot.png" ;
//        }
        /*
        Bitmap mScreenBitmap;
        WindowManager mWindowManager;
        DisplayMetrics mDisplayMetrics;
        Display mDisplay;

        mWindowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        mDisplay = mWindowManager.getDefaultDisplay();
        mDisplayMetrics = new DisplayMetrics();
        mDisplay.getRealMetrics(mDisplayMetrics);

        float[] dims = {mDisplayMetrics.widthPixels , mDisplayMetrics.heightPixels };
        mScreenBitmap = Surface. screenshot((int) dims[0], (int) dims[1]);

        if (mScreenBitmap == null) {
            return false ;
        }*/
        View view = activity.getWindow().getDecorView();
        view.setDrawingCacheEnabled(true);
        view.buildDrawingCache();
        Bitmap bitmap = view.getDrawingCache();

        // 获取状态栏高度
        Rect frame = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(frame);
        int statusBarHeight = frame.top;

        // 获取屏幕长和高
        int width = activity.getWindowManager().getDefaultDisplay().getWidth();
        int height = activity.getWindowManager().getDefaultDisplay().getHeight();
        // 去掉标题栏高度
        Bitmap screenBitmap = Bitmap.createBitmap(bitmap, 0, statusBarHeight, width, height - statusBarHeight);
        view.destroyDrawingCache();

        try {
            FileOutputStream out = new FileOutputStream(imagePath);
            screenBitmap.compress(Bitmap.CompressFormat. PNG, 100, out);
        } catch (Exception e) {
            return null ;
        }
        return file = new File(imagePath) ;
    }
}
