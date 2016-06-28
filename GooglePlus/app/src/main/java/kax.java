import android.os.Handler;
import android.os.Looper;

public abstract class kax
  implements kbb
{
  private static Handler a = new Handler(Looper.getMainLooper(), new kay());
  private kba b;
  private int c;
  private int d;
  private Object e;
  private kaz f;
  private volatile boolean g;
  private boolean h;
  
  public kax(kbd paramkbd) {}
  
  public final Object a()
  {
    efj.l();
    a.sendMessage(a.obtainMessage(0, this));
    try
    {
      if (!this.h)
      {
        boolean bool = this.g;
        if (bool) {}
      }
      try
      {
        wait();
        if (this.g) {
          throw new kbc(this.b);
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        for (;;)
        {
          this.g = true;
          a.sendMessage(a.obtainMessage(1, this));
          Thread.currentThread().interrupt();
        }
      }
      if (this.c == 1) {
        break label125;
      }
    }
    finally {}
    throw new kbm(this.b, this.c, this.d);
    label125:
    return this.e;
  }
  
  public final void a(kaz paramkaz)
  {
    this.f = paramkaz;
    this.c = paramkaz.q;
    if (this.c != 2)
    {
      this.b = paramkaz.o;
      this.d = paramkaz.r;
      this.e = paramkaz.p;
      a.sendMessage(a.obtainMessage(1, this));
      try
      {
        this.h = true;
        notify();
        return;
      }
      finally {}
    }
  }
  
  public final void ap_()
  {
    if (this.f != null)
    {
      this.f.b(this);
      this.f = null;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kax
 * JD-Core Version:    0.7.0.1
 */