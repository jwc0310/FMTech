public final class ned
  extends qan<ned>
{
  private static volatile ned[] a;
  private nei b = null;
  private String c = null;
  
  public ned()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static ned[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new ned[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      nei localnei = this.b;
      int m = qal.d(8);
      int n = localnei.a();
      localnei.ak = n;
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
      nei localnei = this.b;
      paramqal.c(10);
      if (localnei.ak < 0) {
        localnei.ak = localnei.a();
      }
      paramqal.c(localnei.ak);
      localnei.a(paramqal);
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
 * Qualified Name:     ned
 * JD-Core Version:    0.7.0.1
 */