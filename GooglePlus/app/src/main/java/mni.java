public final class mni
  extends qan<mni>
{
  private static volatile mni[] a;
  private mos b = null;
  private mnj c = null;
  private String d = null;
  
  public mni()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static mni[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new mni[0];
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
      mnj localmnj = this.c;
      int m = qal.d(16);
      int n = localmnj.a();
      localmnj.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.d != null)
    {
      String str = this.d;
      int j = qal.d(24);
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
      mnj localmnj = this.c;
      paramqal.c(18);
      if (localmnj.ak < 0) {
        localmnj.ak = localmnj.a();
      }
      paramqal.c(localmnj.ak);
      localmnj.a(paramqal);
    }
    if (this.d != null)
    {
      String str = this.d;
      paramqal.c(26);
      paramqal.a(str);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mni
 * JD-Core Version:    0.7.0.1
 */