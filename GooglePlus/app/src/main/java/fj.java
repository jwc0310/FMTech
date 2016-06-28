import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

public abstract class fj<D>
  extends fu<D>
{
  volatile fk a;
  volatile fk b;
  long c = -10000L;
  private final Executor d;
  
  public fj(Context paramContext)
  {
    this(paramContext, gc.b);
  }
  
  private fj(Context paramContext, Executor paramExecutor)
  {
    super(paramContext);
    this.d = paramExecutor;
  }
  
  protected final void a()
  {
    super.a();
    k();
    this.a = new fk(this);
    c();
  }
  
  final void a(fk paramfk, D paramD)
  {
    a(paramD);
    if (this.b == paramfk)
    {
      if (this.q) {
        this.p = true;
      }
      this.c = SystemClock.uptimeMillis();
      this.b = null;
      if (this.k != null) {
        this.k.d();
      }
      c();
    }
  }
  
  public void a(D paramD) {}
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    super.a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    if (this.a != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mTask=");
      paramPrintWriter.print(this.a);
      paramPrintWriter.print(" waiting=");
      paramPrintWriter.println(this.a.a);
    }
    if (this.b != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mCancellingTask=");
      paramPrintWriter.print(this.b);
      paramPrintWriter.print(" waiting=");
      paramPrintWriter.println(this.b.a);
    }
    if (0L != 0L)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mUpdateThrottle=");
      lc.a(0L, paramPrintWriter);
      paramPrintWriter.print(" mLastLoadCompleteTime=");
      lc.a(this.c, SystemClock.uptimeMillis(), paramPrintWriter);
      paramPrintWriter.println();
    }
  }
  
  protected final boolean b()
  {
    if (this.a != null)
    {
      if (this.b != null)
      {
        if (this.a.a)
        {
          this.a.a = false;
          null.removeCallbacks(this.a);
        }
        this.a = null;
      }
    }
    else {
      return false;
    }
    if (this.a.a)
    {
      this.a.a = false;
      null.removeCallbacks(this.a);
      this.a = null;
      return false;
    }
    boolean bool = this.a.d.cancel(false);
    if (bool)
    {
      this.b = this.a;
      e();
    }
    this.a = null;
    return bool;
  }
  
  final void c()
  {
    if ((this.b == null) && (this.a != null))
    {
      if (this.a.a)
      {
        this.a.a = false;
        null.removeCallbacks(this.a);
      }
      if ((0L > 0L) && (SystemClock.uptimeMillis() < this.c))
      {
        this.a.a = true;
        null.postAtTime(this.a, this.c);
      }
    }
    else
    {
      return;
    }
    fk localfk = this.a;
    Executor localExecutor = this.d;
    if (localfk.e != gi.a) {}
    switch (gf.a[(-1 + localfk.e)])
    {
    default: 
      localfk.e = gi.b;
      localfk.c.a = null;
      localExecutor.execute(localfk.d);
      return;
    case 1: 
      throw new IllegalStateException("Cannot execute task: the task is already running.");
    }
    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
  }
  
  public abstract D d();
  
  public void e() {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fj
 * JD-Core Version:    0.7.0.1
 */