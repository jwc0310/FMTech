public final class nrc
  extends qan<nrc>
{
  private static volatile nrc[] g;
  public int a = -2147483648;
  public nrb b = null;
  public Integer c = null;
  public nrb d = null;
  public Integer e = null;
  public Long f = null;
  
  public nrc()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nrc[] b()
  {
    if (g == null) {}
    synchronized (qar.a)
    {
      if (g == null) {
        g = new nrc[0];
      }
      return g;
    }
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    int i9;
    int i10;
    if (this.a != -2147483648)
    {
      int i8 = this.a;
      i9 = qal.d(8);
      if (i8 >= 0) {
        i10 = qal.d(i8);
      }
    }
    for (int k = j + (i10 + i9);; k = j)
    {
      if (this.b != null)
      {
        nrb localnrb2 = this.b;
        int i6 = qal.d(16);
        int i7 = localnrb2.a();
        localnrb2.ak = i7;
        k += i6 + (i7 + qal.d(i7));
      }
      int i3;
      int i4;
      if (this.c != null)
      {
        i3 = this.c.intValue();
        i4 = qal.d(24);
        if (i3 < 0) {
          break label268;
        }
      }
      label268:
      for (int i5 = qal.d(i3);; i5 = i)
      {
        k += i5 + i4;
        if (this.d != null)
        {
          nrb localnrb1 = this.d;
          int i1 = qal.d(32);
          int i2 = localnrb1.a();
          localnrb1.ak = i2;
          k += i1 + (i2 + qal.d(i2));
        }
        if (this.e != null)
        {
          int m = this.e.intValue();
          int n = qal.d(40);
          if (m >= 0) {
            i = qal.d(m);
          }
          k += i + n;
        }
        if (this.f != null)
        {
          long l = this.f.longValue();
          k += qal.d(48) + qal.b(l);
        }
        return k;
        i10 = i;
        break;
      }
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != -2147483648)
    {
      int k = this.a;
      paramqal.c(8);
      paramqal.a(k);
    }
    if (this.b != null)
    {
      nrb localnrb2 = this.b;
      paramqal.c(18);
      if (localnrb2.ak < 0) {
        localnrb2.ak = localnrb2.a();
      }
      paramqal.c(localnrb2.ak);
      localnrb2.a(paramqal);
    }
    if (this.c != null)
    {
      int j = this.c.intValue();
      paramqal.c(24);
      paramqal.a(j);
    }
    if (this.d != null)
    {
      nrb localnrb1 = this.d;
      paramqal.c(34);
      if (localnrb1.ak < 0) {
        localnrb1.ak = localnrb1.a();
      }
      paramqal.c(localnrb1.ak);
      localnrb1.a(paramqal);
    }
    if (this.e != null)
    {
      int i = this.e.intValue();
      paramqal.c(40);
      paramqal.a(i);
    }
    if (this.f != null)
    {
      long l = this.f.longValue();
      paramqal.c(48);
      paramqal.a(l);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nrc
 * JD-Core Version:    0.7.0.1
 */