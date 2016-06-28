public final class nfr
  extends qan<nfr>
{
  public nef a = null;
  private String b = null;
  
  public nfr()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      nef localnef = this.a;
      int m = qal.d(8);
      int n = localnef.a();
      localnef.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.b != null)
    {
      String str = this.b;
      int j = qal.d(16);
      int k = qal.a(str);
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      nef localnef = this.a;
      paramqal.c(10);
      if (localnef.ak < 0) {
        localnef.ak = localnef.a();
      }
      paramqal.c(localnef.ak);
      localnef.a(paramqal);
    }
    if (this.b != null)
    {
      String str = this.b;
      paramqal.c(18);
      paramqal.a(str);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nfr
 * JD-Core Version:    0.7.0.1
 */