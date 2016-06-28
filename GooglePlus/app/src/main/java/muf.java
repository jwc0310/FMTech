public final class muf
  extends qan<muf>
{
  public ngd a = null;
  public mpv apiHeader = null;
  
  public muf()
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
      ngd localngd = this.a;
      int j = qal.d(16);
      int k = localngd.a();
      localngd.ak = k;
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
      ngd localngd = this.a;
      paramqal.c(18);
      if (localngd.ak < 0) {
        localngd.ak = localngd.a();
      }
      paramqal.c(localngd.ak);
      localngd.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     muf
 * JD-Core Version:    0.7.0.1
 */