public final class mnb
  extends qan<mnb>
{
  private static volatile mnb[] a;
  private mos b = null;
  private Long c = null;
  private Long d = null;
  private String e = null;
  
  public mnb()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static mnb[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new mnb[0];
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
      int m = qal.d(8);
      int n = localmos.a();
      localmos.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.c != null)
    {
      long l2 = this.c.longValue();
      i += qal.d(16) + qal.b(l2);
    }
    if (this.d != null)
    {
      long l1 = this.d.longValue();
      i += qal.d(24) + qal.b(l1);
    }
    if (this.e != null)
    {
      String str = this.e;
      int j = qal.d(32);
      int k = qal.a(str);
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
      long l2 = this.c.longValue();
      paramqal.c(16);
      paramqal.a(l2);
    }
    if (this.d != null)
    {
      long l1 = this.d.longValue();
      paramqal.c(24);
      paramqal.a(l1);
    }
    if (this.e != null)
    {
      String str = this.e;
      paramqal.c(34);
      paramqal.a(str);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mnb
 * JD-Core Version:    0.7.0.1
 */