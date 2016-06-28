public final class oif
  extends qan<oif>
{
  private static volatile oif[] o;
  public String a = null;
  public String b = null;
  public int c = -2147483648;
  public oib d = null;
  public String e = null;
  public oki f = null;
  public String g = null;
  public Long h = null;
  public Long i = null;
  public String j = null;
  public oic k = null;
  public okf l = null;
  public oij[] m = oij.b();
  public String n = null;
  private String p = null;
  private String q = null;
  
  public oif()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static oif[] b()
  {
    if (o == null) {}
    synchronized (qar.a)
    {
      if (o == null) {
        o = new oif[0];
      }
      return o;
    }
  }
  
  protected final int a()
  {
    int i1 = super.a();
    if (this.b != null)
    {
      String str8 = this.b;
      int i31 = qal.d(8);
      int i32 = qal.a(str8);
      i1 += i31 + (i32 + qal.d(i32));
    }
    if (this.g != null)
    {
      String str7 = this.g;
      int i29 = qal.d(16);
      int i30 = qal.a(str7);
      i1 += i29 + (i30 + qal.d(i30));
    }
    if (this.h != null)
    {
      long l2 = this.h.longValue();
      i1 += qal.d(24) + qal.b(l2);
    }
    if (this.p != null)
    {
      String str6 = this.p;
      int i27 = qal.d(32);
      int i28 = qal.a(str6);
      i1 += i27 + (i28 + qal.d(i28));
    }
    int i24;
    int i25;
    if (this.c != -2147483648)
    {
      i24 = this.c;
      i25 = qal.d(40);
      if (i24 < 0) {
        break label473;
      }
    }
    int i12;
    label473:
    for (int i26 = qal.d(i24);; i26 = 10)
    {
      i1 += i26 + i25;
      if (this.k != null)
      {
        oic localoic = this.k;
        int i22 = qal.d(48);
        int i23 = localoic.a();
        localoic.ak = i23;
        i1 += i22 + (i23 + qal.d(i23));
      }
      if (this.q != null)
      {
        String str5 = this.q;
        int i20 = qal.d(56);
        int i21 = qal.a(str5);
        i1 += i20 + (i21 + qal.d(i21));
      }
      if (this.d != null)
      {
        oib localoib = this.d;
        int i18 = qal.d(64);
        int i19 = localoib.a();
        localoib.ak = i19;
        i1 += i18 + (i19 + qal.d(i19));
      }
      if (this.l != null)
      {
        okf localokf = this.l;
        int i16 = qal.d(72);
        int i17 = localokf.a();
        localokf.ak = i17;
        i1 += i16 + (i17 + qal.d(i17));
      }
      if ((this.m == null) || (this.m.length <= 0)) {
        break label483;
      }
      i12 = i1;
      for (int i13 = 0; i13 < this.m.length; i13++)
      {
        oij localoij = this.m[i13];
        if (localoij != null)
        {
          int i14 = qal.d(80);
          int i15 = localoij.a();
          localoij.ak = i15;
          i12 += i14 + (i15 + qal.d(i15));
        }
      }
    }
    i1 = i12;
    label483:
    if (this.i != null)
    {
      long l1 = this.i.longValue();
      i1 += qal.d(88) + qal.b(l1);
    }
    if (this.a != null)
    {
      String str4 = this.a;
      int i10 = qal.d(96);
      int i11 = qal.a(str4);
      i1 += i10 + (i11 + qal.d(i11));
    }
    if (this.e != null)
    {
      String str3 = this.e;
      int i8 = qal.d(104);
      int i9 = qal.a(str3);
      i1 += i8 + (i9 + qal.d(i9));
    }
    if (this.j != null)
    {
      String str2 = this.j;
      int i6 = qal.d(112);
      int i7 = qal.a(str2);
      i1 += i6 + (i7 + qal.d(i7));
    }
    if (this.n != null)
    {
      String str1 = this.n;
      int i4 = qal.d(120);
      int i5 = qal.a(str1);
      i1 += i4 + (i5 + qal.d(i5));
    }
    if (this.f != null)
    {
      oki localoki = this.f;
      int i2 = qal.d(128);
      int i3 = localoki.a();
      localoki.ak = i3;
      i1 += i2 + (i3 + qal.d(i3));
    }
    return i1;
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      String str8 = this.b;
      paramqal.c(10);
      paramqal.a(str8);
    }
    if (this.g != null)
    {
      String str7 = this.g;
      paramqal.c(18);
      paramqal.a(str7);
    }
    if (this.h != null)
    {
      long l2 = this.h.longValue();
      paramqal.c(24);
      paramqal.a(l2);
    }
    if (this.p != null)
    {
      String str6 = this.p;
      paramqal.c(34);
      paramqal.a(str6);
    }
    if (this.c != -2147483648)
    {
      int i2 = this.c;
      paramqal.c(40);
      paramqal.a(i2);
    }
    if (this.k != null)
    {
      oic localoic = this.k;
      paramqal.c(50);
      if (localoic.ak < 0) {
        localoic.ak = localoic.a();
      }
      paramqal.c(localoic.ak);
      localoic.a(paramqal);
    }
    if (this.q != null)
    {
      String str5 = this.q;
      paramqal.c(58);
      paramqal.a(str5);
    }
    if (this.d != null)
    {
      oib localoib = this.d;
      paramqal.c(66);
      if (localoib.ak < 0) {
        localoib.ak = localoib.a();
      }
      paramqal.c(localoib.ak);
      localoib.a(paramqal);
    }
    if (this.l != null)
    {
      okf localokf = this.l;
      paramqal.c(74);
      if (localokf.ak < 0) {
        localokf.ak = localokf.a();
      }
      paramqal.c(localokf.ak);
      localokf.a(paramqal);
    }
    if ((this.m != null) && (this.m.length > 0)) {
      for (int i1 = 0; i1 < this.m.length; i1++)
      {
        oij localoij = this.m[i1];
        if (localoij != null)
        {
          paramqal.c(82);
          if (localoij.ak < 0) {
            localoij.ak = localoij.a();
          }
          paramqal.c(localoij.ak);
          localoij.a(paramqal);
        }
      }
    }
    if (this.i != null)
    {
      long l1 = this.i.longValue();
      paramqal.c(88);
      paramqal.a(l1);
    }
    if (this.a != null)
    {
      String str4 = this.a;
      paramqal.c(98);
      paramqal.a(str4);
    }
    if (this.e != null)
    {
      String str3 = this.e;
      paramqal.c(106);
      paramqal.a(str3);
    }
    if (this.j != null)
    {
      String str2 = this.j;
      paramqal.c(114);
      paramqal.a(str2);
    }
    if (this.n != null)
    {
      String str1 = this.n;
      paramqal.c(122);
      paramqal.a(str1);
    }
    if (this.f != null)
    {
      oki localoki = this.f;
      paramqal.c(130);
      if (localoki.ak < 0) {
        localoki.ak = localoki.a();
      }
      paramqal.c(localoki.ak);
      localoki.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oif
 * JD-Core Version:    0.7.0.1
 */