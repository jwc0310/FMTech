public final class nns
  extends qan<nns>
{
  public nnx a = null;
  public nnr b = null;
  public nno c = null;
  
  public nns()
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
      int i1 = qal.d(8);
      int i2 = localnnx.a();
      localnnx.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.b != null)
    {
      nnr localnnr = this.b;
      int m = qal.d(16);
      int n = localnnr.a();
      localnnr.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.c != null)
    {
      nno localnno = this.c;
      int j = qal.d(24);
      int k = localnno.a();
      localnno.ak = k;
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
      nnr localnnr = this.b;
      paramqal.c(18);
      if (localnnr.ak < 0) {
        localnnr.ak = localnnr.a();
      }
      paramqal.c(localnnr.ak);
      localnnr.a(paramqal);
    }
    if (this.c != null)
    {
      nno localnno = this.c;
      paramqal.c(26);
      if (localnno.ak < 0) {
        localnno.ak = localnno.a();
      }
      paramqal.c(localnno.ak);
      localnno.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nns
 * JD-Core Version:    0.7.0.1
 */