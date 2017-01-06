package com.fmtech.sessiontimeout;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private SessionTimeOutManager mSessionTimeoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSessionTimeoutManager = SessionTimeOutManager.getInstance();
        mSessionTimeoutManager.init(this);
    // Example of a call to a native method
    TextView tv = (TextView) findViewById(R.id.sample_text);
    tv.setText(stringFromJNI());
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        if(MotionEvent.ACTION_DOWN == ev.getAction()) {
            mSessionTimeoutManager.checkTimeout();
        }

        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        mSessionTimeoutManager.checkTimeout();

        return super.dispatchKeyEvent(event);
    }


}
