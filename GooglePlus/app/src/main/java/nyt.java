public final class nyt
  extends qan<nyt>
{
  public nwy a = null;
  
  public nyt()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      nwy localnwy = this.a;
      int j = qal.d(8);
      int k = localnwy.a();
      localnwy.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      nwy localnwy = this.a;
      paramqal.c(10);
      if (localnwy.ak < 0) {
        localnwy.ak = localnwy.a();
      }
      paramqal.c(localnwy.ak);
      localnwy.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nyt
 * JD-Core Version:    0.7.0.1
 */