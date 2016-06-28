package org.chromium.base;

import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.annotations.JNINamespace;

@JNINamespace
public class EventLog
{
  @CalledByNative
  public static void writeEvent(int paramInt1, int paramInt2)
  {
    android.util.EventLog.writeEvent(paramInt1, paramInt2);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     org.chromium.base.EventLog
 * JD-Core Version:    0.7.0.1
 */