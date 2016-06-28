public final class ndg
  extends qan<ndg>
{
  public ome a = null;
  private miv b = null;
  private String c = null;
  
  public ndg()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      miv localmiv = this.b;
      int i1 = qal.d(40);
      int i2 = localmiv.a();
      localmiv.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.c != null)
    {
      String str = this.c;
      int m = qal.d(48);
      int n = qal.a(str);
      i += m + (n + qal.d(n));
    }
    if (this.a != null)
    {
      ome localome = this.a;
      int j = qal.d(56);
      int k = localome.a();
      localome.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      miv localmiv = this.b;
      paramqal.c(42);
      if (localmiv.ak < 0) {
        localmiv.ak = localmiv.a();
      }
      paramqal.c(localmiv.ak);
      localmiv.a(paramqal);
    }
    if (this.c != null)
    {
      String str = this.c;
      paramqal.c(50);
      paramqal.a(str);
    }
    if (this.a != null)
    {
      ome localome = this.a;
      paramqal.c(58);
      if (localome.ak < 0) {
        localome.ak = localome.a();
      }
      paramqal.c(localome.ak);
      localome.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ndg
 * JD-Core Version:    0.7.0.1
 */