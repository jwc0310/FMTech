import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

final class gcu
  implements Application.ActivityLifecycleCallbacks
{
  private final gcv a;
  private final gcw b;
  private final Application c;
  private volatile boolean d = false;
  private volatile boolean e = false;
  private int f = 0;
  
  public gcu(Application paramApplication, gcv paramgcv, gcw paramgcw)
  {
    this.a = paramgcv;
    this.b = paramgcw;
    this.c = paramApplication;
    if ((paramApplication != null) && (paramApplication.getResources() != null)) {
      this.f = paramApplication.getResources().getConfiguration().orientation;
    }
  }
  
  private final void a(Activity paramActivity)
  {
    Context localContext = paramActivity.getApplicationContext();
    List localList = ((ActivityManager)localContext.getSystemService("activity")).getRunningAppProcesses();
    int i;
    if (localList != null)
    {
      Iterator localIterator = localList.iterator();
      for (;;)
      {
        if (localIterator.hasNext())
        {
          ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)localIterator.next();
          if ((localRunningAppProcessInfo.processName.contains(localContext.getPackageName())) && (localRunningAppProcessInfo.importance == 100))
          {
            i = 1;
            if (i != 0) {
              break label111;
            }
            if (this.d)
            {
              this.d = false;
              this.a.a();
            }
          }
        }
      }
    }
    label111:
    while (this.d)
    {
      return;
      i = 0;
      break;
    }
    this.d = true;
    this.b.a();
  }
  
  private final boolean a()
  {
    int i = this.c.getResources().getConfiguration().orientation;
    int j = this.f;
    boolean bool = false;
    if (j != i)
    {
      bool = true;
      this.f = i;
    }
    return bool;
  }
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle) {}
  
  public final void onActivityDestroyed(Activity paramActivity) {}
  
  public final void onActivityPaused(Activity paramActivity) {}
  
  public final void onActivityResumed(Activity paramActivity) {}
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public final void onActivityStarted(Activity paramActivity)
  {
    if (!this.e)
    {
      a(paramActivity);
      return;
    }
    this.e = a();
  }
  
  public final void onActivityStopped(Activity paramActivity)
  {
    this.e = a();
    if (!this.e) {
      a(paramActivity);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gcu
 * JD-Core Version:    0.7.0.1
 */