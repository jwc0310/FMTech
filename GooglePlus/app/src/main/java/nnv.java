public final class nnv
  extends qan<nnv>
{
  public mjx a = null;
  public mmw b = null;
  
  public nnv()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      mjx localmjx = this.a;
      int m = qal.d(8);
      int n = localmjx.a();
      localmjx.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.b != null)
    {
      mmw localmmw = this.b;
      int j = qal.d(16);
      int k = localmmw.a();
      localmmw.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      mjx localmjx = this.a;
      paramqal.c(10);
      if (localmjx.ak < 0) {
        localmjx.ak = localmjx.a();
      }
      paramqal.c(localmjx.ak);
      localmjx.a(paramqal);
    }
    if (this.b != null)
    {
      mmw localmmw = this.b;
      paramqal.c(18);
      if (localmmw.ak < 0) {
        localmmw.ak = localmmw.a();
      }
      paramqal.c(localmmw.ak);
      localmmw.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nnv
 * JD-Core Version:    0.7.0.1
 */