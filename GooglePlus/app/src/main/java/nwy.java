public final class nwy
  extends qan<nwy>
{
  public nxa a = null;
  private nww b = null;
  
  public nwy()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      nxa localnxa = this.a;
      int m = qal.d(8);
      int n = localnxa.a();
      localnxa.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.b != null)
    {
      nww localnww = this.b;
      int j = qal.d(16);
      int k = localnww.a();
      localnww.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      nxa localnxa = this.a;
      paramqal.c(10);
      if (localnxa.ak < 0) {
        localnxa.ak = localnxa.a();
      }
      paramqal.c(localnxa.ak);
      localnxa.a(paramqal);
    }
    if (this.b != null)
    {
      nww localnww = this.b;
      paramqal.c(18);
      if (localnww.ak < 0) {
        localnww.ak = localnww.a();
      }
      paramqal.c(localnww.ak);
      localnww.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nwy
 * JD-Core Version:    0.7.0.1
 */