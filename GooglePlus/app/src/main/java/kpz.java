import android.content.Context;
import android.os.SystemClock;
import java.util.Locale;

public final class kpz
  implements gwv
{
  public final int a;
  public final long b;
  public long c = 0L;
  public String d;
  
  public kpz(int paramInt, long paramLong)
  {
    this.a = paramInt;
    this.b = paramLong;
  }
  
  public final String a(Context paramContext, gwx paramgwx)
  {
    if (this.d != null) {
      return this.d;
    }
    return paramgwx.a(paramContext);
  }
  
  public final void a()
  {
    if (this.c == 0L) {
      this.c = SystemClock.elapsedRealtime();
    }
  }
  
  public final void a(Context paramContext)
  {
    a();
  }
  
  public final void b(Context paramContext)
  {
    ((gww)mbb.a(paramContext, gww.class)).a(paramContext, this);
  }
  
  public final String toString()
  {
    Locale localLocale = Locale.getDefault();
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(this.a);
    arrayOfObject[1] = Long.valueOf(this.c - this.b);
    return String.format(localLocale, "DurationEvent Code: %d & Duration: %d ms", arrayOfObject);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kpz
 * JD-Core Version:    0.7.0.1
 */