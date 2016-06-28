public final class omm
  extends qan<omm>
{
  private static volatile omm[] f;
  public omn a = null;
  public String b = null;
  public String c = null;
  public String d = null;
  public String e = null;
  private okw g = null;
  
  public omm()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static omm[] b()
  {
    if (f == null) {}
    synchronized (qar.a)
    {
      if (f == null) {
        f = new omm[0];
      }
      return f;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      omn localomn = this.a;
      int i7 = qal.d(8);
      int i8 = localomn.a();
      localomn.ak = i8;
      i += i7 + (i8 + qal.d(i8));
    }
    if (this.b != null)
    {
      String str4 = this.b;
      int i5 = qal.d(16);
      int i6 = qal.a(str4);
      i += i5 + (i6 + qal.d(i6));
    }
    if (this.c != null)
    {
      String str3 = this.c;
      int i3 = qal.d(24);
      int i4 = qal.a(str3);
      i += i3 + (i4 + qal.d(i4));
    }
    if (this.g != null)
    {
      okw localokw = this.g;
      int i1 = qal.d(32);
      int i2 = localokw.a();
      localokw.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.d != null)
    {
      String str2 = this.d;
      int m = qal.d(40);
      int n = qal.a(str2);
      i += m + (n + qal.d(n));
    }
    if (this.e != null)
    {
      String str1 = this.e;
      int j = qal.d(48);
      int k = qal.a(str1);
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      omn localomn = this.a;
      paramqal.c(10);
      if (localomn.ak < 0) {
        localomn.ak = localomn.a();
      }
      paramqal.c(localomn.ak);
      localomn.a(paramqal);
    }
    if (this.b != null)
    {
      String str4 = this.b;
      paramqal.c(18);
      paramqal.a(str4);
    }
    if (this.c != null)
    {
      String str3 = this.c;
      paramqal.c(26);
      paramqal.a(str3);
    }
    if (this.g != null)
    {
      okw localokw = this.g;
      paramqal.c(34);
      if (localokw.ak < 0) {
        localokw.ak = localokw.a();
      }
      paramqal.c(localokw.ak);
      localokw.a(paramqal);
    }
    if (this.d != null)
    {
      String str2 = this.d;
      paramqal.c(42);
      paramqal.a(str2);
    }
    if (this.e != null)
    {
      String str1 = this.e;
      paramqal.c(50);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     omm
 * JD-Core Version:    0.7.0.1
 */