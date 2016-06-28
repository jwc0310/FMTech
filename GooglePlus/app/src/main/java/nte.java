public final class nte
  extends qan<nte>
{
  public okn a = null;
  private ojf b = null;
  
  public nte()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      ojf localojf = this.b;
      int m = qal.d(8);
      int n = localojf.a();
      localojf.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.a != null)
    {
      okn localokn = this.a;
      int j = qal.d(16);
      int k = localokn.a();
      localokn.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      ojf localojf = this.b;
      paramqal.c(10);
      if (localojf.ak < 0) {
        localojf.ak = localojf.a();
      }
      paramqal.c(localojf.ak);
      localojf.a(paramqal);
    }
    if (this.a != null)
    {
      okn localokn = this.a;
      paramqal.c(18);
      if (localokn.ak < 0) {
        localokn.ak = localokn.a();
      }
      paramqal.c(localokn.ak);
      localokn.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nte
 * JD-Core Version:    0.7.0.1
 */