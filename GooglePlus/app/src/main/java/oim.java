public final class oim
  extends qan<oim>
{
  public String a = null;
  private oik b = null;
  
  public oim()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      oik localoik = this.b;
      int m = qal.d(8);
      int n = localoik.a();
      localoik.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.a != null)
    {
      String str = this.a;
      int j = qal.d(16);
      int k = qal.a(str);
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      oik localoik = this.b;
      paramqal.c(10);
      if (localoik.ak < 0) {
        localoik.ak = localoik.a();
      }
      paramqal.c(localoik.ak);
      localoik.a(paramqal);
    }
    if (this.a != null)
    {
      String str = this.a;
      paramqal.c(18);
      paramqal.a(str);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oim
 * JD-Core Version:    0.7.0.1
 */