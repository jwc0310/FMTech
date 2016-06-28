import android.os.Handler;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

final class czt
  implements Thread.UncaughtExceptionHandler
{
  final Thread.UncaughtExceptionHandler a;
  private final AtomicReference<Throwable> b;
  
  czt(Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler, AtomicReference<Throwable> paramAtomicReference)
  {
    this.a = paramUncaughtExceptionHandler;
    this.b = paramAtomicReference;
  }
  
  public final void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    if ((Throwable)this.b.get() == paramThrowable) {
      this.a.uncaughtException(paramThread, paramThrowable);
    }
    do
    {
      return;
      if (Log.isLoggable("EsAppStartupListener", 6))
      {
        String str = String.valueOf(paramThread);
        Log.e("EsAppStartupListener", 40 + String.valueOf(str).length() + "Uncaught exception in background thread " + str, paramThrowable);
      }
      if ((bqj.a != 0L) && (System.currentTimeMillis() - bqj.a < 60000L)) {}
      boolean bool2;
      for (boolean bool1 = true;; bool1 = false)
      {
        bool2 = bool1;
        for (Throwable localThrowable = paramThrowable; (localThrowable != null) && (!bool2); localThrowable = localThrowable.getCause()) {
          bool2 = localThrowable instanceof hsk;
        }
      }
      if (!bool2) {
        break;
      }
    } while (!Log.isLoggable("EsAppStartupListener", 6));
    Log.e("EsAppStartupListener", "An account has just been deactivated, which put background threads at a risk of failure. Letting this thread live.", paramThrowable);
    return;
    czu localczu = new czu(this, paramThread, paramThrowable);
    efj.m().post(localczu);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     czt
 * JD-Core Version:    0.7.0.1
 */