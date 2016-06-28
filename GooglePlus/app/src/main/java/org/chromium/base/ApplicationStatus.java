package org.chromium.base;

import aip;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.annotations.JNINamespace;
import rhl;
import rhn;
import rhr;

@JNINamespace
public class ApplicationStatus
{
  public static aip a;
  public static final rhr<aip> b = new rhr();
  private static Object c = new Object();
  private static Integer d;
  private static final Map<Activity, rhn> e = new ConcurrentHashMap();
  
  static
  {
    new rhr();
  }
  
  public static Activity a()
  {
    return null;
  }
  
  public static void a(aip paramaip)
  {
    rhr localrhr = b;
    if ((paramaip == null) || (localrhr.a.contains(paramaip))) {
      return;
    }
    localrhr.a.add(paramaip);
    localrhr.c = (1 + localrhr.c);
  }
  
  public static Context b()
  {
    return null;
  }
  
  public static int c()
  {
    int i = 0;
    int j = 1;
    for (;;)
    {
      int m;
      int n;
      synchronized (c)
      {
        if (d == null)
        {
          Iterator localIterator = e.values().iterator();
          m = 0;
          if (!localIterator.hasNext()) {
            break label136;
          }
          n = ((rhn)localIterator.next()).a;
          if ((n != 4) && (n != 5) && (n != 6)) {
            d = Integer.valueOf(j);
          }
        }
        else
        {
          int k = d.intValue();
          return k;
        }
      }
      do
      {
        i1 = i;
        break label130;
        if (n == 4)
        {
          m = j;
          break;
        }
      } while (n != 5);
      int i1 = j;
      label130:
      i = i1;
      continue;
      label136:
      if (m != 0) {
        j = 2;
      } else if (i != 0) {
        j = 3;
      } else {
        j = 4;
      }
    }
  }
  
  private static native void nativeOnApplicationStateChange(int paramInt);
  
  @CalledByNative
  private static void registerThreadSafeNativeApplicationStateListener()
  {
    rhl localrhl = new rhl();
    if (ThreadUtils.a().getLooper() == Looper.myLooper()) {}
    for (int i = 1; i != 0; i = 0)
    {
      localrhl.run();
      return;
    }
    ThreadUtils.a().post(localrhl);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     org.chromium.base.ApplicationStatus
 * JD-Core Version:    0.7.0.1
 */