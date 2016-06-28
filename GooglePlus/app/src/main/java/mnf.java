import java.nio.ByteBuffer;

public final class mnf
  extends qan<mnf>
{
  private static volatile mnf[] a;
  private mos b = null;
  private String c = null;
  private String d = null;
  private Integer e = null;
  private Integer f = null;
  private Boolean g = null;
  
  public mnf()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static mnf[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new mnf[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    if (this.c != null)
    {
      String str2 = this.c;
      int i7 = qal.d(8);
      int i8 = qal.a(str2);
      j += i7 + (i8 + qal.d(i8));
    }
    if (this.d != null)
    {
      String str1 = this.d;
      int i5 = qal.d(16);
      int i6 = qal.a(str1);
      j += i5 + (i6 + qal.d(i6));
    }
    int i2;
    int i3;
    if (this.e != null)
    {
      i2 = this.e.intValue();
      i3 = qal.d(24);
      if (i2 < 0) {
        break label246;
      }
    }
    label246:
    for (int i4 = qal.d(i2);; i4 = i)
    {
      j += i4 + i3;
      if (this.f != null)
      {
        int n = this.f.intValue();
        int i1 = qal.d(32);
        if (n >= 0) {
          i = qal.d(n);
        }
        j += i1 + i;
      }
      if (this.g != null)
      {
        this.g.booleanValue();
        j += 1 + qal.d(40);
      }
      if (this.b != null)
      {
        mos localmos = this.b;
        int k = qal.d(48);
        int m = localmos.a();
        localmos.ak = m;
        j += k + (m + qal.d(m));
      }
      return j;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.c != null)
    {
      String str2 = this.c;
      paramqal.c(10);
      paramqal.a(str2);
    }
    if (this.d != null)
    {
      String str1 = this.d;
      paramqal.c(18);
      paramqal.a(str1);
    }
    if (this.e != null)
    {
      int k = this.e.intValue();
      paramqal.c(24);
      paramqal.a(k);
    }
    if (this.f != null)
    {
      int j = this.f.intValue();
      paramqal.c(32);
      paramqal.a(j);
    }
    if (this.g != null)
    {
      boolean bool = this.g.booleanValue();
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
    if (this.b != null)
    {
      mos localmos = this.b;
      paramqal.c(50);
      if (localmos.ak < 0) {
        localmos.ak = localmos.a();
      }
      paramqal.c(localmos.ak);
      localmos.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mnf
 * JD-Core Version:    0.7.0.1
 */