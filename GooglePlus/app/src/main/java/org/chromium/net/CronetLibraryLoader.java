package org.chromium.net;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import org.chromium.base.annotations.JNINamespace;
import org.json.JSONObject;
import rie;

@JNINamespace
public class CronetLibraryLoader
{
  private static final Object a = new Object();
  private static boolean b = false;
  
  public static void a(Context paramContext, CronetEngine.Builder paramBuilder)
  {
    synchronized (a)
    {
      if (b) {
        return;
      }
      System.loadLibrary(paramBuilder.a.optString("NATIVE_LIBRARY_NAME", "cronet"));
      if (!"48.0.2564.8".equals(nativeGetCronetVersion()))
      {
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = "48.0.2564.8";
        arrayOfObject[1] = nativeGetCronetVersion();
        throw new RuntimeException(String.format("Expected Cronet version number %s, actual version number %s.", arrayOfObject));
      }
    }
    nativeCronetInitApplicationContext(paramContext.getApplicationContext());
    rie localrie = new rie(paramContext);
    if (Looper.getMainLooper() == Looper.myLooper()) {
      localrie.run();
    }
    for (;;)
    {
      b = true;
      return;
      new Handler(Looper.getMainLooper()).post(localrie);
    }
  }
  
  private static native void nativeCronetInitApplicationContext(Context paramContext);
  
  private static native void nativeCronetInitOnMainThread();
  
  private static native String nativeGetCronetVersion();
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     org.chromium.net.CronetLibraryLoader
 * JD-Core Version:    0.7.0.1
 */