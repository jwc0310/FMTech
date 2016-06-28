public final class nuz
  extends qan<nuz>
{
  public nvd a = null;
  
  public nuz()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      nvd localnvd = this.a;
      int j = qal.d(8);
      int k = localnvd.a();
      localnvd.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      nvd localnvd = this.a;
      paramqal.c(10);
      if (localnvd.ak < 0) {
        localnvd.ak = localnvd.a();
      }
      paramqal.c(localnvd.ak);
      localnvd.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nuz
 * JD-Core Version:    0.7.0.1
 */