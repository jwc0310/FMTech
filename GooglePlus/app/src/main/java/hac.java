import android.content.Context;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.SparseArray;

final class hac
{
  private static hac b;
  final SparseArray<PowerManager.WakeLock> a = new SparseArray();
  private final Context c;
  private int d;
  
  private hac(Context paramContext)
  {
    this.c = paramContext;
  }
  
  static hac a(Context paramContext)
  {
    try
    {
      if (b == null) {
        b = new hac(paramContext);
      }
      hac localhac = b;
      return localhac;
    }
    finally {}
  }
  
  final int a()
  {
    synchronized (this.a)
    {
      int i = 1 + this.d;
      this.d = i;
      if (i <= 0) {
        this.d = 1;
      }
      PowerManager.WakeLock localWakeLock = ((PowerManager)this.c.getSystemService("power")).newWakeLock(1, "BackgroundTaskService");
      localWakeLock.setReferenceCounted(false);
      localWakeLock.acquire(60000L);
      this.a.put(this.d, localWakeLock);
      return this.d;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hac
 * JD-Core Version:    0.7.0.1
 */