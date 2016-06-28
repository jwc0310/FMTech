public final class obr
  extends qan<obr>
{
  public ome a = null;
  public omk b = null;
  private String c = null;
  
  public obr()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.c != null)
    {
      String str = this.c;
      int i1 = qal.d(8);
      int i2 = qal.a(str);
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.a != null)
    {
      ome localome = this.a;
      int m = qal.d(16);
      int n = localome.a();
      localome.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.b != null)
    {
      omk localomk = this.b;
      int j = qal.d(24);
      int k = localomk.a();
      localomk.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.c != null)
    {
      String str = this.c;
      paramqal.c(10);
      paramqal.a(str);
    }
    if (this.a != null)
    {
      ome localome = this.a;
      paramqal.c(18);
      if (localome.ak < 0) {
        localome.ak = localome.a();
      }
      paramqal.c(localome.ak);
      localome.a(paramqal);
    }
    if (this.b != null)
    {
      omk localomk = this.b;
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
 * Qualified Name:     obr
 * JD-Core Version:    0.7.0.1
 */