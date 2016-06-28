import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

public final class lrh
{
  private final lrk a;
  
  public lrh(lrk paramlrk)
  {
    this.a = paramlrk;
  }
  
  public final void a(kbw paramkbw)
  {
    int i = paramkbw.o;
    Exception localException = paramkbw.q;
    if (Log.isLoggable("SyncOperationListener", 3))
    {
      String str1 = String.valueOf(paramkbw.p);
      String str2 = String.valueOf(localException);
      new StringBuilder(38 + String.valueOf(str1).length() + String.valueOf(str2).length()).append("Sync operation complete: ").append(i).append("/").append(str1).append("/").append(str2);
    }
    if (localException != null) {
      if (!(localException instanceof AuthenticatorException)) {}
    }
    do
    {
      this.a.c.incrementAndGet();
      do
      {
        return;
      } while ((localException instanceof OperationCanceledException));
      if ((localException instanceof IOException))
      {
        this.a.a.incrementAndGet();
        return;
      }
      this.a.a.incrementAndGet();
      return;
      if (i == 401)
      {
        this.a.c.incrementAndGet();
        return;
      }
    } while (!paramkbw.n());
    this.a.a.incrementAndGet();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lrh
 * JD-Core Version:    0.7.0.1
 */