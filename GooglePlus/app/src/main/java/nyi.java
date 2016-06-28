public final class nyi
  extends qan<nyi>
{
  private nye a = null;
  
  public nyi()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      nye localnye = this.a;
      int j = qal.d(8);
      int k = localnye.a();
      localnye.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      nye localnye = this.a;
      paramqal.c(10);
      if (localnye.ak < 0) {
        localnye.ak = localnye.a();
      }
      paramqal.c(localnye.ak);
      localnye.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nyi
 * JD-Core Version:    0.7.0.1
 */