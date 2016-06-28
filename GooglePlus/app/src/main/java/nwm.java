import java.nio.ByteBuffer;

public final class nwm
  extends qan<nwm>
{
  public omk a = null;
  public int b = -2147483648;
  private String c = null;
  private Boolean d = null;
  private Boolean e = null;
  private Boolean f = null;
  private String[] g = qay.f;
  
  public nwm()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 0;
    int j = super.a();
    if (this.c != null)
    {
      String str2 = this.c;
      int i6 = qal.d(8);
      int i7 = qal.a(str2);
      j += i6 + (i7 + qal.d(i7));
    }
    if (this.d != null)
    {
      this.d.booleanValue();
      j += 1 + qal.d(16);
    }
    if (this.e != null)
    {
      this.e.booleanValue();
      j += 1 + qal.d(24);
    }
    if (this.f != null)
    {
      this.f.booleanValue();
      j += 1 + qal.d(32);
    }
    if ((this.g != null) && (this.g.length > 0))
    {
      int i3 = 0;
      int i4 = 0;
      while (i < this.g.length)
      {
        String str1 = this.g[i];
        if (str1 != null)
        {
          i4++;
          int i5 = qal.a(str1);
          i3 += i5 + qal.d(i5);
        }
        i++;
      }
      j = j + i3 + i4 * 1;
    }
    int n;
    int i1;
    if (this.b != -2147483648)
    {
      n = this.b;
      i1 = qal.d(48);
      if (n < 0) {
        break label294;
      }
    }
    label294:
    for (int i2 = qal.d(n);; i2 = 10)
    {
      j += i2 + i1;
      if (this.a != null)
      {
        omk localomk = this.a;
        int k = qal.d(56);
        int m = localomk.a();
        localomk.ak = m;
        j += k + (m + qal.d(m));
      }
      return j;
    }
  }
  
  public final void a(qal paramqal)
  {
    int i = 1;
    if (this.c != null)
    {
      String str2 = this.c;
      paramqal.c(10);
      paramqal.a(str2);
    }
    if (this.d != null)
    {
      boolean bool3 = this.d.booleanValue();
      paramqal.c(16);
      if (bool3) {}
      byte b3;
      for (int i1 = i;; i1 = 0)
      {
        b3 = (byte)i1;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b3);
    }
    if (this.e != null)
    {
      boolean bool2 = this.e.booleanValue();
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
    if (this.f != null)
    {
      boolean bool1 = this.f.booleanValue();
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
            paramqal.c(42);
            paramqal.a(str1);
          }
          m++;
        }
      }
    }
    if (this.b != -2147483648)
    {
      int j = this.b;
      paramqal.c(48);
      paramqal.a(j);
    }
    if (this.a != null)
    {
      omk localomk = this.a;
      paramqal.c(58);
      if (localomk.ak < 0) {
        localomk.ak = localomk.a();
      }
      paramqal.c(localomk.ak);
      localomk.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nwm
 * JD-Core Version:    0.7.0.1
 */