import android.os.Process;
import android.util.Log;

final class czr
  implements Runnable
{
  czr(czo paramczo) {}
  
  public final void run()
  {
    try
    {
      Process.setThreadPriority(19);
      dkh.b(this.a.a);
      return;
    }
    catch (Exception localException)
    {
      Log.e("EsAppStartupListener", "Failed app initialization", localException);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     czr
 * JD-Core Version:    0.7.0.1
 */