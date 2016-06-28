import android.os.SystemClock;
import java.util.Map;

public final class ixt
{
  public final int a;
  public final String[] b;
  public final String c;
  public long d;
  public final long e;
  public long f;
  public long g;
  public long h;
  public final int i;
  public final String j;
  public final long k;
  public final Map<String, Long> l;
  private final long m;
  
  public ixt(int paramInt1, String[] paramArrayOfString, String paramString1, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, int paramInt2, String paramString2)
  {
    this(1, paramArrayOfString, paramString1, paramLong1, paramLong2, paramLong3, 0L, paramLong5, paramInt2, paramString2, 0L, null);
  }
  
  public ixt(int paramInt1, String[] paramArrayOfString, String paramString1, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, int paramInt2, String paramString2, long paramLong6, Map<String, Long> paramMap)
  {
    this.a = paramInt1;
    this.b = paramArrayOfString;
    this.c = paramString1;
    this.d = paramLong1;
    this.e = paramLong2;
    this.f = paramLong3;
    this.g = paramLong4;
    this.h = paramLong5;
    this.i = paramInt2;
    this.j = paramString2;
    this.k = paramLong6;
    this.l = paramMap;
    this.m = SystemClock.uptimeMillis();
  }
  
  public final boolean a(int paramInt)
  {
    return 7200L + this.m <= SystemClock.uptimeMillis();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ixt
 * JD-Core Version:    0.7.0.1
 */