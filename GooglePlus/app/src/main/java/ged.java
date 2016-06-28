import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;

public final class ged
{
  public static boolean a()
  {
    ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
    ActivityManager.getMyMemoryState(localRunningAppProcessInfo);
    return localRunningAppProcessInfo.importance == 100;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ged
 * JD-Core Version:    0.7.0.1
 */