public final class onu
  extends qan<onu>
{
  private String a = null;
  private int b = -2147483648;
  private ooj c = null;
  private String d = null;
  
  public onu()
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
    int i1;
    int i2;
    if (this.b != -2147483648)
    {
      i1 = this.b;
      i2 = qal.d(16);
      if (i1 < 0) {
        break label175;
      }
    }
    label175:
    for (int i3 = qal.d(i1);; i3 = 10)
    {
      i += i3 + i2;
      if (this.c != null)
      {
        ooj localooj = this.c;
        int m = qal.d(24);
        int n = localooj.a();
        localooj.ak = n;
        i += m + (n + qal.d(n));
      }
      if (this.d != null)
      {
        String str1 = this.d;
        int j = qal.d(32);
        int k = qal.a(str1);
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
    if (this.b != -2147483648)
    {
      int i = this.b;
      paramqal.c(16);
      paramqal.a(i);
    }
    if (this.c != null)
    {
      ooj localooj = this.c;
      paramqal.c(26);
      if (localooj.ak < 0) {
        localooj.ak = localooj.a();
      }
      paramqal.c(localooj.ak);
      localooj.a(paramqal);
    }
    if (this.d != null)
    {
      String str1 = this.d;
      paramqal.c(34);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     onu
 * JD-Core Version:    0.7.0.1
 */