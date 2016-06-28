public final class nje
  extends qan<nje>
{
  private static volatile nje[] a;
  private Double b = null;
  private Integer c = null;
  private String d = null;
  private nin e = null;
  private nio[] f = nio.b();
  private Integer g = null;
  private Integer h = null;
  private Integer i = null;
  private Long j = null;
  private Integer k = null;
  private String l = null;
  private Integer m = null;
  private nio[] n = nio.b();
  private Integer o = null;
  private Integer p = null;
  private Integer q = null;
  
  public nje()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nje[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new nje[0];
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
    int i40;
    int i41;
    if (this.c != null)
    {
      i40 = this.c.intValue();
      i41 = qal.d(16);
      if (i40 < 0) {
        break label254;
      }
    }
    int i32;
    label254:
    for (int i42 = qal.d(i40);; i42 = i1)
    {
      i2 += i42 + i41;
      if (this.d != null)
      {
        String str2 = this.d;
        int i38 = qal.d(24);
        int i39 = qal.a(str2);
        i2 += i38 + (i39 + qal.d(i39));
      }
      if (this.e != null)
      {
        nin localnin = this.e;
        int i36 = qal.d(32);
        int i37 = localnin.a();
        localnin.ak = i37;
        i2 += i36 + (i37 + qal.d(i37));
      }
      if ((this.f == null) || (this.f.length <= 0)) {
        break label263;
      }
      i32 = i2;
      for (int i33 = 0; i33 < this.f.length; i33++)
      {
        nio localnio2 = this.f[i33];
        if (localnio2 != null)
        {
          int i34 = qal.d(40);
          int i35 = localnio2.a();
          localnio2.ak = i35;
          i32 += i34 + (i35 + qal.d(i35));
        }
      }
    }
    i2 = i32;
    label263:
    int i31;
    int i28;
    label341:
    int i25;
    label384:
    int i20;
    label498:
    int i15;
    int i16;
    if (this.g != null)
    {
      int i29 = this.g.intValue();
      int i30 = qal.d(48);
      if (i29 >= 0)
      {
        i31 = qal.d(i29);
        i2 += i31 + i30;
      }
    }
    else
    {
      if (this.h != null)
      {
        int i26 = this.h.intValue();
        int i27 = qal.d(56);
        if (i26 < 0) {
          break label642;
        }
        i28 = qal.d(i26);
        i2 += i28 + i27;
      }
      if (this.i != null)
      {
        int i23 = this.i.intValue();
        int i24 = qal.d(64);
        if (i23 < 0) {
          break label648;
        }
        i25 = qal.d(i23);
        i2 += i25 + i24;
      }
      if (this.j != null)
      {
        long l1 = this.j.longValue();
        i2 += qal.d(72) + qal.b(l1);
      }
      if (this.l != null)
      {
        String str1 = this.l;
        int i21 = qal.d(80);
        int i22 = qal.a(str1);
        i2 += i21 + (i22 + qal.d(i22));
      }
      if (this.k != null)
      {
        int i18 = this.k.intValue();
        int i19 = qal.d(88);
        if (i18 < 0) {
          break label654;
        }
        i20 = qal.d(i18);
        i2 += i20 + i19;
      }
      if (this.m != null)
      {
        i15 = this.m.intValue();
        i16 = qal.d(96);
        if (i15 < 0) {
          break label660;
        }
      }
    }
    label642:
    label648:
    label654:
    label660:
    for (int i17 = qal.d(i15);; i17 = i1)
    {
      i2 += i17 + i16;
      if (this.n == null) {
        break label666;
      }
      int i11 = this.n.length;
      int i12 = 0;
      if (i11 <= 0) {
        break label666;
      }
      while (i12 < this.n.length)
      {
        nio localnio1 = this.n[i12];
        if (localnio1 != null)
        {
          int i13 = qal.d(104);
          int i14 = localnio1.a();
          localnio1.ak = i14;
          i2 += i13 + (i14 + qal.d(i14));
        }
        i12++;
      }
      i31 = i1;
      break;
      i28 = i1;
      break label341;
      i25 = i1;
      break label384;
      i20 = i1;
      break label498;
    }
    label666:
    int i10;
    int i5;
    int i6;
    if (this.o != null)
    {
      int i8 = this.o.intValue();
      int i9 = qal.d(112);
      if (i8 >= 0)
      {
        i10 = qal.d(i8);
        i2 += i10 + i9;
      }
    }
    else if (this.p != null)
    {
      i5 = this.p.intValue();
      i6 = qal.d(120);
      if (i5 < 0) {
        break label799;
      }
    }
    label799:
    for (int i7 = qal.d(i5);; i7 = i1)
    {
      i2 += i7 + i6;
      if (this.q != null)
      {
        int i3 = this.q.intValue();
        int i4 = qal.d(128);
        if (i3 >= 0) {
          i1 = qal.d(i3);
        }
        i2 += i4 + i1;
      }
      return i2;
      i10 = i1;
      break;
    }
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
      int i12 = this.c.intValue();
      paramqal.c(16);
      paramqal.a(i12);
    }
    if (this.d != null)
    {
      String str2 = this.d;
      paramqal.c(26);
      paramqal.a(str2);
    }
    if (this.e != null)
    {
      nin localnin = this.e;
      paramqal.c(34);
      if (localnin.ak < 0) {
        localnin.ak = localnin.a();
      }
      paramqal.c(localnin.ak);
      localnin.a(paramqal);
    }
    if ((this.f != null) && (this.f.length > 0)) {
      for (int i11 = 0; i11 < this.f.length; i11++)
      {
        nio localnio2 = this.f[i11];
        if (localnio2 != null)
        {
          paramqal.c(42);
          if (localnio2.ak < 0) {
            localnio2.ak = localnio2.a();
          }
          paramqal.c(localnio2.ak);
          localnio2.a(paramqal);
        }
      }
    }
    if (this.g != null)
    {
      int i10 = this.g.intValue();
      paramqal.c(48);
      paramqal.a(i10);
    }
    if (this.h != null)
    {
      int i9 = this.h.intValue();
      paramqal.c(56);
      paramqal.a(i9);
    }
    if (this.i != null)
    {
      int i8 = this.i.intValue();
      paramqal.c(64);
      paramqal.a(i8);
    }
    if (this.j != null)
    {
      long l1 = this.j.longValue();
      paramqal.c(72);
      paramqal.a(l1);
    }
    if (this.l != null)
    {
      String str1 = this.l;
      paramqal.c(82);
      paramqal.a(str1);
    }
    if (this.k != null)
    {
      int i7 = this.k.intValue();
      paramqal.c(88);
      paramqal.a(i7);
    }
    if (this.m != null)
    {
      int i6 = this.m.intValue();
      paramqal.c(96);
      paramqal.a(i6);
    }
    if (this.n != null)
    {
      int i4 = this.n.length;
      int i5 = 0;
      if (i4 > 0) {
        while (i5 < this.n.length)
        {
          nio localnio1 = this.n[i5];
          if (localnio1 != null)
          {
            paramqal.c(106);
            if (localnio1.ak < 0) {
              localnio1.ak = localnio1.a();
            }
            paramqal.c(localnio1.ak);
            localnio1.a(paramqal);
          }
          i5++;
        }
      }
    }
    if (this.o != null)
    {
      int i3 = this.o.intValue();
      paramqal.c(112);
      paramqal.a(i3);
    }
    if (this.p != null)
    {
      int i2 = this.p.intValue();
      paramqal.c(120);
      paramqal.a(i2);
    }
    if (this.q != null)
    {
      int i1 = this.q.intValue();
      paramqal.c(128);
      paramqal.a(i1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nje
 * JD-Core Version:    0.7.0.1
 */