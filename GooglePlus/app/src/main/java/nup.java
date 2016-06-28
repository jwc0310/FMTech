public final class nup
  extends qan<nup>
{
  public String a = null;
  public nul b = null;
  public String c = null;
  
  static
  {
    new qao(11, nup.class, (int)480851562L, false);
  }
  
  public nup()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      nul localnul = this.b;
      int i1 = qal.d(16);
      int i2 = localnul.a();
      localnul.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.a != null)
    {
      String str2 = this.a;
      int m = qal.d(32);
      int n = qal.a(str2);
      i += m + (n + qal.d(n));
    }
    if (this.c != null)
    {
      String str1 = this.c;
      int j = qal.d(40);
      int k = qal.a(str1);
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      nul localnul = this.b;
      paramqal.c(18);
      if (localnul.ak < 0) {
        localnul.ak = localnul.a();
      }
      paramqal.c(localnul.ak);
      localnul.a(paramqal);
    }
    if (this.a != null)
    {
      String str2 = this.a;
      paramqal.c(34);
      paramqal.a(str2);
    }
    if (this.c != null)
    {
      String str1 = this.c;
      paramqal.c(42);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nup
 * JD-Core Version:    0.7.0.1
 */