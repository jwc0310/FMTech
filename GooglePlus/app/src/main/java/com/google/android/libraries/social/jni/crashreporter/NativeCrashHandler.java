package com.google.android.libraries.social.jni.crashreporter;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.Log;
import com.google.android.apps.common.proguard.UsedByNative;
import iia;
import java.util.HashMap;

public final class NativeCrashHandler
{
  private static Context a;
  private static Intent b;
  private static Runnable c;
  private static String d;
  private static HashMap<String, String> e;
  private static final String[] f = { "android.graphics" };
  private static boolean g;
  
  private static void a()
  {
    for (;;)
    {
      try
      {
        System.loadLibrary("crashreporterer");
        if (!g) {
          setup();
        }
        g = true;
        return;
      }
      catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
      {
        if (Build.CPU_ABI.equals("armeabi-v7a"))
        {
          System.loadLibrary("crashreporterer-armeabi-v7a");
          continue;
        }
      }
      finally {}
      if (Build.CPU_ABI.equals("arm64-v8a"))
      {
        System.loadLibrary("crashreporterer-arm64-v8a");
      }
      else if (Build.CPU_ABI.equals("x86"))
      {
        System.loadLibrary("crashreporterer-x86");
      }
      else
      {
        if (!Build.CPU_ABI.equals("mips")) {
          break;
        }
        System.loadLibrary("crashreporterer-mips");
      }
    }
    throw localUnsatisfiedLinkError;
  }
  
  public static void a(Context paramContext)
  {
    if (Build.VERSION.SDK_INT < 21)
    {
      a();
      a = paramContext.getApplicationContext();
      Intent localIntent = new Intent(a, NativeCrashReporterActivity.class);
      b = localIntent;
      localIntent.setFlags(268435456);
      c = null;
      e = null;
    }
  }
  
  private static boolean a(iia paramiia)
  {
    StackTraceElement[] arrayOfStackTraceElement = paramiia.getStackTrace();
    boolean bool = false;
    if (arrayOfStackTraceElement != null) {}
    for (int i = 0;; i++)
    {
      int j = arrayOfStackTraceElement.length;
      bool = false;
      String str;
      if (i < j)
      {
        str = arrayOfStackTraceElement[i].getClassName();
        if (str == null) {}
      }
      else
      {
        for (int k = 0; k < f.length; k++) {
          if (str.contains(f[k]))
          {
            bool = true;
            return bool;
          }
        }
      }
    }
  }
  
  @UsedByNative
  private static void reportCrash(int paramInt1, int paramInt2, long paramLong)
  {
    String str1 = String.valueOf(Long.toHexString(paramLong));
    String str2 = 62 + String.valueOf(str1).length() + "Native crash signal: " + paramInt1 + " code: " + paramInt2 + " address: 0x" + str1;
    iia localiia = new iia(str2);
    Log.e("NativeCrashHandler", str2, localiia);
    if (a(localiia)) {
      b.putExtra("knownCrash", true);
    }
    if (c != null) {
      c.run();
    }
    if (d != null) {
      b.putExtra("runnableName", d);
    }
    if (e != null) {
      b.putExtra("runnableArgs", e);
    }
    b.putExtra("description", str2);
    a.startActivity(b);
  }
  
  private static native void setup();
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.jni.crashreporter.NativeCrashHandler
 * JD-Core Version:    0.7.0.1
 */