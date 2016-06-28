public final class mhz
  extends qan<mhz>
{
  private static volatile mhz[] c;
  public mhy a = null;
  public pko b = null;
  
  public mhz()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static mhz[] b()
  {
    if (c == null) {}
    synchronized (qar.a)
    {
      if (c == null) {
        c = new mhz[0];
      }
      return c;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      mhy localmhy = this.a;
      int m = qal.d(8);
      int n = localmhy.a();
      localmhy.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.b != null)
    {
      pko localpko = this.b;
      int j = qal.d(16);
      int k = localpko.a();
      localpko.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      mhy localmhy = this.a;
      paramqal.c(10);
      if (localmhy.ak < 0) {
        localmhy.ak = localmhy.a();
      }
      paramqal.c(localmhy.ak);
      localmhy.a(paramqal);
    }
    if (this.b != null)
    {
      pko localpko = this.b;
      paramqal.c(18);
      if (localpko.ak < 0) {
        localpko.ak = localpko.a();
      }
      paramqal.c(localpko.ak);
      localpko.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mhz
 * JD-Core Version:    0.7.0.1
 */