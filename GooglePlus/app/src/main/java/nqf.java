import java.nio.ByteBuffer;

public final class nqf
  extends qan<nqf>
{
  public long[] a = qay.b;
  public int b = -2147483648;
  public Boolean c = null;
  public Boolean d = null;
  private String[] e = qay.f;
  private String[] f = qay.f;
  private String[] g = qay.f;
  private int h = -2147483648;
  private Boolean i = null;
  
  public nqf()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int j = 10;
    int k = 0;
    int m = super.a();
    int i18;
    if ((this.a != null) && (this.a.length > 0))
    {
      int i17 = 0;
      i18 = 0;
      while (i17 < this.a.length)
      {
        i18 += qal.b(this.a[i17]);
        i17++;
      }
    }
    for (int n = m + i18 + 1 * this.a.length;; n = m)
    {
      if ((this.e != null) && (this.e.length > 0))
      {
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < this.e.length)
        {
          String str3 = this.e[i13];
          if (str3 != null)
          {
            i15++;
            int i16 = qal.a(str3);
            i14 += i16 + qal.d(i16);
          }
          i13++;
        }
        n = n + i14 + i15 * 1;
      }
      int i10;
      int i11;
      if (this.b != -2147483648)
      {
        i10 = this.b;
        i11 = qal.d(24);
        if (i10 < 0) {
          break label340;
        }
      }
      int i7;
      int i8;
      label340:
      for (int i12 = qal.d(i10);; i12 = j)
      {
        n += i12 + i11;
        if (this.c != null)
        {
          this.c.booleanValue();
          n += 1 + qal.d(32);
        }
        if (this.d != null)
        {
          this.d.booleanValue();
          n += 1 + qal.d(40);
        }
        if ((this.f == null) || (this.f.length <= 0)) {
          break label358;
        }
        int i6 = 0;
        i7 = 0;
        i8 = 0;
        while (i6 < this.f.length)
        {
          String str2 = this.f[i6];
          if (str2 != null)
          {
            i8++;
            int i9 = qal.a(str2);
            i7 += i9 + qal.d(i9);
          }
          i6++;
        }
      }
      n = n + i7 + i8 * 1;
      label358:
      if ((this.g != null) && (this.g.length > 0))
      {
        int i3 = 0;
        int i4 = 0;
        while (k < this.g.length)
        {
          String str1 = this.g[k];
          if (str1 != null)
          {
            i4++;
            int i5 = qal.a(str1);
            i3 += i5 + qal.d(i5);
          }
          k++;
        }
        n = n + i3 + i4 * 1;
      }
      if (this.h != -2147483648)
      {
        int i1 = this.h;
        int i2 = qal.d(64);
        if (i1 >= 0) {
          j = qal.d(i1);
        }
        n += i2 + j;
      }
      if (this.i != null)
      {
        this.i.booleanValue();
        n += 1 + qal.d(72);
      }
      return n;
    }
  }
  
  public final void a(qal paramqal)
  {
    int j = 1;
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i5 = 0; i5 < this.a.length; i5++)
      {
        long l = this.a[i5];
        paramqal.c(8);
        paramqal.a(l);
      }
    }
    if ((this.e != null) && (this.e.length > 0)) {
      for (int i4 = 0; i4 < this.e.length; i4++)
      {
        String str3 = this.e[i4];
        if (str3 != null)
        {
          paramqal.c(18);
          paramqal.a(str3);
        }
      }
    }
    if (this.b != -2147483648)
    {
      int i3 = this.b;
      paramqal.c(24);
      paramqal.a(i3);
    }
    if (this.c != null)
    {
      boolean bool3 = this.c.booleanValue();
      paramqal.c(32);
      if (bool3) {}
      byte b3;
      for (int i2 = j;; i2 = 0)
      {
        b3 = (byte)i2;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b3);
    }
    if (this.d != null)
    {
      boolean bool2 = this.d.booleanValue();
      paramqal.c(40);
      if (bool2) {}
      byte b2;
      for (int i1 = j;; i1 = 0)
      {
        b2 = (byte)i1;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b2);
    }
    if ((this.f != null) && (this.f.length > 0)) {
      for (int n = 0; n < this.f.length; n++)
      {
        String str2 = this.f[n];
        if (str2 != null)
        {
          paramqal.c(50);
          paramqal.a(str2);
        }
      }
    }
    if ((this.g != null) && (this.g.length > 0)) {
      for (int m = 0; m < this.g.length; m++)
      {
        String str1 = this.g[m];
        if (str1 != null)
        {
          paramqal.c(58);
          paramqal.a(str1);
        }
      }
    }
    if (this.h != -2147483648)
    {
      int k = this.h;
      paramqal.c(64);
      paramqal.a(k);
    }
    if (this.i != null)
    {
      boolean bool1 = this.i.booleanValue();
      paramqal.c(72);
      if (bool1) {}
      byte b1;
      for (;;)
      {
        b1 = (byte)j;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
        j = 0;
      }
      paramqal.a.put(b1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nqf
 * JD-Core Version:    0.7.0.1
 */