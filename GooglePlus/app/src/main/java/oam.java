public final class oam
  extends qan<oam>
{
  public oaj a = null;
  
  public oam()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      oaj localoaj = this.a;
      int j = qal.d(8);
      int k = localoaj.a();
      localoaj.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      oaj localoaj = this.a;
      paramqal.c(10);
      if (localoaj.ak < 0) {
        localoaj.ak = localoaj.a();
      }
      paramqal.c(localoaj.ak);
      localoaj.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oam
 * JD-Core Version:    0.7.0.1
 */