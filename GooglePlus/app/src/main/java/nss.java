public final class nss
  extends qan<nss>
{
  public String a = null;
  public String b = null;
  public Integer c = null;
  public oih d = null;
  
  public nss()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      String str2 = this.a;
      int i4 = qal.d(8);
      int i5 = qal.a(str2);
      i += i4 + (i5 + qal.d(i5));
    }
    if (this.b != null)
    {
      String str1 = this.b;
      int i2 = qal.d(16);
      int i3 = qal.a(str1);
      i += i2 + (i3 + qal.d(i3));
    }
    int m;
    int n;
    if (this.c != null)
    {
      m = this.c.intValue();
      n = qal.d(24);
      if (m < 0) {
        break label175;
      }
    }
    label175:
    for (int i1 = qal.d(m);; i1 = 10)
    {
      i += i1 + n;
      if (this.d != null)
      {
        oih localoih = this.d;
        int j = qal.d(32);
        int k = localoih.a();
        localoih.ak = k;
        i += j + (k + qal.d(k));
      }
      return i;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      String str2 = this.a;
      paramqal.c(10);
      paramqal.a(str2);
    }
    if (this.b != null)
    {
      String str1 = this.b;
      paramqal.c(18);
      paramqal.a(str1);
    }
    if (this.c != null)
    {
      int i = this.c.intValue();
      paramqal.c(24);
      paramqal.a(i);
    }
    if (this.d != null)
    {
      oih localoih = this.d;
      paramqal.c(34);
      if (localoih.ak < 0) {
        localoih.ak = localoih.a();
      }
      paramqal.c(localoih.ak);
      localoih.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nss
 * JD-Core Version:    0.7.0.1
 */