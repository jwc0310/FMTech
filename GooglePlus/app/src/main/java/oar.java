public final class oar
  extends qan<oar>
{
  public obn a = null;
  
  public oar()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      obn localobn = this.a;
      int j = qal.d(8);
      int k = localobn.a();
      localobn.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      obn localobn = this.a;
      paramqal.c(10);
      if (localobn.ak < 0) {
        localobn.ak = localobn.a();
      }
      paramqal.c(localobn.ak);
      localobn.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oar
 * JD-Core Version:    0.7.0.1
 */