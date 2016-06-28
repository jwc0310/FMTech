public final class mth
  extends qan<mth>
{
  public ogx a = null;
  public mpv apiHeader = null;
  
  public mth()
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
      ogx localogx = this.a;
      int j = qal.d(16);
      int k = localogx.a();
      localogx.ak = k;
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
      ogx localogx = this.a;
      paramqal.c(18);
      if (localogx.ak < 0) {
        localogx.ak = localogx.a();
      }
      paramqal.c(localogx.ak);
      localogx.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mth
 * JD-Core Version:    0.7.0.1
 */