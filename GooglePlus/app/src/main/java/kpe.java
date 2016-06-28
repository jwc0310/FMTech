import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

public final class kpe
  implements Thread.UncaughtExceptionHandler
{
  private final Context a;
  private final Thread.UncaughtExceptionHandler b;
  private final AtomicReference<Throwable> c;
  private final kpg d;
  
  public kpe(Context paramContext, Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler, AtomicReference<Throwable> paramAtomicReference, kpg paramkpg)
  {
    this.a = paramContext;
    this.b = paramUncaughtExceptionHandler;
    this.c = paramAtomicReference;
    this.d = paramkpg;
  }
  
  public final void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    if (this.d.a())
    {
      Throwable localThrowable = (Throwable)this.c.get();
      if ((localThrowable == null) || (localThrowable != paramThrowable)) {
        kpb.a(this.a, paramThrowable, this.d.c());
      }
    }
    this.b.uncaughtException(paramThread, paramThrowable);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kpe
 * JD-Core Version:    0.7.0.1
 */