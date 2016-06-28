public final class nhi
  extends qan<nhi>
{
  private static volatile nhi[] d;
  public String a = null;
  public String b = null;
  public String c = null;
  private String e = null;
  private String f = null;
  private Integer g = null;
  
  public nhi()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nhi[] b()
  {
    if (d == null) {}
    synchronized (qar.a)
    {
      if (d == null) {
        d = new nhi[0];
      }
      return d;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      String str5 = this.a;
      int i8 = qal.d(8);
      int i9 = qal.a(str5);
      i += i8 + (i9 + qal.d(i9));
    }
    if (this.b != null)
    {
      String str4 = this.b;
      int i6 = qal.d(16);
      int i7 = qal.a(str4);
      i += i6 + (i7 + qal.d(i7));
    }
    if (this.e != null)
    {
      String str3 = this.e;
      int i4 = qal.d(24);
      int i5 = qal.a(str3);
      i += i4 + (i5 + qal.d(i5));
    }
    if (this.f != null)
    {
      String str2 = this.f;
      int i2 = qal.d(32);
      int i3 = qal.a(str2);
      i += i2 + (i3 + qal.d(i3));
    }
    int m;
    int n;
    if (this.g != null)
    {
      m = this.g.intValue();
      n = qal.d(40);
      if (m < 0) {
        break label251;
      }
    }
    label251:
    for (int i1 = qal.d(m);; i1 = 10)
    {
      i += i1 + n;
      if (this.c != null)
      {
        String str1 = this.c;
        int j = qal.d(48);
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
      String str5 = this.a;
      paramqal.c(10);
      paramqal.a(str5);
    }
    if (this.b != null)
    {
      String str4 = this.b;
      paramqal.c(18);
      paramqal.a(str4);
    }
    if (this.e != null)
    {
      String str3 = this.e;
      paramqal.c(26);
      paramqal.a(str3);
    }
    if (this.f != null)
    {
      String str2 = this.f;
      paramqal.c(34);
      paramqal.a(str2);
    }
    if (this.g != null)
    {
      int i = this.g.intValue();
      paramqal.c(40);
      paramqal.a(i);
    }
    if (this.c != null)
    {
      String str1 = this.c;
      paramqal.c(50);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nhi
 * JD-Core Version:    0.7.0.1
 */