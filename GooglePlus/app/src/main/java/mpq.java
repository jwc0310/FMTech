public final class mpq
  extends qan<mpq>
{
  private String a = null;
  private mpr b = null;
  
  public mpq()
  {
    this.aj = null;
    this.ak = -1;
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
      mpr localmpr = this.b;
      int j = qal.d(16);
      int k = localmpr.a();
      localmpr.ak = k;
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
      mpr localmpr = this.b;
      paramqal.c(18);
      if (localmpr.ak < 0) {
        localmpr.ak = localmpr.a();
      }
      paramqal.c(localmpr.ak);
      localmpr.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mpq
 * JD-Core Version:    0.7.0.1
 */