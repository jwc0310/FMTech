public final class mwi
  extends qan<mwi>
{
  public ote a = null;
  public mpw apiHeader = null;
  
  public mwi()
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
      ote localote = this.a;
      int j = qal.d(16);
      int k = localote.a();
      localote.ak = k;
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
      ote localote = this.a;
      paramqal.c(18);
      if (localote.ak < 0) {
        localote.ak = localote.a();
      }
      paramqal.c(localote.ak);
      localote.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mwi
 * JD-Core Version:    0.7.0.1
 */