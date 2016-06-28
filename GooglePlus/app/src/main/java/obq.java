public final class obq
  extends qan<obq>
{
  private String a = null;
  private ome b = null;
  private omk c = null;
  
  public obq()
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
      int i1 = qal.d(8);
      int i2 = qal.a(str);
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.b != null)
    {
      ome localome = this.b;
      int m = qal.d(16);
      int n = localome.a();
      localome.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.c != null)
    {
      omk localomk = this.c;
      int j = qal.d(24);
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
      String str = this.a;
      paramqal.c(10);
      paramqal.a(str);
    }
    if (this.b != null)
    {
      ome localome = this.b;
      paramqal.c(18);
      if (localome.ak < 0) {
        localome.ak = localome.a();
      }
      paramqal.c(localome.ak);
      localome.a(paramqal);
    }
    if (this.c != null)
    {
      omk localomk = this.c;
      paramqal.c(26);
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
 * Qualified Name:     obq
 * JD-Core Version:    0.7.0.1
 */