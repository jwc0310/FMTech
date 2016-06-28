package org.chromium.net;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.annotations.JNINamespace;
import org.json.JSONObject;
import rid;

@Deprecated
@JNINamespace
public class ChromiumUrlRequestContext
{
  public long a;
  
  protected ChromiumUrlRequestContext(Context paramContext, String paramString, CronetEngine.Builder paramBuilder)
  {
    CronetLibraryLoader.a(paramContext, paramBuilder);
    if (Log.isLoggable("ChromiumNetwork", 2)) {
      i = -2;
    }
    for (;;)
    {
      this.a = nativeCreateRequestContextAdapter(paramString, i, paramBuilder.a.toString());
      if (this.a != 0L) {
        break;
      }
      throw new NullPointerException("Context Adapter creation failed");
      if (Log.isLoggable("ChromiumNetwork", i)) {
        i = -1;
      }
    }
    rid localrid = new rid(this);
    new Handler(Looper.getMainLooper()).post(localrid);
  }
  
  @CalledByNative
  private void initNetworkThread()
  {
    Thread.currentThread().setName("ChromiumNet");
    Process.setThreadPriority(10);
  }
  
  private native long nativeCreateRequestContextAdapter(String paramString1, int paramInt, String paramString2);
  
  private native String nativeGetStatisticsJSON(String paramString);
  
  private native void nativeInitRequestContextOnMainThread(long paramLong);
  
  private native void nativeInitializeStatistics();
  
  private native void nativeReleaseRequestContextAdapter(long paramLong);
  
  private native void nativeStartNetLogToFile(long paramLong, String paramString, boolean paramBoolean);
  
  private native void nativeStopNetLog(long paramLong);
  
  public final void a()
  {
    nativeStopNetLog(this.a);
  }
  
  public final void a(String paramString, boolean paramBoolean)
  {
    nativeStartNetLogToFile(this.a, paramString, paramBoolean);
  }
  
  protected void finalize()
  {
    if (this.a != 0L) {
      nativeReleaseRequestContextAdapter(this.a);
    }
    super.finalize();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     org.chromium.net.ChromiumUrlRequestContext
 * JD-Core Version:    0.7.0.1
 */