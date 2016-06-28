import android.os.Process;
import android.util.Log;

public final class dkc
  implements Runnable
{
  public dkc(dka paramdka) {}
  
  public final void run()
  {
    try
    {
      Process.setThreadPriority(19);
      this.a.a(false);
      return;
    }
    catch (Exception localException)
    {
      Log.e("AllPhotosSyncManager", "Local media refresh failed", localException);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dkc
 * JD-Core Version:    0.7.0.1
 */