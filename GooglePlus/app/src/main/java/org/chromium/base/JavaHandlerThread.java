package org.chromium.base;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.annotations.JNINamespace;
import rho;
import rhp;

@JNINamespace
public class JavaHandlerThread
{
  public final HandlerThread a;
  
  private JavaHandlerThread(String paramString)
  {
    this.a = new HandlerThread(paramString);
  }
  
  @CalledByNative
  private static JavaHandlerThread create(String paramString)
  {
    return new JavaHandlerThread(paramString);
  }
  
  private native void nativeInitializeThread(long paramLong1, long paramLong2);
  
  private native void nativeStopThread(long paramLong1, long paramLong2);
  
  @CalledByNative
  private void start(long paramLong1, long paramLong2)
  {
    this.a.start();
    new Handler(this.a.getLooper()).post(new rho(this, paramLong1, paramLong2));
  }
  
  @TargetApi(18)
  @CalledByNative
  private void stop(long paramLong1, long paramLong2)
  {
    if (Build.VERSION.SDK_INT >= 18) {}
    for (boolean bool = true;; bool = false)
    {
      new Handler(this.a.getLooper()).post(new rhp(this, paramLong1, paramLong2, bool));
      if (bool) {
        this.a.quitSafely();
      }
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     org.chromium.base.JavaHandlerThread
 * JD-Core Version:    0.7.0.1
 */