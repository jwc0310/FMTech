public final class mtb
  extends qan<mtb>
{
  public ner a = null;
  public mpv apiHeader = null;
  
  public mtb()
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
      ner localner = this.a;
      int j = qal.d(16);
      int k = localner.a();
      localner.ak = k;
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
      ner localner = this.a;
      paramqal.c(18);
      if (localner.ak < 0) {
        localner.ak = localner.a();
      }
      paramqal.c(localner.ak);
      localner.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mtb
 * JD-Core Version:    0.7.0.1
 */