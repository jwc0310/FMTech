public final class ohe
  extends qan<ohe>
{
  public String a = null;
  public String b = null;
  public String c = null;
  public Long d = null;
  public int e = -2147483648;
  public opr f = null;
  private onh g = null;
  private int h = -2147483648;
  private String i = null;
  private opu j = null;
  
  public ohe()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int k = 10;
    int m = super.a();
    if (this.a != null)
    {
      String str4 = this.a;
      int i17 = qal.d(8);
      int i18 = qal.a(str4);
      m += i17 + (i18 + qal.d(i18));
    }
    if (this.b != null)
    {
      String str3 = this.b;
      int i15 = qal.d(16);
      int i16 = qal.a(str3);
      m += i15 + (i16 + qal.d(i16));
    }
    if (this.c != null)
    {
      String str2 = this.c;
      int i13 = qal.d(24);
      int i14 = qal.a(str2);
      m += i13 + (i14 + qal.d(i14));
    }
    if (this.d != null)
    {
      long l = this.d.longValue();
      m += qal.d(32) + qal.b(l);
    }
    if (this.g != null)
    {
      onh localonh = this.g;
      int i11 = qal.d(40);
      int i12 = localonh.a();
      localonh.ak = i12;
      m += i11 + (i12 + qal.d(i12));
    }
    int i8;
    int i9;
    if (this.e != -2147483648)
    {
      i8 = this.e;
      i9 = qal.d(48);
      if (i8 < 0) {
        break label427;
      }
    }
    label427:
    for (int i10 = qal.d(i8);; i10 = k)
    {
      m += i10 + i9;
      if (this.h != -2147483648)
      {
        int i6 = this.h;
        int i7 = qal.d(56);
        if (i6 >= 0) {
          k = qal.d(i6);
        }
        m += i7 + k;
      }
      if (this.i != null)
      {
        String str1 = this.i;
        int i4 = qal.d(64);
        int i5 = qal.a(str1);
        m += i4 + (i5 + qal.d(i5));
      }
      if (this.j != null)
      {
        opu localopu = this.j;
        int i2 = qal.d(72);
        int i3 = localopu.a();
        localopu.ak = i3;
        m += i2 + (i3 + qal.d(i3));
      }
      if (this.f != null)
      {
        opr localopr = this.f;
        int n = qal.d(80);
        int i1 = localopr.a();
        localopr.ak = i1;
        m += n + (i1 + qal.d(i1));
      }
      return m;
    }
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
      String str2 = this.c;
      paramqal.c(26);
      paramqal.a(str2);
    }
    if (this.d != null)
    {
      long l = this.d.longValue();
      paramqal.c(32);
      paramqal.a(l);
    }
    if (this.g != null)
    {
      onh localonh = this.g;
      paramqal.c(42);
      if (localonh.ak < 0) {
        localonh.ak = localonh.a();
      }
      paramqal.c(localonh.ak);
      localonh.a(paramqal);
    }
    if (this.e != -2147483648)
    {
      int m = this.e;
      paramqal.c(48);
      paramqal.a(m);
    }
    if (this.h != -2147483648)
    {
      int k = this.h;
      paramqal.c(56);
      paramqal.a(k);
    }
    if (this.i != null)
    {
      String str1 = this.i;
      paramqal.c(66);
      paramqal.a(str1);
    }
    if (this.j != null)
    {
      opu localopu = this.j;
      paramqal.c(74);
      if (localopu.ak < 0) {
        localopu.ak = localopu.a();
      }
      paramqal.c(localopu.ak);
      localopu.a(paramqal);
    }
    if (this.f != null)
    {
      opr localopr = this.f;
      paramqal.c(82);
      if (localopr.ak < 0) {
        localopr.ak = localopr.a();
      }
      paramqal.c(localopr.ak);
      localopr.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ohe
 * JD-Core Version:    0.7.0.1
 */