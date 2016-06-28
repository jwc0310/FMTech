public final class mwe
  extends qan<mwe>
{
  public oln a = null;
  public mpw apiHeader = null;
  
  public mwe()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.apiHeader != null)
    {
      mpw localmpw = this.apiHeader;
      int m = qal.d(8);
      int n = localmpw.a();
      localmpw.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.a != null)
    {
      oln localoln = this.a;
      int j = qal.d(16);
      int k = localoln.a();
      localoln.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.apiHeader != null)
    {
      mpw localmpw = this.apiHeader;
      paramqal.c(10);
      if (localmpw.ak < 0) {
        localmpw.ak = localmpw.a();
      }
      paramqal.c(localmpw.ak);
      localmpw.a(paramqal);
    }
    if (this.a != null)
    {
      oln localoln = this.a;
      paramqal.c(18);
      if (localoln.ak < 0) {
        localoln.ak = localoln.a();
      }
      paramqal.c(localoln.ak);
      localoln.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mwe
 * JD-Core Version:    0.7.0.1
 */