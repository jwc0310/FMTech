package org.chromium.base;

import aip;
import android.os.Handler;
import android.os.Looper;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.annotations.JNINamespace;
import rht;

@JNINamespace
public class PowerMonitor
  implements aip
{
  static
  {
    new rht();
  }
  
  private PowerMonitor()
  {
    new Handler(Looper.getMainLooper());
  }
  
  @CalledByNative
  private static boolean isBatteryPower()
  {
    return false;
  }
  
  private static native void nativeOnBatteryChargingChanged();
  
  private static native void nativeOnMainActivityResumed();
  
  private static native void nativeOnMainActivitySuspended();
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     org.chromium.base.PowerMonitor
 * JD-Core Version:    0.7.0.1
 */