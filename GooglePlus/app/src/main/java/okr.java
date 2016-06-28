public final class okr
  extends qan<okr>
{
  private static volatile okr[] d;
  public String a = null;
  public String b = null;
  public String c = null;
  private String e = null;
  private String f = null;
  
  public okr()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static okr[] b()
  {
    if (d == null) {}
    synchronized (qar.a)
    {
      if (d == null) {
        d = new okr[0];
      }
      return d;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    String str1 = this.e;
    int j = qal.d(8);
    int k = qal.a(str1);
    int m = i + (j + (k + qal.d(k)));
    String str2 = this.a;
    int n = qal.d(16);
    int i1 = qal.a(str2);
    int i2 = m + (n + (i1 + qal.d(i1)));
    if (this.f != null)
    {
      String str5 = this.f;
      int i7 = qal.d(24);
      int i8 = qal.a(str5);
      i2 += i7 + (i8 + qal.d(i8));
    }
    if (this.b != null)
    {
      String str4 = this.b;
      int i5 = qal.d(32);
      int i6 = qal.a(str4);
      i2 += i5 + (i6 + qal.d(i6));
    }
    if (this.c != null)
    {
      String str3 = this.c;
      int i3 = qal.d(40);
      int i4 = qal.a(str3);
      i2 += i3 + (i4 + qal.d(i4));
    }
    return i2;
  }
  
  public final void a(qal paramqal)
  {
    String str1 = this.e;
    paramqal.c(10);
    paramqal.a(str1);
    String str2 = this.a;
    paramqal.c(18);
    paramqal.a(str2);
    if (this.f != null)
    {
      String str5 = this.f;
      paramqal.c(26);
      paramqal.a(str5);
    }
    if (this.b != null)
    {
      String str4 = this.b;
      paramqal.c(34);
      paramqal.a(str4);
    }
    if (this.c != null)
    {
      String str3 = this.c;
      paramqal.c(42);
      paramqal.a(str3);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     okr
 * JD-Core Version:    0.7.0.1
 */