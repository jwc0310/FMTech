import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

public class hpy
{
  private volatile hpz a;
  
  public final String a()
  {
    hpz localhpz = this.a;
    if (localhpz == null) {}
    while (SystemClock.elapsedRealtime() >= localhpz.b) {
      return null;
    }
    return localhpz.a;
  }
  
  public final void a(mgn parammgn)
  {
    String str = parammgn.a;
    long l = parammgn.b.intValue();
    if (l <= 0L)
    {
      this.a = null;
      return;
    }
    this.a = new hpz(str, SystemClock.elapsedRealtime() + TimeUnit.SECONDS.toMillis(l));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hpy
 * JD-Core Version:    0.7.0.1
 */