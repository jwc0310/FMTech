public final class nnq
  extends qan<nnq>
{
  public nnx a = null;
  public nnp b = null;
  private nno c = null;
  
  public nnq()
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
      nnp localnnp = this.b;
      int m = qal.d(16);
      int n = localnnp.a();
      localnnp.ak = n;
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
      nnp localnnp = this.b;
      paramqal.c(18);
      if (localnnp.ak < 0) {
        localnnp.ak = localnnp.a();
      }
      paramqal.c(localnnp.ak);
      localnnp.a(paramqal);
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
 * Qualified Name:     nnq
 * JD-Core Version:    0.7.0.1
 */