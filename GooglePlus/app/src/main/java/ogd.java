public final class ogd
  extends qan<ogd>
{
  public opm a = null;
  
  public ogd()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      opm localopm = this.a;
      int j = qal.d(8);
      int k = localopm.a();
      localopm.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      opm localopm = this.a;
      paramqal.c(10);
      if (localopm.ak < 0) {
        localopm.ak = localopm.a();
      }
      paramqal.c(localopm.ak);
      localopm.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ogd
 * JD-Core Version:    0.7.0.1
 */