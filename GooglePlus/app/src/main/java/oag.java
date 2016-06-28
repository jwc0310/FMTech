public final class oag
  extends qan<oag>
{
  public nzt a = null;
  
  public oag()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      nzt localnzt = this.a;
      int j = qal.d(8);
      int k = localnzt.a();
      localnzt.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      nzt localnzt = this.a;
      paramqal.c(10);
      if (localnzt.ak < 0) {
        localnzt.ak = localnzt.a();
      }
      paramqal.c(localnzt.ak);
      localnzt.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oag
 * JD-Core Version:    0.7.0.1
 */