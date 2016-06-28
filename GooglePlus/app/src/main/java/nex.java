public final class nex
  extends qan<nex>
{
  public String a = null;
  public ndt b = null;
  public ndt c = null;
  
  static
  {
    new qao(11, nex.class, (int)690558826L, false);
  }
  
  public nex()
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
      int i1 = qal.d(8);
      int i2 = qal.a(str);
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.b != null)
    {
      ndt localndt2 = this.b;
      int m = qal.d(16);
      int n = localndt2.a();
      localndt2.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.c != null)
    {
      ndt localndt1 = this.c;
      int j = qal.d(24);
      int k = localndt1.a();
      localndt1.ak = k;
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
      ndt localndt2 = this.b;
      paramqal.c(18);
      if (localndt2.ak < 0) {
        localndt2.ak = localndt2.a();
      }
      paramqal.c(localndt2.ak);
      localndt2.a(paramqal);
    }
    if (this.c != null)
    {
      ndt localndt1 = this.c;
      paramqal.c(26);
      if (localndt1.ak < 0) {
        localndt1.ak = localndt1.a();
      }
      paramqal.c(localndt1.ak);
      localndt1.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nex
 * JD-Core Version:    0.7.0.1
 */