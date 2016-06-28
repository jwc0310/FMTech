import android.os.Handler;
import android.os.Looper;

public abstract class duq
  implements Runnable
{
  public final Handler a;
  public long b;
  public final Runnable c = new dur(this);
  private final long d;
  
  public duq(long paramLong)
  {
    this(paramLong, efj.m());
  }
  
  private duq(long paramLong, Handler paramHandler)
  {
    this.d = paramLong;
    this.a = paramHandler;
  }
  
  public abstract void a();
  
  public void run()
  {
    long l1 = System.currentTimeMillis() - this.b;
    long l2 = this.d - l1;
    this.a.removeCallbacks(this.c);
    if (l2 <= 0L)
    {
      if (this.a.getLooper().getThread() == Thread.currentThread()) {}
      for (int i = 1; i != 0; i = 0)
      {
        this.c.run();
        return;
      }
      this.a.post(this.c);
      return;
    }
    this.a.postDelayed(this.c, l2);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     duq
 * JD-Core Version:    0.7.0.1
 */