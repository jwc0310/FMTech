public final class ncd
  extends qan<ncd>
{
  public nff a = null;
  public mpv apiHeader = null;
  
  public ncd()
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
      nff localnff = this.a;
      int j = qal.d(16);
      int k = localnff.a();
      localnff.ak = k;
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
      nff localnff = this.a;
      paramqal.c(18);
      if (localnff.ak < 0) {
        localnff.ak = localnff.a();
      }
      paramqal.c(localnff.ak);
      localnff.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ncd
 * JD-Core Version:    0.7.0.1
 */