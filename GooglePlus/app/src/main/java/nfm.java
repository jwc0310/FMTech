public final class nfm
  extends qan<nfm>
{
  public nds a = null;
  public String b = null;
  
  static
  {
    new qao(11, nfm.class, (int)702012258L, false);
  }
  
  public nfm()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      nds localnds = this.a;
      int m = qal.d(8);
      int n = localnds.a();
      localnds.ak = n;
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
      nds localnds = this.a;
      paramqal.c(10);
      if (localnds.ak < 0) {
        localnds.ak = localnds.a();
      }
      paramqal.c(localnds.ak);
      localnds.a(paramqal);
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
 * Qualified Name:     nfm
 * JD-Core Version:    0.7.0.1
 */