import java.nio.ByteBuffer;

public final class mnz
  extends qan<mnz>
{
  private static volatile mnz[] c;
  public int a = -2147483648;
  public Boolean b = null;
  private mos d = null;
  
  public mnz()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static mnz[] b()
  {
    if (c == null) {}
    synchronized (qar.a)
    {
      if (c == null) {
        c = new mnz[0];
      }
      return c;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.d != null)
    {
      mos localmos = this.d;
      int n = qal.d(8);
      int i1 = localmos.a();
      localmos.ak = i1;
      i += n + (i1 + qal.d(i1));
    }
    int j;
    int k;
    if (this.a != -2147483648)
    {
      j = this.a;
      k = qal.d(32);
      if (j < 0) {
        break label119;
      }
    }
    label119:
    for (int m = qal.d(j);; m = 10)
    {
      i += m + k;
      if (this.b != null)
      {
        this.b.booleanValue();
        i += 1 + qal.d(40);
      }
      return i;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.d != null)
    {
      mos localmos = this.d;
      paramqal.c(10);
      if (localmos.ak < 0) {
        localmos.ak = localmos.a();
      }
      paramqal.c(localmos.ak);
      localmos.a(paramqal);
    }
    if (this.a != -2147483648)
    {
      int j = this.a;
      paramqal.c(32);
      paramqal.a(j);
    }
    if (this.b != null)
    {
      boolean bool = this.b.booleanValue();
      paramqal.c(40);
      if (bool) {}
      byte b1;
      for (int i = 1;; i = 0)
      {
        b1 = (byte)i;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mnz
 * JD-Core Version:    0.7.0.1
 */