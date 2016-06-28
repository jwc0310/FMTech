import java.util.ArrayList;
import java.util.List;

public final class ltb
{
  public final String a;
  public final long b;
  public final long c;
  public final List<Long> d;
  public final List<String> e;
  public final List<Long> f;
  public final long g;
  public long h;
  public final Object i = new Object();
  
  public ltb(String paramString, long paramLong1, long paramLong2)
  {
    this(paramString, paramLong1, paramLong2, System.currentTimeMillis(), 0L, new ArrayList(), new ArrayList(), new ArrayList());
  }
  
  public ltb(String paramString, long paramLong1, long paramLong2, long paramLong3, long paramLong4, List<String> paramList, List<Long> paramList1)
  {
    this(paramString, paramLong1, 1L, paramLong3, paramLong4, paramList, paramList1, new ArrayList());
  }
  
  private ltb(String paramString, long paramLong1, long paramLong2, long paramLong3, long paramLong4, List<String> paramList, List<Long> paramList1, List<Long> paramList2)
  {
    b(paramLong1);
    this.a = paramString;
    this.b = paramLong1;
    this.c = paramLong2;
    this.g = paramLong3;
    this.h = paramLong4;
    this.e = paramList;
    this.f = paramList1;
    this.d = paramList2;
  }
  
  private static void b(long paramLong)
  {
    if ((0xFFFFFFF0 & paramLong) != 0L)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Long.valueOf(paramLong);
      throw new IllegalArgumentException(String.format("%d is not valid aggregated categories value.", arrayOfObject));
    }
  }
  
  public final boolean a(long paramLong)
  {
    if ((paramLong & paramLong - 1L) != 0L)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Long.valueOf(paramLong);
      throw new IllegalArgumentException(String.format("%d is must be a single category value", arrayOfObject));
    }
    b(paramLong);
    boolean bool1;
    if (paramLong != 0L)
    {
      boolean bool2 = (paramLong & this.b) < 0L;
      bool1 = false;
      if (!bool2) {}
    }
    else
    {
      bool1 = true;
    }
    return bool1;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ltb
 * JD-Core Version:    0.7.0.1
 */