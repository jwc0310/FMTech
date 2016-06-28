public final class omu
  extends qan<omu>
{
  private static volatile omu[] c;
  public omr a = null;
  public omv b = null;
  
  public omu()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static omu[] b()
  {
    if (c == null) {}
    synchronized (qar.a)
    {
      if (c == null) {
        c = new omu[0];
      }
      return c;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      omr localomr = this.a;
      int m = qal.d(8);
      int n = localomr.a();
      localomr.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.b != null)
    {
      omv localomv = this.b;
      int j = qal.d(16);
      int k = localomv.a();
      localomv.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      omr localomr = this.a;
      paramqal.c(10);
      if (localomr.ak < 0) {
        localomr.ak = localomr.a();
      }
      paramqal.c(localomr.ak);
      localomr.a(paramqal);
    }
    if (this.b != null)
    {
      omv localomv = this.b;
      paramqal.c(18);
      if (localomv.ak < 0) {
        localomv.ak = localomv.a();
      }
      paramqal.c(localomv.ak);
      localomv.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     omu
 * JD-Core Version:    0.7.0.1
 */