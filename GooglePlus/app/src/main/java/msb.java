public final class msb
  extends qan<msb>
{
  public ngh a = null;
  public mpv apiHeader = null;
  
  public msb()
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
      ngh localngh = this.a;
      int j = qal.d(16);
      int k = localngh.a();
      localngh.ak = k;
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
      ngh localngh = this.a;
      paramqal.c(18);
      if (localngh.ak < 0) {
        localngh.ak = localngh.a();
      }
      paramqal.c(localngh.ak);
      localngh.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     msb
 * JD-Core Version:    0.7.0.1
 */