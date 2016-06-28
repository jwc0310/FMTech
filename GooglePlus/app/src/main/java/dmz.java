import android.content.Intent;
import java.util.Queue;

final class dmz
  implements Runnable
{
  dmz(dmy paramdmy) {}
  
  public final void run()
  {
    for (;;)
    {
      Intent localIntent = (Intent)this.a.a.poll();
      if (localIntent == null) {
        break;
      }
      try
      {
        if (this.a.d != null) {
          this.a.d.a(localIntent);
        }
      }
      catch (Throwable localThrowable)
      {
        Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), localThrowable);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dmz
 * JD-Core Version:    0.7.0.1
 */