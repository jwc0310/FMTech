import android.os.SystemClock;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;

final class fk
  extends gc<Void, Void, D>
  implements Runnable
{
  boolean a;
  private final CountDownLatch g = new CountDownLatch(1);
  
  fk(fj paramfj) {}
  
  private D b()
  {
    try
    {
      Object localObject = this.h.d();
      return localObject;
    }
    catch (jc localjc)
    {
      if (!this.d.isCancelled()) {
        throw localjc;
      }
    }
    return null;
  }
  
  protected final void a(D paramD)
  {
    for (;;)
    {
      fj localfj;
      try
      {
        localfj = this.h;
        if (localfj.a != this)
        {
          localfj.a(this, paramD);
          return;
        }
        if (localfj.n)
        {
          localfj.a(paramD);
          continue;
        }
        localfj.q = false;
      }
      finally
      {
        this.g.countDown();
      }
      localfj.c = SystemClock.uptimeMillis();
      localfj.a = null;
      localfj.b(paramD);
    }
  }
  
  protected final void b(D paramD)
  {
    try
    {
      this.h.a(this, paramD);
      return;
    }
    finally
    {
      this.g.countDown();
    }
  }
  
  public final void run()
  {
    this.a = false;
    this.h.c();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fk
 * JD-Core Version:    0.7.0.1
 */