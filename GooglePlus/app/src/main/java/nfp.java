public final class nfp
  extends qan<nfp>
{
  public nec a = null;
  
  public nfp()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      nec localnec = this.a;
      int j = qal.d(8);
      int k = localnec.a();
      localnec.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      nec localnec = this.a;
      paramqal.c(10);
      if (localnec.ak < 0) {
        localnec.ak = localnec.a();
      }
      paramqal.c(localnec.ak);
      localnec.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nfp
 * JD-Core Version:    0.7.0.1
 */