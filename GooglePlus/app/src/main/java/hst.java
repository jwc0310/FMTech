import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import java.util.List;

public final class hst
  extends gzf
{
  private final hsp a;
  
  public hst(Context paramContext)
  {
    super(paramContext, "CleanupTask");
    this.a = ((hsp)mbb.a(paramContext, hsp.class));
  }
  
  protected final hae a()
  {
    try
    {
      Context localContext = g();
      String str = localContext.getPackageName();
      List localList = ((ActivityManager)localContext.getSystemService("activity")).getRunningAppProcesses();
      giz localgiz = (giz)mbb.a(localContext, giz.class);
      Iterator localIterator1 = localList.iterator();
      ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo;
      do
      {
        if (!localIterator1.hasNext()) {
          break;
        }
        localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)localIterator1.next();
      } while (!TextUtils.equals(str, localRunningAppProcessInfo.processName));
      if ((100 != localRunningAppProcessInfo.importance) && (200 != localRunningAppProcessInfo.importance))
      {
        Iterator localIterator2 = localgiz.a(new String[] { "logged_in" }).iterator();
        while (localIterator2.hasNext())
        {
          int i = ((Integer)localIterator2.next()).intValue();
          this.a.a(localContext, i, true);
        }
      }
      bool = Log.isLoggable("LowStorageMonitor", 4);
    }
    catch (Throwable localThrowable)
    {
      return new hae(false);
    }
    boolean bool;
    if (bool) {}
    return new hae(true);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hst
 * JD-Core Version:    0.7.0.1
 */