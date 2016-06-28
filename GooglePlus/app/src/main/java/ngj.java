public final class ngj
  extends qan<ngj>
{
  public String a = null;
  public String b = null;
  private String c = null;
  private String d = null;
  private String e = null;
  
  public ngj()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      String str5 = this.a;
      int i5 = qal.d(8);
      int i6 = qal.a(str5);
      i += i5 + (i6 + qal.d(i6));
    }
    if (this.c != null)
    {
      String str4 = this.c;
      int i3 = qal.d(16);
      int i4 = qal.a(str4);
      i += i3 + (i4 + qal.d(i4));
    }
    if (this.b != null)
    {
      String str3 = this.b;
      int i1 = qal.d(24);
      int i2 = qal.a(str3);
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.d != null)
    {
      String str2 = this.d;
      int m = qal.d(32);
      int n = qal.a(str2);
      i += m + (n + qal.d(n));
    }
    if (this.e != null)
    {
      String str1 = this.e;
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
      String str5 = this.a;
      paramqal.c(10);
      paramqal.a(str5);
    }
    if (this.c != null)
    {
      String str4 = this.c;
      paramqal.c(18);
      paramqal.a(str4);
    }
    if (this.b != null)
    {
      String str3 = this.b;
      paramqal.c(26);
      paramqal.a(str3);
    }
    if (this.d != null)
    {
      String str2 = this.d;
      paramqal.c(34);
      paramqal.a(str2);
    }
    if (this.e != null)
    {
      String str1 = this.e;
      paramqal.c(42);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ngj
 * JD-Core Version:    0.7.0.1
 */