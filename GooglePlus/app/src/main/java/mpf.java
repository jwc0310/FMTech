public final class mpf
  extends qan<mpf>
{
  private static volatile mpf[] b;
  public String a = null;
  private mos c = null;
  
  public mpf()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static mpf[] b()
  {
    if (b == null) {}
    synchronized (qar.a)
    {
      if (b == null) {
        b = new mpf[0];
      }
      return b;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.c != null)
    {
      mos localmos = this.c;
      int m = qal.d(8);
      int n = localmos.a();
      localmos.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.a != null)
    {
      String str = this.a;
      int j = qal.d(16);
      int k = qal.a(str);
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.c != null)
    {
      mos localmos = this.c;
      paramqal.c(10);
      if (localmos.ak < 0) {
        localmos.ak = localmos.a();
      }
      paramqal.c(localmos.ak);
      localmos.a(paramqal);
    }
    if (this.a != null)
    {
      String str = this.a;
      paramqal.c(18);
      paramqal.a(str);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mpf
 * JD-Core Version:    0.7.0.1
 */