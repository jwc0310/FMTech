package org.chromium.net;

import android.os.Build.VERSION;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.annotations.JNINamespace;
import org.chromium.base.annotations.NativeClassQualifiedName;
import org.chromium.base.annotations.UsedByReflection;
import org.json.JSONObject;
import rhr;
import rip;
import riq;
import rir;

@JNINamespace
@UsedByReflection
public class CronetUrlRequestContext
  extends CronetEngine
{
  public final Object a = new Object();
  final AtomicInteger b = new AtomicInteger(0);
  public long c = 0L;
  public final Object d = new Object();
  public final rhr<NetworkQualityRttListener> e = new rhr();
  public final rhr<NetworkQualityThroughputListener> f = new rhr();
  private final ConditionVariable g = new ConditionVariable(false);
  
  @UsedByReflection
  public CronetUrlRequestContext(CronetEngine.Builder paramBuilder)
  {
    CronetLibraryLoader.a(paramBuilder.b, paramBuilder);
    if (Log.isLoggable("ChromiumNetwork", 2)) {
      i = -2;
    }
    for (;;)
    {
      nativeSetMinLogLevel(i);
      this.c = nativeCreateRequestContextAdapter(paramBuilder.a.toString());
      if (this.c != 0L) {
        break;
      }
      throw new NullPointerException("Context Adapter creation failed.");
      if (Log.isLoggable("ChromiumNetwork", i)) {
        i = -1;
      }
    }
    rip localrip = new rip(this);
    if (Looper.getMainLooper() == Looper.myLooper())
    {
      localrip.run();
      return;
    }
    new Handler(Looper.getMainLooper()).post(localrip);
  }
  
  private void a(Runnable paramRunnable)
  {
    try
    {
      null.execute(paramRunnable);
      return;
    }
    catch (RejectedExecutionException localRejectedExecutionException)
    {
      Log.e("ChromiumNetwork", "Exception posting task to executor", localRejectedExecutionException);
    }
  }
  
  private final void e()
  {
    if (this.c != 0L) {}
    for (int i = 1; i == 0; i = 0) {
      throw new IllegalStateException("Engine is shut down.");
    }
  }
  
  @CalledByNative
  private void initNetworkThread()
  {
    synchronized (this.a)
    {
      Thread.currentThread();
      this.g.open();
      Thread.currentThread().setName("ChromiumNet");
      Process.setThreadPriority(10);
      return;
    }
  }
  
  private static native long nativeCreateRequestContextAdapter(String paramString);
  
  @NativeClassQualifiedName
  private native void nativeDestroy(long paramLong);
  
  @NativeClassQualifiedName
  private native void nativeEnableNetworkQualityEstimator(long paramLong, boolean paramBoolean1, boolean paramBoolean2);
  
  private static native byte[] nativeGetHistogramDeltas();
  
  @NativeClassQualifiedName
  private native void nativeInitRequestContextOnMainThread(long paramLong);
  
  @NativeClassQualifiedName
  private native void nativeProvideRTTObservations(long paramLong, boolean paramBoolean);
  
  @NativeClassQualifiedName
  private native void nativeProvideThroughputObservations(long paramLong, boolean paramBoolean);
  
  private static native int nativeSetMinLogLevel(int paramInt);
  
  @NativeClassQualifiedName
  private native void nativeStartNetLogToFile(long paramLong, String paramString, boolean paramBoolean);
  
  @NativeClassQualifiedName
  private native void nativeStopNetLog(long paramLong);
  
  @CalledByNative
  private void onRttObservation(int paramInt1, long paramLong, int paramInt2)
  {
    a(new riq(this, paramInt1, paramLong, paramInt2));
  }
  
  @CalledByNative
  private void onThroughputObservation(int paramInt1, long paramLong, int paramInt2)
  {
    a(new rir(this, paramInt1, paramLong, paramInt2));
  }
  
  public final UrlRequest a(String paramString, UrlRequest.Callback paramCallback, Executor paramExecutor, int paramInt)
  {
    synchronized (this.a)
    {
      e();
      CronetUrlRequest localCronetUrlRequest = new CronetUrlRequest(this, paramString, paramInt, paramCallback, paramExecutor);
      return localCronetUrlRequest;
    }
  }
  
  public final boolean a()
  {
    return Build.VERSION.SDK_INT >= 14;
  }
  
  public final String b()
  {
    return "Cronet/" + Version.a();
  }
  
  public final byte[] c()
  {
    return nativeGetHistogramDeltas();
  }
  
  final long d()
  {
    synchronized (this.a)
    {
      e();
      long l = this.c;
      return l;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     org.chromium.net.CronetUrlRequestContext
 * JD-Core Version:    0.7.0.1
 */