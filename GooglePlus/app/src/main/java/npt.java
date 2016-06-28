public final class npt
  extends qan<npt>
{
  private static volatile npt[] c;
  public pou a = null;
  public String b = null;
  
  public npt()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static npt[] b()
  {
    if (c == null) {}
    synchronized (qar.a)
    {
      if (c == null) {
        c = new npt[0];
      }
      return c;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      pou localpou = this.a;
      int m = qal.d(8);
      int n = localpou.a();
      localpou.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.b != null)
    {
      String str = this.b;
      int j = qal.d(16);
      int k = qal.a(str);
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      pou localpou = this.a;
      paramqal.c(10);
      if (localpou.ak < 0) {
        localpou.ak = localpou.a();
      }
      paramqal.c(localpou.ak);
      localpou.a(paramqal);
    }
    if (this.b != null)
    {
      String str = this.b;
      paramqal.c(18);
      paramqal.a(str);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     npt
 * JD-Core Version:    0.7.0.1
 */