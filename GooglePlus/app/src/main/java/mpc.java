public final class mpc
  extends qan<mpc>
{
  private static volatile mpc[] a;
  private mos b = null;
  private String c = null;
  
  public mpc()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static mpc[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new mpc[0];
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
      String str = this.c;
      int j = qal.d(16);
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
      String str = this.c;
      paramqal.c(18);
      paramqal.a(str);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mpc
 * JD-Core Version:    0.7.0.1
 */