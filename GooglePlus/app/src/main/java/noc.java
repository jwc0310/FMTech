public final class noc
  extends qan<noc>
{
  public nnx a = null;
  public nob b = null;
  
  public noc()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      nnx localnnx = this.a;
      int m = qal.d(8);
      int n = localnnx.a();
      localnnx.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.b != null)
    {
      nob localnob = this.b;
      int j = qal.d(16);
      int k = localnob.a();
      localnob.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      nnx localnnx = this.a;
      paramqal.c(10);
      if (localnnx.ak < 0) {
        localnnx.ak = localnnx.a();
      }
      paramqal.c(localnnx.ak);
      localnnx.a(paramqal);
    }
    if (this.b != null)
    {
      nob localnob = this.b;
      paramqal.c(18);
      if (localnob.ak < 0) {
        localnob.ak = localnob.a();
      }
      paramqal.c(localnob.ak);
      localnob.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     noc
 * JD-Core Version:    0.7.0.1
 */