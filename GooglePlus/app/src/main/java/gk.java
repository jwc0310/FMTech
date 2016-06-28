import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.SparseArray;

public abstract class gk
  extends BroadcastReceiver
{
  private static final SparseArray<PowerManager.WakeLock> a = new SparseArray();
  private static int b = 1;
  
  public static ComponentName a(Context paramContext, Intent paramIntent)
  {
    synchronized (a)
    {
      int i = b;
      int j = 1 + b;
      b = j;
      if (j <= 0) {
        b = 1;
      }
      paramIntent.putExtra("android.support.content.wakelockid", i);
      ComponentName localComponentName = paramContext.startService(paramIntent);
      if (localComponentName == null) {
        return null;
      }
      PowerManager.WakeLock localWakeLock = ((PowerManager)paramContext.getSystemService("power")).newWakeLock(1, "wake:" + localComponentName.flattenToShortString());
      localWakeLock.setReferenceCounted(false);
      localWakeLock.acquire(60000L);
      a.put(i, localWakeLock);
      return localComponentName;
    }
  }
  
  public static boolean a(Intent paramIntent)
  {
    int i = paramIntent.getIntExtra("android.support.content.wakelockid", 0);
    if (i == 0) {
      return false;
    }
    synchronized (a)
    {
      PowerManager.WakeLock localWakeLock = (PowerManager.WakeLock)a.get(i);
      if (localWakeLock != null)
      {
        localWakeLock.release();
        a.remove(i);
        return true;
      }
      new StringBuilder("No active wake lock id #").append(i);
      return true;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gk
 * JD-Core Version:    0.7.0.1
 */