public final class oah
  extends qan<oah>
{
  public oac a = null;
  
  public oah()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      oac localoac = this.a;
      int j = qal.d(8);
      int k = localoac.a();
      localoac.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      oac localoac = this.a;
      paramqal.c(10);
      if (localoac.ak < 0) {
        localoac.ak = localoac.a();
      }
      paramqal.c(localoac.ak);
      localoac.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oah
 * JD-Core Version:    0.7.0.1
 */