public final class nvz
  extends qan<nvz>
{
  private static volatile nvz[] e;
  public String a = null;
  public String b = null;
  public nvt c = null;
  public String d = null;
  private String f = null;
  
  public nvz()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nvz[] b()
  {
    if (e == null) {}
    synchronized (qar.a)
    {
      if (e == null) {
        e = new nvz[0];
      }
      return e;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      String str4 = this.a;
      int i5 = qal.d(8);
      int i6 = qal.a(str4);
      i += i5 + (i6 + qal.d(i6));
    }
    if (this.b != null)
    {
      String str3 = this.b;
      int i3 = qal.d(16);
      int i4 = qal.a(str3);
      i += i3 + (i4 + qal.d(i4));
    }
    if (this.c != null)
    {
      nvt localnvt = this.c;
      int i1 = qal.d(24);
      int i2 = localnvt.a();
      localnvt.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.f != null)
    {
      String str2 = this.f;
      int m = qal.d(32);
      int n = qal.a(str2);
      i += m + (n + qal.d(n));
    }
    if (this.d != null)
    {
      String str1 = this.d;
      int j = qal.d(40);
      int k = qal.a(str1);
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      String str4 = this.a;
      paramqal.c(10);
      paramqal.a(str4);
    }
    if (this.b != null)
    {
      String str3 = this.b;
      paramqal.c(18);
      paramqal.a(str3);
    }
    if (this.c != null)
    {
      nvt localnvt = this.c;
      paramqal.c(26);
      if (localnvt.ak < 0) {
        localnvt.ak = localnvt.a();
      }
      paramqal.c(localnvt.ak);
      localnvt.a(paramqal);
    }
    if (this.f != null)
    {
      String str2 = this.f;
      paramqal.c(34);
      paramqal.a(str2);
    }
    if (this.d != null)
    {
      String str1 = this.d;
      paramqal.c(42);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nvz
 * JD-Core Version:    0.7.0.1
 */