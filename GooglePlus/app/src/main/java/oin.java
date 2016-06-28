public final class oin
  extends qan<oin>
{
  private static volatile oin[] b;
  public String a = null;
  private oio[] c = oio.b();
  
  public oin()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static oin[] b()
  {
    if (b == null) {}
    synchronized (qar.a)
    {
      if (b == null) {
        b = new oin[0];
      }
      return b;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      String str = this.a;
      int i1 = qal.d(8);
      int i2 = qal.a(str);
      i += i1 + (i2 + qal.d(i2));
    }
    if ((this.c != null) && (this.c.length > 0))
    {
      int j = i;
      for (int k = 0; k < this.c.length; k++)
      {
        oio localoio = this.c[k];
        if (localoio != null)
        {
          int m = qal.d(16);
          int n = localoio.a();
          localoio.ak = n;
          j += m + (n + qal.d(n));
        }
      }
      i = j;
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      String str = this.a;
      paramqal.c(10);
      paramqal.a(str);
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (int i = 0; i < this.c.length; i++)
      {
        oio localoio = this.c[i];
        if (localoio != null)
        {
          paramqal.c(18);
          if (localoio.ak < 0) {
            localoio.ak = localoio.a();
          }
          paramqal.c(localoio.ak);
          localoio.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oin
 * JD-Core Version:    0.7.0.1
 */