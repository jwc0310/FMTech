public final class ojh
  extends qan<ojh>
{
  private ojg a = null;
  private ojg b = null;
  
  public ojh()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      ojg localojg2 = this.a;
      int m = qal.d(8);
      int n = localojg2.a();
      localojg2.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.b != null)
    {
      ojg localojg1 = this.b;
      int j = qal.d(16);
      int k = localojg1.a();
      localojg1.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      ojg localojg2 = this.a;
      paramqal.c(10);
      if (localojg2.ak < 0) {
        localojg2.ak = localojg2.a();
      }
      paramqal.c(localojg2.ak);
      localojg2.a(paramqal);
    }
    if (this.b != null)
    {
      ojg localojg1 = this.b;
      paramqal.c(18);
      if (localojg1.ak < 0) {
        localojg1.ak = localojg1.a();
      }
      paramqal.c(localojg1.ak);
      localojg1.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ojh
 * JD-Core Version:    0.7.0.1
 */