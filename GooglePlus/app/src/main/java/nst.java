public final class nst
  extends qan<nst>
{
  public String a = null;
  public Long b = null;
  public mmw c = null;
  private String d = null;
  private String e = null;
  private String f = null;
  private String g = null;
  
  public nst()
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
      int i7 = qal.d(8);
      int i8 = qal.a(str5);
      i += i7 + (i8 + qal.d(i8));
    }
    if (this.b != null)
    {
      long l = this.b.longValue();
      i += qal.d(16) + qal.b(l);
    }
    if (this.e != null)
    {
      String str4 = this.e;
      int i5 = qal.d(24);
      int i6 = qal.a(str4);
      i += i5 + (i6 + qal.d(i6));
    }
    if (this.c != null)
    {
      mmw localmmw = this.c;
      int i3 = qal.d(32);
      int i4 = localmmw.a();
      localmmw.ak = i4;
      i += i3 + (i4 + qal.d(i4));
    }
    if (this.f != null)
    {
      String str3 = this.f;
      int i1 = qal.d(40);
      int i2 = qal.a(str3);
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.g != null)
    {
      String str2 = this.g;
      int m = qal.d(48);
      int n = qal.a(str2);
      i += m + (n + qal.d(n));
    }
    if (this.d != null)
    {
      String str1 = this.d;
      int j = qal.d(56);
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
    if (this.b != null)
    {
      long l = this.b.longValue();
      paramqal.c(16);
      paramqal.a(l);
    }
    if (this.e != null)
    {
      String str4 = this.e;
      paramqal.c(26);
      paramqal.a(str4);
    }
    if (this.c != null)
    {
      mmw localmmw = this.c;
      paramqal.c(34);
      if (localmmw.ak < 0) {
        localmmw.ak = localmmw.a();
      }
      paramqal.c(localmmw.ak);
      localmmw.a(paramqal);
    }
    if (this.f != null)
    {
      String str3 = this.f;
      paramqal.c(42);
      paramqal.a(str3);
    }
    if (this.g != null)
    {
      String str2 = this.g;
      paramqal.c(50);
      paramqal.a(str2);
    }
    if (this.d != null)
    {
      String str1 = this.d;
      paramqal.c(58);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nst
 * JD-Core Version:    0.7.0.1
 */