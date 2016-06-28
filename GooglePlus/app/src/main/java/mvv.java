public final class mvv
  extends qan<mvv>
{
  public qqw a = null;
  public mpv apiHeader = null;
  
  public mvv()
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
      qqw localqqw = this.a;
      int j = qal.d(16);
      int k = localqqw.a();
      localqqw.ak = k;
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
      qqw localqqw = this.a;
      paramqal.c(18);
      if (localqqw.ak < 0) {
        localqqw.ak = localqqw.a();
      }
      paramqal.c(localqqw.ak);
      localqqw.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mvv
 * JD-Core Version:    0.7.0.1
 */