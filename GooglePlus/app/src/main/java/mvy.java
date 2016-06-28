public final class mvy
  extends qan<mvy>
{
  public qqz a = null;
  public mpw apiHeader = null;
  
  public mvy()
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
      qqz localqqz = this.a;
      int j = qal.d(16);
      int k = localqqz.a();
      localqqz.ak = k;
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
      qqz localqqz = this.a;
      paramqal.c(18);
      if (localqqz.ak < 0) {
        localqqz.ak = localqqz.a();
      }
      paramqal.c(localqqz.ak);
      localqqz.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mvy
 * JD-Core Version:    0.7.0.1
 */