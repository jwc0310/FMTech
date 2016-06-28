public final class nfj
  extends qan<nfj>
{
  public nei a = null;
  private ndy b = null;
  
  static
  {
    new qao(11, nfj.class, (int)410682042L, false);
  }
  
  public nfj()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      ndy localndy = this.b;
      int m = qal.d(16);
      int n = localndy.a();
      localndy.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.a != null)
    {
      nei localnei = this.a;
      int j = qal.d(24);
      int k = localnei.a();
      localnei.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      ndy localndy = this.b;
      paramqal.c(18);
      if (localndy.ak < 0) {
        localndy.ak = localndy.a();
      }
      paramqal.c(localndy.ak);
      localndy.a(paramqal);
    }
    if (this.a != null)
    {
      nei localnei = this.a;
      paramqal.c(26);
      if (localnei.ak < 0) {
        localnei.ak = localnei.a();
      }
      paramqal.c(localnei.ak);
      localnei.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nfj
 * JD-Core Version:    0.7.0.1
 */