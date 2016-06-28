public final class mht
  extends qan<mht>
{
  public mic a = null;
  public mhv b = null;
  
  public mht()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      mic localmic = this.a;
      int m = qal.d(8);
      int n = localmic.a();
      localmic.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.b != null)
    {
      mhv localmhv = this.b;
      int j = qal.d(16);
      int k = localmhv.a();
      localmhv.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      mic localmic = this.a;
      paramqal.c(10);
      if (localmic.ak < 0) {
        localmic.ak = localmic.a();
      }
      paramqal.c(localmic.ak);
      localmic.a(paramqal);
    }
    if (this.b != null)
    {
      mhv localmhv = this.b;
      paramqal.c(18);
      if (localmhv.ak < 0) {
        localmhv.ak = localmhv.a();
      }
      paramqal.c(localmhv.ak);
      localmhv.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mht
 * JD-Core Version:    0.7.0.1
 */