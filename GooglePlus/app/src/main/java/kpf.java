import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

public final class kpf
  implements Thread.UncaughtExceptionHandler
{
  private final Context a;
  private final Thread.UncaughtExceptionHandler b;
  private final AtomicReference<Throwable> c;
  private final kpg d;
  
  public kpf(Context paramContext, Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler, AtomicReference<Throwable> paramAtomicReference, kpg paramkpg)
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
      kpb.a(this.a, paramThrowable, this.d.b());
      this.c.set(paramThrowable);
    }
    this.b.uncaughtException(paramThread, paramThrowable);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kpf
 * JD-Core Version:    0.7.0.1
 */