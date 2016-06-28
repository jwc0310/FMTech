public final class nyw
  extends qan<nyw>
{
  public nxl a = null;
  
  public nyw()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      nxl localnxl = this.a;
      int j = qal.d(8);
      int k = localnxl.a();
      localnxl.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      nxl localnxl = this.a;
      paramqal.c(10);
      if (localnxl.ak < 0) {
        localnxl.ak = localnxl.a();
      }
      paramqal.c(localnxl.ak);
      localnxl.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nyw
 * JD-Core Version:    0.7.0.1
 */