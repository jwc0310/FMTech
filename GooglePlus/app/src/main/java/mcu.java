import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Process;
import android.util.Log;
import com.google.android.libraries.stitch.incompat.PlatformBugActivity;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public final class mcu
  implements Thread.UncaughtExceptionHandler
{
  private final Thread.UncaughtExceptionHandler a;
  private final Context b;
  private final x c;
  
  public mcu(Context paramContext, Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler)
  {
    this(paramContext, paramUncaughtExceptionHandler, null);
  }
  
  private mcu(Context paramContext, Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler, x paramx)
  {
    this.a = paramUncaughtExceptionHandler;
    this.b = ((Context)efj.e(paramContext, "context"));
    this.c = null;
  }
  
  public static boolean a(Context paramContext)
  {
    Iterator localIterator1 = mbb.c(paramContext, mct.class).iterator();
    mct localmct;
    do
    {
      if (!localIterator1.hasNext()) {
        break;
      }
      localmct = (mct)localIterator1.next();
    } while (!localmct.a(paramContext).exists());
    for (;;)
    {
      try
      {
        ActivityInfo localActivityInfo = paramContext.getPackageManager().getActivityInfo(new ComponentName(paramContext, PlatformBugActivity.class), 0);
        int i = Process.myPid();
        Iterator localIterator2 = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses().iterator();
        if (!localIterator2.hasNext()) {
          break label210;
        }
        ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)localIterator2.next();
        if (localRunningAppProcessInfo.pid != i) {
          continue;
        }
        str = localRunningAppProcessInfo.processName;
        if ((str == null) || (str.equals(localActivityInfo.processName))) {
          return true;
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        Log.wtf("PlatformBugHandler", "Cannot find PlatformBugActivity", localNameNotFoundException);
        return true;
      }
      Intent localIntent = new Intent(paramContext, PlatformBugActivity.class);
      localIntent.addFlags(884998144);
      localIntent.putExtra("extra_error_type", (String)localmct.a());
      paramContext.startActivity(localIntent);
      System.exit(0);
      return true;
      return false;
      label210:
      String str = null;
    }
  }
  
  public final void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    for (Throwable localThrowable = paramThrowable; localThrowable != null; localThrowable = localThrowable.getCause())
    {
      Iterator localIterator = mbb.c(this.b, mct.class).iterator();
      for (;;)
      {
        if (localIterator.hasNext())
        {
          mct localmct = (mct)localIterator.next();
          if (!localmct.a(localThrowable)) {
            continue;
          }
          try
          {
            localmct.a(this.b).createNewFile();
            if (this.c != null) {
              localmct.a();
            }
            System.exit(0);
          }
          catch (IOException localIOException)
          {
            for (;;)
            {
              Log.wtf("PlatformBugHandler", "Cannot create marker for platform bug file", localIOException);
            }
          }
        }
      }
    }
    if (this.a != null)
    {
      this.a.uncaughtException(paramThread, paramThrowable);
      return;
    }
    paramThrowable.printStackTrace();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mcu
 * JD-Core Version:    0.7.0.1
 */