public final class mmy
  extends qan<mmy>
{
  private static volatile mmy[] a;
  private mos b = null;
  private String c = null;
  private String d = null;
  private String e = null;
  private String f = null;
  private String g = null;
  private String h = null;
  private String i = null;
  private String j = null;
  private String k = null;
  private String l = null;
  private String m = null;
  
  public mmy()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static mmy[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new mmy[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int n = super.a();
    if (this.b != null)
    {
      mos localmos = this.b;
      int i23 = qal.d(8);
      int i24 = localmos.a();
      localmos.ak = i24;
      n += i23 + (i24 + qal.d(i24));
    }
    if (this.c != null)
    {
      String str11 = this.c;
      int i21 = qal.d(16);
      int i22 = qal.a(str11);
      n += i21 + (i22 + qal.d(i22));
    }
    if (this.e != null)
    {
      String str10 = this.e;
      int i19 = qal.d(24);
      int i20 = qal.a(str10);
      n += i19 + (i20 + qal.d(i20));
    }
    if (this.f != null)
    {
      String str9 = this.f;
      int i17 = qal.d(32);
      int i18 = qal.a(str9);
      n += i17 + (i18 + qal.d(i18));
    }
    if (this.g != null)
    {
      String str8 = this.g;
      int i15 = qal.d(40);
      int i16 = qal.a(str8);
      n += i15 + (i16 + qal.d(i16));
    }
    if (this.i != null)
    {
      String str7 = this.i;
      int i13 = qal.d(48);
      int i14 = qal.a(str7);
      n += i13 + (i14 + qal.d(i14));
    }
    if (this.j != null)
    {
      String str6 = this.j;
      int i11 = qal.d(56);
      int i12 = qal.a(str6);
      n += i11 + (i12 + qal.d(i12));
    }
    if (this.k != null)
    {
      String str5 = this.k;
      int i9 = qal.d(64);
      int i10 = qal.a(str5);
      n += i9 + (i10 + qal.d(i10));
    }
    if (this.l != null)
    {
      String str4 = this.l;
      int i7 = qal.d(72);
      int i8 = qal.a(str4);
      n += i7 + (i8 + qal.d(i8));
    }
    if (this.m != null)
    {
      String str3 = this.m;
      int i5 = qal.d(80);
      int i6 = qal.a(str3);
      n += i5 + (i6 + qal.d(i6));
    }
    if (this.d != null)
    {
      String str2 = this.d;
      int i3 = qal.d(88);
      int i4 = qal.a(str2);
      n += i3 + (i4 + qal.d(i4));
    }
    if (this.h != null)
    {
      String str1 = this.h;
      int i1 = qal.d(96);
      int i2 = qal.a(str1);
      n += i1 + (i2 + qal.d(i2));
    }
    return n;
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      mos localmos = this.b;
      paramqal.c(10);
      if (localmos.ak < 0) {
        localmos.ak = localmos.a();
      }
      paramqal.c(localmos.ak);
      localmos.a(paramqal);
    }
    if (this.c != null)
    {
      String str11 = this.c;
      paramqal.c(18);
      paramqal.a(str11);
    }
    if (this.e != null)
    {
      String str10 = this.e;
      paramqal.c(26);
      paramqal.a(str10);
    }
    if (this.f != null)
    {
      String str9 = this.f;
      paramqal.c(34);
      paramqal.a(str9);
    }
    if (this.g != null)
    {
      String str8 = this.g;
      paramqal.c(42);
      paramqal.a(str8);
    }
    if (this.i != null)
    {
      String str7 = this.i;
      paramqal.c(50);
      paramqal.a(str7);
    }
    if (this.j != null)
    {
      String str6 = this.j;
      paramqal.c(58);
      paramqal.a(str6);
    }
    if (this.k != null)
    {
      String str5 = this.k;
      paramqal.c(66);
      paramqal.a(str5);
    }
    if (this.l != null)
    {
      String str4 = this.l;
      paramqal.c(74);
      paramqal.a(str4);
    }
    if (this.m != null)
    {
      String str3 = this.m;
      paramqal.c(82);
      paramqal.a(str3);
    }
    if (this.d != null)
    {
      String str2 = this.d;
      paramqal.c(90);
      paramqal.a(str2);
    }
    if (this.h != null)
    {
      String str1 = this.h;
      paramqal.c(98);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mmy
 * JD-Core Version:    0.7.0.1
 */