public final class nfg
  extends qan<nfg>
{
  public ndu a = null;
  public ndy b = null;
  private omk c = null;
  
  static
  {
    new qao(11, nfg.class, (int)414376562L, false);
  }
  
  public nfg()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      ndu localndu = this.a;
      int i1 = qal.d(16);
      int i2 = localndu.a();
      localndu.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.b != null)
    {
      ndy localndy = this.b;
      int m = qal.d(24);
      int n = localndy.a();
      localndy.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.c != null)
    {
      omk localomk = this.c;
      int j = qal.d(32);
      int k = localomk.a();
      localomk.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      ndu localndu = this.a;
      paramqal.c(18);
      if (localndu.ak < 0) {
        localndu.ak = localndu.a();
      }
      paramqal.c(localndu.ak);
      localndu.a(paramqal);
    }
    if (this.b != null)
    {
      ndy localndy = this.b;
      paramqal.c(26);
      if (localndy.ak < 0) {
        localndy.ak = localndy.a();
      }
      paramqal.c(localndy.ak);
      localndy.a(paramqal);
    }
    if (this.c != null)
    {
      omk localomk = this.c;
      paramqal.c(34);
      if (localomk.ak < 0) {
        localomk.ak = localomk.a();
      }
      paramqal.c(localomk.ak);
      localomk.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nfg
 * JD-Core Version:    0.7.0.1
 */