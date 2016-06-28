public final class ncf
  extends qan<ncf>
{
  public nfg a = null;
  public mpv apiHeader = null;
  
  public ncf()
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
      nfg localnfg = this.a;
      int j = qal.d(16);
      int k = localnfg.a();
      localnfg.ak = k;
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
      nfg localnfg = this.a;
      paramqal.c(18);
      if (localnfg.ak < 0) {
        localnfg.ak = localnfg.a();
      }
      paramqal.c(localnfg.ak);
      localnfg.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ncf
 * JD-Core Version:    0.7.0.1
 */