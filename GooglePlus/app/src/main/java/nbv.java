public final class nbv
  extends qan<nbv>
{
  public oaf a = null;
  public mpv apiHeader = null;
  
  public nbv()
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
      oaf localoaf = this.a;
      int j = qal.d(16);
      int k = localoaf.a();
      localoaf.ak = k;
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
      oaf localoaf = this.a;
      paramqal.c(18);
      if (localoaf.ak < 0) {
        localoaf.ak = localoaf.a();
      }
      paramqal.c(localoaf.ak);
      localoaf.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nbv
 * JD-Core Version:    0.7.0.1
 */