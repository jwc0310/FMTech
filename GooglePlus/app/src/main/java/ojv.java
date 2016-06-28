public final class ojv
  extends qan<ojv>
{
  private static volatile ojv[] f;
  public String a = null;
  public String b = null;
  public String c = null;
  public String d = null;
  public ojw e = null;
  private String g = null;
  private String h = null;
  private String i = null;
  private String j = null;
  private Integer k = null;
  
  public ojv()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static ojv[] b()
  {
    if (f == null) {}
    synchronized (qar.a)
    {
      if (f == null) {
        f = new ojv[0];
      }
      return f;
    }
  }
  
  protected final int a()
  {
    int m = super.a();
    String str1 = this.b;
    int n = qal.d(8);
    int i1 = qal.a(str1);
    int i2 = m + (n + (i1 + qal.d(i1)));
    if (this.g != null)
    {
      String str8 = this.g;
      int i20 = qal.d(16);
      int i21 = qal.a(str8);
      i2 += i20 + (i21 + qal.d(i21));
    }
    if (this.h != null)
    {
      String str7 = this.h;
      int i18 = qal.d(24);
      int i19 = qal.a(str7);
      i2 += i18 + (i19 + qal.d(i19));
    }
    if (this.c != null)
    {
      String str6 = this.c;
      int i16 = qal.d(32);
      int i17 = qal.a(str6);
      i2 += i16 + (i17 + qal.d(i17));
    }
    if (this.d != null)
    {
      String str5 = this.d;
      int i14 = qal.d(40);
      int i15 = qal.a(str5);
      i2 += i14 + (i15 + qal.d(i15));
    }
    if (this.j != null)
    {
      String str4 = this.j;
      int i12 = qal.d(48);
      int i13 = qal.a(str4);
      i2 += i12 + (i13 + qal.d(i13));
    }
    int i9;
    int i10;
    if (this.k != null)
    {
      i9 = this.k.intValue();
      i10 = qal.d(56);
      if (i9 < 0) {
        break label435;
      }
    }
    label435:
    for (int i11 = qal.d(i9);; i11 = 10)
    {
      i2 += i11 + i10;
      if (this.i != null)
      {
        String str3 = this.i;
        int i7 = qal.d(64);
        int i8 = qal.a(str3);
        i2 += i7 + (i8 + qal.d(i8));
      }
      if (this.a != null)
      {
        String str2 = this.a;
        int i5 = qal.d(72);
        int i6 = qal.a(str2);
        i2 += i5 + (i6 + qal.d(i6));
      }
      if (this.e != null)
      {
        ojw localojw = this.e;
        int i3 = qal.d(80);
        int i4 = localojw.a();
        localojw.ak = i4;
        i2 += i3 + (i4 + qal.d(i4));
      }
      return i2;
    }
  }
  
  public final void a(qal paramqal)
  {
    String str1 = this.b;
    paramqal.c(10);
    paramqal.a(str1);
    if (this.g != null)
    {
      String str8 = this.g;
      paramqal.c(18);
      paramqal.a(str8);
    }
    if (this.h != null)
    {
      String str7 = this.h;
      paramqal.c(26);
      paramqal.a(str7);
    }
    if (this.c != null)
    {
      String str6 = this.c;
      paramqal.c(34);
      paramqal.a(str6);
    }
    if (this.d != null)
    {
      String str5 = this.d;
      paramqal.c(42);
      paramqal.a(str5);
    }
    if (this.j != null)
    {
      String str4 = this.j;
      paramqal.c(50);
      paramqal.a(str4);
    }
    if (this.k != null)
    {
      int m = this.k.intValue();
      paramqal.c(56);
      paramqal.a(m);
    }
    if (this.i != null)
    {
      String str3 = this.i;
      paramqal.c(66);
      paramqal.a(str3);
    }
    if (this.a != null)
    {
      String str2 = this.a;
      paramqal.c(74);
      paramqal.a(str2);
    }
    if (this.e != null)
    {
      ojw localojw = this.e;
      paramqal.c(82);
      if (localojw.ak < 0) {
        localojw.ak = localojw.a();
      }
      paramqal.c(localojw.ak);
      localojw.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ojv
 * JD-Core Version:    0.7.0.1
 */