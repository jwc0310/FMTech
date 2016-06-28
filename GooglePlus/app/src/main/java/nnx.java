public final class nnx
  extends qan<nnx>
{
  public String a = null;
  public nnm b = null;
  
  public nnx()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      String str = this.a;
      int m = qal.d(8);
      int n = qal.a(str);
      i += m + (n + qal.d(n));
    }
    if (this.b != null)
    {
      nnm localnnm = this.b;
      int j = qal.d(16);
      int k = localnnm.a();
      localnnm.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      String str = this.a;
      paramqal.c(10);
      paramqal.a(str);
    }
    if (this.b != null)
    {
      nnm localnnm = this.b;
      paramqal.c(18);
      if (localnnm.ak < 0) {
        localnnm.ak = localnnm.a();
      }
      paramqal.c(localnnm.ak);
      localnnm.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nnx
 * JD-Core Version:    0.7.0.1
 */