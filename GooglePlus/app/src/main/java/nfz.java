public final class nfz
  extends qan<nfz>
{
  public String a = null;
  public ndr b = null;
  
  static
  {
    new qao(11, nfz.class, (int)491259194L, false);
  }
  
  public nfz()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      String str = this.a;
      int m = qal.d(8);
      int n = qal.a(str);
      i += m + (n + qal.d(n));
    }
    if (this.b != null)
    {
      ndr localndr = this.b;
      int j = qal.d(16);
      int k = localndr.a();
      localndr.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      String str = this.a;
      paramqal.c(10);
      paramqal.a(str);
    }
    if (this.b != null)
    {
      ndr localndr = this.b;
      paramqal.c(18);
      if (localndr.ak < 0) {
        localndr.ak = localndr.a();
      }
      paramqal.c(localndr.ak);
      localndr.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nfz
 * JD-Core Version:    0.7.0.1
 */