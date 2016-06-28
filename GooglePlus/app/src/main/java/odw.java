public final class odw
  extends qan<odw>
{
  private static volatile odw[] d;
  public String a = null;
  public String b = null;
  public String c = null;
  private odx e = null;
  
  public odw()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static odw[] b()
  {
    if (d == null) {}
    synchronized (qar.a)
    {
      if (d == null) {
        d = new odw[0];
      }
      return d;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      String str3 = this.a;
      int i3 = qal.d(8);
      int i4 = qal.a(str3);
      i += i3 + (i4 + qal.d(i4));
    }
    if (this.b != null)
    {
      String str2 = this.b;
      int i1 = qal.d(16);
      int i2 = qal.a(str2);
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.c != null)
    {
      String str1 = this.c;
      int m = qal.d(24);
      int n = qal.a(str1);
      i += m + (n + qal.d(n));
    }
    if (this.e != null)
    {
      odx localodx = this.e;
      int j = qal.d(32);
      int k = localodx.a();
      localodx.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      String str3 = this.a;
      paramqal.c(10);
      paramqal.a(str3);
    }
    if (this.b != null)
    {
      String str2 = this.b;
      paramqal.c(18);
      paramqal.a(str2);
    }
    if (this.c != null)
    {
      String str1 = this.c;
      paramqal.c(26);
      paramqal.a(str1);
    }
    if (this.e != null)
    {
      odx localodx = this.e;
      paramqal.c(34);
      if (localodx.ak < 0) {
        localodx.ak = localodx.a();
      }
      paramqal.c(localodx.ak);
      localodx.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     odw
 * JD-Core Version:    0.7.0.1
 */