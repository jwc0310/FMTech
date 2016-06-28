import android.os.Looper;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public abstract class efq<R extends efn>
  implements efk<R>
{
  private efr<R> a;
  private final CountDownLatch b = new CountDownLatch(1);
  public final Object c = new Object();
  public final ArrayList<efl> d = new ArrayList();
  public volatile R e;
  public volatile boolean f;
  private efo<R> g;
  private boolean h;
  private boolean i;
  private eit j;
  
  protected efq(Looper paramLooper)
  {
    this.a = new efr(paramLooper);
  }
  
  static void b(efn paramefn)
  {
    if ((paramefn instanceof efm)) {}
    try
    {
      ((efm)paramefn).a();
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      new StringBuilder("Unable to release ").append(paramefn);
    }
  }
  
  private final void c(R paramR)
  {
    this.e = paramR;
    this.j = null;
    this.b.countDown();
    if (this.g != null)
    {
      this.a.removeMessages(2);
      if (!this.h) {
        this.a.a(this.g, h());
      }
    }
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext()) {
      ((efl)localIterator.next()).a();
    }
    this.d.clear();
  }
  
  private boolean g()
  {
    synchronized (this.c)
    {
      boolean bool = this.h;
      return bool;
    }
  }
  
  private final R h()
  {
    boolean bool = true;
    synchronized (this.c)
    {
      if (!this.f)
      {
        efj.a(bool, "Result has already been consumed.");
        efj.a(b(), "Result is not ready.");
        efn localefn = this.e;
        this.e = null;
        this.g = null;
        this.f = true;
        d();
        return localefn;
      }
      bool = false;
    }
  }
  
  public final R a()
  {
    boolean bool1 = true;
    boolean bool2;
    if (Looper.myLooper() != Looper.getMainLooper()) {
      bool2 = bool1;
    }
    for (;;)
    {
      efj.a(bool2, "await must not be called on the UI thread");
      if (!this.f) {
        efj.a(bool1, "Result has already been consumed");
      }
      try
      {
        this.b.await();
        efj.a(b(), "Result is not ready.");
        return h();
        bool2 = false;
        continue;
        bool1 = false;
      }
      catch (InterruptedException localInterruptedException)
      {
        for (;;)
        {
          b(Status.b);
        }
      }
    }
  }
  
  public final R a(long paramLong, TimeUnit paramTimeUnit)
  {
    boolean bool1 = true;
    boolean bool2;
    if ((paramLong <= 0L) || (Looper.myLooper() != Looper.getMainLooper())) {
      bool2 = bool1;
    }
    for (;;)
    {
      efj.a(bool2, "await must not be called on the UI thread when time is greater than zero.");
      if (!this.f) {
        efj.a(bool1, "Result has already been consumed.");
      }
      try
      {
        if (!this.b.await(paramLong, paramTimeUnit)) {
          b(Status.d);
        }
        efj.a(b(), "Result is not ready.");
        return h();
        bool2 = false;
        continue;
        bool1 = false;
      }
      catch (InterruptedException localInterruptedException)
      {
        for (;;)
        {
          b(Status.b);
        }
      }
    }
  }
  
  public abstract R a(Status paramStatus);
  
  public final void a(efl paramefl)
  {
    if (!this.f) {}
    for (boolean bool = true;; bool = false)
    {
      efj.a(bool, "Result has already been consumed.");
      synchronized (this.c)
      {
        if (b())
        {
          paramefl.a();
          return;
        }
        this.d.add(paramefl);
      }
    }
  }
  
  public final void a(R paramR)
  {
    boolean bool1 = true;
    for (;;)
    {
      synchronized (this.c)
      {
        if ((this.i) || (this.h))
        {
          b(paramR);
          return;
        }
        if (!b())
        {
          bool2 = bool1;
          efj.a(bool2, "Results have already been set");
          if (this.f) {
            break label81;
          }
          efj.a(bool1, "Result has already been consumed");
          c(paramR);
          return;
        }
      }
      boolean bool2 = false;
      continue;
      label81:
      bool1 = false;
    }
  }
  
  public final void a(efo<R> paramefo)
  {
    if (!this.f) {}
    for (boolean bool = true;; bool = false)
    {
      efj.a(bool, "Result has already been consumed.");
      for (;;)
      {
        synchronized (this.c)
        {
          if (g()) {
            return;
          }
          if (b())
          {
            this.a.a(paramefo, h());
            return;
          }
        }
        this.g = paramefo;
      }
    }
  }
  
  public final void b(Status paramStatus)
  {
    synchronized (this.c)
    {
      if (!b())
      {
        a(a(paramStatus));
        this.i = true;
      }
      return;
    }
  }
  
  public final boolean b()
  {
    return this.b.getCount() == 0L;
  }
  
  public final void c()
  {
    synchronized (this.c)
    {
      if ((this.h) || (this.f)) {
        return;
      }
      b(this.e);
      this.g = null;
      this.h = true;
      c(a(Status.e));
      return;
    }
  }
  
  protected void d() {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     efq
 * JD-Core Version:    0.7.0.1
 */