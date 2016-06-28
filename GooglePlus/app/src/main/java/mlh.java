public final class mlh
  extends qan<mlh>
{
  private static volatile mlh[] c;
  public String a = null;
  public mlg b = null;
  
  public mlh()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static mlh[] b()
  {
    if (c == null) {}
    synchronized (qar.a)
    {
      if (c == null) {
        c = new mlh[0];
      }
      return c;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      String str = this.a;
      int m = qal.d(8);
      int n = qal.a(str);
      i += m + (n + qal.d(n));
    }
    if (this.b != null)
    {
      mlg localmlg = this.b;
      int j = qal.d(16);
      int k = localmlg.a();
      localmlg.ak = k;
      i += j + (k + qal.d(k));
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
    if (this.b != null)
    {
      mlg localmlg = this.b;
      paramqal.c(18);
      if (localmlg.ak < 0) {
        localmlg.ak = localmlg.a();
      }
      paramqal.c(localmlg.ak);
      localmlg.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mlh
 * JD-Core Version:    0.7.0.1
 */