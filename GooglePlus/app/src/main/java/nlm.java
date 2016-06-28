public final class nlm
  extends qan<nlm>
{
  private static volatile nlm[] a;
  private Double b = null;
  private Integer c = null;
  private String d = null;
  private njx e = null;
  private njy[] f = njy.b();
  private Integer g = null;
  private Integer h = null;
  private int i = -2147483648;
  private Long j = null;
  private Integer k = null;
  private String l = null;
  private Integer m = null;
  private int n = -2147483648;
  private Integer o = null;
  private Integer p = null;
  private njn q = null;
  private Long r = null;
  private nmq[] s = nmq.b();
  private nmm[] t = nmm.b();
  private nln u = null;
  
  public nlm()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nlm[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new nlm[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i1 = 10;
    int i2 = super.a();
    if (this.b != null)
    {
      this.b.doubleValue();
      i2 += 8 + qal.d(8);
    }
    int i48;
    int i49;
    if (this.c != null)
    {
      i48 = this.c.intValue();
      i49 = qal.d(16);
      if (i48 < 0) {
        break label254;
      }
    }
    int i40;
    label254:
    for (int i50 = qal.d(i48);; i50 = i1)
    {
      i2 += i50 + i49;
      if (this.d != null)
      {
        String str2 = this.d;
        int i46 = qal.d(24);
        int i47 = qal.a(str2);
        i2 += i46 + (i47 + qal.d(i47));
      }
      if (this.e != null)
      {
        njx localnjx = this.e;
        int i44 = qal.d(32);
        int i45 = localnjx.a();
        localnjx.ak = i45;
        i2 += i44 + (i45 + qal.d(i45));
      }
      if ((this.f == null) || (this.f.length <= 0)) {
        break label263;
      }
      i40 = i2;
      for (int i41 = 0; i41 < this.f.length; i41++)
      {
        njy localnjy = this.f[i41];
        if (localnjy != null)
        {
          int i42 = qal.d(40);
          int i43 = localnjy.a();
          localnjy.ak = i43;
          i40 += i42 + (i43 + qal.d(i43));
        }
      }
    }
    i2 = i40;
    label263:
    int i39;
    int i36;
    label341:
    int i33;
    label383:
    int i28;
    label497:
    int i25;
    label540:
    int i22;
    label582:
    int i17;
    int i18;
    if (this.g != null)
    {
      int i37 = this.g.intValue();
      int i38 = qal.d(48);
      if (i37 >= 0)
      {
        i39 = qal.d(i37);
        i2 += i39 + i38;
      }
    }
    else
    {
      if (this.h != null)
      {
        int i34 = this.h.intValue();
        int i35 = qal.d(56);
        if (i34 < 0) {
          break label849;
        }
        i36 = qal.d(i34);
        i2 += i36 + i35;
      }
      if (this.i != -2147483648)
      {
        int i31 = this.i;
        int i32 = qal.d(64);
        if (i31 < 0) {
          break label855;
        }
        i33 = qal.d(i31);
        i2 += i33 + i32;
      }
      if (this.j != null)
      {
        long l2 = this.j.longValue();
        i2 += qal.d(72) + qal.b(l2);
      }
      if (this.l != null)
      {
        String str1 = this.l;
        int i29 = qal.d(80);
        int i30 = qal.a(str1);
        i2 += i29 + (i30 + qal.d(i30));
      }
      if (this.k != null)
      {
        int i26 = this.k.intValue();
        int i27 = qal.d(88);
        if (i26 < 0) {
          break label861;
        }
        i28 = qal.d(i26);
        i2 += i28 + i27;
      }
      if (this.m != null)
      {
        int i23 = this.m.intValue();
        int i24 = qal.d(96);
        if (i23 < 0) {
          break label867;
        }
        i25 = qal.d(i23);
        i2 += i25 + i24;
      }
      if (this.n != -2147483648)
      {
        int i20 = this.n;
        int i21 = qal.d(104);
        if (i20 < 0) {
          break label873;
        }
        i22 = qal.d(i20);
        i2 += i22 + i21;
      }
      if (this.o != null)
      {
        i17 = this.o.intValue();
        i18 = qal.d(112);
        if (i17 < 0) {
          break label879;
        }
      }
    }
    int i9;
    label849:
    label855:
    label861:
    label867:
    label873:
    label879:
    for (int i19 = qal.d(i17);; i19 = i1)
    {
      i2 += i19 + i18;
      if (this.p != null)
      {
        int i15 = this.p.intValue();
        int i16 = qal.d(120);
        if (i15 >= 0) {
          i1 = qal.d(i15);
        }
        i2 += i16 + i1;
      }
      if (this.q != null)
      {
        njn localnjn = this.q;
        int i13 = qal.d(128);
        int i14 = localnjn.a();
        localnjn.ak = i14;
        i2 += i13 + (i14 + qal.d(i14));
      }
      if (this.r != null)
      {
        long l1 = this.r.longValue();
        i2 += qal.d(136) + qal.b(l1);
      }
      if ((this.s == null) || (this.s.length <= 0)) {
        break label888;
      }
      i9 = i2;
      for (int i10 = 0; i10 < this.s.length; i10++)
      {
        nmq localnmq = this.s[i10];
        if (localnmq != null)
        {
          int i11 = qal.d(144);
          int i12 = localnmq.a();
          localnmq.ak = i12;
          i9 += i11 + (i12 + qal.d(i12));
        }
      }
      i39 = i1;
      break;
      i36 = i1;
      break label341;
      i33 = i1;
      break label383;
      i28 = i1;
      break label497;
      i25 = i1;
      break label540;
      i22 = i1;
      break label582;
    }
    i2 = i9;
    label888:
    if (this.t != null)
    {
      int i5 = this.t.length;
      int i6 = 0;
      if (i5 > 0) {
        while (i6 < this.t.length)
        {
          nmm localnmm = this.t[i6];
          if (localnmm != null)
          {
            int i7 = qal.d(152);
            int i8 = localnmm.a();
            localnmm.ak = i8;
            i2 += i7 + (i8 + qal.d(i8));
          }
          i6++;
        }
      }
    }
    if (this.u != null)
    {
      nln localnln = this.u;
      int i3 = qal.d(160);
      int i4 = localnln.a();
      localnln.ak = i4;
      i2 += i3 + (i4 + qal.d(i4));
    }
    return i2;
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      double d1 = this.b.doubleValue();
      paramqal.c(9);
      paramqal.c(Double.doubleToLongBits(d1));
    }
    if (this.c != null)
    {
      int i13 = this.c.intValue();
      paramqal.c(16);
      paramqal.a(i13);
    }
    if (this.d != null)
    {
      String str2 = this.d;
      paramqal.c(26);
      paramqal.a(str2);
    }
    if (this.e != null)
    {
      njx localnjx = this.e;
      paramqal.c(34);
      if (localnjx.ak < 0) {
        localnjx.ak = localnjx.a();
      }
      paramqal.c(localnjx.ak);
      localnjx.a(paramqal);
    }
    if ((this.f != null) && (this.f.length > 0)) {
      for (int i12 = 0; i12 < this.f.length; i12++)
      {
        njy localnjy = this.f[i12];
        if (localnjy != null)
        {
          paramqal.c(42);
          if (localnjy.ak < 0) {
            localnjy.ak = localnjy.a();
          }
          paramqal.c(localnjy.ak);
          localnjy.a(paramqal);
        }
      }
    }
    if (this.g != null)
    {
      int i11 = this.g.intValue();
      paramqal.c(48);
      paramqal.a(i11);
    }
    if (this.h != null)
    {
      int i10 = this.h.intValue();
      paramqal.c(56);
      paramqal.a(i10);
    }
    if (this.i != -2147483648)
    {
      int i9 = this.i;
      paramqal.c(64);
      paramqal.a(i9);
    }
    if (this.j != null)
    {
      long l2 = this.j.longValue();
      paramqal.c(72);
      paramqal.a(l2);
    }
    if (this.l != null)
    {
      String str1 = this.l;
      paramqal.c(82);
      paramqal.a(str1);
    }
    if (this.k != null)
    {
      int i8 = this.k.intValue();
      paramqal.c(88);
      paramqal.a(i8);
    }
    if (this.m != null)
    {
      int i7 = this.m.intValue();
      paramqal.c(96);
      paramqal.a(i7);
    }
    if (this.n != -2147483648)
    {
      int i6 = this.n;
      paramqal.c(104);
      paramqal.a(i6);
    }
    if (this.o != null)
    {
      int i5 = this.o.intValue();
      paramqal.c(112);
      paramqal.a(i5);
    }
    if (this.p != null)
    {
      int i4 = this.p.intValue();
      paramqal.c(120);
      paramqal.a(i4);
    }
    if (this.q != null)
    {
      njn localnjn = this.q;
      paramqal.c(130);
      if (localnjn.ak < 0) {
        localnjn.ak = localnjn.a();
      }
      paramqal.c(localnjn.ak);
      localnjn.a(paramqal);
    }
    if (this.r != null)
    {
      long l1 = this.r.longValue();
      paramqal.c(136);
      paramqal.a(l1);
    }
    if ((this.s != null) && (this.s.length > 0)) {
      for (int i3 = 0; i3 < this.s.length; i3++)
      {
        nmq localnmq = this.s[i3];
        if (localnmq != null)
        {
          paramqal.c(146);
          if (localnmq.ak < 0) {
            localnmq.ak = localnmq.a();
          }
          paramqal.c(localnmq.ak);
          localnmq.a(paramqal);
        }
      }
    }
    if (this.t != null)
    {
      int i1 = this.t.length;
      int i2 = 0;
      if (i1 > 0) {
        while (i2 < this.t.length)
        {
          nmm localnmm = this.t[i2];
          if (localnmm != null)
          {
            paramqal.c(154);
            if (localnmm.ak < 0) {
              localnmm.ak = localnmm.a();
            }
            paramqal.c(localnmm.ak);
            localnmm.a(paramqal);
          }
          i2++;
        }
      }
    }
    if (this.u != null)
    {
      nln localnln = this.u;
      paramqal.c(162);
      if (localnln.ak < 0) {
        localnln.ak = localnln.a();
      }
      paramqal.c(localnln.ak);
      localnln.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nlm
 * JD-Core Version:    0.7.0.1
 */