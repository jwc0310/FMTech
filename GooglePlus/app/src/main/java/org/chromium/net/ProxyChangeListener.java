package org.chromium.net;

import android.content.Context;
import android.content.IntentFilter;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.annotations.JNINamespace;
import org.chromium.base.annotations.NativeClassQualifiedName;
import rjk;

@JNINamespace
public class ProxyChangeListener
{
  private static boolean a = true;
  private long b;
  private Context c;
  private rjk d;
  
  private ProxyChangeListener(Context paramContext)
  {
    this.c = paramContext;
  }
  
  @CalledByNative
  public static ProxyChangeListener create(Context paramContext)
  {
    return new ProxyChangeListener(paramContext);
  }
  
  @CalledByNative
  public static String getProperty(String paramString)
  {
    return System.getProperty(paramString);
  }
  
  @NativeClassQualifiedName
  private native void nativeProxySettingsChanged(long paramLong);
  
  @NativeClassQualifiedName
  private native void nativeProxySettingsChangedTo(long paramLong, String paramString1, int paramInt, String paramString2, String[] paramArrayOfString);
  
  @CalledByNative
  public void start(long paramLong)
  {
    this.b = paramLong;
    if (this.d == null)
    {
      IntentFilter localIntentFilter = new IntentFilter();
      localIntentFilter.addAction("android.intent.action.PROXY_CHANGE");
      this.d = new rjk(this);
      this.c.getApplicationContext().registerReceiver(this.d, localIntentFilter);
    }
  }
  
  @CalledByNative
  public void stop()
  {
    this.b = 0L;
    if (this.d != null)
    {
      this.c.unregisterReceiver(this.d);
      this.d = null;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     org.chromium.net.ProxyChangeListener
 * JD-Core Version:    0.7.0.1
 */