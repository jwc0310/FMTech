public final class mvd
  extends qan<mvd>
{
  public nqp a = null;
  public mpv apiHeader = null;
  
  public mvd()
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
      nqp localnqp = this.a;
      int j = qal.d(16);
      int k = localnqp.a();
      localnqp.ak = k;
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
      nqp localnqp = this.a;
      paramqal.c(18);
      if (localnqp.ak < 0) {
        localnqp.ak = localnqp.a();
      }
      paramqal.c(localnqp.ak);
      localnqp.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mvd
 * JD-Core Version:    0.7.0.1
 */