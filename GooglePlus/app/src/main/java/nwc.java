public final class nwc
  extends qan<nwc>
{
  private static volatile nwc[] a;
  private String b = null;
  private nwd c = null;
  
  public nwc()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nwc[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new nwc[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      String str = this.b;
      int m = qal.d(8);
      int n = qal.a(str);
      i += m + (n + qal.d(n));
    }
    if (this.c != null)
    {
      nwd localnwd = this.c;
      int j = qal.d(16);
      int k = localnwd.a();
      localnwd.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      String str = this.b;
      paramqal.c(10);
      paramqal.a(str);
    }
    if (this.c != null)
    {
      nwd localnwd = this.c;
      paramqal.c(18);
      if (localnwd.ak < 0) {
        localnwd.ak = localnwd.a();
      }
      paramqal.c(localnwd.ak);
      localnwd.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nwc
 * JD-Core Version:    0.7.0.1
 */