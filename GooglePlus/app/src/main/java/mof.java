public final class mof
  extends qan<mof>
{
  private static volatile mof[] a;
  private mos b = null;
  private int c = -2147483648;
  
  public mof()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static mof[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new mof[0];
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
      int n = qal.d(8);
      int i1 = localmos.a();
      localmos.ak = i1;
      i += n + (i1 + qal.d(i1));
    }
    int j;
    int k;
    if (this.c != -2147483648)
    {
      j = this.c;
      k = qal.d(32);
      if (j < 0) {
        break label92;
      }
    }
    label92:
    for (int m = qal.d(j);; m = 10)
    {
      i += m + k;
      return i;
    }
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
    if (this.c != -2147483648)
    {
      int i = this.c;
      paramqal.c(32);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mof
 * JD-Core Version:    0.7.0.1
 */