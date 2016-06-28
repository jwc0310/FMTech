public final class mkf
  extends qan<mkf>
{
  private static volatile mkf[] d;
  public mkt a = null;
  public Long b = null;
  public mkh c = null;
  private mkw[] e = mkw.b();
  private String[] f = qay.f;
  
  public mkf()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static mkf[] b()
  {
    if (d == null) {}
    synchronized (qar.a)
    {
      if (d == null) {
        d = new mkf[0];
      }
      return d;
    }
  }
  
  protected final int a()
  {
    int i = 0;
    int j = super.a();
    if (this.a != null)
    {
      mkt localmkt = this.a;
      int i7 = qal.d(8);
      int i8 = localmkt.a();
      localmkt.ak = i8;
      j += i7 + (i8 + qal.d(i8));
    }
    if (this.b != null)
    {
      long l = this.b.longValue();
      j += qal.d(16) + qal.b(l);
    }
    if (this.c != null)
    {
      mkh localmkh = this.c;
      int i5 = qal.d(24);
      int i6 = localmkh.a();
      localmkh.ak = i6;
      j += i5 + (i6 + qal.d(i6));
    }
    if ((this.e != null) && (this.e.length > 0))
    {
      int i1 = j;
      for (int i2 = 0; i2 < this.e.length; i2++)
      {
        mkw localmkw = this.e[i2];
        if (localmkw != null)
        {
          int i3 = qal.d(32);
          int i4 = localmkw.a();
          localmkw.ak = i4;
          i1 += i3 + (i4 + qal.d(i4));
        }
      }
      j = i1;
    }
    if ((this.f != null) && (this.f.length > 0))
    {
      int k = 0;
      int m = 0;
      while (i < this.f.length)
      {
        String str = this.f[i];
        if (str != null)
        {
          m++;
          int n = qal.a(str);
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
    if (this.a != null)
    {
      mkt localmkt = this.a;
      paramqal.c(10);
      if (localmkt.ak < 0) {
        localmkt.ak = localmkt.a();
      }
      paramqal.c(localmkt.ak);
      localmkt.a(paramqal);
    }
    if (this.b != null)
    {
      long l = this.b.longValue();
      paramqal.c(16);
      paramqal.a(l);
    }
    if (this.c != null)
    {
      mkh localmkh = this.c;
      paramqal.c(26);
      if (localmkh.ak < 0) {
        localmkh.ak = localmkh.a();
      }
      paramqal.c(localmkh.ak);
      localmkh.a(paramqal);
    }
    if ((this.e != null) && (this.e.length > 0)) {
      for (int k = 0; k < this.e.length; k++)
      {
        mkw localmkw = this.e[k];
        if (localmkw != null)
        {
          paramqal.c(34);
          if (localmkw.ak < 0) {
            localmkw.ak = localmkw.a();
          }
          paramqal.c(localmkw.ak);
          localmkw.a(paramqal);
        }
      }
    }
    if (this.f != null)
    {
      int i = this.f.length;
      int j = 0;
      if (i > 0) {
        while (j < this.f.length)
        {
          String str = this.f[j];
          if (str != null)
          {
            paramqal.c(42);
            paramqal.a(str);
          }
          j++;
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mkf
 * JD-Core Version:    0.7.0.1
 */