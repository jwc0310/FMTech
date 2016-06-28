public final class oeo
  extends qan<oeo>
{
  public oea a = null;
  public oep b = null;
  
  public oeo()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      oea localoea = this.a;
      int m = qal.d(8);
      int n = localoea.a();
      localoea.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.b != null)
    {
      oep localoep = this.b;
      int j = qal.d(16);
      int k = localoep.a();
      localoep.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      oea localoea = this.a;
      paramqal.c(10);
      if (localoea.ak < 0) {
        localoea.ak = localoea.a();
      }
      paramqal.c(localoea.ak);
      localoea.a(paramqal);
    }
    if (this.b != null)
    {
      oep localoep = this.b;
      paramqal.c(18);
      if (localoep.ak < 0) {
        localoep.ak = localoep.a();
      }
      paramqal.c(localoep.ak);
      localoep.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oeo
 * JD-Core Version:    0.7.0.1
 */