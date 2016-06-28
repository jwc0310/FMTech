import android.os.Bundle;

final class ksh
  implements Thread.UncaughtExceptionHandler
{
  ksh(ksg paramksg, Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler) {}
  
  public final void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    Bundle localBundle = new Bundle();
    kqy.a(localBundle, this.b.b);
    kqy.a(localBundle, null);
    this.b.a.a(new kpv(null), localBundle);
    if (this.a != null) {
      this.a.uncaughtException(paramThread, paramThrowable);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ksh
 * JD-Core Version:    0.7.0.1
 */