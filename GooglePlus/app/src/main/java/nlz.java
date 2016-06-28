public final class nlz
  extends qan<nlz>
{
  public Integer a = null;
  public Integer b = null;
  private nlt[] c = nlt.b();
  private nkm[] d = nkm.b();
  private long[] e = qay.b;
  private nmu[] f = nmu.b();
  private njx[] g = njx.b();
  private njy[] h = njy.b();
  private nlm[] i = nlm.b();
  private String j = null;
  private njx k = null;
  private String l = null;
  private Integer m = null;
  private nkp n = null;
  private int o = -2147483648;
  private nlw p = null;
  private njm q = null;
  
  public nlz()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i1 = 10;
    int i2 = super.a();
    if ((this.c != null) && (this.c.length > 0))
    {
      int i46 = i2;
      for (int i47 = 0; i47 < this.c.length; i47++)
      {
        nlt localnlt = this.c[i47];
        if (localnlt != null)
        {
          int i48 = qal.d(8);
          int i49 = localnlt.a();
          localnlt.ak = i49;
          i46 += i48 + (i49 + qal.d(i49));
        }
      }
      i2 = i46;
    }
    if ((this.d != null) && (this.d.length > 0))
    {
      int i42 = i2;
      for (int i43 = 0; i43 < this.d.length; i43++)
      {
        nkm localnkm = this.d[i43];
        if (localnkm != null)
        {
          int i44 = qal.d(16);
          int i45 = localnkm.a();
          localnkm.ak = i45;
          i42 += i44 + (i45 + qal.d(i45));
        }
      }
      i2 = i42;
    }
    if ((this.e != null) && (this.e.length > 0)) {
      i2 = i2 + 8 * this.e.length + 1 * this.e.length;
    }
    if ((this.f != null) && (this.f.length > 0))
    {
      int i38 = i2;
      for (int i39 = 0; i39 < this.f.length; i39++)
      {
        nmu localnmu = this.f[i39];
        if (localnmu != null)
        {
          int i40 = qal.d(32);
          int i41 = localnmu.a();
          localnmu.ak = i41;
          i38 += i40 + (i41 + qal.d(i41));
        }
      }
      i2 = i38;
    }
    if ((this.g != null) && (this.g.length > 0))
    {
      int i34 = i2;
      for (int i35 = 0; i35 < this.g.length; i35++)
      {
        njx localnjx2 = this.g[i35];
        if (localnjx2 != null)
        {
          int i36 = qal.d(40);
          int i37 = localnjx2.a();
          localnjx2.ak = i37;
          i34 += i36 + (i37 + qal.d(i37));
        }
      }
      i2 = i34;
    }
    if ((this.h != null) && (this.h.length > 0))
    {
      int i30 = i2;
      for (int i31 = 0; i31 < this.h.length; i31++)
      {
        njy localnjy = this.h[i31];
        if (localnjy != null)
        {
          int i32 = qal.d(48);
          int i33 = localnjy.a();
          localnjy.ak = i33;
          i30 += i32 + (i33 + qal.d(i33));
        }
      }
      i2 = i30;
    }
    if (this.i != null)
    {
      int i26 = this.i.length;
      int i27 = 0;
      if (i26 > 0) {
        while (i27 < this.i.length)
        {
          nlm localnlm = this.i[i27];
          if (localnlm != null)
          {
            int i28 = qal.d(56);
            int i29 = localnlm.a();
            localnlm.ak = i29;
            i2 += i28 + (i29 + qal.d(i29));
          }
          i27++;
        }
      }
    }
    int i25;
    int i20;
    label703:
    int i11;
    int i12;
    if (this.a != null)
    {
      int i23 = this.a.intValue();
      int i24 = qal.d(64);
      if (i23 >= 0)
      {
        i25 = qal.d(i23);
        i2 += i25 + i24;
      }
    }
    else
    {
      if (this.j != null)
      {
        String str2 = this.j;
        int i21 = qal.d(72);
        int i22 = qal.a(str2);
        i2 += i21 + (i22 + qal.d(i22));
      }
      if (this.b != null)
      {
        int i18 = this.b.intValue();
        int i19 = qal.d(80);
        if (i18 < 0) {
          break label1034;
        }
        i20 = qal.d(i18);
        i2 += i20 + i19;
      }
      if (this.k != null)
      {
        njx localnjx1 = this.k;
        int i16 = qal.d(88);
        int i17 = localnjx1.a();
        localnjx1.ak = i17;
        i2 += i16 + (i17 + qal.d(i17));
      }
      if (this.l != null)
      {
        String str1 = this.l;
        int i14 = qal.d(96);
        int i15 = qal.a(str1);
        i2 += i14 + (i15 + qal.d(i15));
      }
      if (this.m != null)
      {
        i11 = this.m.intValue();
        i12 = qal.d(104);
        if (i11 < 0) {
          break label1040;
        }
      }
    }
    label1034:
    label1040:
    for (int i13 = qal.d(i11);; i13 = i1)
    {
      i2 += i13 + i12;
      if (this.n != null)
      {
        nkp localnkp = this.n;
        int i9 = qal.d(112);
        int i10 = localnkp.a();
        localnkp.ak = i10;
        i2 += i9 + (i10 + qal.d(i10));
      }
      if (this.p != null)
      {
        nlw localnlw = this.p;
        int i7 = qal.d(120);
        int i8 = localnlw.a();
        localnlw.ak = i8;
        i2 += i7 + (i8 + qal.d(i8));
      }
      if (this.q != null)
      {
        njm localnjm = this.q;
        int i5 = qal.d(128);
        int i6 = localnjm.a();
        localnjm.ak = i6;
        i2 += i5 + (i6 + qal.d(i6));
      }
      if (this.o != -2147483648)
      {
        int i3 = this.o;
        int i4 = qal.d(264);
        if (i3 >= 0) {
          i1 = qal.d(i3);
        }
        i2 += i4 + i1;
      }
      return i2;
      i25 = i1;
      break;
      i20 = i1;
      break label703;
    }
  }
  
  public final void a(qal paramqal)
  {
    if ((this.c != null) && (this.c.length > 0)) {
      for (int i12 = 0; i12 < this.c.length; i12++)
      {
        nlt localnlt = this.c[i12];
        if (localnlt != null)
        {
          paramqal.c(10);
          if (localnlt.ak < 0) {
            localnlt.ak = localnlt.a();
          }
          paramqal.c(localnlt.ak);
          localnlt.a(paramqal);
        }
      }
    }
    if ((this.d != null) && (this.d.length > 0)) {
      for (int i11 = 0; i11 < this.d.length; i11++)
      {
        nkm localnkm = this.d[i11];
        if (localnkm != null)
        {
          paramqal.c(18);
          if (localnkm.ak < 0) {
            localnkm.ak = localnkm.a();
          }
          paramqal.c(localnkm.ak);
          localnkm.a(paramqal);
        }
      }
    }
    if ((this.e != null) && (this.e.length > 0)) {
      for (int i10 = 0; i10 < this.e.length; i10++)
      {
        long l1 = this.e[i10];
        paramqal.c(25);
        paramqal.c(l1);
      }
    }
    if ((this.f != null) && (this.f.length > 0)) {
      for (int i9 = 0; i9 < this.f.length; i9++)
      {
        nmu localnmu = this.f[i9];
        if (localnmu != null)
        {
          paramqal.c(34);
          if (localnmu.ak < 0) {
            localnmu.ak = localnmu.a();
          }
          paramqal.c(localnmu.ak);
          localnmu.a(paramqal);
        }
      }
    }
    if ((this.g != null) && (this.g.length > 0)) {
      for (int i8 = 0; i8 < this.g.length; i8++)
      {
        njx localnjx2 = this.g[i8];
        if (localnjx2 != null)
        {
          paramqal.c(42);
          if (localnjx2.ak < 0) {
            localnjx2.ak = localnjx2.a();
          }
          paramqal.c(localnjx2.ak);
          localnjx2.a(paramqal);
        }
      }
    }
    if ((this.h != null) && (this.h.length > 0)) {
      for (int i7 = 0; i7 < this.h.length; i7++)
      {
        njy localnjy = this.h[i7];
        if (localnjy != null)
        {
          paramqal.c(50);
          if (localnjy.ak < 0) {
            localnjy.ak = localnjy.a();
          }
          paramqal.c(localnjy.ak);
          localnjy.a(paramqal);
        }
      }
    }
    if (this.i != null)
    {
      int i5 = this.i.length;
      int i6 = 0;
      if (i5 > 0) {
        while (i6 < this.i.length)
        {
          nlm localnlm = this.i[i6];
          if (localnlm != null)
          {
            paramqal.c(58);
            if (localnlm.ak < 0) {
              localnlm.ak = localnlm.a();
            }
            paramqal.c(localnlm.ak);
            localnlm.a(paramqal);
          }
          i6++;
        }
      }
    }
    if (this.a != null)
    {
      int i4 = this.a.intValue();
      paramqal.c(64);
      paramqal.a(i4);
    }
    if (this.j != null)
    {
      String str2 = this.j;
      paramqal.c(74);
      paramqal.a(str2);
    }
    if (this.b != null)
    {
      int i3 = this.b.intValue();
      paramqal.c(80);
      paramqal.a(i3);
    }
    if (this.k != null)
    {
      njx localnjx1 = this.k;
      paramqal.c(90);
      if (localnjx1.ak < 0) {
        localnjx1.ak = localnjx1.a();
      }
      paramqal.c(localnjx1.ak);
      localnjx1.a(paramqal);
    }
    if (this.l != null)
    {
      String str1 = this.l;
      paramqal.c(98);
      paramqal.a(str1);
    }
    if (this.m != null)
    {
      int i2 = this.m.intValue();
      paramqal.c(104);
      paramqal.a(i2);
    }
    if (this.n != null)
    {
      nkp localnkp = this.n;
      paramqal.c(114);
      if (localnkp.ak < 0) {
        localnkp.ak = localnkp.a();
      }
      paramqal.c(localnkp.ak);
      localnkp.a(paramqal);
    }
    if (this.p != null)
    {
      nlw localnlw = this.p;
      paramqal.c(122);
      if (localnlw.ak < 0) {
        localnlw.ak = localnlw.a();
      }
      paramqal.c(localnlw.ak);
      localnlw.a(paramqal);
    }
    if (this.q != null)
    {
      njm localnjm = this.q;
      paramqal.c(130);
      if (localnjm.ak < 0) {
        localnjm.ak = localnjm.a();
      }
      paramqal.c(localnjm.ak);
      localnjm.a(paramqal);
    }
    if (this.o != -2147483648)
    {
      int i1 = this.o;
      paramqal.c(264);
      paramqal.a(i1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nlz
 * JD-Core Version:    0.7.0.1
 */