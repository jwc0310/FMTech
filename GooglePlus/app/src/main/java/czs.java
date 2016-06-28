import java.util.concurrent.atomic.AtomicReference;

final class czs
  implements Thread.UncaughtExceptionHandler
{
  private final Thread.UncaughtExceptionHandler a;
  private final AtomicReference<Throwable> b;
  
  czs(Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler, AtomicReference<Throwable> paramAtomicReference)
  {
    this.a = paramUncaughtExceptionHandler;
    this.b = paramAtomicReference;
  }
  
  public final void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    this.b.set(paramThrowable);
    this.a.uncaughtException(paramThread, paramThrowable);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     czs
 * JD-Core Version:    0.7.0.1
 */