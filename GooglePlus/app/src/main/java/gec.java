import android.os.Build.VERSION;
import android.os.Debug;
import android.os.Debug.MemoryInfo;
import android.os.Looper;

public final class gec
{
  private static final Thread a = Looper.getMainLooper().getThread();
  
  public static rgv a()
  {
    Debug.MemoryInfo localMemoryInfo = new Debug.MemoryInfo();
    Debug.getMemoryInfo(localMemoryInfo);
    return a(localMemoryInfo);
  }
  
  public static rgv a(Debug.MemoryInfo paramMemoryInfo)
  {
    rgv localrgv = new rgv();
    localrgv.a = Integer.valueOf(paramMemoryInfo.dalvikPss);
    localrgv.b = Integer.valueOf(paramMemoryInfo.nativePss);
    localrgv.c = Integer.valueOf(paramMemoryInfo.otherPss);
    localrgv.d = Integer.valueOf(paramMemoryInfo.dalvikPrivateDirty);
    localrgv.e = Integer.valueOf(paramMemoryInfo.nativePrivateDirty);
    localrgv.f = Integer.valueOf(paramMemoryInfo.otherPrivateDirty);
    if (Build.VERSION.SDK_INT >= 19)
    {
      localrgv.g = Integer.valueOf(paramMemoryInfo.getTotalPrivateClean());
      localrgv.i = Integer.valueOf(paramMemoryInfo.getTotalSwappablePss());
    }
    localrgv.h = Integer.valueOf(paramMemoryInfo.getTotalSharedDirty());
    return localrgv;
  }
  
  public static void b()
  {
    if (a.equals(Thread.currentThread())) {
      throw new UnsupportedOperationException("getMemoryUsageMetric should not be called from Ui thread.");
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gec
 * JD-Core Version:    0.7.0.1
 */