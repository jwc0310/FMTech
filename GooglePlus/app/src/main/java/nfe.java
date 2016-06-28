public final class nfe
  extends qan<nfe>
{
  public ndt a = null;
  public String b = null;
  public String c = null;
  public ndr d = null;
  private neb e = null;
  
  static
  {
    new qao(11, nfe.class, (int)491259194L, false);
  }
  
  public nfe()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      ndt localndt = this.a;
      int i5 = qal.d(8);
      int i6 = localndt.a();
      localndt.ak = i6;
      i += i5 + (i6 + qal.d(i6));
    }
    if (this.b != null)
    {
      String str2 = this.b;
      int i3 = qal.d(16);
      int i4 = qal.a(str2);
      i += i3 + (i4 + qal.d(i4));
    }
    if (this.d != null)
    {
      ndr localndr = this.d;
      int i1 = qal.d(24);
      int i2 = localndr.a();
      localndr.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.c != null)
    {
      String str1 = this.c;
      int m = qal.d(32);
      int n = qal.a(str1);
      i += m + (n + qal.d(n));
    }
    if (this.e != null)
    {
      neb localneb = this.e;
      int j = qal.d(40);
      int k = localneb.a();
      localneb.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      ndt localndt = this.a;
      paramqal.c(10);
      if (localndt.ak < 0) {
        localndt.ak = localndt.a();
      }
      paramqal.c(localndt.ak);
      localndt.a(paramqal);
    }
    if (this.b != null)
    {
      String str2 = this.b;
      paramqal.c(18);
      paramqal.a(str2);
    }
    if (this.d != null)
    {
      ndr localndr = this.d;
      paramqal.c(26);
      if (localndr.ak < 0) {
        localndr.ak = localndr.a();
      }
      paramqal.c(localndr.ak);
      localndr.a(paramqal);
    }
    if (this.c != null)
    {
      String str1 = this.c;
      paramqal.c(34);
      paramqal.a(str1);
    }
    if (this.e != null)
    {
      neb localneb = this.e;
      paramqal.c(42);
      if (localneb.ak < 0) {
        localneb.ak = localneb.a();
      }
      paramqal.c(localneb.ak);
      localneb.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nfe
 * JD-Core Version:    0.7.0.1
 */