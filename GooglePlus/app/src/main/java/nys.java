public final class nys
  extends qan<nys>
{
  public oon a = null;
  public nxx b = null;
  
  public nys()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      oon localoon = this.a;
      int m = qal.d(8);
      int n = localoon.a();
      localoon.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.b != null)
    {
      nxx localnxx = this.b;
      int j = qal.d(16);
      int k = localnxx.a();
      localnxx.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      oon localoon = this.a;
      paramqal.c(10);
      if (localoon.ak < 0) {
        localoon.ak = localoon.a();
      }
      paramqal.c(localoon.ak);
      localoon.a(paramqal);
    }
    if (this.b != null)
    {
      nxx localnxx = this.b;
      paramqal.c(18);
      if (localnxx.ak < 0) {
        localnxx.ak = localnxx.a();
      }
      paramqal.c(localnxx.ak);
      localnxx.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nys
 * JD-Core Version:    0.7.0.1
 */