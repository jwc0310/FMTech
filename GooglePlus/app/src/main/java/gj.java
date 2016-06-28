import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

class gj<Params, Result>
  implements Callable<Result>
{
  Params[] a;
  
  gj() {}
  
  gj(gc paramgc)
  {
    this();
  }
  
  public Result call()
  {
    this.b.f.set(true);
    Process.setThreadPriority(10);
    return this.b.c(this.b.a(this.a));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gj
 * JD-Core Version:    0.7.0.1
 */