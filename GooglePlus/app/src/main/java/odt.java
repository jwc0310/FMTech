public final class odt
  extends qan<odt>
{
  public odl a = null;
  private odl b = null;
  
  public odt()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      odl localodl2 = this.a;
      int m = qal.d(8);
      int n = localodl2.a();
      localodl2.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.b != null)
    {
      odl localodl1 = this.b;
      int j = qal.d(16);
      int k = localodl1.a();
      localodl1.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      odl localodl2 = this.a;
      paramqal.c(10);
      if (localodl2.ak < 0) {
        localodl2.ak = localodl2.a();
      }
      paramqal.c(localodl2.ak);
      localodl2.a(paramqal);
    }
    if (this.b != null)
    {
      odl localodl1 = this.b;
      paramqal.c(18);
      if (localodl1.ak < 0) {
        localodl1.ak = localodl1.a();
      }
      paramqal.c(localodl1.ak);
      localodl1.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     odt
 * JD-Core Version:    0.7.0.1
 */