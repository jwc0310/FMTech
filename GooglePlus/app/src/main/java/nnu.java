public final class nnu
  extends qan<nnu>
{
  public nnx a = null;
  public nnt b = null;
  
  public nnu()
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
      nnt localnnt = this.b;
      int j = qal.d(16);
      int k = localnnt.a();
      localnnt.ak = k;
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
      nnt localnnt = this.b;
      paramqal.c(18);
      if (localnnt.ak < 0) {
        localnnt.ak = localnnt.a();
      }
      paramqal.c(localnnt.ak);
      localnnt.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nnu
 * JD-Core Version:    0.7.0.1
 */