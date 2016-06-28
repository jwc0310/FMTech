public final class npp
  extends qan<npp>
{
  private pre a = null;
  private String b = null;
  
  public npp()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      pre localpre = this.a;
      int m = qal.d(8);
      int n = localpre.a();
      localpre.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.b != null)
    {
      String str = this.b;
      int j = qal.d(16);
      int k = qal.a(str);
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      pre localpre = this.a;
      paramqal.c(10);
      if (localpre.ak < 0) {
        localpre.ak = localpre.a();
      }
      paramqal.c(localpre.ak);
      localpre.a(paramqal);
    }
    if (this.b != null)
    {
      String str = this.b;
      paramqal.c(18);
      paramqal.a(str);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     npp
 * JD-Core Version:    0.7.0.1
 */