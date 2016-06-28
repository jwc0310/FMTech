import java.nio.ByteBuffer;

public final class mov
  extends qan<mov>
{
  private static volatile mov[] b;
  public String a = null;
  private mos c = null;
  private Boolean d = null;
  private String e = null;
  private String[] f = qay.f;
  
  public mov()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static mov[] b()
  {
    if (b == null) {}
    synchronized (qar.a)
    {
      if (b == null) {
        b = new mov[0];
      }
      return b;
    }
  }
  
  protected final int a()
  {
    int i = 0;
    int j = super.a();
    if (this.c != null)
    {
      mos localmos = this.c;
      int i5 = qal.d(8);
      int i6 = localmos.a();
      localmos.ak = i6;
      j += i5 + (i6 + qal.d(i6));
    }
    if (this.a != null)
    {
      String str3 = this.a;
      int i3 = qal.d(16);
      int i4 = qal.a(str3);
      j += i3 + (i4 + qal.d(i4));
    }
    if (this.d != null)
    {
      this.d.booleanValue();
      j += 1 + qal.d(24);
    }
    if (this.e != null)
    {
      String str2 = this.e;
      int i1 = qal.d(32);
      int i2 = qal.a(str2);
      j += i1 + (i2 + qal.d(i2));
    }
    if ((this.f != null) && (this.f.length > 0))
    {
      int k = 0;
      int m = 0;
      while (i < this.f.length)
      {
        String str1 = this.f[i];
        if (str1 != null)
        {
          m++;
          int n = qal.a(str1);
          k += n + qal.d(n);
        }
        i++;
      }
      j = j + k + m * 1;
    }
    return j;
  }
  
  public final void a(qal paramqal)
  {
    if (this.c != null)
    {
      mos localmos = this.c;
      paramqal.c(10);
      if (localmos.ak < 0) {
        localmos.ak = localmos.a();
      }
      paramqal.c(localmos.ak);
      localmos.a(paramqal);
    }
    if (this.a != null)
    {
      String str3 = this.a;
      paramqal.c(18);
      paramqal.a(str3);
    }
    if (this.d != null)
    {
      boolean bool = this.d.booleanValue();
      paramqal.c(24);
      if (bool) {}
      byte b1;
      for (int k = 1;; k = 0)
      {
        b1 = (byte)k;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b1);
    }
    if (this.e != null)
    {
      String str2 = this.e;
      paramqal.c(34);
      paramqal.a(str2);
    }
    if (this.f != null)
    {
      int i = this.f.length;
      int j = 0;
      if (i > 0) {
        while (j < this.f.length)
        {
          String str1 = this.f[j];
          if (str1 != null)
          {
            paramqal.c(42);
            paramqal.a(str1);
          }
          j++;
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mov
 * JD-Core Version:    0.7.0.1
 */