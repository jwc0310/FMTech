public final class olt
  extends qan<olt>
{
  private oky a = null;
  private olv b = null;
  
  public olt()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      oky localoky = this.a;
      int m = qal.d(8);
      int n = localoky.a();
      localoky.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.b != null)
    {
      olv localolv = this.b;
      int j = qal.d(16);
      int k = localolv.a();
      localolv.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      oky localoky = this.a;
      paramqal.c(10);
      if (localoky.ak < 0) {
        localoky.ak = localoky.a();
      }
      paramqal.c(localoky.ak);
      localoky.a(paramqal);
    }
    if (this.b != null)
    {
      olv localolv = this.b;
      paramqal.c(18);
      if (localolv.ak < 0) {
        localolv.ak = localolv.a();
      }
      paramqal.c(localolv.ak);
      localolv.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     olt
 * JD-Core Version:    0.7.0.1
 */