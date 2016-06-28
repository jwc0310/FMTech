import java.nio.ByteBuffer;

public final class ngw
  extends qan<ngw>
{
  private static volatile ngw[] b;
  public Integer a = null;
  private int c = -2147483648;
  private Boolean d = null;
  private Boolean e = null;
  private String f = null;
  private String[] g = qay.f;
  private int h = -2147483648;
  
  public ngw()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static ngw[] b()
  {
    if (b == null) {}
    synchronized (qar.a)
    {
      if (b == null) {
        b = new ngw[0];
      }
      return b;
    }
  }
  
  protected final int a()
  {
    int i = 10;
    int j = 0;
    int k = super.a();
    int i11;
    int i12;
    if (this.a != null)
    {
      int i10 = this.a.intValue();
      i11 = qal.d(8);
      if (i10 >= 0) {
        i12 = qal.d(i10);
      }
    }
    for (int m = k + (i12 + i11);; m = k)
    {
      int i7;
      int i8;
      if (this.c != -2147483648)
      {
        i7 = this.c;
        i8 = qal.d(16);
        if (i7 < 0) {
          break label273;
        }
      }
      int i3;
      label273:
      for (int i9 = qal.d(i7);; i9 = i)
      {
        m += i9 + i8;
        if (this.d != null)
        {
          this.d.booleanValue();
          m += 1 + qal.d(24);
        }
        if (this.e != null)
        {
          this.e.booleanValue();
          m += 1 + qal.d(32);
        }
        if (this.f != null)
        {
          String str2 = this.f;
          int i5 = qal.d(40);
          int i6 = qal.a(str2);
          m += i5 + (i6 + qal.d(i6));
        }
        if ((this.g == null) || (this.g.length <= 0)) {
          break label290;
        }
        int i2 = 0;
        i3 = 0;
        while (i2 < this.g.length)
        {
          String str1 = this.g[i2];
          if (str1 != null)
          {
            i3++;
            int i4 = qal.a(str1);
            j += i4 + qal.d(i4);
          }
          i2++;
        }
        i12 = i;
        break;
      }
      m = m + j + i3 * 1;
      label290:
      if (this.h != -2147483648)
      {
        int n = this.h;
        int i1 = qal.d(56);
        if (n >= 0) {
          i = qal.d(n);
        }
        m += i + i1;
      }
      return m;
    }
  }
  
  public final void a(qal paramqal)
  {
    int i = 1;
    if (this.a != null)
    {
      int i2 = this.a.intValue();
      paramqal.c(8);
      paramqal.a(i2);
    }
    if (this.c != -2147483648)
    {
      int i1 = this.c;
      paramqal.c(16);
      paramqal.a(i1);
    }
    if (this.d != null)
    {
      boolean bool2 = this.d.booleanValue();
      paramqal.c(24);
      if (bool2) {}
      byte b2;
      for (int n = i;; n = 0)
      {
        b2 = (byte)n;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b2);
    }
    if (this.e != null)
    {
      boolean bool1 = this.e.booleanValue();
      paramqal.c(32);
      if (bool1) {}
      byte b1;
      for (;;)
      {
        b1 = (byte)i;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
        i = 0;
      }
      paramqal.a.put(b1);
    }
    if (this.f != null)
    {
      String str2 = this.f;
      paramqal.c(42);
      paramqal.a(str2);
    }
    if (this.g != null)
    {
      int k = this.g.length;
      int m = 0;
      if (k > 0) {
        while (m < this.g.length)
        {
          String str1 = this.g[m];
          if (str1 != null)
          {
            paramqal.c(50);
            paramqal.a(str1);
          }
          m++;
        }
      }
    }
    if (this.h != -2147483648)
    {
      int j = this.h;
      paramqal.c(56);
      paramqal.a(j);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ngw
 * JD-Core Version:    0.7.0.1
 */