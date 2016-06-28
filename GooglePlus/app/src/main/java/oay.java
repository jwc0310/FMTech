public final class oay
  extends qan<oay>
{
  private ome a = null;
  private omk b = null;
  
  public oay()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      ome localome = this.a;
      int m = qal.d(8);
      int n = localome.a();
      localome.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.b != null)
    {
      omk localomk = this.b;
      int j = qal.d(16);
      int k = localomk.a();
      localomk.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      ome localome = this.a;
      paramqal.c(10);
      if (localome.ak < 0) {
        localome.ak = localome.a();
      }
      paramqal.c(localome.ak);
      localome.a(paramqal);
    }
    if (this.b != null)
    {
      omk localomk = this.b;
      paramqal.c(18);
      if (localomk.ak < 0) {
        localomk.ak = localomk.a();
      }
      paramqal.c(localomk.ak);
      localomk.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oay
 * JD-Core Version:    0.7.0.1
 */