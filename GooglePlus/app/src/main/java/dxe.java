import android.os.SystemClock;
import android.view.View;

public final class dxe
  implements Runnable
{
  private long a;
  private long b;
  
  public dxe(dxb paramdxb) {}
  
  public final int a()
  {
    if (this.c.k != 3) {
      return 255;
    }
    long l = SystemClock.uptimeMillis();
    if (l > this.a + this.b) {
      return 0;
    }
    return (int)(255L - 255L * (l - this.a) / this.b);
  }
  
  public final void run()
  {
    if (this.c.k != 3)
    {
      this.b = 200L;
      this.a = SystemClock.uptimeMillis();
      this.c.a(3);
      return;
    }
    if (a() > 0)
    {
      this.c.m.invalidate();
      return;
    }
    this.c.a(0);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dxe
 * JD-Core Version:    0.7.0.1
 */