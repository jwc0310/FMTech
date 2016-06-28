public final class mow
  extends qan<mow>
{
  private static volatile mow[] a;
  private mos b = null;
  private moj c = null;
  private moc d = null;
  
  public mow()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static mow[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new mow[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      mos localmos = this.b;
      int i1 = qal.d(8);
      int i2 = localmos.a();
      localmos.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.c != null)
    {
      moj localmoj = this.c;
      int m = qal.d(16);
      int n = localmoj.a();
      localmoj.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.d != null)
    {
      moc localmoc = this.d;
      int j = qal.d(24);
      int k = localmoc.a();
      localmoc.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      mos localmos = this.b;
      paramqal.c(10);
      if (localmos.ak < 0) {
        localmos.ak = localmos.a();
      }
      paramqal.c(localmos.ak);
      localmos.a(paramqal);
    }
    if (this.c != null)
    {
      moj localmoj = this.c;
      paramqal.c(18);
      if (localmoj.ak < 0) {
        localmoj.ak = localmoj.a();
      }
      paramqal.c(localmoj.ak);
      localmoj.a(paramqal);
    }
    if (this.d != null)
    {
      moc localmoc = this.d;
      paramqal.c(26);
      if (localmoc.ak < 0) {
        localmoc.ak = localmoc.a();
      }
      paramqal.c(localmoc.ak);
      localmoc.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mow
 * JD-Core Version:    0.7.0.1
 */