public final class nyl
  extends qan<nyl>
{
  public nyf a = null;
  public nyb b = null;
  
  public nyl()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      nyf localnyf = this.a;
      int m = qal.d(8);
      int n = localnyf.a();
      localnyf.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.b != null)
    {
      nyb localnyb = this.b;
      int j = qal.d(16);
      int k = localnyb.a();
      localnyb.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      nyf localnyf = this.a;
      paramqal.c(10);
      if (localnyf.ak < 0) {
        localnyf.ak = localnyf.a();
      }
      paramqal.c(localnyf.ak);
      localnyf.a(paramqal);
    }
    if (this.b != null)
    {
      nyb localnyb = this.b;
      paramqal.c(18);
      if (localnyb.ak < 0) {
        localnyb.ak = localnyb.a();
      }
      paramqal.c(localnyb.ak);
      localnyb.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nyl
 * JD-Core Version:    0.7.0.1
 */