public final class mmx
  extends qan<mmx>
{
  private static volatile mmx[] a;
  private mos b = null;
  private String c = null;
  private int d = -2147483648;
  
  public mmx()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static mmx[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new mmx[0];
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
      int i2 = qal.d(8);
      int i3 = localmos.a();
      localmos.ak = i3;
      i += i2 + (i3 + qal.d(i3));
    }
    if (this.c != null)
    {
      String str = this.c;
      int n = qal.d(16);
      int i1 = qal.a(str);
      i += n + (i1 + qal.d(i1));
    }
    int j;
    int k;
    if (this.d != -2147483648)
    {
      j = this.d;
      k = qal.d(24);
      if (j < 0) {
        break label133;
      }
    }
    label133:
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
    if (this.c != null)
    {
      String str = this.c;
      paramqal.c(18);
      paramqal.a(str);
    }
    if (this.d != -2147483648)
    {
      int i = this.d;
      paramqal.c(24);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mmx
 * JD-Core Version:    0.7.0.1
 */