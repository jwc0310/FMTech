public final class mlw
  extends qan<mlw>
{
  private static volatile mlw[] d;
  public mmk a = null;
  public mmq b = null;
  public mma c = null;
  
  public mlw()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static mlw[] b()
  {
    if (d == null) {}
    synchronized (qar.a)
    {
      if (d == null) {
        d = new mlw[0];
      }
      return d;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      mmk localmmk = this.a;
      int i1 = qal.d(8);
      int i2 = localmmk.a();
      localmmk.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.b != null)
    {
      mmq localmmq = this.b;
      int m = qal.d(16);
      int n = localmmq.a();
      localmmq.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.c != null)
    {
      mma localmma = this.c;
      int j = qal.d(24);
      int k = localmma.a();
      localmma.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      mmk localmmk = this.a;
      paramqal.c(10);
      if (localmmk.ak < 0) {
        localmmk.ak = localmmk.a();
      }
      paramqal.c(localmmk.ak);
      localmmk.a(paramqal);
    }
    if (this.b != null)
    {
      mmq localmmq = this.b;
      paramqal.c(18);
      if (localmmq.ak < 0) {
        localmmq.ak = localmmq.a();
      }
      paramqal.c(localmmq.ak);
      localmmq.a(paramqal);
    }
    if (this.c != null)
    {
      mma localmma = this.c;
      paramqal.c(26);
      if (localmma.ak < 0) {
        localmma.ak = localmma.a();
      }
      paramqal.c(localmma.ak);
      localmma.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mlw
 * JD-Core Version:    0.7.0.1
 */