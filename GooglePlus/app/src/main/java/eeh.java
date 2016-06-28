import android.util.Log;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;

public final class eeh
  implements edy
{
  public static final eem a = new eem();
  private static final long b = TimeUnit.MILLISECONDS.convert(2L, TimeUnit.MINUTES);
  private final ejr c;
  private final Object d = new Object();
  private long e = 0L;
  private efd f = null;
  
  static
  {
    new Object();
  }
  
  public eeh()
  {
    this(new ejs(), b, new eej());
  }
  
  private eeh(ejr paramejr, long paramLong, eej parameej)
  {
    new eei(this);
    this.c = paramejr;
  }
  
  private static void b(LogEventParcelable paramLogEventParcelable)
  {
    if ((paramLogEventParcelable.f != null) && (paramLogEventParcelable.e.f.length == 0)) {
      paramLogEventParcelable.e.f = paramLogEventParcelable.f.d();
    }
    if ((paramLogEventParcelable.g != null) && (paramLogEventParcelable.e.h.length == 0)) {
      paramLogEventParcelable.e.h = paramLogEventParcelable.g.d();
    }
    eyq localeyq = paramLogEventParcelable.e;
    int i = localeyq.a();
    localeyq.b = i;
    byte[] arrayOfByte = new byte[i];
    eyk.a(localeyq, arrayOfByte, 0, arrayOfByte.length);
    paramLogEventParcelable.c = arrayOfByte;
  }
  
  public final efk<Status> a(efd paramefd, LogEventParcelable paramLogEventParcelable)
  {
    b(paramLogEventParcelable);
    a.a();
    eek localeek = new eek(this, paramLogEventParcelable, paramefd);
    localeek.a(new efl(this));
    return paramefd.a(localeek);
  }
  
  public final boolean a(long paramLong, TimeUnit paramTimeUnit)
  {
    try
    {
      boolean bool = a.a(paramLong, paramTimeUnit);
      return bool;
    }
    catch (InterruptedException localInterruptedException)
    {
      Log.e("ClearcutLoggerApiImpl", "flush interrupted");
      Thread.currentThread().interrupt();
    }
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eeh
 * JD-Core Version:    0.7.0.1
 */