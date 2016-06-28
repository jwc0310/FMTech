import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;

public final class iwz
{
  final iwy a;
  volatile boolean b = false;
  public volatile long c;
  final AtomicLong d = new AtomicLong(0L);
  final Runnable e = new ixa(this);
  private final Executor f;
  
  iwz(iwy paramiwy) {}
  
  iwz(iwy paramiwy, long paramLong) {}
  
  private iwz(Executor paramExecutor, iwy paramiwy, long paramLong)
  {
    this.f = paramExecutor;
    this.a = paramiwy;
    this.c = paramLong;
  }
  
  final void a(long paramLong)
  {
    this.d.getAndAdd(paramLong);
    if ((this.d.get() == this.c) || (!this.b))
    {
      this.b = true;
      if (this.f != null) {
        this.f.execute(this.e);
      }
    }
    else
    {
      return;
    }
    new ixb(this).execute(new Void[0]);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iwz
 * JD-Core Version:    0.7.0.1
 */