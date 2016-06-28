public final class ofi
  extends qan<ofi>
{
  public oea a = null;
  
  public ofi()
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
      int j = qal.d(8);
      int k = localoea.a();
      localoea.ak = k;
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
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ofi
 * JD-Core Version:    0.7.0.1
 */