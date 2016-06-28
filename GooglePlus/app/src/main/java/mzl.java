public final class mzl
  extends qan<mzl>
{
  public pto a = null;
  public mpv apiHeader = null;
  
  public mzl()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.apiHeader != null)
    {
      mpv localmpv = this.apiHeader;
      int m = qal.d(8);
      int n = localmpv.a();
      localmpv.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.a != null)
    {
      pto localpto = this.a;
      int j = qal.d(16);
      int k = localpto.a();
      localpto.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.apiHeader != null)
    {
      mpv localmpv = this.apiHeader;
      paramqal.c(10);
      if (localmpv.ak < 0) {
        localmpv.ak = localmpv.a();
      }
      paramqal.c(localmpv.ak);
      localmpv.a(paramqal);
    }
    if (this.a != null)
    {
      pto localpto = this.a;
      paramqal.c(18);
      if (localpto.ak < 0) {
        localpto.ak = localpto.a();
      }
      paramqal.c(localpto.ak);
      localpto.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mzl
 * JD-Core Version:    0.7.0.1
 */