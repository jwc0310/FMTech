public final class mic
  extends qan<mic>
{
  public mib a = null;
  public pko b = null;
  
  public mic()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      mib localmib = this.a;
      int m = qal.d(8);
      int n = localmib.a();
      localmib.ak = n;
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
      mib localmib = this.a;
      paramqal.c(10);
      if (localmib.ak < 0) {
        localmib.ak = localmib.a();
      }
      paramqal.c(localmib.ak);
      localmib.a(paramqal);
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
 * Qualified Name:     mic
 * JD-Core Version:    0.7.0.1
 */