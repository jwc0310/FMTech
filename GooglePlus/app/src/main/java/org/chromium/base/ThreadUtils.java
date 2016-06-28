package org.chromium.base;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import org.chromium.base.annotations.CalledByNative;

public class ThreadUtils
{
  private static final Object a = new Object();
  private static boolean b = false;
  private static Handler c = null;
  
  public static Handler a()
  {
    synchronized (a)
    {
      if (c == null) {
        c = new Handler(Looper.getMainLooper());
      }
      Handler localHandler = c;
      return localHandler;
    }
  }
  
  public static void b() {}
  
  @CalledByNative
  private static boolean isThreadPriorityAudio(int paramInt)
  {
    return Process.getThreadPriority(paramInt) == -16;
  }
  
  @CalledByNative
  public static void setThreadPriorityAudio(int paramInt)
  {
    Process.setThreadPriority(paramInt, -16);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     org.chromium.base.ThreadUtils
 * JD-Core Version:    0.7.0.1
 */