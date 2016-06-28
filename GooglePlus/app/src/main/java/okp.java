public final class okp
  extends qan<okp>
{
  private static volatile okp[] a;
  private Double b = null;
  private String c = null;
  private okr[] d = okr.b();
  
  public okp()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static okp[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new okp[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    this.b.doubleValue();
    int j = i + (8 + qal.d(8));
    if (this.c != null)
    {
      String str = this.c;
      int i1 = qal.d(16);
      int i2 = qal.a(str);
      j += i1 + (i2 + qal.d(i2));
    }
    if ((this.d != null) && (this.d.length > 0)) {
      for (int k = 0; k < this.d.length; k++)
      {
        okr localokr = this.d[k];
        if (localokr != null)
        {
          int m = qal.d(24);
          int n = localokr.a();
          localokr.ak = n;
          j += m + (n + qal.d(n));
        }
      }
    }
    return j;
  }
  
  public final void a(qal paramqal)
  {
    double d1 = this.b.doubleValue();
    paramqal.c(9);
    paramqal.c(Double.doubleToLongBits(d1));
    if (this.c != null)
    {
      String str = this.c;
      paramqal.c(18);
      paramqal.a(str);
    }
    if ((this.d != null) && (this.d.length > 0)) {
      for (int i = 0; i < this.d.length; i++)
      {
        okr localokr = this.d[i];
        if (localokr != null)
        {
          paramqal.c(26);
          if (localokr.ak < 0) {
            localokr.ak = localokr.a();
          }
          paramqal.c(localokr.ak);
          localokr.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     okp
 * JD-Core Version:    0.7.0.1
 */